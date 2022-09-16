-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2022 a las 04:58:54
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adminmascotas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

CREATE TABLE `doctor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `direccion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gato`
--

CREATE TABLE `gato` (
  `id` int(11) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `id_mascota` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hospital`
--

CREATE TABLE `hospital` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `tipo_paciente` varchar(30) NOT NULL,
  `id_doctor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hospital_mascota`
--

CREATE TABLE `hospital_mascota` (
  `id` int(11) NOT NULL,
  `id_mascota` int(11) NOT NULL,
  `id_hospital` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `id` int(11) NOT NULL,
  `codigo` varchar(5) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `anionac` int(4) NOT NULL,
  `color` varchar(20) NOT NULL,
  `estadosalud` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`id`, `codigo`, `nombre`, `anionac`, `color`, `estadosalud`) VALUES
(1, '22', 'MANCHAS', 2000, 'BLANCO NEGRO', 'Sano'),
(2, '2134', 'SAMY', 2001, 'BEIGE', 'Healthy'),
(3, '321', 'Pepe', 2001, 'blanco', 'Sano'),
(4, '2132', 'ssdfs', 2232, 'dfsdf', 'Saludable'),
(5, '6543', 'petete', 2017, 'negro', 'Enfermo'),
(6, '7809', 'Miperro', 2012, 'Cafe', 'Saludable'),
(7, '7678', 'FIRU', 2019, 'CAFE', 'Enfermo'),
(9, '6666', 'perro', 2019, 'blanco', 'Enfermo'),
(11, '1111', 'FIRULAIS', 2022, 'NEGROBLANCO', 'Enfermo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perro`
--

CREATE TABLE `perro` (
  `id` int(11) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `pedigree` tinyint(1) NOT NULL,
  `id_mascota` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `perro`
--

INSERT INTO `perro` (`id`, `raza`, `pedigree`, `id_mascota`) VALUES
(1, 'Criollo', 0, 1),
(2, 'Schnauzer', 1, 2),
(3, 'Chau Chau', 1, 3),
(4, 'Beagle', 0, 4),
(5, 'Pastor Alemán', 1, 5),
(6, 'Chihuahua', 1, 6),
(7, 'Pastor Alemán', 0, 7),
(8, 'Pastor Alemán', 1, 9),
(9, 'Beagle', 1, 11);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `gato`
--
ALTER TABLE `gato`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`);

--
-- Indices de la tabla `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_doctor` (`id_doctor`);

--
-- Indices de la tabla `hospital_mascota`
--
ALTER TABLE `hospital_mascota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`),
  ADD KEY `id_hospital` (`id_hospital`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `perro`
--
ALTER TABLE `perro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `gato`
--
ALTER TABLE `gato`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hospital`
--
ALTER TABLE `hospital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hospital_mascota`
--
ALTER TABLE `hospital_mascota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `perro`
--
ALTER TABLE `perro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `gato`
--
ALTER TABLE `gato`
  ADD CONSTRAINT `gato_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`);

--
-- Filtros para la tabla `hospital`
--
ALTER TABLE `hospital`
  ADD CONSTRAINT `hospital_ibfk_1` FOREIGN KEY (`id_doctor`) REFERENCES `doctor` (`id`);

--
-- Filtros para la tabla `hospital_mascota`
--
ALTER TABLE `hospital_mascota`
  ADD CONSTRAINT `hospital_mascota_ibfk_1` FOREIGN KEY (`id_hospital`) REFERENCES `hospital` (`id`),
  ADD CONSTRAINT `hospital_mascota_ibfk_2` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`);

--
-- Filtros para la tabla `perro`
--
ALTER TABLE `perro`
  ADD CONSTRAINT `perro_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
