
insert into student (number,name) values (1,'StudentA');
insert into student (number,name) values (2,'StudentB');
insert into student (number,name) values (3,'StudentC');
insert into student (number,name) values (4,'StudentD');
insert into student (number,name) values (5,'StudentE');
insert into student (number,name) values (6,'StudentF');

insert into task(id,description) values ('Exercice1','faire des tests');
insert into task(id,description) values ('Exercice2','trier tableau');
insert into task(id,description) values ('Exercice3','creer SGBD');
insert into task(id,description) values ('Exercice4','faire un pull request');
insert into task(id,description) values ('Exercice5','faire une GUI');

insert into student_task(student_id,task_id) values (6,'Exercice4');
insert into student_task(student_id,task_id) values (6,'Exercice3');
insert into student_task(student_id,task_id) values (5,'Exercice3');
insert into student_task(student_id,task_id) values (4,'Exercice2');
insert into student_task(student_id,task_id) values (3,'Exercice1');
insert into student_task(student_id,task_id) values (2,'Exercice5');
insert into student_task(student_id,task_id) values (1,'Exercice4');
insert into student_task(student_id,task_id) values (1,'Exercice2');

INSERT INTO Users (id,username,password,enabled) values (1,'StudentA','{noop}studenta',true);
INSERT INTO Users (id,username,password,enabled) values (2,'StudentB','{noop}studentb',true);
INSERT INTO Authority (id,username,authority) values (1,'StudentA','PROF');
INSERT INTO Authority (id,username,authority) values (2,'StudentB','ADMIN');



