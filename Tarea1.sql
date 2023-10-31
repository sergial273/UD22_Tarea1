DROP database IF exists ClientesDB;
CREATE DATABASE ClientesDB;

USE ClientesDB;

CREATE TABLE Clientes (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(250) DEFAULT NULL,
    apellido VARCHAR(250) DEFAULT NULL,
    direccion VARCHAR(250) DEFAULT NULL,
    dni INT(11) DEFAULT NULL,
    fecha VARCHAR(250) DEFAULT NULL,
    PRIMARY KEY (id)
);


INSERT INTO Clientes (nombre, apellido, direccion, dni, fecha) VALUES
('Juan', 'Pérez', 'Calle A, Ciudad X', 123456789, '1990-01-15'),
('María', 'García', 'Calle B, Ciudad Y', 987654321, '1985-03-20'),
('Luis', 'Rodríguez', 'Calle C, Ciudad Z', 555555555, '1978-06-10'),
('Ana', 'Sánchez', 'Calle D, Ciudad X', 777777777, '1993-09-30'),
('Carlos', 'López', 'Calle E, Ciudad Y', 111111111, '1982-11-25'),
('Laura', 'Martínez', 'Calle F, Ciudad Z', 999999999, '1987-12-05'),
('Pedro', 'González', 'Calle G, Ciudad X', 444444444, '1980-04-12'),
('Marta', 'Fernández', 'Calle H, Ciudad Y', 222222222, '1995-07-18'),
('Javier', 'Torres', 'Calle I, Ciudad Z', 888888888, '1977-10-07'),
('Isabel', 'Ramírez', 'Calle J, Ciudad X', 666666666, '1992-02-22');
