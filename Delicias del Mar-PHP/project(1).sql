-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2017 a las 21:13:07
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `project`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `date` varchar(50) NOT NULL,
  `hour` time NOT NULL,
  `people` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `name`, `date`, `hour`, `people`) VALUES
(1, 'Yamileth Garcia', '10/29/2017', '20:00:00', 6),
(2, 'Diego Hernandez', '10/22/2017', '13:00:00', 4),
(3, 'Eduardo Cruz', '10/27/2017', '21:00:00', 2),
(4, 'Rosie Garcia', '11/02/2017', '21:00:00', 5),
(5, 'weew', '11/07/2017', '13:00:00', 9),
(6, 'Abigail Garcia', '12/21/2017', '20:00:00', 2),
(7, 'Abigail Garcia', '12/21/2017', '20:00:00', 2),
(8, 'Ana Garcia', '01/23/2018', '12:00:00', 3),
(9, 'Ingrid Garcia', '11/26/2017', '13:00:00', 3),
(10, 'Alfredo', '11/15/2017', '21:00:00', 7),
(11, 'Fernanda', '11/17/2017', '11:00:00', 9),
(12, 'Fer', '11/21/2017', '20:00:00', 8),
(13, 'Ana', '11/30/2017', '16:00:00', 5),
(14, 'Ana', '11/30/2017', '16:00:00', 5),
(15, 'Enrique', '11/15/2017', '11:00:00', 6),
(16, 'Enrique', '11/15/2017', '11:00:00', 6),
(17, 'Enrique', '11/15/2017', '11:00:00', 6),
(18, 'Enrique', '11/15/2017', '11:00:00', 6),
(19, 'Enrique', '11/15/2017', '11:00:00', 6),
(20, 'Enrique', '11/15/2017', '11:00:00', 6),
(21, 'Enrique', '11/15/2017', '11:00:00', 6),
(22, 'Enrique', '11/15/2017', '11:00:00', 6),
(23, 'Enrique', '11/15/2017', '11:00:00', 6),
(24, 'Enrique', '11/15/2017', '11:00:00', 6),
(25, 'Fer Rodriguez', '12/28/2017', '19:00:00', 5),
(26, 'Ana Garcia', '12/13/2017', '20:00:00', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE `category` (
  `Category_id` int(11) NOT NULL,
  `Name_Category` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `age` int(50) NOT NULL,
  `rate` int(11) NOT NULL,
  `opinion` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `customer`
--

INSERT INTO `customer` (`id`, `name`, `email`, `sex`, `age`, `rate`, `opinion`) VALUES
(3, 'Eduardo Cruz', 'ed_cruz@hotmail.com', 'Male', 0, 5, 'Buena atencion'),
(6, 'Ana Yamileth', 'ana_123@gmail.com', 'Female', 0, 5, 'Good atention'),
(13, 'Fernando Bandala', 'fer@gmail.com', 'Male', 13, 5, 'asdfghjklÃ±'),
(19, 'Ingrid Garcia', 'ingrid@gmail.com', 'Female', 17, 4, 'qwertyuiop'),
(23, 'Gustavo Ordaz', 'gus@gmail.com', 'Male', 21, 4, 'asdfghjklÃ±'),
(37, 'Juana Ramirez', 'juana@gmail.com', 'Female', 22, 4, 'qwertyuiop'),
(45, 'Ana Garcia', 'aaa@gmail.com', 'Male', 22, 1, 'asdfghjklÃ±'),
(46, ' jlwrjovw ', '123@gmail.com', 'Male', 123, 1, 'ih Ã±eqiphenfpqned'),
(48, 'Abraham Mateo', 'alfred@gmail.com', 'Female', 1223, 4, 'asdfghjkl'),
(49, 'Ingrid Garcia', 'ingrid@gmail.com', 'Female', 15, 5, 'aklÃ±{');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employees`
--

CREATE TABLE `employees` (
  `Employee_id` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `Cellphone` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Roll` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expenses`
--

CREATE TABLE `expenses` (
  `Expenses_id` int(11) NOT NULL,
  `DateTime_Expense` datetime NOT NULL,
  `Amount` float NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Supplier_id` int(11) NOT NULL,
  `Employee_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `user` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`id`, `user`, `mail`, `pass`) VALUES
(1, 'Admin', 'ana_123@gmail.com', '1234'),
(2, 'Abi Garcia', 'abi@gmail.com', '123'),
(3, 'Yamileth', 'yami@gmail.com', '123'),
(4, 'Abrianna Garcia', 'abri@gmail.com', '111'),
(5, 'ana', '111@gmail.com', '111'),
(6, 'ana', '111@gmail.com', '111'),
(7, 'ana', '111@gmail.com', '111'),
(8, 'abi', 'abi1@gmail.com', '111'),
(9, 'eloy', 'eloy@gmail.com', '111'),
(10, 'Alfredo', 'alfred@gmail.com', '123'),
(11, '', '', ''),
(12, 'rosa', 'r@gmail.com', '123'),
(13, 'Sandra', 's@gmail.com', '222');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orders`
--

CREATE TABLE `orders` (
  `Order_id` int(11) NOT NULL,
  `Customer_id` int(11) NOT NULL,
  `Employee_id` int(11) NOT NULL,
  `Type` varchar(45) NOT NULL,
  `DateTime_OrderTaken` datetime DEFAULT NULL,
  `DateTime_OrderDelivered` datetime DEFAULT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `payment`
--

CREATE TABLE `payment` (
  `Payment_id` int(11) NOT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `Order_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `products`
--

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Category` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suppliers`
--

CREATE TABLE `suppliers` (
  `Supplier_id` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Cellphone` varchar(45) NOT NULL,
  `company_name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Type_Product` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nick` varchar(50) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `tipo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Category_id`);

--
-- Indices de la tabla `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`Employee_id`);

--
-- Indices de la tabla `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`Expenses_id`),
  ADD KEY `Supplier_id` (`Supplier_id`),
  ADD KEY `Employee_id` (`Employee_id`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_id`),
  ADD KEY `Customer_id` (`Customer_id`),
  ADD KEY `Employee_id` (`Employee_id`);

--
-- Indices de la tabla `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`Payment_id`),
  ADD KEY `Order_id` (`Order_id`);

--
-- Indices de la tabla `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `Category` (`Category`);

--
-- Indices de la tabla `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`Supplier_id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT de la tabla `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `expenses`
--
ALTER TABLE `expenses`
  ADD CONSTRAINT `expenses_ibfk_1` FOREIGN KEY (`Supplier_id`) REFERENCES `suppliers` (`Supplier_id`),
  ADD CONSTRAINT `expenses_ibfk_2` FOREIGN KEY (`Employee_id`) REFERENCES `employees` (`Employee_id`);

--
-- Filtros para la tabla `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`Employee_id`) REFERENCES `employees` (`Employee_id`),
  ADD CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`Customer_id`) REFERENCES `customer` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Order_id`) REFERENCES `orders` (`Order_id`);

--
-- Filtros para la tabla `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`Category`) REFERENCES `category` (`Category_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
