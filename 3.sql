USE my_db;



CREATE TABLE typespizzas (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(25),
  cost double,
  PRIMARY KEY (id)
);

INSERT INTO my_db.typespizzas (name, cost)
VALUES
	('Пеперони', 2.3),
	('Пицца четыре сыра', 2.5),
	('Пицца с грибами', 3),
    ('Домашняя пицца', 2.2),
    ('Карбонара', 2.7);
   



