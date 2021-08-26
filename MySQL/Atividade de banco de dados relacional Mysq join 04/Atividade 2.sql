create database db_pizzaria_legal;
-- create database
use db_pizzaria_legal;
-- use database
create table tb_categoria( -- create table
	id_categoria int(5) not null,
	tipo varchar(20) not null,
    tamanho varcharacter(1) not null,
    primary key(id_categoria)
);
-- insere as categorias
insert into tb_categoria (id_categoria, tipo, tamanho) values (1, 'Salgada', 'G'), (2, 'Doce', 'G'), (3, 'Salgada', 'M'), (4, 'Doce', 'M');

create table tb_pizza( -- create table
	id int(5) auto_increment,
    categoria_id int not null,
    sabor varchar(20) not null,
	preco int(4) not null,
    primary key(id),
	foreign key(categoria_id) references tb_categoria (id_categoria)
);
-- insere as pizzas
insert into tb_pizza (categoria_id, sabor, preco) values (1, 'Brocolis', 45), (3, 'Brocolis', 32), (2, 'Brigadeiro', 50), (4, 'Brigadeiro', 37), (1, 'Millana', 45), (3, 'Mussarela', 32), (1, 'Catupireza', 45), (1, 'Frango/Cat', 45), (1, 'Turim', 45);

-- select preco >= 45
select * from tb_pizza
	inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.categoria_id
    where tb_pizza.preco >= 45;
    
    -- select preco >= 29 <=60
select * from tb_pizza
	inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.categoria_id
    where tb_pizza.preco >= 29 and tb_pizza.preco <=60;
    
        -- select C no nome
select * from tb_pizza where sabor like 'C%';

-- select preco >= 45
select * from tb_pizza
	inner join tb_categoria on tb_categoria.id_categoria = tb_pizza.categoria_id
    where tb_categoria.tamanho = 'M';
    
select * from tb_pizza;