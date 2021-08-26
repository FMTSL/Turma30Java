create database escola;
use escola;

create table estudantes ( 
id bigint (5) auto_increment,
nome varchar(50) not null,
serie bigint (9) not null,
nota1 decimal(10,2),
nota2 decimal(10,2),
media decimal as ((nota1 + nota2)/ 2),
primary key(id));

insert into estudantes (nome, serie, nota1, nota2) values ("Matheus", 9, 8, 4.3);
insert into estudantes (nome, serie, nota1, nota2) values ("A", 6, 8, 10);
insert into estudantes (nome, serie, nota1, nota2) values ("B", 5, 7, 9.3);
insert into estudantes (nome, serie, nota1, nota2) values ("C", 4, 10, 5.3);
insert into estudantes (nome, serie, nota1, nota2) values ("D", 3, 6, 6.3);
insert into estudantes (nome, serie, nota1, nota2) values ("E", 2, 4, 7.3);
insert into estudantes (nome, serie, nota1, nota2) values ("F", 7, 3, 8.3);
insert into estudantes (nome, serie, nota1, nota2) values ("G", 8, 8, 9.3);

select * from estudantes where media >= 7;
select * from estudantes where media <= 7;
update estudantes set nota2 = 10
where id = 2;