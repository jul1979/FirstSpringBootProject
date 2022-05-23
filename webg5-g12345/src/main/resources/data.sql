INSERT INTO Subscriber (login,name) VALUES ('g48982','jules');
INSERT INTO Subscriber (login,name) VALUES ('g55032','Frank');
INSERT INTO Subscriber (login,name) VALUES ('g51034','vivace');


INSERT INTO Repository (id,name,user_id) VALUES ('1','premier depot','g48982');
INSERT INTO Repository (id,name,user_id) VALUES ('2','deuxième depot','g55032');
INSERT INTO Repository (id,name,user_id) VALUES ('3','troisième depot','g55032');
INSERT INTO Repository (id,name,user_id) VALUES ('4','quatrième depot','g55032');


INSERT INTO COMMIT (id,date,message,repository_id) VALUES (1,'2020-05-30','premier commit',1);
INSERT INTO COMMIT (id,date,message,repository_id) VALUES (2,'2020-06-30','premier commit',2);
INSERT INTO COMMIT (id,date,message,repository_id) VALUES (3,'2020-07-30','premier commit',2);
INSERT INTO COMMIT (id,date,message,repository_id) VALUES (4,'2019-07-10','premier commit',3);
INSERT INTO COMMIT (id,date,message,repository_id) VALUES (5,'2021-07-20','premier commit',4);

ALTER SEQUENCE repo_seq restart with 5;
ALTER SEQUENCE commit_seq restart with 6;