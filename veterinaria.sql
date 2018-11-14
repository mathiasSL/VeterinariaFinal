-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2018 a las 20:18:25
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `personaAlternativa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `dni`, `direccion`, `telefono`, `personaAlternativa`) VALUES
(5, 'Emmanuel', 'Medina', '32855579', 'M49 C1', '265545874', '-'),
(6, 'Adrian', 'Medina', '32000000', 'M49 C1', '265545874', '-'),
(7, 'Afredo', 'Casero', '22400254', 'Bs . As', '01124582226', '-');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `alias` varchar(100) NOT NULL,
  `especie` varchar(100) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `raza` varchar(100) NOT NULL,
  `colorPelo` varchar(100) NOT NULL,
  `fecNac` date NOT NULL,
  `pesoMedio` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `idCliente`, `alias`, `especie`, `sexo`, `raza`, `colorPelo`, `fecNac`, `pesoMedio`) VALUES
(1, 5, 'Pipo', 'Canino', 'Macho', 'Cruza', 'Negro con Blanco', '2014-05-13', 16.67),
(2, 5, 'Candy', 'Canino', 'Hembra', 'Labrador', 'Dorado', '2016-06-14', 0),
(3, 6, 'Ramon', 'Ave', 'Macho', 'Loro', 'Verde', '2018-09-13', 0.2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `importe` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `tipo`, `descripcion`, `activo`, `importe`) VALUES
(1, 'VACUNACION', 'sextuple', 0, 300),
(2, 'VACUNACION', 'Quintuple', 1, 180),
(3, 'VACUNACION', 'Sextuple', 1, 180),
(4, 'VACUNACION', 'sextuple(Canino)', 1, 350),
(5, 'VACUNACION', 'Polivalente(Canino)', 1, 300),
(6, 'VACUNACION', 'AntiParvovirus(Canino)', 1, 280),
(7, 'VACUNACION', 'Quintuple(Canino)', 1, 280),
(8, 'CASTRACION', '-', 1, 150),
(9, 'CORTE Y BAÑO', '-', 1, 380),
(10, 'CORTE Y BAÑO', 'Solo Baño', 1, 200),
(11, 'CORTE Y BAÑO', 'Solo Corte', 1, 200),
(12, 'ENFERMEDAD', 'Parvovirus(Canino)', 1, 150),
(13, 'ENFERMEDAD', 'Moquillo(Canino)', 1, 150),
(14, 'ENFERMEDAD', 'Hepatitis(Canino)', 1, 150),
(15, 'ENFERMEDAD', 'Leptospirosis(Canino)', 1, 150),
(16, 'ENFERMEDAD', 'ParaInfluenza(Canino)', 1, 160),
(17, 'ENFERMEDAD', 'Rabia(Canino)', 1, 180),
(18, 'VACUNACION', 'Trivalente (Felino)', 1, 170),
(19, 'VACUNACION', 'Leucemia (Felino)', 1, 180),
(20, 'VACUNACION', 'Rabia (Felino)', 1, 180),
(21, 'ENFERMEDAD', 'Panleucopenia (Felino)', 1, 150),
(22, 'ENFERMEDAD', 'Rinotraqueitis (Felino)', 1, 150),
(23, 'ENFERMEDAD', 'Calcivirus (Felino)', 1, 150),
(24, 'ENFERMEDAD', 'Leucemia (Felino)', 1, 0),
(25, 'ENFERMEDAD', 'Rabia (Felino)', 0, 0),
(26, 'ENFERMEDAD', 'Psitacosis (Loros)', 1, 120);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitadeatencion`
--

CREATE TABLE `visitadeatencion` (
  `idVisita` int(11) NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `fechaDeVisita` date NOT NULL,
  `pesoMascota` double NOT NULL,
  `importeTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `visitadeatencion`
--

INSERT INTO `visitadeatencion` (`idVisita`, `idTratamiento`, `idMascota`, `fechaDeVisita`, `pesoMascota`, `importeTotal`) VALUES
(1, 1, 1, '2018-11-06', 15, 300),
(2, 2, 1, '2018-11-09', 20, 180),
(3, 12, 1, '2018-11-13', 15, 150),
(4, 8, 3, '2018-11-13', 0.2, 150),
(5, 26, 3, '2018-11-13', 0.2, 120);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`);

--
-- Indices de la tabla `visitadeatencion`
--
ALTER TABLE `visitadeatencion`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idTratamiento` (`idTratamiento`),
  ADD KEY `idMascota` (`idMascota`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `visitadeatencion`
--
ALTER TABLE `visitadeatencion`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascotaCliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `visitadeatencion`
--
ALTER TABLE `visitadeatencion`
  ADD CONSTRAINT `VisitaMascota` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `visitaTratamiento` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
