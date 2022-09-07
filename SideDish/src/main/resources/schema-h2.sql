drop table sidedish if exists;

create table sidedish(
    id INTEGER NOT NULL AUTO_INCREMENT,
    sideDishId INTEGER NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);