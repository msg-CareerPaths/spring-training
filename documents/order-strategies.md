# Order Strategies
*Up to you*: what should happen if no solution is found by a strategy? Fail or find best alternative? Even better, use a fallback strategy.

## Single Location

Find a single location that has all the required products (with the required quantities) in stock.

### 1. Naïve approach

Load all the locations from the database into the memory.

Loop over each location, then loop over each order detail and check if the location contains the necessary stock of the product. Performance improvements may be done using maps (e.g. instead of a list of order details, use a map between between product ID and stock). 

### 2. Optimize by filtering

An improvement to the above method is to load only the locations that have all the products needed. A (relatively) simple query can be written to do this:

```sql
SELECT location_product.location_id FROM location_product
WHERE location_product.product_id IN (:products)
GROUP BY location_product.location_id 
HAVING COUNT(location_product.product_id) = :products_count;
```

### 3. Optimize by pagination

Both the above approaches can be improved by using pagination (instead of loading all the locations, we can load only a portion of them). An extreme form of this version would be to load each location individually.

### 4. Dynamic query

Build a dynamic query to find the "right" location directly:

```sql
SELECT location_product.location_id FROM location_product
   WHERE (location_product.product_id = 1 AND location_product.stock = 2) OR
      (location_product.product_id = 2 AND location_product.stock = 3)
   GROUP BY location_product.location_id 
   HAVING COUNT(location_product.product_id) = 2;
```

## Most abundant

For each required product, select the location that has the largest stock for that given product.

### 1. Naïve approach

Create a query that retrieves the location that has the largest stock for a product:
 - Using join or grouping: https://stackoverflow.com/a/7745635/7612556.
 - Using order-by and limit.

Call this query inside a loop over the list order details.  

### 2. Single query approach

Write a single query that returns directly the list of location_products that have the largest count for each product. This can be done using a variation of the `LEFT JOIN` approach described in the link above.

## Greedy

Take from each location as many products as possible.

Load all the locations (optionally, use pagination) in any order that you want. Then iterate over these locations and take as many products as possible (and needed) from each location. 

You should keep track of how many units of each product you still need to obtain in a "register". At each step, subtract the products found in the current step from the "register".

If no products remain in the "register", then the algorithm is done. If we arrived at the end of the location list and there are still products in the "register", then the strategy fails (and no strategy would actually work).

Optimizations: 
 - Only load the locations that have at least one product from the order. 
 - Only load the location_products for the needed products. 

