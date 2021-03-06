CREATE TABLE categories (
	category_id INT AUTO_INCREMENT  PRIMARY KEY,
	name varchar(255) not null
);

insert into categories (name) values 
('actualité'),
('astrologie'),
('jeux');

CREATE TABLE ARTICLES(
	article_id int auto_increment primary key,
	content text not null,
	author_id int,
	category_id int,
	date_pub date not null
);

insert into articles (content,author_id,category_id,date_pub) values
('Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 3,3,TO_DATE('23/12/2021', 'DD/MM/YYYY')),
('Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 1,1,TO_DATE('26/12/2021', 'DD/MM/YYYY')),
('Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 1,1 ,TO_DATE('24/12/2021', 'DD/MM/YYYY'));

CREATE TABLE author(
	author_id int auto_increment primary key,
	username varchar(50),
	password varchar(255),
	email varchar(255)
);

insert into author(username,password,email) values
('shinra-tensei','$2a$12$q8w5HMZglXsEj4qgKHp3/O2HqCV7H28UrhY/lrZnDUAzQ1aYHWJAW','shinra-tensei@gmail.com'),
('jojo','$2a$12$q8w5HMZglXsEj4qgKHp3/O2HqCV7H28UrhY/lrZnDUAzQ1aYHWJAW','jojo@gmail.com'),
('mob','$2a$12$q8w5HMZglXsEj4qgKHp3/O2HqCV7H28UrhY/lrZnDUAzQ1aYHWJAW','mob@gmail.com');


CREATE TABLE COMMENTARIES(
	comment_id int auto_increment primary key,
	date_pub date not null,
	content text not null,
	article_id int, 
	author_id int
 );
 
insert into commentaries (date_pub,content,author_id,article_id) values 
(TO_DATE('28/12/2021', 'DD/MM/YYYY'),'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical',1,3),
(TO_DATE('28/12/2021', 'DD/MM/YYYY'),'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical',3,3),
(TO_DATE('25/12/2021', 'DD/MM/YYYY'),'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical',2,1),
(TO_DATE('25/12/2021', 'DD/MM/YYYY'),'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical',3,1),
(TO_DATE('27/12/2021', 'DD/MM/YYYY'),'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical',3,2);


/*
CREATE TABLE CATEGORY_ARTICLE(
	category_id int not null,
	article_id int not null,
	primary key (category_id,article_id)
);


INSERT INTO category_article (category_id, article_id) VALUES
  (1,3),
  (1,2),
  (1,4),
  (2,1),
  (3,2);*/