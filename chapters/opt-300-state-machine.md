### OPT-3. State Machine

Goal: Perform migration of a database table by adding a new column and create a state machine.  

Required Reading:

- [Spring State Machine](https://docs.spring.io/spring-statemachine/docs/3.2.1/reference/#statemachine)
- [Spring State Machine Guide](https://www.baeldung.com/spring-state-machine)
- [Spring State Machine Example](https://stackoverflow.com/questions/35911877/how-to-use-spring-state-machine-for-an-order-object)

Online Shop:

> - Add a new property for an Order:
>
>   - status -> represents the status of the Order
>             
>               NEW -> every Order which is not saved yet
>               SAVED -> saved but editable (add/remove products, change delivery address etc.)
>               PLACED -> not editable anymore (waiting for delivery)
>               CANCELED -> not valid anymore (will not be delivered)
> - You will need to create a flyway script to add the new column for status in Order database table.
> 
> - Enhance the OrderService with an update method. 
>
> - Create a StateMachineConfig class in which you will define the following order statuses transitions:
>
>   ![State Machine](https://raw.githubusercontent.com/msg-CareerPaths/spring-training/career-start-2023/diagrams/stateMachine.png "State Machine")
> 
> - Create also a handler class (use @WithStateMachine and @OnTransition annotations) in which you add your custom logic for every transition (status changes and call to the corresponding order service method).
> 
> Adapt the Order Controller in such a way that when a post request is made for an Order, the event which needs to be performed on the Order is also specified. From the controller, instead of calling the OrderService creation method, trigger the corresponding state machine event. 
> 
> Note: do not forget to validate that a transition is possible for the given Order by performing the given event, spring state machine is not doing this check. 
> 
> 

Further Resources:

- [Get Started with State machines](https://www.youtube.com/watch?v=A-dVgRV5-Bw&ab_channel=SpringFrameworkGuru)
