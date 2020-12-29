-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-12-2020 a las 21:44:20
-- Versión del servidor: 10.1.34-MariaDB
-- Versión de PHP: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

CREATE TABLE `actividad` (
  `id_act` int(11) NOT NULL,
  `actividad` varchar(100) NOT NULL,
  `id_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actividad`
--

INSERT INTO `actividad` (`id_act`, `actividad`, `id_client`) VALUES
(1, 'Mantto Preventivo/ Correctivo', 4),
(2, 'Mantto Preventivo/ Correctivo', 4),
(3, 'Instalacion de Hardware', 4),
(4, 'Instalacion de Hardware', 4),
(5, 'Revision/ Diagnostico', 4),
(6, 'Configuracion de Acceso a Internet', 4),
(7, 'Trabajo Realizado sobre Cotizacion', 4),
(8, 'hola', 4),
(9, 'Reparacion de Accesorio', 5),
(10, 'Instalacion de Hardware', 5),
(11, 'Mantto Preventivo/ Correctivo', 6),
(12, 'Reparacion de Accesorio', 6),
(13, 'Instalacion de Hardware', 6),
(14, 'Instalacion de Hardware', 6),
(15, 'Revision/ Diagnostico', 6),
(16, 'Configuracion de Acceso a Internet', 6),
(17, 'Trabajo Realizado sobre Cotizacion', 6),
(18, 'CCTV', 6),
(19, 'Instalacion de Hardware', 7),
(20, 'Revision/ Diagnostico', 7),
(21, 'Trabajo Realizado sobre Cotizacion', 7),
(22, 'CCTV', 7),
(23, 'Reparacion de Accesorio', 8),
(24, 'Revision/ Diagnostico', 8),
(25, 'Mantto Preventivo/ Correctivo', 9),
(26, 'Instalacion de Hardware', 9),
(27, 'Revision/ Diagnostico', 9),
(28, 'Instalacion de Hardware', 10),
(29, 'Configuracion de Acceso a Internet', 10),
(30, 'Trabajo Realizado sobre Cotizacion', 10),
(31, 'Mantto Preventivo/ Correctivo', 11),
(32, 'Reparacion de Accesorio', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `ciudad` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `rfc` varchar(100) NOT NULL,
  `tel` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `cp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `ciudad`, `direccion`, `correo`, `rfc`, `tel`, `estado`, `cp`) VALUES
(1, 'Olegario', 'Gutierrez Zamora', 'Av. olegario', '16610010@utgz.edu.mx', '7854510235', 'Veracruz', '93556|', '6156sad15as6d5'),
(2, 'Milton', 'zamora', 'malecon', 'sjkad@kcas.com', '516545656', 'veracruz', '5646', '8855'),
(3, 'Carlos', 'tecolutla', 'nose xd', 'mota@mota.ocm', '656546', 'veracruz', '54646', 'sa354das654a'),
(4, 'Eloy', 'Zamora', 'carrillo Puerto', '16610010@utgz.edu.mx', '7661009266', 'Veracruz', '93562', '6546sad656as'),
(5, 'Jorge Benavidez', 'San rafael', 'san rafael', 'sajja@jaskq.com', '5547255', '5555', '55554', 'asd4sd5a5a'),
(6, 'panther olegario', 'teoclutla', 'sibnfkjasnj', '1665345@bgmail.com', '554545454', 'puebla', '5555', 'as5as5d4sa4d'),
(7, 'Milton Osas', 'Gutierrez Zamora', 'uuuuuuuuuuuh', 'osasMil@gmail.com', '556156156', 'Veracruz', '93556', '56as15d6as4d56a'),
(8, 'Olegario Benitez', 'Gutierrez Zamora ', 'Av. tu hermana ', '16610237@utgz.edu.mx', '123212132', '7661008973', 'Veracruz', '93570'),
(9, 'Ana', 'gutierrez zamora', 'gutierrez zamora', '16610410@utgz.edu.mx', '5645646546465', '5411565614654', 'veracruz', '15656'),
(10, 'Eloy Marcos Dominguez', 'Gutierrez Zamora', 'Santa Rosa ', '16610010@utgz.edu.mx', 'N/A', '7661009266', 'Veracruz', '93556'),
(11, 'Federico', 'Gutierrez Zamora', 'Libertad', 'fedricopro@xpg.com', 'jJKLBHDAJK', '127638127', 'Veracruz', '93565'),
(12, 'kj', 'kj', 'kj', 'jkh', 'k', 'jkh', 'kj', 'hkj');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cotizacion`
--

CREATE TABLE `cotizacion` (
  `id_cotizacion` int(11) NOT NULL,
  `PARTIDA` varchar(100) NOT NULL,
  `CANTIDAD` varchar(100) NOT NULL,
  `DESCRIPCION` varchar(100) NOT NULL,
  `P. UNITARIO` varchar(100) NOT NULL,
  `IMPORTE` varchar(100) NOT NULL,
  `id_cliente1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cotizacion`
--

INSERT INTO `cotizacion` (`id_cotizacion`, `PARTIDA`, `CANTIDAD`, `DESCRIPCION`, `P. UNITARIO`, `IMPORTE`, `id_cliente1`) VALUES
(1, '1', '1', 'sdaaaaaaaaaaaaaaaaaaaaaaaaaaa', '54545445', '54576654224', 7),
(2, '1', '1', '1sadasdasdasd', '1', '1', 2),
(3, '1', '1', '1', '1', '1', 1),
(4, '1', '1', '1', '1', '1', 1),
(5, '1', '1', '1', '1', '1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id` int(11) NOT NULL,
  `equipo` varchar(100) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `serie` varchar(100) NOT NULL,
  `clien_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id`, `equipo`, `marca`, `modelo`, `serie`, `clien_id`) VALUES
(1, 'pc', 'lenovo', 'ghjkasl', '256415218', 1),
(2, 'laptop', 'hp', 'ssadka', 'safdsa55as5a', 3),
(3, 'Laptop', 'Pavilion', '15-cb00la', '6545666', 4),
(4, 'celular', 'lenovo', 'jasdaksl', 'kasd', 5),
(5, 'laptop', 'hp', 'sda56', 'as kdm5s4d', 6),
(6, 'Laptop', 'Asus', 'uuuuuuuuuuuuuh', 'uuuuuuuuuuuuuuh', 7),
(7, 'Laptop', 'HP votala', '2gfa', '1212121', 8),
(8, 'escritorio', 'hp', 'votela', '5661056465', 9),
(9, 'Laptop', 'Hp', 'Pavilion 15cb000la', 'Cd564362', 10),
(10, 'Laptop', 'Lenovo', 'Inpiron', 'K/KVUYI&', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `folio`
--

CREATE TABLE `folio` (
  `id_folio` int(11) NOT NULL,
  `folio` int(11) NOT NULL,
  `id_client_f` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `folio`
--

INSERT INTO `folio` (`id_folio`, `folio`, `id_client_f`) VALUES
(1, 7, 7),
(2, 8, 8),
(3, 9, 9),
(4, 10, 10),
(5, 11, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obseentrada`
--

CREATE TABLE `obseentrada` (
  `id_entra` int(11) NOT NULL,
  `observacion` varchar(200) NOT NULL,
  `id_client_ob` int(11) NOT NULL,
  `fecha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `obseentrada`
--

INSERT INTO `obseentrada` (`id_entra`, `observacion`, `id_client_ob`, `fecha`) VALUES
(1, 'zxnbckndsj ds  cizhx cijz cjz cj zxknc xzc zxjc znxc zxknc zxkj zxkjcc zxkj czkj ckzcknzx c kzx ckjzxc kjzxc zknx cknz c', 6, '2018-09-03'),
(2, 'milton esgay and very homosexual', 6, '2018-09-03'),
(3, 'uuuuuuuuuuuuuuuuuuuuuuuhhu it is very difficult, very normal and very common', 7, '2018-09-03'),
(4, 'uuuuuuh', 8, '2018-09-03'),
(5, 'dejo cargador, y no prende en corto', 9, '2018-09-03'),
(6, 'Deja cargador\nNo accesa a internet', 10, '2018-10-26'),
(7, 'prro\n', 11, '2019-12-11');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obsesalida`
--

CREATE TABLE `obsesalida` (
  `id_sal` int(11) NOT NULL,
  `observacionsal` varchar(200) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `precio` varchar(100) NOT NULL,
  `id_client_sal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `obsesalida`
--

INSERT INTO `obsesalida` (`id_sal`, `observacionsal`, `fecha`, `precio`, `id_client_sal`) VALUES
(1, 'jinhugyftdrscfgvbhnjkl,ijmnhubgytfdghjkjmhnugytfrdefghbjnbhgvfdcesxxedcfgvhjnkmnhbgtfvdrrcfgvhj', '12/12/12', '651165', 6),
(2, 'asdfnbvdcxzcvcxzxzxzxzxzxzxzx', '12/12/12', '32', 5),
(3, '55', '12/12/12', '5456', 6),
(4, 'was difficult but we were more originals', '03/09/2018', '550', 7),
(6, 'hola', '2018-09-03', '555', 7),
(7, 'hola x2', '2018-09-03', '555555', 7),
(8, 'uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuh x2', '2018-09-06', '88888', 8),
(9, '', '2018-09-06', '500', 8),
(10, 'se formateo hy se instalo paquetieria de office', '2018-10-15', '540', 9),
(11, 'Se instalo driver de red\nSe le hizo limpieza fisica\nse hizo limpieza de sofware', '2018-10-26', '800', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` decimal(50,0) NOT NULL,
  `stock` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id`, `name`, `price`, `stock`) VALUES
(1, 'Ganso', '8', 10),
(2, 'coca', '12', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_user` int(11) NOT NULL,
  `name_user` varchar(100) NOT NULL,
  `tel_user` varchar(100) NOT NULL,
  `nick_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tipo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_user`, `name_user`, `tel_user`, `nick_name`, `password`, `email`, `tipo`) VALUES
(1, 'Eloy Marcos Dominguez', '7661009266', 'eloy23', 'pantherson', NULL, 'Manager'),
(2, 'Carlos Arturo Nieves Mora', '5589456289', 'panther123', 'mota1337', 'uuuuuuuuuuuuuuuh@gmail.com', 'Empleado'),
(3, 'Milton', '2545445', 'milton123', 'quini123', 'dsaffdsa@.com', 'Empleado'),
(4, 'fghjkl', 'ghjklñ{', 'vghjklñ{', '123456', '5454544554', 'Empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `wisp`
--

CREATE TABLE `wisp` (
  `id_wisp` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `zona` varchar(100) NOT NULL,
  `corte_ser` varchar(100) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `direccion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `wisp`
--

INSERT INTO `wisp` (`id_wisp`, `nombre`, `zona`, `corte_ser`, `tel`, `direccion`) VALUES
(1, 'Ricarda Sosa Maldonado', 'Boca de Lima', '30', '2321032120', 'Santa Cecilia, sobre la calle 16 de septiembre, s/n, esq. Benito Juarez'),
(2, 'Maria Isabel Cruz Gomez', 'Boca de Lima', '30', '7661131949', 'Santa Cecilia sobre la calle Benito Juarez'),
(3, 'Maria del Socorro Ramirez Bastian', 'Boca de Lima', '30', '7661063142', 'Santa Cecilia, Sobre la calle 20 de Noviembre, S/N (A un costado de la primaria Benito Juarez)'),
(4, 'Dra. Elisa Santiago Alejandro', 'Boca de Lima', '30', '2294015821', 'en la clicnica sobre la calle francisco villa (aun lado del parque)'),
(5, 'Eloy  Marcos Dominguez', 'Santa Rosa', '24', '7661001010', 'Santa Rosa, Cerca del Auditorio');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD PRIMARY KEY (`id_act`),
  ADD KEY `id_client` (`id_client`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
  ADD PRIMARY KEY (`id_cotizacion`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `clien_id` (`clien_id`);

--
-- Indices de la tabla `folio`
--
ALTER TABLE `folio`
  ADD PRIMARY KEY (`id_folio`),
  ADD KEY `id_client_f` (`id_client_f`);

--
-- Indices de la tabla `obseentrada`
--
ALTER TABLE `obseentrada`
  ADD PRIMARY KEY (`id_entra`),
  ADD KEY `id_client_ob` (`id_client_ob`);

--
-- Indices de la tabla `obsesalida`
--
ALTER TABLE `obsesalida`
  ADD PRIMARY KEY (`id_sal`),
  ADD KEY `id_client_sal` (`id_client_sal`);

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_user`);

--
-- Indices de la tabla `wisp`
--
ALTER TABLE `wisp`
  ADD PRIMARY KEY (`id_wisp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad`
--
ALTER TABLE `actividad`
  MODIFY `id_act` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
  MODIFY `id_cotizacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `folio`
--
ALTER TABLE `folio`
  MODIFY `id_folio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `obseentrada`
--
ALTER TABLE `obseentrada`
  MODIFY `id_entra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `obsesalida`
--
ALTER TABLE `obsesalida`
  MODIFY `id_sal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `wisp`
--
ALTER TABLE `wisp`
  MODIFY `id_wisp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD CONSTRAINT `actividad_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `cliente` (`id`);

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`clien_id`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `folio`
--
ALTER TABLE `folio`
  ADD CONSTRAINT `folio_ibfk_1` FOREIGN KEY (`id_client_f`) REFERENCES `cliente` (`id`);

--
-- Filtros para la tabla `obseentrada`
--
ALTER TABLE `obseentrada`
  ADD CONSTRAINT `obseentrada_ibfk_1` FOREIGN KEY (`id_client_ob`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `obsesalida`
--
ALTER TABLE `obsesalida`
  ADD CONSTRAINT `obsesalida_ibfk_1` FOREIGN KEY (`id_client_sal`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
