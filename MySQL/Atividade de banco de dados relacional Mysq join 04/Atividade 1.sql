create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe( -- create table
	id_classe int(5) not null,
	nome varchar(20) not null,
    ataque int(5) not null,
    defesa int(5) not null,
    primary key(id_classe));
    
    insert into tb_classe (id_classe, nome, ataque, defesa) values (1, 'Guerreiro', 900, 2300), (2, 'Mago', 2000, 700), (3, 'Assasino', 1500, 1300);
    
    create table tb_personagem( -- create table
	id int(5) auto_increment,
    classe_id int not null,
    nome varchar(20) not null,
	lvl int(4) not null,
    primary key(id),
	foreign key(classe_id) references tb_classe (id_classe));
    
    insert into tb_personagem (classe_id, nome, lvl) values (3, 'Matmatbr', 8), (1, 'Jubileu', 8), (2, 'Sahly', 8), (2, 'Daniel', 8), (1, 'Matmatbr1', 8), (2, 'Matmatbr2', 8);
    
    select * from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.classe_id
    where tb_classe.ataque >=2000;
    
    select * from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.classe_id
    where tb_classe.defesa >=1000 and tb_classe.defesa <=2000;
    
    select * from tb_personagem where nome like 'C%';
    select * from tb_personagem where classe_id = 3;idididpostagempostagemdatetitulopostagempostagempostagempostagem