USE my_db;



CREATE TABLE drinks (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(25),
  cost double,
  PRIMARY KEY (id)
);


INSERT INTO my_db.drinks (name, cost)
VALUES
	('Hot tea', 1),
	('Cold tea', 1.2),
	('Cappucccino', 2.2),
    ('Coffee With Milk', 2.3),
    ('Espresso', 1.5),
    ('Latte', 2);

