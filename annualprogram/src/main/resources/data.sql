insert into Unit (id,title,semester,ects) values ('INT1',  'Introduction à l''informatique',1,10);
insert into Unit (id,title,semester,ects) values ('MAT1',  'Mathématique contextualisée',1,6);
insert into Unit (id,title,semester,ects) values ('CAI1',  'Communication anglophone contextualisée I',1,2);
insert into Unit (id,title,semester,ects) values ('CPT1',  'Comptabilité contextualisée I',1,2);
insert into Unit (id,title,semester,ects) values ('DEV1',  'Développement I',1,10);
insert into Unit (id,title,semester,ects) values ('STA2',  'Statistique contextualisée',2,3);
insert into Unit (id,title,semester,ects) values ('CAI2',  'Communication anglophone contextualisée II',2,2);
insert into Unit (id,title,semester,ects) values ('DEV2',  'Développement II',2,10);
insert into Unit (id,title,semester,ects) values ('DON2',  'Persistance des données I',2,5);
insert into Unit (id,title,semester,ects) values ('SYS2',  'Systèmes d''exploitation I',2,5);
insert into Unit (id,title,semester,ects) values ('WEBG2', 'Développement Web I',2,5);
insert into Unit (id,title,semester,ects) values ('PHYIR2', 'Physique I',2,3);
insert into Unit (id,title,semester,ects) values ('RESIR2', 'Réseau II',2,2);

insert into Unit_Sections (unit_id, sections) values ('INT1', 'G');
insert into Unit_Sections (unit_id, sections) values ('MAT1', 'G');
insert into Unit_Sections (unit_id, sections) values ('CAI1', 'G');
insert into Unit_Sections (unit_id, sections) values ('CPT1', 'G');
insert into Unit_Sections (unit_id, sections) values ('DEV1', 'G');
insert into Unit_Sections (unit_id, sections) values ('STA2', 'G');
insert into Unit_Sections (unit_id, sections) values ('CAI2', 'G');
insert into Unit_Sections (unit_id, sections) values ('DEV2', 'G');
insert into Unit_Sections (unit_id, sections) values ('DON2', 'G');
insert into Unit_Sections (unit_id, sections) values ('SYS2', 'G');
insert into Unit_Sections (unit_id, sections) values ('INT1', 'I');
insert into Unit_Sections (unit_id, sections) values ('MAT1', 'I');
insert into Unit_Sections (unit_id, sections) values ('CAI1', 'I');
insert into Unit_Sections (unit_id, sections) values ('CPT1', 'I');
insert into Unit_Sections (unit_id, sections) values ('DEV1', 'I');
insert into Unit_Sections (unit_id, sections) values ('STA2', 'I');
insert into Unit_Sections (unit_id, sections) values ('CAI2', 'I');
insert into Unit_Sections (unit_id, sections) values ('DEV2', 'I');
insert into Unit_Sections (unit_id, sections) values ('DON2', 'I');
insert into Unit_Sections (unit_id, sections) values ('SYS2', 'I');
insert into Unit_Sections (unit_id, sections) values ('INT1', 'R');
insert into Unit_Sections (unit_id, sections) values ('MAT1', 'R');
insert into Unit_Sections (unit_id, sections) values ('CAI1', 'R');
insert into Unit_Sections (unit_id, sections) values ('CPT1', 'R');
insert into Unit_Sections (unit_id, sections) values ('DEV1', 'R');
insert into Unit_Sections (unit_id, sections) values ('STA2', 'R');
insert into Unit_Sections (unit_id, sections) values ('CAI2', 'R');
insert into Unit_Sections (unit_id, sections) values ('DEV2', 'R');
insert into Unit_Sections (unit_id, sections) values ('DON2', 'R');
insert into Unit_Sections (unit_id, sections) values ('SYS2', 'R');
insert into Unit_Sections (unit_id, sections) values ('WEBG2', 'G');
insert into Unit_Sections (unit_id, sections) values ('PHYIR2', 'I');
insert into Unit_Sections (unit_id, sections) values ('PHYIR2', 'R');
insert into Unit_Sections (unit_id, sections) values ('RESIR2', 'I');
insert into Unit_Sections (unit_id, sections) values ('RESIR2', 'R');

INSERT INTO Student (number,name,bloc,section) VALUES (40001,'Baker Gates',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40002,'Lillith Meyers',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40003,'Nevada Cline',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40004,'Kaitlin Christensen',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40005,'Peter Cote',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40006,'Gannon Wade',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40007,'Elizabeth Avery',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40008,'Leah Christian',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40009,'May Santos',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40010,'Sybil Zimmerman',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40011,'Jasmine Brady',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40012,'Martina Parks',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40013,'Brenden Gilbert',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40014,'Margaret Vazquez',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40015,'Donna Fisher',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40016,'Emily Burgess',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40017,'Brenden Lawrence',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40018,'Ivory Steele',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40019,'Lillian Rios',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40020,'Griffin Ayala',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40021,'Victoria Perkins',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40022,'Marny Moore',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40023,'Carol Ellison',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40024,'Bethany Ayers',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40025,'TaShya Wallace',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40026,'Alice Hyde',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40027,'Keane Holloway',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40028,'Charles Jennings',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40029,'Kiona Mcmillan',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40030,'Neville Moody',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40031,'Damian Brock',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40032,'Zeus Owen',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40033,'Josephine Willis',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40034,'Regina Burt',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40035,'George Collins',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40036,'Blossom Martinez',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40037,'Moana Pena',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40038,'Walter Davidson',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40039,'Price Hutchinson',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40040,'Audrey Morales',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40041,'Melinda Kennedy',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40042,'Jael Sellers',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40043,'Chandler Wolfe',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40044,'Rosalyn Lowery',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40045,'Calvin Dixon',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40046,'Jarrod Kline',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40047,'Cole Little',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40048,'Amir Fowler',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40049,'Ariana Matthews',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40050,'Dylan Sears',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40051,'Fritz Wheeler',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40052,'Meghan Everett',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40053,'Rudyard Bush',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40054,'Peter Goodman',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40055,'Marvin Rodriguez',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40056,'Vernon Tyson',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40057,'Murphy Henson',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40058,'Karina Stuart',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40059,'Kay Abbott',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40060,'Marny Sharp',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40061,'Darryl Martin',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40062,'Illiana Franklin',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40063,'Tiger Heath',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40064,'Zelda Logan',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40065,'Guy Brock',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40066,'Calista Cabrera',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40067,'Cairo Castaneda',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40068,'Kai Sellers',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40069,'Stacy Nash',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40070,'Adena Jefferson',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40071,'Anika Hensley',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40072,'Medge Huff',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40073,'Colin Massey',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40074,'Amethyst Black',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40075,'Clayton Underwood',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40076,'Dane Acosta',1,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40077,'Shad Newman',3,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40078,'Maia Dunlap',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40079,'Geraldine Sampson',2,'I');
INSERT INTO Student (number,name,bloc,section) VALUES (40080,'Elton Wolfe',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40081,'Carson Armstrong',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40082,'Timon Allison',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40083,'Sarah Waller',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40084,'Farrah Newton',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40085,'Renee Shepard',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40086,'Alea Neal',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40087,'Quincy Acosta',1,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40088,'Connor Hess',2,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40089,'Craig Meyers',3,'R');
INSERT INTO Student (number,name,bloc,section) VALUES (40090,'Jordan Bowman',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40091,'Plato Waller',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40092,'Brady Mathews',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40093,'Virginia Herrera',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40094,'Gemma Reyes',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40095,'Guinevere Stuart',1,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40096,'Cameron Dominguez',2,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40097,'James Hickman',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40098,'Calvin Luna',3,'G');
INSERT INTO Student (number,name,bloc,section) VALUES (40099,'Stewart Harmon',2,'G');
ALTER SEQUENCE student_seq restart with 40100;

INSERT INTO Annual_Program (id,student_number) VALUES (1,40001);
INSERT INTO Annual_Program (id,student_number) VALUES (2,40002);
INSERT INTO Annual_Program (id,student_number) VALUES (3,40003);
INSERT INTO Annual_Program (id,student_number) VALUES (4,40004);
INSERT INTO Annual_Program (id,student_number) VALUES (5,40005);
INSERT INTO Annual_Program (id,student_number) VALUES (6,40006);
INSERT INTO Annual_Program (id,student_number) VALUES (7,40007);
INSERT INTO Annual_Program (id,student_number) VALUES (8,40008);
INSERT INTO Annual_Program (id,student_number) VALUES (9,40009);
INSERT INTO Annual_Program (id,student_number) VALUES (10,40010);
INSERT INTO Annual_Program (id,student_number) VALUES (11,40011);
INSERT INTO Annual_Program (id,student_number) VALUES (12,40012);
INSERT INTO Annual_Program (id,student_number) VALUES (13,40013);
INSERT INTO Annual_Program (id,student_number) VALUES (14,40014);
INSERT INTO Annual_Program (id,student_number) VALUES (15,40015);
INSERT INTO Annual_Program (id,student_number) VALUES (16,40016);
INSERT INTO Annual_Program (id,student_number) VALUES (17,40017);
INSERT INTO Annual_Program (id,student_number) VALUES (18,40018);
INSERT INTO Annual_Program (id,student_number) VALUES (19,40019);
INSERT INTO Annual_Program (id,student_number) VALUES (20,40020);
INSERT INTO Annual_Program (id,student_number) VALUES (21,40021);
INSERT INTO Annual_Program (id,student_number) VALUES (22,40022);
INSERT INTO Annual_Program (id,student_number) VALUES (23,40023);
INSERT INTO Annual_Program (id,student_number) VALUES (24,40024);
INSERT INTO Annual_Program (id,student_number) VALUES (25,40025);
INSERT INTO Annual_Program (id,student_number) VALUES (26,40026);
INSERT INTO Annual_Program (id,student_number) VALUES (27,40027);
INSERT INTO Annual_Program (id,student_number) VALUES (28,40028);
INSERT INTO Annual_Program (id,student_number) VALUES (29,40029);
INSERT INTO Annual_Program (id,student_number) VALUES (30,40030);
INSERT INTO Annual_Program (id,student_number) VALUES (31,40031);
INSERT INTO Annual_Program (id,student_number) VALUES (32,40032);
INSERT INTO Annual_Program (id,student_number) VALUES (33,40033);
INSERT INTO Annual_Program (id,student_number) VALUES (34,40034);
INSERT INTO Annual_Program (id,student_number) VALUES (35,40035);
INSERT INTO Annual_Program (id,student_number) VALUES (36,40036);
INSERT INTO Annual_Program (id,student_number) VALUES (37,40037);
INSERT INTO Annual_Program (id,student_number) VALUES (38,40038);
INSERT INTO Annual_Program (id,student_number) VALUES (39,40039);
INSERT INTO Annual_Program (id,student_number) VALUES (40,40040);
INSERT INTO Annual_Program (id,student_number) VALUES (41,40041);
INSERT INTO Annual_Program (id,student_number) VALUES (42,40042);
INSERT INTO Annual_Program (id,student_number) VALUES (43,40043);
INSERT INTO Annual_Program (id,student_number) VALUES (44,40044);
INSERT INTO Annual_Program (id,student_number) VALUES (45,40045);
INSERT INTO Annual_Program (id,student_number) VALUES (46,40046);
INSERT INTO Annual_Program (id,student_number) VALUES (47,40047);
INSERT INTO Annual_Program (id,student_number) VALUES (48,40048);
INSERT INTO Annual_Program (id,student_number) VALUES (49,40049);
INSERT INTO Annual_Program (id,student_number) VALUES (50,40050);
INSERT INTO Annual_Program (id,student_number) VALUES (51,40051);
INSERT INTO Annual_Program (id,student_number) VALUES (52,40052);
INSERT INTO Annual_Program (id,student_number) VALUES (53,40053);
INSERT INTO Annual_Program (id,student_number) VALUES (54,40054);
INSERT INTO Annual_Program (id,student_number) VALUES (55,40055);
INSERT INTO Annual_Program (id,student_number) VALUES (56,40056);
INSERT INTO Annual_Program (id,student_number) VALUES (57,40057);
INSERT INTO Annual_Program (id,student_number) VALUES (58,40058);
INSERT INTO Annual_Program (id,student_number) VALUES (59,40059);
INSERT INTO Annual_Program (id,student_number) VALUES (60,40060);
INSERT INTO Annual_Program (id,student_number) VALUES (61,40061);
INSERT INTO Annual_Program (id,student_number) VALUES (62,40062);
INSERT INTO Annual_Program (id,student_number) VALUES (63,40063);
INSERT INTO Annual_Program (id,student_number) VALUES (64,40064);
INSERT INTO Annual_Program (id,student_number) VALUES (65,40065);
INSERT INTO Annual_Program (id,student_number) VALUES (66,40066);
INSERT INTO Annual_Program (id,student_number) VALUES (67,40067);
INSERT INTO Annual_Program (id,student_number) VALUES (68,40068);
INSERT INTO Annual_Program (id,student_number) VALUES (69,40069);
INSERT INTO Annual_Program (id,student_number) VALUES (70,40070);
INSERT INTO Annual_Program (id,student_number) VALUES (71,40071);
INSERT INTO Annual_Program (id,student_number) VALUES (72,40072);
INSERT INTO Annual_Program (id,student_number) VALUES (73,40073);
INSERT INTO Annual_Program (id,student_number) VALUES (74,40074);
INSERT INTO Annual_Program (id,student_number) VALUES (75,40075);
INSERT INTO Annual_Program (id,student_number) VALUES (76,40076);
INSERT INTO Annual_Program (id,student_number) VALUES (77,40077);
INSERT INTO Annual_Program (id,student_number) VALUES (78,40078);
INSERT INTO Annual_Program (id,student_number) VALUES (79,40079);
INSERT INTO Annual_Program (id,student_number) VALUES (80,40080);
INSERT INTO Annual_Program (id,student_number) VALUES (81,40081);
INSERT INTO Annual_Program (id,student_number) VALUES (82,40082);
INSERT INTO Annual_Program (id,student_number) VALUES (83,40083);
INSERT INTO Annual_Program (id,student_number) VALUES (84,40084);
INSERT INTO Annual_Program (id,student_number) VALUES (85,40085);
INSERT INTO Annual_Program (id,student_number) VALUES (86,40086);
INSERT INTO Annual_Program (id,student_number) VALUES (87,40087);
INSERT INTO Annual_Program (id,student_number) VALUES (88,40088);
INSERT INTO Annual_Program (id,student_number) VALUES (89,40089);
INSERT INTO Annual_Program (id,student_number) VALUES (90,40090);
INSERT INTO Annual_Program (id,student_number) VALUES (91,40091);
INSERT INTO Annual_Program (id,student_number) VALUES (92,40092);
INSERT INTO Annual_Program (id,student_number) VALUES (93,40093);
INSERT INTO Annual_Program (id,student_number) VALUES (94,40094);
INSERT INTO Annual_Program (id,student_number) VALUES (95,40095);
INSERT INTO Annual_Program (id,student_number) VALUES (96,40096);
INSERT INTO Annual_Program (id,student_number) VALUES (97,40097);
INSERT INTO Annual_Program (id,student_number) VALUES (98,40098);
INSERT INTO Annual_Program (id,student_number) VALUES (99,40099);

INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (101,true,1,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (102,true,2,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (103,true,3,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (104,true,4,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (105,true,5,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (106,true,6,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (107,true,7,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (108,true,8,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (109,true,9,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (110,true,10,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (111,true,11,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (112,true,12,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (113,true,13,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (114,true,14,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (115,true,15,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (116,true,16,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (117,true,17,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (118,true,18,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (119,true,19,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (120,true,20,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (121,true,21,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (122,true,22,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (123,true,23,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (124,true,24,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (125,true,25,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (126,true,26,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (127,true,27,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (128,true,28,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (129,true,29,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (130,true,30,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (131,true,31,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (132,true,32,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (133,true,33,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (134,true,34,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (135,true,35,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (136,true,36,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (137,true,37,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (138,true,38,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (139,true,39,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (140,true,40,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (141,true,41,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (142,true,42,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (143,true,43,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (144,true,44,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (145,true,45,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (146,true,46,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (147,true,47,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (148,true,48,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (149,true,49,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (150,true,50,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (151,true,51,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (152,true,52,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (153,true,53,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (154,true,54,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (155,true,55,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (156,true,56,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (157,true,57,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (158,true,58,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (159,true,59,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (160,true,60,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (161,true,61,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (162,true,62,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (163,true,63,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (164,true,64,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (165,true,65,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (166,true,66,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (167,true,67,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (168,true,68,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (169,true,69,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (170,true,70,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (171,true,71,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (172,true,72,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (173,true,73,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (174,true,74,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (175,true,75,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (176,true,76,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (177,true,77,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (178,true,78,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (179,true,79,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (180,true,80,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (181,true,81,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (182,true,82,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (183,true,83,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (184,true,84,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (185,true,85,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (186,true,86,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (187,true,87,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (188,true,88,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (189,true,89,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (190,true,90,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (191,true,91,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (192,true,92,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (193,true,93,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (194,true,94,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (195,true,95,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (196,true,96,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (197,true,97,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (198,true,98,'INT1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (199,true,99,'INT1');

INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (201,true,1,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (202,true,2,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (203,true,3,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (204,true,4,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (205,true,5,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (206,true,6,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (207,true,7,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (208,true,8,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (209,true,9,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (210,true,10,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (211,true,11,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (212,true,12,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (213,true,13,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (214,true,14,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (215,true,15,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (216,true,16,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (217,true,17,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (218,true,18,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (219,true,19,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (220,true,20,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (221,true,21,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (222,true,22,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (223,true,23,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (224,true,24,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (225,true,25,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (226,true,26,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (227,true,27,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (228,true,28,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (229,true,29,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (230,true,30,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (231,true,31,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (232,true,32,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (233,true,33,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (234,true,34,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (235,true,35,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (236,true,36,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (237,true,37,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (238,true,38,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (239,true,39,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (240,true,40,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (241,true,41,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (242,true,42,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (243,true,43,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (244,true,44,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (245,true,45,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (246,true,46,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (247,true,47,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (248,true,48,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (249,true,49,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (250,true,50,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (251,true,51,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (252,true,52,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (253,true,53,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (254,true,54,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (255,true,55,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (256,true,56,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (257,true,57,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (258,true,58,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (259,true,59,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (260,true,60,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (261,true,61,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (262,true,62,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (263,true,63,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (264,true,64,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (265,true,65,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (266,true,66,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (267,true,67,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (268,true,68,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (269,true,69,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (270,true,70,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (271,true,71,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (272,true,72,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (273,true,73,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (274,true,74,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (275,true,75,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (276,true,76,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (277,true,77,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (278,true,78,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (279,true,79,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (280,true,80,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (281,true,81,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (282,true,82,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (283,true,83,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (284,true,84,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (285,true,85,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (286,true,86,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (287,true,87,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (288,true,88,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (289,true,89,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (290,true,90,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (291,true,91,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (292,true,92,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (293,true,93,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (294,true,94,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (295,true,95,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (296,true,96,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (297,true,97,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (298,true,98,'DEV1');
INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (299,true,99,'DEV1');

INSERT INTO Registration (id,mandatory,annual_program_id,unit_id) VALUES (301,false,1,'CAI1');



ALTER SEQUENCE hibernate_sequence restart with 1000;
