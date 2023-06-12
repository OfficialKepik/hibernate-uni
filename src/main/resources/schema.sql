CREATE TABLE if not exists person (
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(45) NOT NULL,
    last_name varchar(64) NOT NULL,
    passport_id int DEFAULT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE if not exists  passport (
    id int NOT NULL AUTO_INCREMENT,
    number varchar(45) NOT NULL,
    country varchar(3) NOT NULL,
    PRIMARY KEY (id)
    );

ALTER TABLE person
    ADD CONSTRAINT IF NOT EXISTS fk_person_passport FOREIGN KEY (passport_id) REFERENCES passport (id);