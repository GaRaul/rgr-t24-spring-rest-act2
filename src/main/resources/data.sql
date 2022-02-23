DROP table IF EXISTS fabricante;
DROP table IF EXISTS articulo;

create table fabricante(
    id int auto_increment,
    nombre varchar(250)
    );

create table articulo(
	id int auto_increment,
    nombre varchar(250),
    precio int,
    fabricante_id int,
    constraint aticulo_fk foreign key (fabricante_id) references fabricante(id) on delete cascade);

insert into fabricante (nombre)values('Crucial');
insert into fabricante (nombre)values('Kingston');
insert into fabricante (nombre)values('Patriot');
insert into fabricante (nombre)values('GSkill');
insert into fabricante (nombre)values('Razer');

insert into articulo (nombre, precio, fabricante) values ('SSD', 93, 1);
insert into articulo (nombre, precio, fabricante) values ('Memoria RAM 8gb', 50, 1);
insert into articulo (nombre, precio, fabricante) values ('HDD', 77, 2);
insert into articulo (nombre, precio, fabricante) values ('RTX 3090', 68, 3);
insert into articulo (nombre, precio, fabricante) values ('Placa Base', 100, 4);
insert into articulo (nombre, precio, fabricante) values ('Teclado', 120, 5);
