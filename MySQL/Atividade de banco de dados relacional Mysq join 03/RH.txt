create database db_rh;
use db_rh;
create table tb_funcionaios(
id bigint (3) auto_increment,
nome varchar (50) not null,
idade bigint (2) not null,
salario decimal (5),
ativo boolean,
primary key (id) ); 
select *from tb_funcionaios 
insert into tb_funcionaios (nome, idade, salario, ativo) 
values ("Felipe", 24, 1200.00, true );

insert into tb_funcionaios (nome, idade, salario, ativo) 
values ("Sabrina", 25, 2000.00, true );

insert into tb_funcionaios (nome, idade, salario, ativo) 
values ("Matheus", 20, 3000.00, true );

insert into tb_funcionaios (nome, idade, salario, ativo) 
values ("Ana", 18, 5000.00, true );

select *from tb_funcionaios where salario > 2000
select *from tb_funcionaios where salario <= 2000

update tb_funcionaios set nome = "Maria" where id = 1 
