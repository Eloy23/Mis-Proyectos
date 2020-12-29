-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2019 a las 00:07:47
-- Versión del servidor: 10.3.15-MariaDB
-- Versión de PHP: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `asesoria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agendas`
--

CREATE TABLE `agendas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `maestro_id` int(11) NOT NULL,
  `alumnno_id` int(11) NOT NULL,
  `clase_id` int(11) NOT NULL,
  `horario_en` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `horario_sal` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `duracion` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `agendas`
--

INSERT INTO `agendas` (`id`, `maestro_id`, `alumnno_id`, `clase_id`, `horario_en`, `horario_sal`, `duracion`, `created_at`, `updated_at`) VALUES
(6, 2, 1, 1, '12:00', '13:00', '1', '2019-12-02 02:44:40', '2019-12-02 02:44:40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `escolaridad` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `escolaridad`, `user_id`, `created_at`, `updated_at`) VALUES
(1, 'Universidad', 2, '2019-11-17 10:40:27', '2019-11-29 02:09:38'),
(2, 'Selecciona Una Opcion', 5, '2019-12-03 02:18:21', '2019-12-03 02:18:21'),
(3, 'Selecciona Una Opcion', 6, '2019-12-03 02:24:50', '2019-12-03 02:24:50'),
(4, 'Selecciona Una Opcion', 7, '2019-12-03 02:32:05', '2019-12-03 02:32:05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificacions`
--

CREATE TABLE `calificacions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `calificacion` int(11) NOT NULL,
  `encabezado` varchar(55) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `maestro_id` int(11) NOT NULL,
  `alumno_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `calificacions`
--

INSERT INTO `calificacions` (`id`, `calificacion`, `encabezado`, `descripcion`, `maestro_id`, `alumno_id`, `created_at`, `updated_at`) VALUES
(1, 2, 'malo', 'No se explica bien', 2, 1, '2019-11-19 05:10:01', '2019-11-19 05:10:01'),
(20, 5, 'Excelente', 'Es muy buen maestro', 1, 1, '2019-11-19 14:36:48', '2019-11-19 14:36:48'),
(23, 3, 'Regular', 'Regular', 1, 1, '2019-12-01 00:15:56', '2019-12-01 00:15:56'),
(24, 3, 'Regular', 'Regular', 1, 1, '2019-12-01 00:15:59', '2019-12-01 00:15:59'),
(26, 4, 'Bueno', 'Excelente', 1, 1, '2019-12-01 00:18:58', '2019-12-01 00:18:58'),
(28, 5, 'Bueno', 'Bueno', 1, 1, '2019-12-01 00:21:36', '2019-12-01 00:21:36');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clases`
--

CREATE TABLE `clases` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `precio` double NOT NULL,
  `de_hora` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hasta_hora` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tool` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipo` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `objetivo` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cantidad_alumno` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `imagen` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_maestro` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `clases`
--

INSERT INTO `clases` (`id`, `nombre`, `descripcion`, `precio`, `de_hora`, `hasta_hora`, `tool`, `tipo`, `objetivo`, `cantidad_alumno`, `imagen`, `id_maestro`, `created_at`, `updated_at`) VALUES
(1, 'Videojuegos', 'Se brindara el conocimiento y la mejor configuracion de keyword para ser jugador competitivo del fortnite', 100, '10', '10', 'Laptop Gamer', 'Presencial', 'Que el asesorado sea capaz de tener su victoria magistral', '2', 'clases/duRslmyGLqLRCymaYskV08y5K02RAU8yUEzi8u4m.jpeg', 2, '2019-11-17 12:44:23', '2019-11-17 12:44:23'),
(2, 'Matematicas', 'Se brindara el conocimiento para que el asesorado sea capaz de resolver ecuaciones de primer grado por el método de sustitución, eliminación e igualación', 100, '10', '10', 'Libreta Gamer', 'Presencial', 'Que el asesorado sea capaz resolver ecuaciones de primer grado', '2', 'clases/QpRQ41St4o5zMsnqcpFNeOfJ7p0gOHRtAzwysWFc.jpeg', 2, '2019-11-17 12:45:58', '2019-11-17 12:45:58'),
(3, 'Desarrollo Android', 'Se brindara el conocimiento del manejo de IDE Android Studio con la finalidad de que el asesorado sea capaz de desarrollar aplicaciones con funciones basicas para android', 200, '10', '10', 'Laptop', 'Presencial', 'Que el alumno sea capaz de desarrollar aplicaciones basicas para el sistema Operativo Android', '5', 'clases/IkOwUH0VCy6O06IhKR8ielTYCxfXX0zCGuGmgKTg.jpeg', 1, '2019-11-17 12:48:46', '2019-11-17 12:48:46'),
(4, 'Desarrollo Web', 'Desarrollo de pagina web para e-comerce usando Laravel', 500, '10', '10', 'Laptop', 'Presencial', 'Alumno sea capaz de desarrolar una aplicacion para e-comerce usando el framework de laravel', '5', 'clases/C3XjhE2Q4SXjOt0rH4sqPZ6KlkiizEJwmuVL1pMI.jpeg', 1, '2019-11-17 12:50:57', '2019-11-17 12:50:57'),
(7, 'Base de Datos', 'Se enseñara la estructura de las consultas', 100, '10:00:00', '13:00', 'Computadora\r\nXampp', 'Presencial', 'Aprender principios basicos de base de datos', '4', 'clases/zBwixjChs59lrHFHpUjVgPrj6ftJ99j9QQfuBvub.png', 1, '2019-12-01 01:58:14', '2019-12-01 01:58:14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase_favorito`
--

CREATE TABLE `clase_favorito` (
  `id` int(11) NOT NULL,
  `clase_id` int(11) NOT NULL,
  `favorito_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccions`
--

CREATE TABLE `direccions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `ciudad` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `del_mun` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `calle` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cp` int(11) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `direccions`
--

INSERT INTO `direccions` (`id`, `ciudad`, `del_mun`, `estado`, `calle`, `cp`, `user_id`, `created_at`, `updated_at`) VALUES
(1, 'Poza Rica', 'Poza Rica', 'Veracruz', 'eshe', 8218921, 1, '2019-11-17 10:40:09', '2019-11-17 11:16:54'),
(2, 'Poza Rica', 'Poza Rica', 'Veracruz', 'eshe', 8218921, 2, '2019-11-17 10:40:27', '2019-11-17 11:26:10'),
(3, 'Zamora', 'Zamora', 'Veracruz', 'eshe', 8218921, 3, '2019-11-17 12:38:44', '2019-11-17 12:42:15'),
(4, NULL, NULL, NULL, NULL, NULL, 5, '2019-12-03 02:18:21', '2019-12-03 02:18:21'),
(5, NULL, NULL, NULL, NULL, NULL, 6, '2019-12-03 02:24:50', '2019-12-03 02:24:50'),
(6, NULL, NULL, NULL, NULL, NULL, 7, '2019-12-03 02:32:05', '2019-12-03 02:32:05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

CREATE TABLE `favoritos` (
  `id` int(11) NOT NULL,
  `estatus` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `favoritos`
--

INSERT INTO `favoritos` (`id`, `estatus`, `user_id`, `created_at`, `updated_at`) VALUES
(1, 0, 2, '2019-11-25 03:26:12', '2019-11-25 03:26:12'),
(2, 0, 7, '2019-12-03 02:32:05', '2019-12-03 02:32:05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maestros`
--

CREATE TABLE `maestros` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `especialidad` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cv` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `maestros`
--

INSERT INTO `maestros` (`id`, `especialidad`, `cv`, `user_id`, `created_at`, `updated_at`) VALUES
(1, 'Desarrollo', 'Laravel', 1, '2019-11-17 10:40:09', '2019-12-01 01:51:01'),
(2, 'Fortnite', 'Juego 19 horas diarias de fortnite tengo una victoria con cuatro kills', 3, '2019-11-17 12:38:44', '2019-11-18 01:47:08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(7, '2019_10_13_025406_create_userls_table', 1),
(18, '2019_11_10_193349_create_direccions_table', 2),
(101, '2014_10_12_000000_create_users_table', 3),
(102, '2014_10_12_100000_create_password_resets_table', 3),
(103, '2019_11_10_201257_create_direccions_table', 3),
(104, '2019_11_14_224806_create_clases_table', 3),
(105, '2019_11_15_022105_create_maestros_table', 3),
(106, '2019_11_15_022142_create_alumnos_table', 3),
(107, '2019_11_15_022326_create_calificacions_table', 3),
(108, '2019_11_15_022412_create_agendas_table', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `userls`
--

CREATE TABLE `userls` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `usuario` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `contraseña` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipo` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `userls`
--

INSERT INTO `userls` (`id`, `usuario`, `contraseña`, `tipo`, `created_at`, `updated_at`) VALUES
(1, 'Esquilax2311', 'As123456', '1', '2019-10-13 09:33:34', '2019-10-13 09:33:34');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` int(11) DEFAULT NULL,
  `apellidos` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sexo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tipo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `imagen` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `nombre`, `edad`, `apellidos`, `email`, `password`, `sexo`, `tipo`, `imagen`, `remember_token`, `created_at`, `updated_at`) VALUES
(1, 'Eloy', 22, 'Marcos Domínguez', '16610010@utgz.edu.mx', '$2y$10$1hGJHEFhiIA3gtfjvog4xuFfldR4ocaEezoZVuLVatXi3N6wVVWFe', 'Masculino', 'Maestro', 'users/G5NfrDAZ8tHC8vzOSbKVKSoNTeMC5Dw41XRoGUMW.jpeg', NULL, '2019-11-17 10:40:09', '2019-12-01 01:53:18'),
(2, 'Jose Alfredo', NULL, 'Santes Benites', 'jose@gmail.com', '$2y$10$14LV8HsTZWj1loQVsE3l1.Eq0swGFS3jgaC5Nmb1ZETsVzSaBjequ', 'Masculino', 'Alumno', 'users/qKxCP6dq9sPO9lAvYmMTLf2La9aUU0YyF9X21Dlf.jpeg', NULL, '2019-11-17 10:40:27', '2019-11-17 11:40:26'),
(3, 'Enrique', NULL, 'Nuñes', 'enrique@gmail.com', '$2y$10$s2bZ6dkPk7eTupxeEuOjqObhm9sbEneIMiw.mGuaizfITmOyfEx5C', 'Masculino', 'Maestro', 'users/YQuXdJAWTKsexorRscJ6xOsXPud624OKR1JUilbj.jpeg', NULL, '2019-11-17 12:38:44', '2019-11-17 12:42:01'),
(5, 'Milton', NULL, 'Nuñes Ga', 'milton@gmail.com', '$2y$10$c3Mb4fOCQpqCy4qf3KLENetxcEKlsdOnT8rqoq7Q7lxy9hNnfCJry', NULL, 'Alumno', NULL, NULL, '2019-12-03 02:18:21', '2019-12-03 02:18:21'),
(6, 'Ana', NULL, 'Ana', 'ana@gmail.com', '$2y$10$XTKDMy6kjyrmM2Hlup0BYuOmNpGgto64iP2RvSVrKv22DyV3MDmQa', NULL, 'Alumno', NULL, NULL, '2019-12-03 02:24:49', '2019-12-03 02:24:49'),
(7, 'prueba', NULL, 'prueba', 'prueba@gmail.com', '$2y$10$Tf1dosZVy/yGqh.TgzaVue7u5iOIrskukYsSrRx0W2p3Ilmf2K62S', NULL, 'Alumno', NULL, NULL, '2019-12-03 02:32:05', '2019-12-03 02:32:05');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agendas`
--
ALTER TABLE `agendas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `calificacions`
--
ALTER TABLE `calificacions`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clases`
--
ALTER TABLE `clases`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clase_favorito`
--
ALTER TABLE `clase_favorito`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `direccions`
--
ALTER TABLE `direccions`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `maestros`
--
ALTER TABLE `maestros`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Indices de la tabla `userls`
--
ALTER TABLE `userls`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `agendas`
--
ALTER TABLE `agendas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `calificacions`
--
ALTER TABLE `calificacions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `clases`
--
ALTER TABLE `clases`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `clase_favorito`
--
ALTER TABLE `clase_favorito`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `direccions`
--
ALTER TABLE `direccions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `maestros`
--
ALTER TABLE `maestros`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=109;

--
-- AUTO_INCREMENT de la tabla `userls`
--
ALTER TABLE `userls`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
