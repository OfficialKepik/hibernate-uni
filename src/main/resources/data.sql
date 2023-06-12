delete from passport;
delete from person;

insert into passport (id,number,country) values(1,'DB2351345', 'BY');
insert into passport (id,number,country) values(2,'DB1233346', 'BY');

insert into person (id,first_name, last_name, passport_id) values(1,'Ivan', 'Ivanov',1);
insert into person (id,first_name, last_name, passport_id) values(2,'John', 'Smith',2);