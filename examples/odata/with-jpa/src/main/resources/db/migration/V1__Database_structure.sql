CREATE TABLE manufacturer(
    id int NOT NULL,
    name varchar(32),
    updated timestamp
);

CREATE TABLE car(
    id int NOT NULL,
    model varchar(64),
    manufacturer_id int,
    PRIMARY KEY(id),
    FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(id)
);