INSERT INTO critic (name,password,enabled) values ('bob','{noop}bob',true);
INSERT INTO critic (name,password,enabled) values ('alice','{noop}alice',true);

 INSERT INTO Authority (id,name,authority) values (2,'bob','CRITIC');
 INSERT INTO Authority (id,name,authority) values (1,'alice','CRITIC');

INSERT INTO  movie(id,title) values (1,  'Les Animaux Fantastiques : Les Secrets de Dumbledore');
INSERT INTO  movie(id,title) values (2,  'Top Gun : Maverick');
INSERT INTO  movie(id,title) values (3,  'Doctor Strange in the Multiverse of Madness');
INSERT INTO  movie(id,title) values (4,  'Jurassic World : Le Monde d''après');
INSERT INTO  movie(id,title) values (5,  'Buzz l''éclair');

INSERT INTO  review(id, movie_id, critic_name, rate) values (1, 1, 'bob', 3);
INSERT INTO  review(id, movie_id, critic_name, rate) values (2, 2, 'bob', 2);
INSERT INTO  review(id, movie_id, critic_name, rate) values (3, 5, 'bob', 5);
INSERT INTO  review(id, movie_id, critic_name, rate) values (4, 3, 'alice', 4);
INSERT INTO  review(id, movie_id, critic_name, rate) values (5, 1, 'alice', 5);
ALTER SEQUENCE REVIEW_ID_SEQ restart with 10;
ALTER SEQUENCE MOVIE_ID_SEQ restart with 10;


