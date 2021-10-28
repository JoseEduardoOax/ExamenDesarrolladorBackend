CREATE DATABASE grandes_almacenes;

use grandes_almacenes;

CREATE TABLE IF NOT EXISTS Productos(
	Producto int AUTO_INCREMENT PRIMARY KEY,
	Nombre varchar(100),
	Precio DECIMAL(6,2)
);


CREATE TABLE IF NOT EXISTS Cajeros(
	Cajero int AUTO_INCREMENT PRIMARY KEY,
	NomApels varchar(255)
);

CREATE TABLE IF NOT EXISTS Maquinas_Registradoras(
	Maquina int AUTO_INCREMENT PRIMARY KEY,
	Piso int
);

CREATE TABLE IF NOT EXISTS Venta(
	Cajero int,
	Maquina int,
	Producto int,
	FOREIGN KEY (Cajero) REFERENCES Cajeros(Cajero),
	FOREIGN KEY (Maquina) REFERENCES Maquinas_Registradoras(Maquina),
	FOREIGN KEY (Producto) REFERENCES Productos(Producto)
);
