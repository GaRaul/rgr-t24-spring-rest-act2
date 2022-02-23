DROP table IF EXISTS articulo;
DROP table IF EXISTS fabricante;

create table fabricante(
    id int auto_increment primary key,
    nombre varchar(250));

create table articulo(
	id int auto_increment primary key,
    nombre varchar(250),
    precio int,
    fabricante_id int,
	foreign key (fabricante_id) references fabricante(id) on delete cascade on update cascade);

insert into fabricante (nombre)values('Crucial');
insert into fabricante (nombre)values('Kingston');
insert into fabricante (nombre)values('Patriot');
insert into fabricante (nombre)values('GSkill');
insert into fabricante (nombre)values('Razer');

insert into articulo (nombre, precio, fabricante_id) values ('SSD', 93, 1);
insert into articulo (nombre, precio, fabricante_id) values ('Memoria RAM 8gb', 50, 1);
insert into articulo (nombre, precio, fabricante_id) values ('HDD', 77, 2);
insert into articulo (nombre, precio, fabricante_id) values ('RTX 3090', 68, 3);
insert into articulo (nombre, precio, fabricante_id) values ('Placa Base', 100, 4);
insert into articulo (nombre, precio, fabricante_id) values ('Teclado', 120, 5);
