INSERT INTO Course(id,title,credits) VALUES ('INT1','Introductions', 10);
INSERT INTO Course(id,title,credits) VALUES ('DEV1','Developpement I', 10);
INSERT INTO Course(id,title,credits) VALUES ('MAT1','Mathematique contextualisee', 6);
INSERT INTO Course(id,title,credits) VALUES ('CAI1','Communication anglophone contextualisee I', 2);
INSERT INTO Course(id,title,credits) VALUES ('CPT1','Comptabilite contextualisee I', 2);
INSERT INTO Course(id,title,credits) VALUES ('STA2','Statistique contextualisee', 3);
INSERT INTO Course(id,title,credits) VALUES ('DEV2','Developpement II', 10);
INSERT INTO Course(id,title,credits) VALUES ('DON2','Persistance des donnees I', 5);
INSERT INTO Course(id,title,credits) VALUES ('SYS2','Systemes  exploitation I', 5);
INSERT INTO Course(id,title,credits) VALUES ('CAIG3','Communication anglophone contextualisee', 3);
INSERT INTO Course(id,title,credits) VALUES ('DRTG3','Droit et philosophie contextualises', 2);

 INSERT INTO Student(matricule,nom,genre,section) VALUES (48982,'rattata','MALE','GESTION');
 INSERT INTO Student(matricule,nom,genre,section) VALUES (50987,'dracaufeu','MALE', 'GESTION');
INSERT INTO Student(matricule,nom,genre,section) VALUES (51987,'rattata','MALE', 'GESTION');
INSERT INTO Student(matricule,nom,genre,section) VALUES (54987,'pikachu','FEMALE', 'GESTION');

INSERT INTO Student(matricule,nom,genre,section) VALUES (56987,'roudoudou','FEMALE', 'INDUSTRIELLE');
INSERT INTO Student(matricule,nom,genre,section) VALUES (59987,'dynavolt','MALE', 'INDUSTRIELLE');
INSERT INTO Student(matricule,nom,genre,section) VALUES (60987,'regice','MALE', 'RESEAU');
INSERT INTO Student(matricule,nom,genre,section) VALUES (30987,'fddfds','FEMALE', 'INDUSTRIELLE');

INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(48982,'INT1');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(48982,'DRTG3');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(50987,'DEV2');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(50987,'STA2');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(50987,'CAIG3');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(51987,'STA2');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(51987,'MAT1');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(54987,'INT1');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(54987,'CAI1');

INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(54987,'CAIG3');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(54987,'DRTG3');

INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(56987,'DEV2');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(56987,'DON2');

INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(59987,'MAT1');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(59987,'CPT1');


INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(60987,'CPT1');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(60987,'CAI1');

INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(30987,'SYS2');
INSERT INTO STUDENT_COURSE(STUDENT_ID,COURSE_ID)VALUES(30987,'DON2');








