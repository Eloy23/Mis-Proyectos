-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-10-2020 a las 02:35:05
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
-- Base de datos: `gaya_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad_economicas`
--

CREATE TABLE `actividad_economicas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `actividad_economicas`
--

INSERT INTO `actividad_economicas` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Ing Sistemas', 'Desarrolla', '2020-08-01 00:05:52', '2020-08-07 01:23:34'),
(2, 'DEFAULT', 'LLENAR MAS ADELANTE', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caracteristicas_municipios`
--

CREATE TABLE `caracteristicas_municipios` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `escuelas` tinyint(1) DEFAULT NULL,
  `salud` tinyint(1) DEFAULT NULL,
  `pavimento` tinyint(1) DEFAULT NULL,
  `alumbrado` tinyint(1) DEFAULT NULL,
  `transporte` tinyint(1) DEFAULT NULL,
  `red_movil` tinyint(1) DEFAULT NULL,
  `potable` tinyint(1) DEFAULT NULL,
  `alcantarillado` tinyint(1) DEFAULT NULL,
  `drenaje` tinyint(1) DEFAULT NULL,
  `electricidad` tinyint(1) DEFAULT NULL,
  `residuos` tinyint(1) DEFAULT NULL,
  `gas` tinyint(1) DEFAULT NULL,
  `seguridad` tinyint(1) DEFAULT NULL,
  `abastos` tinyint(1) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `caracteristicas_municipios`
--

INSERT INTO `caracteristicas_municipios` (`id`, `escuelas`, `salud`, `pavimento`, `alumbrado`, `transporte`, `red_movil`, `potable`, `alcantarillado`, `drenaje`, `electricidad`, `residuos`, `gas`, `seguridad`, `abastos`, `created_at`, `updated_at`) VALUES
(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '2020-08-01 00:22:39', '2020-08-01 00:34:43'),
(3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '2020-08-02 23:53:47', '2020-08-02 23:53:47'),
(4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-14 00:06:56', '2020-08-14 00:06:56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caractesticas_casas`
--

CREATE TABLE `caractesticas_casas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `plantas` int(11) DEFAULT NULL,
  `sala` tinyint(1) DEFAULT NULL,
  `comedor` tinyint(1) DEFAULT NULL,
  `cocina` tinyint(1) DEFAULT NULL,
  `cuartos` int(11) DEFAULT NULL,
  `baños` int(11) DEFAULT NULL,
  `patio` tinyint(1) DEFAULT NULL,
  `cochera` tinyint(1) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `caractesticas_casas`
--

INSERT INTO `caractesticas_casas` (`id`, `plantas`, `sala`, `comedor`, `cocina`, `cuartos`, `baños`, `patio`, `cochera`, `created_at`, `updated_at`) VALUES
(3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-01 23:11:17', '2020-08-01 23:11:17'),
(4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-05 03:04:44', '2020-08-05 03:04:44'),
(5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-05 21:21:46', '2020-08-05 21:21:46'),
(7, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 22:50:54', '2020-08-06 22:50:54'),
(8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 22:51:32', '2020-08-06 22:51:32'),
(10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 23:54:44', '2020-08-06 23:54:44'),
(11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 23:55:21', '2020-08-06 23:55:21'),
(14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-07 01:37:48', '2020-08-07 01:37:48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

CREATE TABLE `cargos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cargos`
--

INSERT INTO `cargos` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(2, 'Supervisor de Campo', 'Supervisa las areas de campo para tener una buena produccion', '2020-08-02 02:55:19', '2020-08-02 02:55:19');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casas`
--

CREATE TABLE `casas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `estado` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `material` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `piso` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `techo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `combustible` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_servequip` bigint(20) UNSIGNED NOT NULL,
  `id_caractcasa` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `casas`
--

INSERT INTO `casas` (`id`, `estado`, `material`, `piso`, `techo`, `combustible`, `id_servequip`, `id_caractcasa`, `created_at`, `updated_at`) VALUES
(2, 'Rentada', 'Block', 'Tierra', 'Lamina', 'Gas', 3, 3, '2020-08-01 23:11:17', '2020-08-01 23:11:17'),
(3, 'Rentada', 'Block', 'Tierra', 'Lamina', 'Gas', 4, 4, '2020-08-05 03:04:44', '2020-08-05 03:04:44'),
(4, 'Rentada', 'Block', 'Tierra', 'Lamina', 'Gas', 5, 5, '2020-08-05 21:21:46', '2020-08-05 21:21:46'),
(7, NULL, NULL, NULL, NULL, NULL, 10, 10, '2020-08-06 23:54:44', '2020-08-06 23:54:44'),
(8, NULL, NULL, NULL, NULL, NULL, 11, 11, '2020-08-06 23:55:22', '2020-08-06 23:55:22'),
(11, NULL, NULL, NULL, NULL, NULL, 14, 14, '2020-08-07 01:37:48', '2020-08-07 01:37:48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciclo_floracions`
--

CREATE TABLE `ciclo_floracions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `inicio_floracion` date NOT NULL,
  `fin_floracion` date NOT NULL,
  `dias_floracion` int(11) NOT NULL,
  `recomendada` date DEFAULT NULL,
  `daño` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `caida_prematura` double NOT NULL,
  `fecha_cosecha` date DEFAULT NULL,
  `edad_fruto` double DEFAULT NULL,
  `produccion` double DEFAULT NULL,
  `perdida_estimada` double DEFAULT NULL,
  `rendimiento_estimado` double DEFAULT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `ciclo_floracions`
--

INSERT INTO `ciclo_floracions` (`id`, `inicio_floracion`, `fin_floracion`, `dias_floracion`, `recomendada`, `daño`, `caida_prematura`, `fecha_cosecha`, `edad_fruto`, `produccion`, `perdida_estimada`, `rendimiento_estimado`, `id_plantacion`, `created_at`, `updated_at`) VALUES
(1, '2019-03-18', '2019-05-15', 58, '2020-01-16', 'Medio', 50, '2019-12-12', 7.868852459016393, 10, 10, 20, 1, '2019-08-11 00:27:58', '2020-08-12 21:39:20'),
(2, '2019-12-03', '2020-02-12', 71, '2020-10-07', 'Bajo', 80, '2020-10-19', 9.37704918032787, 120, 10, 150, 2, '2020-08-14 00:08:32', '2020-08-14 05:26:51'),
(3, '2020-08-03', '2020-10-19', 77, '2021-06-10', 'Medio', 50, '2021-05-19', 8.229508196721312, 10, 10, 20, 3, '2020-08-14 00:31:51', '2020-08-14 00:31:51'),
(4, '2020-08-07', '2020-08-19', 12, '2021-05-13', 'Bajo', 50, '2020-12-19', 4.19672131147541, 50, 20, 100, 1, '2020-08-14 04:21:31', '2020-08-14 04:21:31'),
(5, '2019-08-05', '2019-09-05', 31, '2020-05-20', 'Bajo', 30, '2020-02-19', 6, 65, 10, 216.66666666666669, 1, '2018-08-14 05:41:21', '2020-08-14 05:41:21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cultivo_asociados`
--

CREATE TABLE `cultivo_asociados` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cultivo_asociados`
--

INSERT INTO `cultivo_asociados` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Naranja', 'Sembradío de Naranja', '2020-08-08 02:55:53', '2020-08-08 02:57:14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccions`
--

CREATE TABLE `direccions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `calle` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `numero` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `colonia` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_municipio` bigint(20) UNSIGNED NOT NULL,
  `localidad` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ejido` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `referencias` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `direccions`
--

INSERT INTO `direccions` (`id`, `calle`, `numero`, `colonia`, `id_municipio`, `localidad`, `ejido`, `referencias`, `created_at`, `updated_at`) VALUES
(2, 'Av. Furro', '8', 'Las flores', 2, 'papantla', 'papantla', 'taller', NULL, NULL),
(3, 'Arista', '8', 'Las Flores', 2, 'Papantla', 'Carillo Puerto', 'Taller Mecánico', '2020-08-05 03:04:44', '2020-08-05 03:04:44'),
(4, 'Arista', '8', 'Las Flores', 2, 'Gutierrez Zamora', 'Gutierrez Zamora', 'Casa Morada', '2020-08-05 21:21:46', '2020-08-05 21:21:46'),
(6, NULL, NULL, NULL, 2, NULL, NULL, NULL, '2020-08-06 23:54:44', '2020-08-06 23:54:44'),
(7, NULL, NULL, NULL, 2, NULL, NULL, NULL, '2020-08-06 23:55:22', '2020-08-06 23:55:22'),
(8, NULL, NULL, NULL, 2, NULL, NULL, NULL, '2020-08-06 23:56:17', '2020-08-06 23:56:17'),
(10, NULL, NULL, NULL, 2, NULL, NULL, NULL, '2020-08-07 01:37:48', '2020-08-07 01:37:48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedades`
--

CREATE TABLE `enfermedades` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `enfermedades`
--

INSERT INTO `enfermedades` (`id`, `nombre`, `created_at`, `updated_at`) VALUES
(1, 'Enfermedades cardiovasculares', NULL, NULL),
(2, 'Cáncer', NULL, NULL),
(3, 'Enfermedad Pulmonar', NULL, NULL),
(4, 'Diabetes', NULL, NULL),
(5, 'Parkinson', NULL, NULL),
(6, 'Alzheimer', NULL, NULL),
(7, 'Esclerosis múltiple', NULL, NULL),
(8, 'Hipertensión', NULL, NULL),
(9, 'Lumbalgia', NULL, NULL),
(10, 'Colesterol', NULL, NULL),
(11, 'Depresión', NULL, NULL),
(12, 'Ansiedad', NULL, NULL),
(13, 'Tiroides', NULL, NULL),
(14, 'Osteoporosis', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedades_familia`
--

CREATE TABLE `enfermedades_familia` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `enfermedades_id` bigint(20) UNSIGNED NOT NULL,
  `familia_id` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `enfermedades_familia`
--

INSERT INTO `enfermedades_familia` (`id`, `enfermedades_id`, `familia_id`, `created_at`, `updated_at`) VALUES
(14, 1, 11, NULL, NULL),
(15, 5, 11, NULL, NULL),
(16, 4, 12, NULL, NULL),
(23, 6, 12, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermedades_plantaciones`
--

CREATE TABLE `enfermedades_plantaciones` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_enfermedad` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `enfermedades_plantaciones`
--

INSERT INTO `enfermedades_plantaciones` (`id`, `id_plantacion`, `id_enfermedad`, `created_at`, `updated_at`) VALUES
(16, 1, 1, '2020-08-12 23:33:20', '2020-08-12 23:33:20'),
(17, 1, 1, '2020-09-13 00:37:34', '2020-09-13 00:37:34');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfer_plantas`
--

CREATE TABLE `enfer_plantas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `enfer_plantas`
--

INSERT INTO `enfer_plantas` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Hoja Negra', 'Hongo', '2020-08-07 22:46:29', '2020-08-08 00:32:39'),
(2, 'Peste', 'xd', '2020-08-12 03:28:25', '2020-08-12 03:28:25');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especies`
--

CREATE TABLE `especies` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre_comun` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nombre_cientifico` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `especies`
--

INSERT INTO `especies` (`id`, `nombre_comun`, `nombre_cientifico`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Vainilla Negra', 'Black Vanilla', 'Vainilla Negra', '2020-08-08 03:24:42', '2020-08-08 03:26:01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE `estados` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`id`, `nombre`, `created_at`, `updated_at`) VALUES
(1, 'Aguascalientes', NULL, NULL),
(2, 'Baja California', NULL, NULL),
(3, 'Baja California Sur', NULL, NULL),
(4, 'Campeche', NULL, NULL),
(5, 'Chihuahua', NULL, NULL),
(6, 'Chiapas', NULL, NULL),
(7, 'Ciudad de México', NULL, NULL),
(8, 'Coahuila', NULL, NULL),
(9, 'Colima', NULL, NULL),
(10, 'Durango', NULL, NULL),
(11, 'Guanajuato', NULL, NULL),
(12, 'Guerrero', NULL, NULL),
(13, 'Hidalgo', NULL, NULL),
(14, 'Jalisco', NULL, NULL),
(15, 'México', NULL, NULL),
(16, 'Michoacán', NULL, NULL),
(17, 'Morelos', NULL, NULL),
(18, 'Nayarit', NULL, NULL),
(19, 'Nuevo León', NULL, NULL),
(20, 'Oaxaca', NULL, NULL),
(21, 'Puebla', NULL, NULL),
(22, 'Querétaro', NULL, NULL),
(23, 'Quintana Roo', NULL, NULL),
(24, 'San Luis Potosí', NULL, NULL),
(25, 'Sinaloa', NULL, NULL),
(26, 'Sonora', NULL, NULL),
(27, 'Tabasco', NULL, NULL),
(28, 'Tamaulipas', NULL, NULL),
(29, 'Tlaxcala', NULL, NULL),
(30, 'Veracruz', NULL, NULL),
(31, 'Yucatán', NULL, NULL),
(32, 'Zacatecas', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familias`
--

CREATE TABLE `familias` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido_pat` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido_mat` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `nacimiento` date NOT NULL,
  `parentesco` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `escolaridad` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ingreso` double DEFAULT NULL,
  `gasto` double DEFAULT NULL,
  `id_productor` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `familias`
--

INSERT INTO `familias` (`id`, `nombre`, `apellido_pat`, `apellido_mat`, `edad`, `nacimiento`, `parentesco`, `escolaridad`, `ingreso`, `gasto`, `id_productor`, `created_at`, `updated_at`) VALUES
(11, 'Carlos', 'Nuñez', 'Perez', 45, '1972-08-19', 'Papá', 'Secundaria', 5000, 1000, 1, '2020-08-02 00:34:17', '2020-08-02 02:42:25'),
(12, 'Marla', 'Bautista', 'Morales', 42, '1976-08-19', 'Mamá', 'Primaria', 5000, 1000, 1, '2020-08-02 00:35:08', '2020-08-02 00:35:08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fertilizantes`
--

CREATE TABLE `fertilizantes` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `fertilizantes`
--

INSERT INTO `fertilizantes` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Dragón', 'Quemante', '2020-08-08 01:37:52', '2020-08-08 01:39:52');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `manejo_enfermedads`
--

CREATE TABLE `manejo_enfermedads` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `manejo_enfermedads`
--

INSERT INTO `manejo_enfermedads` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'corte de la parte dañada', 'cortar el tallo o parte que esta infectado', '2020-08-08 01:12:52', '2020-08-08 01:13:15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `manejo_plagas`
--

CREATE TABLE `manejo_plagas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `manejo_plagas`
--

INSERT INTO `manejo_plagas` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'metodo de cal', 'regar calsobre la plantacion', '2020-08-08 00:29:26', '2020-08-08 00:29:26');

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
(2, '2014_10_12_100000_create_password_resets_table', 1),
(3, '2020_06_05_185026_create_cargos_table', 1),
(4, '2020_06_27_184141_create_productors_table', 1),
(6, '2020_06_28_204848_create_servicios_equipamientos_table', 1),
(7, '2020_06_28_205644_create_caractesticas_casas_table', 1),
(9, '2020_06_28_210334_create_estados_table', 1),
(11, '2020_06_28_210600_create_caracteristicas_municipios_table', 1),
(12, '2020_06_28_210924_create_actividad_economicas_table', 1),
(13, '2020_07_22_190933_create_familias_table', 1),
(14, '2020_07_23_180918_create_enfermedades_table', 1),
(15, '2020_07_24_030332_create_familia__enfermedads_table', 1),
(16, '2020_06_28_210428_create_municipios_table', 2),
(17, '2020_06_28_210220_create_direccions_table', 3),
(18, '2020_06_28_194716_create_casas_table', 4),
(20, '2014_10_12_000000_create_users_table', 5),
(21, '2020_08_03_180354_create_riegos_table', 6),
(22, '2020_08_03_180457_create_tipo_suelos_table', 6),
(23, '2020_08_03_180516_create_visitas_table', 7),
(24, '2020_08_03_180822_create_parcelas_table', 7),
(25, '2020_08_03_180903_create_especies_table', 7),
(26, '2020_08_03_180919_create_ciclo_floracions_table', 7),
(27, '2020_08_03_180957_create_enfer_plantas_table', 7),
(28, '2020_08_03_181052_create_enfermedades_plantaciones_table', 8),
(29, '2020_08_03_181115_create_manejo_plagas_table', 8),
(30, '2020_08_03_181132_create_plagas_table', 8),
(31, '2020_08_03_181202_create_plantaciones__plagas_table', 9),
(32, '2020_08_03_181248_create_manejo_enfermedads_table', 9),
(33, '2020_08_03_181304_create_fertilizantes_table', 9),
(34, '2020_08_03_181322_create_tutors_table', 9),
(35, '2020_08_03_181336_create_cultivo_asociados_table', 9),
(36, '2020_08_03_181352_create_plantacions_table', 10),
(38, '2020_08_03_195810_create_plantacion__manejo_enfermedads_table', 11),
(39, '2020_08_03_200320_create_plantacion__fertilizantes_table', 11),
(40, '2020_08_03_200537_create_plantacion__tutors_table', 11),
(41, '2020_08_03_200759_create_plantacion__asociados_table', 11),
(42, '2020_08_03_201729_create_tipo_plantacions_table', 11),
(43, '2020_08_03_195051_create_plantacion__manejo_plagas_table', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_estado` bigint(20) UNSIGNED NOT NULL,
  `id_caracmunicipio` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`id`, `nombre`, `id_estado`, `id_caracmunicipio`, `created_at`, `updated_at`) VALUES
(2, 'Papantla', 30, 2, '2020-08-01 00:22:39', '2020-08-01 00:22:39'),
(3, 'Piedad', 22, 4, '2020-08-14 00:06:56', '2020-08-14 00:06:56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parcelas`
--

CREATE TABLE `parcelas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `latitud` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `longitud` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `altitud` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ha` double NOT NULL,
  `pendiente` double NOT NULL,
  `localidad` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_tiposuelo` bigint(20) UNSIGNED NOT NULL,
  `id_riego` bigint(20) UNSIGNED NOT NULL,
  `id_municipio` bigint(20) UNSIGNED NOT NULL,
  `id_productor` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `parcelas`
--

INSERT INTO `parcelas` (`id`, `latitud`, `longitud`, `altitud`, `ha`, `pendiente`, `localidad`, `id_tiposuelo`, `id_riego`, `id_municipio`, `id_productor`, `created_at`, `updated_at`) VALUES
(1, '20°25\'39.7\"N', '97°08\'39.2\"W', '5', 1, 20, 'Gutierrez Zamora', 2, 3, 2, 1, '2020-08-05 02:24:52', '2020-08-05 03:00:03'),
(2, '20°25\'39.7\"N', '97°08\'39.2\"W', '10', 2, 30, 'Tecolutla', 5, 1, 3, 3, '2020-08-11 06:05:31', '2020-08-14 00:07:09'),
(3, '20°25\'39.7\"N', '97°08\'39.2\"W', '10', 1, 20, 'Xalapa', 2, 3, 2, 8, '2020-08-14 00:31:06', '2020-08-14 00:31:06');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plagas`
--

CREATE TABLE `plagas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plagas`
--

INSERT INTO `plagas` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'gusano', 'invasion de gusano', '2020-08-08 00:50:47', '2020-08-08 00:51:56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantaciones__plagas`
--

CREATE TABLE `plantaciones__plagas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_plaga` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantaciones__plagas`
--

INSERT INTO `plantaciones__plagas` (`id`, `id_plantacion`, `id_plaga`, `created_at`, `updated_at`) VALUES
(2, 1, 1, '2020-08-13 01:01:25', '2020-08-13 01:01:25'),
(3, 1, 1, '2020-09-13 00:37:44', '2020-09-13 00:37:44');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacions`
--

CREATE TABLE `plantacions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `cantidad` int(11) NOT NULL,
  `año` int(11) NOT NULL,
  `id_especie` bigint(20) UNSIGNED NOT NULL,
  `id_tipoplantacion` bigint(20) UNSIGNED NOT NULL,
  `id_parcela` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacions`
--

INSERT INTO `plantacions` (`id`, `cantidad`, `año`, `id_especie`, `id_tipoplantacion`, `id_parcela`, `created_at`, `updated_at`) VALUES
(1, 200, 2015, 1, 1, 1, '2020-08-10 23:54:40', '2020-08-11 01:44:10'),
(2, 300, 2018, 1, 1, 2, '2020-08-14 00:07:31', '2020-08-14 00:07:31'),
(3, 100, 2019, 1, 1, 3, '2020-08-14 00:31:16', '2020-08-14 00:31:16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacion__asociados`
--

CREATE TABLE `plantacion__asociados` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_asociado` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacion__asociados`
--

INSERT INTO `plantacion__asociados` (`id`, `id_plantacion`, `id_asociado`, `created_at`, `updated_at`) VALUES
(2, 1, 1, '2020-08-13 03:46:19', '2020-08-13 03:46:19'),
(3, 1, 1, '2020-09-12 06:11:52', '2020-09-12 06:11:52'),
(4, 1, 1, '2020-09-13 00:37:02', '2020-09-13 00:37:02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacion__fertilizantes`
--

CREATE TABLE `plantacion__fertilizantes` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_fertilizante` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacion__fertilizantes`
--

INSERT INTO `plantacion__fertilizantes` (`id`, `id_plantacion`, `id_fertilizante`, `created_at`, `updated_at`) VALUES
(5, 1, 1, '2020-09-12 08:36:12', '2020-09-12 08:36:12'),
(6, 1, 1, '2020-09-13 00:37:21', '2020-09-13 00:37:21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacion__manejo_enfermedads`
--

CREATE TABLE `plantacion__manejo_enfermedads` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_manejoenfermedad` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacion__manejo_enfermedads`
--

INSERT INTO `plantacion__manejo_enfermedads` (`id`, `id_plantacion`, `id_manejoenfermedad`, `created_at`, `updated_at`) VALUES
(3, 1, 1, '2020-08-12 23:55:36', '2020-08-12 23:55:36');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacion__manejo_plagas`
--

CREATE TABLE `plantacion__manejo_plagas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_manejoplaga` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacion__manejo_plagas`
--

INSERT INTO `plantacion__manejo_plagas` (`id`, `id_plantacion`, `id_manejoplaga`, `created_at`, `updated_at`) VALUES
(2, 1, 1, '2020-08-13 01:16:56', '2020-08-13 01:16:56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plantacion__tutors`
--

CREATE TABLE `plantacion__tutors` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_plantacion` bigint(20) UNSIGNED NOT NULL,
  `id_tutor` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `plantacion__tutors`
--

INSERT INTO `plantacion__tutors` (`id`, `id_plantacion`, `id_tutor`, `created_at`, `updated_at`) VALUES
(2, 1, 1, '2020-08-13 03:29:17', '2020-08-13 03:29:17'),
(3, 1, 1, '2020-09-13 00:37:12', '2020-09-13 00:37:12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productors`
--

CREATE TABLE `productors` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido_pat` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido_mat` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ingreso` double DEFAULT NULL,
  `gasto` double DEFAULT NULL,
  `escolaridad` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_direccion` bigint(20) UNSIGNED NOT NULL,
  `id_acteconomica` bigint(20) UNSIGNED NOT NULL,
  `seguro` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_estatuscasa` bigint(20) UNSIGNED NOT NULL,
  `jefe_familia` tinyint(1) DEFAULT NULL,
  `estado_civil` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `productors`
--

INSERT INTO `productors` (`id`, `nombre`, `apellido_pat`, `apellido_mat`, `edad`, `sexo`, `ingreso`, `gasto`, `escolaridad`, `id_direccion`, `id_acteconomica`, `seguro`, `id_estatuscasa`, `jefe_familia`, `estado_civil`, `created_at`, `updated_at`) VALUES
(1, 'Jose Enrique', 'Nuñez', 'Bautista', 35, 'Hombre', 5000, 200, 'Superior', 2, 1, 'Seguro Popular', 2, 2, 'Solter@', '2020-08-01 00:22:39', '2020-08-01 00:22:39'),
(2, 'prueba', 'pruena', 'prueba', 22, 'Hombre', 1000, 1000, 'Media Superior', 3, 1, 'Seguro Popular', 3, 1, 'Casado', '2020-08-05 03:04:44', '2020-08-05 03:04:44'),
(3, 'Eloy', 'Marcos', 'Dominguez', 22, 'Hombre', 5000, 100, 'Superior', 4, 1, 'Seguro Popular', 4, 2, 'Solter@', '2020-08-05 21:21:46', '2020-08-07 01:03:55'),
(8, 'Jose Alfredo', 'Santes', 'Benitez', 45, 'Hombre', NULL, NULL, 'Nula', 10, 2, 'IMSS', 11, NULL, NULL, '2020-08-07 01:37:48', '2020-08-07 01:37:48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `riegos`
--

CREATE TABLE `riegos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `riegos`
--

INSERT INTO `riegos` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Temporal', 'Es el área en la que el desarrollo completo de los cultivos depende exclusivamente de las lluvias o de la humedad residual del suelo.', '2020-08-05 01:38:09', '2020-08-05 01:38:09'),
(2, 'Manual', 'Se hace mediante la actividad humana regando mediante cubetas', '2020-08-05 01:39:38', '2020-08-05 01:48:39'),
(3, 'Semitecnificado', 'Se usa un sistema especial de Riego dependiendo de la necesidad', '2020-08-05 01:40:46', '2020-08-05 01:40:46');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios_equipamientos`
--

CREATE TABLE `servicios_equipamientos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `electricidad` tinyint(1) DEFAULT NULL,
  `drenaje` tinyint(1) DEFAULT NULL,
  `potable` tinyint(1) DEFAULT NULL,
  `gas` tinyint(1) DEFAULT NULL,
  `lavadora` tinyint(1) DEFAULT NULL,
  `refrigerador` tinyint(1) DEFAULT NULL,
  `television` tinyint(1) DEFAULT NULL,
  `telefono` tinyint(1) DEFAULT NULL,
  `celular` tinyint(1) DEFAULT NULL,
  `microondas` tinyint(1) DEFAULT NULL,
  `radio` tinyint(1) DEFAULT NULL,
  `dvd` tinyint(1) DEFAULT NULL,
  `computadora` tinyint(1) DEFAULT NULL,
  `internet` tinyint(1) DEFAULT NULL,
  `automovil` tinyint(1) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `servicios_equipamientos`
--

INSERT INTO `servicios_equipamientos` (`id`, `electricidad`, `drenaje`, `potable`, `gas`, `lavadora`, `refrigerador`, `television`, `telefono`, `celular`, `microondas`, `radio`, `dvd`, `computadora`, `internet`, `automovil`, `created_at`, `updated_at`) VALUES
(3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-01 23:11:17', '2020-08-01 23:11:17'),
(4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-05 03:04:44', '2020-08-05 03:04:44'),
(5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-05 21:21:46', '2020-08-05 21:21:46'),
(7, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 22:50:55', '2020-08-06 22:50:55'),
(8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 22:51:32', '2020-08-06 22:51:32'),
(10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 23:54:44', '2020-08-06 23:54:44'),
(11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-06 23:55:22', '2020-08-06 23:55:22'),
(14, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-07 01:37:48', '2020-08-07 01:37:48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_plantacions`
--

CREATE TABLE `tipo_plantacions` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tipo_plantacions`
--

INSERT INTO `tipo_plantacions` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, '5 de oros', 'Sembrar en forma de 5 de oros', '2020-08-08 03:10:16', '2020-08-08 03:10:23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_suelos`
--

CREATE TABLE `tipo_suelos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tipo_suelos`
--

INSERT INTO `tipo_suelos` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Suelos Arenosos', 'Incapaces de retener el agua, son escasos en materia orgánica y por lo tanto poco fértiles.', '2020-08-05 00:39:16', '2020-08-05 00:55:26'),
(2, 'Suelos Calizos', 'Abundan en minerales calcáreos y por lo tanto en sales, lo cual les confiere dureza, aridez y color blanquecino.', '2020-08-05 00:40:24', '2020-08-05 00:55:37'),
(3, 'Suelos Humíferos', 'De tierra negra, en ellos abunda la materia orgánica en descomposición y retienen muy bien el agua, siendo muy fértiles.', '2020-08-05 00:40:46', '2020-08-05 00:55:44'),
(4, 'Suelos Arcillosos', 'Compuestos por finos granos amarillentos que retienen muy bien el agua, por lo que suelen inundarse con facilidad.', '2020-08-05 00:41:07', '2020-08-05 00:55:51'),
(5, 'Suelos Pedregosos', 'Compuestos por rocas de distintos tamaños, son muy porosos y no retienen en nada el agua.', '2020-08-05 00:41:25', '2020-08-05 00:55:59'),
(7, 'Suelos Mixtos', 'Suelos mezclados, por lo general entre arenosos y arcillosos.', '2020-08-05 00:58:58', '2020-08-05 00:58:58');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tutors`
--

CREATE TABLE `tutors` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tutors`
--

INSERT INTO `tutors` (`id`, `nombre`, `descripcion`, `created_at`, `updated_at`) VALUES
(1, 'Chaka', 'Árbol', '2020-08-08 02:34:14', '2020-08-08 02:35:20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellidos` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipo` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `id_cargo` bigint(20) UNSIGNED NOT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `nombre`, `apellidos`, `edad`, `email`, `password`, `tipo`, `telefono`, `id_cargo`, `remember_token`, `created_at`, `updated_at`) VALUES
(1, 'Pedro Antonio', 'Alegre Marcelino', 35, 'correoprueba@gmail.com', '$2y$10$NT/5bo7JHg75UZKV2jQB4uz6guNAafZzdXz33oEqlhINtIOCN5h8O', 'Administrador', 56862562, 2, NULL, '2020-08-02 03:01:02', '2020-08-16 00:53:22'),
(2, 'Eloy', 'Marcos Dominguez', 22, '16610010@utgz.edu.mx', '$2y$10$EPV0C.liyBadnnlCdxMfCu2OROc..c73ABpv/j5J.0IM5MsRy5/tW', 'Productor', 7661009266, 2, NULL, '2020-08-30 02:29:51', '2020-09-13 01:01:12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visitas`
--

CREATE TABLE `visitas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `fecha` date NOT NULL,
  `actividad` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_parcela` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `visitas`
--

INSERT INTO `visitas` (`id`, `fecha`, `actividad`, `descripcion`, `id_parcela`, `created_at`, `updated_at`) VALUES
(1, '2020-08-01', 'Revisado de Flor', 'Revisar que la flor no tenga enfermedad', 1, '2020-08-11 02:47:33', '2020-08-11 02:54:23'),
(2, '2020-08-01', 'Visita', 'Visita', 2, '2020-08-11 06:05:53', '2020-08-11 06:05:53');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad_economicas`
--
ALTER TABLE `actividad_economicas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `caracteristicas_municipios`
--
ALTER TABLE `caracteristicas_municipios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `caractesticas_casas`
--
ALTER TABLE `caractesticas_casas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `casas`
--
ALTER TABLE `casas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `casas_id_servequip_foreign` (`id_servequip`),
  ADD KEY `casas_id_caractcasa_foreign` (`id_caractcasa`);

--
-- Indices de la tabla `ciclo_floracions`
--
ALTER TABLE `ciclo_floracions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plantacion` (`id_plantacion`);

--
-- Indices de la tabla `cultivo_asociados`
--
ALTER TABLE `cultivo_asociados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `direccions`
--
ALTER TABLE `direccions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `direccions_id_municipio_foreign` (`id_municipio`);

--
-- Indices de la tabla `enfermedades`
--
ALTER TABLE `enfermedades`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `enfermedades_familia`
--
ALTER TABLE `enfermedades_familia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `enfermedades_familia_enfermedades_id_foreign` (`enfermedades_id`),
  ADD KEY `enfermedades_familia_familia_id_foreign` (`familia_id`);

--
-- Indices de la tabla `enfermedades_plantaciones`
--
ALTER TABLE `enfermedades_plantaciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_enfermedad` (`id_enfermedad`),
  ADD KEY `id_plantacion` (`id_plantacion`);

--
-- Indices de la tabla `enfer_plantas`
--
ALTER TABLE `enfer_plantas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `especies`
--
ALTER TABLE `especies`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `familias`
--
ALTER TABLE `familias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `familias_id_productor_foreign` (`id_productor`);

--
-- Indices de la tabla `fertilizantes`
--
ALTER TABLE `fertilizantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `manejo_enfermedads`
--
ALTER TABLE `manejo_enfermedads`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `manejo_plagas`
--
ALTER TABLE `manejo_plagas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `municipios_id_estado_foreign` (`id_estado`),
  ADD KEY `municipios_id_caracmunicipio_foreign` (`id_caracmunicipio`);

--
-- Indices de la tabla `parcelas`
--
ALTER TABLE `parcelas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `parcelas_id_tiposuelo_foreign` (`id_tiposuelo`),
  ADD KEY `parcelas_id_riego_foreign` (`id_riego`),
  ADD KEY `parcelas_id_municipio_foreign` (`id_municipio`),
  ADD KEY `parcelas_id_productor_foreign` (`id_productor`);

--
-- Indices de la tabla `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Indices de la tabla `plagas`
--
ALTER TABLE `plagas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `plantaciones__plagas`
--
ALTER TABLE `plantaciones__plagas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plaga` (`id_plaga`),
  ADD KEY `id_plantacion` (`id_plantacion`);

--
-- Indices de la tabla `plantacions`
--
ALTER TABLE `plantacions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_parcela` (`id_parcela`),
  ADD KEY `id_especie` (`id_especie`),
  ADD KEY `id_tipoplantacion` (`id_tipoplantacion`);

--
-- Indices de la tabla `plantacion__asociados`
--
ALTER TABLE `plantacion__asociados`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plantacion__asociados_id_asociado_foreign` (`id_asociado`),
  ADD KEY `plantacion__asociados_id_plantacion_foreign` (`id_plantacion`);

--
-- Indices de la tabla `plantacion__fertilizantes`
--
ALTER TABLE `plantacion__fertilizantes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plantacion__fertilizantes_id_fertilizante_foreign` (`id_fertilizante`),
  ADD KEY `plantacion__fertilizantes_id_plantacion_foreign` (`id_plantacion`);

--
-- Indices de la tabla `plantacion__manejo_enfermedads`
--
ALTER TABLE `plantacion__manejo_enfermedads`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plantacion__manejo_enfermedads_id_manejoenfermedad_foreign` (`id_manejoenfermedad`),
  ADD KEY `plantacion__manejo_enfermedads_id_plantacion_foreign` (`id_plantacion`);

--
-- Indices de la tabla `plantacion__manejo_plagas`
--
ALTER TABLE `plantacion__manejo_plagas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plantacion__manejo_plagas_id_manejoplaga_foreign` (`id_manejoplaga`),
  ADD KEY `plantacion__manejo_plagas_id_plantacion_foreign` (`id_plantacion`);

--
-- Indices de la tabla `plantacion__tutors`
--
ALTER TABLE `plantacion__tutors`
  ADD PRIMARY KEY (`id`),
  ADD KEY `plantacion__tutors_id_tutor_foreign` (`id_tutor`),
  ADD KEY `plantacion__tutors_id_plantacion_foreign` (`id_plantacion`);

--
-- Indices de la tabla `productors`
--
ALTER TABLE `productors`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `riegos`
--
ALTER TABLE `riegos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `servicios_equipamientos`
--
ALTER TABLE `servicios_equipamientos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_plantacions`
--
ALTER TABLE `tipo_plantacions`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo_suelos`
--
ALTER TABLE `tipo_suelos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tutors`
--
ALTER TABLE `tutors`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`),
  ADD KEY `users_id_cargo_foreign` (`id_cargo`);

--
-- Indices de la tabla `visitas`
--
ALTER TABLE `visitas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_parcela` (`id_parcela`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad_economicas`
--
ALTER TABLE `actividad_economicas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `caracteristicas_municipios`
--
ALTER TABLE `caracteristicas_municipios`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `caractesticas_casas`
--
ALTER TABLE `caractesticas_casas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `cargos`
--
ALTER TABLE `cargos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `casas`
--
ALTER TABLE `casas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `ciclo_floracions`
--
ALTER TABLE `ciclo_floracions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cultivo_asociados`
--
ALTER TABLE `cultivo_asociados`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `direccions`
--
ALTER TABLE `direccions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `enfermedades`
--
ALTER TABLE `enfermedades`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `enfermedades_familia`
--
ALTER TABLE `enfermedades_familia`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `enfermedades_plantaciones`
--
ALTER TABLE `enfermedades_plantaciones`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `enfer_plantas`
--
ALTER TABLE `enfer_plantas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `especies`
--
ALTER TABLE `especies`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `familias`
--
ALTER TABLE `familias`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `fertilizantes`
--
ALTER TABLE `fertilizantes`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `manejo_enfermedads`
--
ALTER TABLE `manejo_enfermedads`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `manejo_plagas`
--
ALTER TABLE `manejo_plagas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `municipios`
--
ALTER TABLE `municipios`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `parcelas`
--
ALTER TABLE `parcelas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `plagas`
--
ALTER TABLE `plagas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `plantaciones__plagas`
--
ALTER TABLE `plantaciones__plagas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `plantacions`
--
ALTER TABLE `plantacions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `plantacion__asociados`
--
ALTER TABLE `plantacion__asociados`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `plantacion__fertilizantes`
--
ALTER TABLE `plantacion__fertilizantes`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `plantacion__manejo_enfermedads`
--
ALTER TABLE `plantacion__manejo_enfermedads`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `plantacion__manejo_plagas`
--
ALTER TABLE `plantacion__manejo_plagas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `plantacion__tutors`
--
ALTER TABLE `plantacion__tutors`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `productors`
--
ALTER TABLE `productors`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `riegos`
--
ALTER TABLE `riegos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `servicios_equipamientos`
--
ALTER TABLE `servicios_equipamientos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `tipo_plantacions`
--
ALTER TABLE `tipo_plantacions`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipo_suelos`
--
ALTER TABLE `tipo_suelos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tutors`
--
ALTER TABLE `tutors`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `visitas`
--
ALTER TABLE `visitas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `casas`
--
ALTER TABLE `casas`
  ADD CONSTRAINT `casas_id_caractcasa_foreign` FOREIGN KEY (`id_caractcasa`) REFERENCES `caractesticas_casas` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `casas_id_servequip_foreign` FOREIGN KEY (`id_servequip`) REFERENCES `servicios_equipamientos` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `ciclo_floracions`
--
ALTER TABLE `ciclo_floracions`
  ADD CONSTRAINT `ciclo_floracions_ibfk_1` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `direccions`
--
ALTER TABLE `direccions`
  ADD CONSTRAINT `direccions_id_municipio_foreign` FOREIGN KEY (`id_municipio`) REFERENCES `municipios` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `enfermedades_familia`
--
ALTER TABLE `enfermedades_familia`
  ADD CONSTRAINT `enfermedades_familia_enfermedades_id_foreign` FOREIGN KEY (`enfermedades_id`) REFERENCES `enfermedades` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `enfermedades_familia_familia_id_foreign` FOREIGN KEY (`familia_id`) REFERENCES `familias` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `enfermedades_plantaciones`
--
ALTER TABLE `enfermedades_plantaciones`
  ADD CONSTRAINT `enfermedades_plantaciones_ibfk_1` FOREIGN KEY (`id_enfermedad`) REFERENCES `enfer_plantas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `enfermedades_plantaciones_ibfk_2` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `familias`
--
ALTER TABLE `familias`
  ADD CONSTRAINT `familias_id_productor_foreign` FOREIGN KEY (`id_productor`) REFERENCES `productors` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `municipios_id_caracmunicipio_foreign` FOREIGN KEY (`id_caracmunicipio`) REFERENCES `caracteristicas_municipios` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `municipios_id_estado_foreign` FOREIGN KEY (`id_estado`) REFERENCES `estados` (`id`);

--
-- Filtros para la tabla `parcelas`
--
ALTER TABLE `parcelas`
  ADD CONSTRAINT `parcelas_id_municipio_foreign` FOREIGN KEY (`id_municipio`) REFERENCES `municipios` (`id`),
  ADD CONSTRAINT `parcelas_id_productor_foreign` FOREIGN KEY (`id_productor`) REFERENCES `productors` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `parcelas_id_riego_foreign` FOREIGN KEY (`id_riego`) REFERENCES `riegos` (`id`),
  ADD CONSTRAINT `parcelas_id_tiposuelo_foreign` FOREIGN KEY (`id_tiposuelo`) REFERENCES `tipo_suelos` (`id`);

--
-- Filtros para la tabla `plantaciones__plagas`
--
ALTER TABLE `plantaciones__plagas`
  ADD CONSTRAINT `plantaciones__plagas_ibfk_1` FOREIGN KEY (`id_plaga`) REFERENCES `plagas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `plantaciones__plagas_ibfk_2` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `plantacions`
--
ALTER TABLE `plantacions`
  ADD CONSTRAINT `plantacions_ibfk_1` FOREIGN KEY (`id_parcela`) REFERENCES `parcelas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `plantacions_ibfk_2` FOREIGN KEY (`id_especie`) REFERENCES `especies` (`id`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `plantacions_ibfk_3` FOREIGN KEY (`id_tipoplantacion`) REFERENCES `tipo_plantacions` (`id`) ON UPDATE NO ACTION;

--
-- Filtros para la tabla `plantacion__asociados`
--
ALTER TABLE `plantacion__asociados`
  ADD CONSTRAINT `plantacion__asociados_id_asociado_foreign` FOREIGN KEY (`id_asociado`) REFERENCES `cultivo_asociados` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `plantacion__asociados_id_plantacion_foreign` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `plantacion__fertilizantes`
--
ALTER TABLE `plantacion__fertilizantes`
  ADD CONSTRAINT `plantacion__fertilizantes_id_fertilizante_foreign` FOREIGN KEY (`id_fertilizante`) REFERENCES `fertilizantes` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `plantacion__fertilizantes_id_plantacion_foreign` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `plantacion__manejo_enfermedads`
--
ALTER TABLE `plantacion__manejo_enfermedads`
  ADD CONSTRAINT `plantacion__manejo_enfermedads_id_manejoenfermedad_foreign` FOREIGN KEY (`id_manejoenfermedad`) REFERENCES `manejo_enfermedads` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `plantacion__manejo_enfermedads_id_plantacion_foreign` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `plantacion__manejo_plagas`
--
ALTER TABLE `plantacion__manejo_plagas`
  ADD CONSTRAINT `plantacion__manejo_plagas_id_manejoplaga_foreign` FOREIGN KEY (`id_manejoplaga`) REFERENCES `manejo_plagas` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `plantacion__manejo_plagas_id_plantacion_foreign` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `plantacion__tutors`
--
ALTER TABLE `plantacion__tutors`
  ADD CONSTRAINT `plantacion__tutors_id_plantacion_foreign` FOREIGN KEY (`id_plantacion`) REFERENCES `plantacions` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `plantacion__tutors_id_tutor_foreign` FOREIGN KEY (`id_tutor`) REFERENCES `tutors` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_id_cargo_foreign` FOREIGN KEY (`id_cargo`) REFERENCES `cargos` (`id`);

--
-- Filtros para la tabla `visitas`
--
ALTER TABLE `visitas`
  ADD CONSTRAINT `visitas_ibfk_1` FOREIGN KEY (`id_parcela`) REFERENCES `parcelas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
