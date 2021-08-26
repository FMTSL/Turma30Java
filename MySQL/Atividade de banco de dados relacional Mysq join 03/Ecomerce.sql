create database ecommerce;
use ecommerce;

create table tb_marcas(
	id bigint(5)auto_increment,
    nome varchar(20)not null,
    ativo boolean not null,
    primary key(id));
    
    create table tb_produtos(
	id bigint(5)auto_increment,
    nome varchar(20)not null,
	preco decimal(10,2)not null,
    estoque bigint(5)not null,
    marca_id bigint(5),
	primary key(id),
    Foreign key(marca_id) references tb_marcas (id));
    
INSERT INTO tb_marcas (nome, ativo) VALUES ("Nike", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("H&M", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Zara", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Louis Vuitton", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Adidas", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Uniqlo", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Hermès", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Rolex", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Gucci", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Cartier", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Polo", true);
INSERT INTO tb_marcas (nome, ativo) VALUES ("Armany", true);

INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Sapato","60.53",11,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Camisa","58.18",9,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Meias","83.50",4,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Meias","92.81",3,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Blusa","76.95",9,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Tênis","96.56",4,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Sapato","61.16",8,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Sapato","73.08",4,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Meias","53.45",6,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Camisa","56.92",3,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Blusa","81.02",9,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Meias","900.09",11,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Tênis","55.73",9,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Sapato","09.46",10,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Calça","60.61",10,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Calça","71.91",7,20);
INSERT INTO tb_produtos (nome,preco,marca_id,estoque) VALUES ("Joia","504.90",7,20);

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_marcas set ativo = false where id = 4;


