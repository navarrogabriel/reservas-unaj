insert into estado (id, descripcion) VALUES (1, 'libre');
insert into estado (id, descripcion) VALUES (2, 'ocupado');

insert into tipo_producto (id, descripcion) VALUES (1, 'equipos');
insert into tipo_producto (id, descripcion) VALUES (2, 'servicios');

insert into producto (id, descripcion, estado_id, tipo_producto_id) values (1000, 'CPU Dell X531', 1, 1);
insert into producto (id, descripcion, estado_id, tipo_producto_id) values (2000, 'CPU Dell X311', 2, 1);

insert into usuario (id, nombre, email) VALUES (1000, 'leonardogarcia', 'garcialeonardogabriel@gmail.com');
insert into usuario (id, nombre, email) VALUES (2000, 'nahuelarmanno', 'nahuelarmanno@gmail.com');
insert into usuario (id, nombre, email) VALUES (3000, 'gabrielnavarro', 'gabrielnavarro@gmail.com');