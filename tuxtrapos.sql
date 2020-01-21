-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2017 a las 23:47:18
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tuxtrapos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `art_id` int(100) NOT NULL,
  `artC_id` int(11) NOT NULL,
  `pro_id` int(11) NOT NULL,
  `art_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `art_precio` int(100) NOT NULL,
  `art_stock` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`art_id`, `artC_id`, `pro_id`, `art_nombre`, `art_precio`, `art_stock`) VALUES
(1, 1, 3004, 'Camisa-blusa rolling mujer', 1500, 2),
(2, 1, 3004, 'Camisa Rota hombre', 2500, 0),
(3, 1, 3004, 'Camisa angry birds M (mujer)', 2700, 3),
(4, 1, 3004, 'camisa Real Elegant (L)-Hombre', 3000, 3),
(5, 1, 3004, 'Camisa Loren Ipusm S Mujer', 3600, 5),
(6, 1, 3004, 'Camisa sit amet XL - Hombre', 4100, 3),
(7, 1, 3004, 'Camisa consectetur M hombre', 6000, 1),
(8, 1, 3004, 'Camisa adipiscing elit XS Mujer', 1990, 4),
(9, 1, 3004, 'Camisa sed do eiusmod M - Mujer', 2200, 0),
(10, 1, 3004, 'Camisa Infantil Niña - 10', 990, 14),
(11, 1, 3004, 'Camisa Hombre XLL', 4000, 33),
(12, 1, 3004, 'Camisa Mujer L', 2900, 19),
(13, 1, 3004, 'Camisa Mujer XL', 5000, 31),
(14, 1, 3004, 'Camisa Hombre S', 5000, 40),
(15, 2, 3004, 'Pantalon Niña 8', 2000, 23),
(16, 2, 3004, 'Pantalon Mujer 36', 6000, 53),
(17, 2, 3004, 'Pantalon Mujer 38', 4000, 38),
(18, 2, 3004, 'Pantalon Mujer 40', 4028, 14),
(19, 2, 3004, 'Pantalon Mujer 42', 2889, 19),
(20, 2, 3004, 'Pantalon Mujer 44', 2888, 40),
(21, 2, 3004, 'Pantalon hombre 40', 2500, 41),
(22, 2, 3004, 'Pantaon hombre 42', 5369, 1),
(23, 2, 3004, 'Pantaon hombre 44', 4157, 68),
(24, 2, 3004, 'Pantaon hombre 46', 1990, 9),
(25, 3, 3004, 'zapato mujer 36', 3000, 15),
(26, 3, 3004, 'zapato mujer 37', 3500, 0),
(27, 3, 3004, 'zapato mujer 38', 4350, 25),
(28, 3, 3004, 'zapato mujer 39', 2555, 40),
(29, 3, 3004, 'zapato hombre 40', 4563, 20),
(30, 3, 3004, 'zapato hombre 42', 6541, 31),
(31, 3, 3004, 'zapato hombre 39', 4456, 24),
(32, 3, 3004, 'zapato hombre ', 8523, 5),
(33, 3, 3004, 'zapato hombre 37', 5283, 4),
(34, 3, 3004, 'zapato infantil 30', 4414, 9),
(1000, 3, 3000, 'Zapato elegant 21', 5500, 103),
(1001, 3, 3000, 'Zapato 43 cofcof', 3450, 200),
(2000, 5, 3001, 'Vestido S Mujer La Mascara ', 7500, 69),
(2001, 1, 3001, 'Camisa xl Hombre Spider Man', 2990, 147),
(3000, 6, 3002, 'Traje Hombre 44 Negro', 20000, 48),
(3001, 6, 3002, 'Traje Mujer Oficina 38', 28, 25597),
(3002, 6, 3002, 'Traje negro niño 10', 16990, 285),
(3003, 5, 3002, 'Vestido Flores M', 3992, 46),
(3004, 5, 3002, 'Vestido S juvenil', 4000, 96),
(3005, 5, 3002, 'Vestido niña Verano 7 ', 3450, 315),
(3006, 4, 3002, 'Chaqueta Pluma hombre L', 5900, 654),
(3007, 4, 3002, 'Chaqueta Mujer Invierno Verde XS', 4680, 963),
(3008, 4, 3002, 'Chaqueta niño 10 azulita', 3800, 417),
(3009, 3, 3002, 'Zapatos mujer 37', 1648, 436),
(3010, 3, 3002, 'Zapato Hombre 45', 4786, 654),
(3011, 3, 3002, 'Zapato Rosa niña 24', 4321, 234),
(3012, 3, 3002, 'Zapato Escolar niño 27', 1990, 634),
(3013, 2, 3002, 'Pantalon niño 14', 1824, 0),
(3014, 2, 3002, 'Pantalon hombre 44', 4867, 41),
(3015, 1, 3002, 'Camisa cuadro hombre S', 2234, 8),
(3016, 1, 3002, 'Camisa niño escolar 8', 1234, 653),
(3017, 1, 3002, 'Camisa hombre XL', 2134, 109),
(3018, 4, 3002, 'Chaqueta Chaqueton mujer S', 5000, 787),
(3019, 2, 3002, 'Pantalon Sepsi mujer 40 ', 4656, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo_categoria`
--

CREATE TABLE `articulo_categoria` (
  `artC_id` int(10) NOT NULL,
  `artC_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `articulo_categoria`
--

INSERT INTO `articulo_categoria` (`artC_id`, `artC_nombre`) VALUES
(1, 'Camisas'),
(2, 'Pantalones'),
(3, 'Zapatos'),
(4, 'Chaquetas'),
(5, 'Vestidos'),
(6, 'Trajes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE `asistencia` (
  `asistencia_id` date NOT NULL,
  `emp_id` int(100) NOT NULL,
  `asistencia_descripcion` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `asistencia`
--

INSERT INTO `asistencia` (`asistencia_id`, `emp_id`, `asistencia_descripcion`) VALUES
('2017-06-11', 1, 'SI'),
('2017-06-11', 3, 'NO'),
('2017-06-11', 4, 'NO'),
('2017-06-11', 5, 'SI'),
('2017-06-12', 1, 'SI'),
('2017-06-12', 4, 'SI'),
('2017-06-12', 5, 'SI'),
('2017-06-14', 1, 'NO'),
('2017-06-14', 5, 'SI'),
('2017-06-15', 1, 'NO'),
('2017-06-15', 4, 'SI'),
('2017-06-16', 1, 'NO'),
('2017-06-16', 3, 'SI'),
('2017-06-16', 4, 'SI'),
('2017-06-16', 5, 'SI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE `cargo` (
  `cargo_id` int(100) NOT NULL,
  `cargo_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cargo_sueldo` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`cargo_id`, `cargo_nombre`, `cargo_sueldo`) VALUES
(1, 'Vendedor', 350000),
(2, 'Supervisor', 450000),
(3, 'Jefe de área ', 1000000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cli_id` int(100) NOT NULL,
  `cli_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cli_direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cli_telefono` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cli_correo` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cli_id`, `cli_nombre`, `cli_direccion`, `cli_telefono`, `cli_correo`) VALUES
(0, 'Sin Datos', '', '', ''),
(1, 'Michael Bahamondes Tapia', 'Los platanos 80', '899999999999', 'Michael.ba@gmail.com'),
(2, 'Beatriz Amanda Castro Rojas', 'Los Almendros 453', '7777777', 'beatrizC@live.com'),
(3, 'Jezabel edomita', 'Las acacias 44', '54534523', 'edomita.J@gmail.com'),
(4, 'Camila Velasquez', 'Av. Hidrogeno', '7777777777', 'cami.vela@outlook.com'),
(5, 'Paloma Aguilera', 'antofagasta 231', '44444444', 'paloma.a@yahoo.es'),
(6, '55', '555', '555555', '55555555'),
(7, 'Bob Sin', 'Vest 450', '34525678', 'bobs@erc.com'),
(9, 'Eskiusme Please', 'Av OMG 654', '999999999', 'e.please@LOL.com'),
(33, 'Camilo Valdivieso', 'Los Jebuseos 999 ', '5485968424', 'camiloV@hotmail.com'),
(67, 'gfdsa', 'asdfghfds', 'sdfghjgfds', 'sdfghjgfds'),
(654, 'wertytre', '4555445', '8898888', '5545454'),
(4567, 'RTYU', 'RTYU', 'RDFTGH', 'DFGH'),
(99999999, 'MELÓN', 'Tarapaca 416', '4342223223', 'emisoad22@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_categoria`
--

CREATE TABLE `cliente_categoria` (
  `cliC_id` int(100) NOT NULL,
  `cliC_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `com_id` int(100) NOT NULL,
  `pro_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `cli_id` int(11) NOT NULL,
  `com_valor` int(100) NOT NULL,
  `com_fecha` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `com_medioPago` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`com_id`, `pro_id`, `emp_id`, `cli_id`, `com_valor`, `com_fecha`, `com_medioPago`) VALUES
(7999, 3003, 1, 5, 56432, '76543', ''),
(8000, 3002, 3, 2, 5000, '2017-06-13 20:16:39', ''),
(8001, 3002, 4, 1, 26770, '2017-06-14 04:00:45', ''),
(8002, 3002, 4, 0, 4268, '2017-06-14 17:07:09', ''),
(8003, 3002, 1, 0, 8826, '2017-06-14 17:54:49', ''),
(8004, 3002, 3, 0, 6928, '2017-06-14 23:31:41', ''),
(8005, 3001, 5, 0, 2990, '2017-06-15 01:26:45', 'Tarjeta de Credito'),
(8006, 3002, 3, 4, 6178, '2017-06-15 02:03:12', 'Cheque'),
(8007, 3001, 3, 9, 52500, '2017-06-15 02:24:22', 'Efectivo'),
(8008, 3002, 5, 0, 4468, '2017-06-15 04:05:46', 'Efectivo'),
(8009, 3002, 3, 33, 11536, '2017-06-15 04:50:08', 'Tarjeta de Credito'),
(8010, 3001, 1, 2, 13480, '2017-06-15 23:32:02', 'Efectivo'),
(8011, 3002, 1, 33, 68016, '2017-06-16 02:58:58', 'Debito'),
(8012, 3002, 4, 2, 25776, '2017-06-16 12:17:56', 'Efectivo'),
(8013, 3002, 5, 33, 16542, '2017-06-16 13:25:49', 'Efectivo'),
(8014, 3004, 3, 2, 5990, '2017-06-16 15:45:33', 'Cheque');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `cont_id` int(100) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `cargo_id` int(11) NOT NULL,
  `cont_FI` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cont_FT` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cont_horasT` int(20) NOT NULL,
  `cont_sueldo` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`cont_id`, `emp_id`, `cargo_id`, `cont_FI`, `cont_FT`, `cont_horasT`, `cont_sueldo`) VALUES
(1, 1, 1, '04-06-2015', '-', 45, 380000),
(2, 2, 2, '09-01-2016', '05-11-2016', 30, 420000),
(3, 3, 1, '11-06-2017', '-', 45, 380000),
(4, 5, 3, '04-06-2017', '-', 20, 1000000),
(5, 4, 1, '04-02-2016', '-', 30, 250000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato_anexo`
--

CREATE TABLE `contrato_anexo` (
  `anexoC_id` int(11) NOT NULL,
  `cont_id` int(11) NOT NULL,
  `cargo_id` int(11) NOT NULL,
  `anexoC_FI` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `anexoC_horas` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detcompra`
--

CREATE TABLE `detcompra` (
  `com_id` int(100) NOT NULL,
  `art_id` int(100) NOT NULL,
  `detC_cant` int(100) NOT NULL,
  `detC_precio` int(11) NOT NULL,
  `detC_total` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `detcompra`
--

INSERT INTO `detcompra` (`com_id`, `art_id`, `detC_cant`, `detC_precio`, `detC_total`) VALUES
(8002, 3017, 2, 2134, 4268),
(8003, 3009, 4, 1648, 6592),
(8003, 3015, 1, 2234, 2234),
(8004, 3001, 1, 28, 28),
(8004, 3005, 2, 3450, 6900),
(8005, 2001, 1, 2990, 2990),
(8006, 3009, 3, 1648, 4944),
(8006, 3016, 1, 1234, 1234),
(8007, 2000, 7, 7500, 52500),
(8008, 3015, 2, 2234, 4468),
(8009, 3009, 7, 1648, 11536),
(8010, 2000, 1, 7500, 7500),
(8010, 2001, 2, 2990, 5980),
(8011, 3001, 2, 28, 56),
(8011, 3002, 4, 16990, 67960),
(8012, 3003, 3, 3992, 11976),
(8012, 3005, 4, 3450, 13800),
(8013, 3009, 4, 1648, 6592),
(8013, 3012, 5, 1990, 9950),
(8014, 15, 2, 2000, 4000),
(8014, 24, 1, 1990, 1990);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detventa`
--

CREATE TABLE `detventa` (
  `ven_id` int(11) NOT NULL,
  `art_id` int(11) NOT NULL,
  `detV_precio` int(100) NOT NULL,
  `detV_cant` int(100) NOT NULL,
  `detV_total` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `detventa`
--

INSERT INTO `detventa` (`ven_id`, `art_id`, `detV_precio`, `detV_cant`, `detV_total`) VALUES
(7000, 2, 2000, 5, 10000),
(7001, 1, 5000, 2, 10000),
(7001, 2, 2500, 4, 10000),
(7003, 5, 3600, 2, 7200),
(7003, 6, 4100, 3, 12300),
(7004, 1, 1500, 2, 3000),
(7004, 2, 2500, 2, 5000),
(7005, 5, 3600, 2, 7200),
(7005, 14, 5000, 2, 10000),
(7005, 23, 4157, 4, 16628),
(7006, 5, 3600, 2, 7200),
(7006, 16, 6000, 3, 18000),
(7007, 29, 4563, 2, 9126),
(7007, 30, 6541, 2, 13082),
(7008, 4, 3000, 1, 3000),
(7008, 13, 5000, 1, 5000),
(7008, 20, 2888, 2, 5776),
(7009, 13, 5000, 2, 10000),
(7010, 29, 4563, 6, 27378),
(7010, 32, 8523, 3, 25569),
(7011, 5, 3600, 1, 3600),
(7011, 17, 4000, 6, 24000),
(7012, 11, 4000, 1, 4000),
(7012, 23, 4157, 1, 4157),
(7013, 23, 4157, 1, 4157),
(7014, 28, 2555, 1, 2555),
(7015, 3, 2700, 1, 2700),
(7015, 11, 4000, 2, 8000),
(7016, 3, 2700, 1, 2700),
(7017, 17, 4000, 2, 8000),
(7017, 20, 2888, 2, 5776),
(7018, 3, 2700, 1, 2700),
(7018, 11, 4000, 4, 16000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `emp_id` int(100) NOT NULL,
  `emp_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `emp_direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `emp_telefono` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `emp_descripcion` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`emp_id`, `emp_nombre`, `emp_direccion`, `emp_telefono`, `emp_descripcion`) VALUES
(1, 'Gariela Alfaro', 'Larrain Alcalde 500', '54859395', 'BLA BLA BLA'),
(2, 'Jhony Barraza', 'Los Molles 434', '34435636', 'asdasdasdasd'),
(3, 'Teresa Carrizo', 'San Agustín 785', '86596482', ''),
(4, 'Ricardo Medina', 'España 231', '53548715', ''),
(5, 'Alegria Macarena', 'La arboleda', '45356735', 'bla bla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `pro_id` int(100) NOT NULL,
  `pro_nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `pro_direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `pro_telefono` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`pro_id`, `pro_nombre`, `pro_direccion`, `pro_telefono`) VALUES
(3000, 'Zapatero tus Zapatos', '', ''),
(3001, 'Todo Disfraces', '', ''),
(3002, 'Fachions Pork', '', ''),
(3003, 'Feria de las Pulgas', '', ''),
(3004, 'TuxTrapos Ltda', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `ven_id` int(100) NOT NULL,
  `pro_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `cli_id` int(11) NOT NULL,
  `ven_comision` int(11) NOT NULL,
  `ven_valor` int(11) NOT NULL,
  `ven_fecha` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `ven_medioPago` varchar(100) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`ven_id`, `pro_id`, `emp_id`, `cli_id`, `ven_comision`, `ven_valor`, `ven_fecha`, `ven_medioPago`) VALUES
(7000, 3004, 1, 33, 2, 10000, '10-02-2016', 'Cheque'),
(7001, 3004, 2, 5, 2, 20000, '14-08-2016', 'Efectivo'),
(7003, 3004, 2, 1, 2, 19500, '2017-06-07 03:44:04', 'Debito'),
(7004, 3004, 2, 33, 2, 8000, '2017-06-07 17:52:11', 'Tarjeta Credito'),
(7005, 3004, 2, 3, 2, 33828, '2017-06-07 23:35:42', 'Tarjeta Credito'),
(7006, 3004, 1, 2, 2, 25200, '2017-06-09 03:57:42', 'Debito'),
(7007, 3004, 1, 2, 2, 22208, '2017-06-09 05:42:13', 'Debito'),
(7008, 3004, 3, 33, 2, 13776, '2017-06-11 21:19:53', 'Tarjeta Credito'),
(7009, 3004, 4, 33, 2, 10000, '2017-06-12 15:49:44', 'Efectivo'),
(7010, 3004, 1, 33, 2, 52947, '2017-06-12 17:43:39', 'Efectivo'),
(7011, 3004, 1, 0, 2, 27600, '2017-06-14 23:29:01', 'Efectivo'),
(7012, 3004, 5, 9, 2, 8157, '2017-06-15 00:40:52', 'Efectivo'),
(7013, 3004, 5, 0, 2, 4157, '2017-06-15 20:47:23', 'Debito'),
(7014, 3004, 3, 1, 2, 2555, '2017-06-15 21:46:12', 'Cheque'),
(7015, 3004, 4, 9, 2, 2, '2017-06-16 01:48:16', 'Tarjeta de Crédito'),
(7016, 3004, 3, 9, 2, 2700, '2017-06-16 01:58:35', 'Debito'),
(7017, 3004, 3, 1, 2, 13776, '2017-06-16 02:22:04', 'Debito'),
(7018, 3004, 5, 0, 2, 18700, '2017-06-16 12:16:48', 'Cheque');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`art_id`),
  ADD KEY `artC_id` (`artC_id`),
  ADD KEY `articulo_ibfk_1` (`pro_id`);

--
-- Indices de la tabla `articulo_categoria`
--
ALTER TABLE `articulo_categoria`
  ADD PRIMARY KEY (`artC_id`);

--
-- Indices de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`asistencia_id`,`emp_id`),
  ADD KEY `emp_id` (`emp_id`);

--
-- Indices de la tabla `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`cargo_id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_id`);

--
-- Indices de la tabla `cliente_categoria`
--
ALTER TABLE `cliente_categoria`
  ADD PRIMARY KEY (`cliC_id`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`com_id`),
  ADD KEY `pro_id` (`pro_id`),
  ADD KEY `cli_id` (`cli_id`),
  ADD KEY `emp_id` (`emp_id`);

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`cont_id`),
  ADD KEY `emp_id` (`emp_id`),
  ADD KEY `cargo_id` (`cargo_id`);

--
-- Indices de la tabla `contrato_anexo`
--
ALTER TABLE `contrato_anexo`
  ADD PRIMARY KEY (`anexoC_id`),
  ADD KEY `cont_id` (`cont_id`),
  ADD KEY `cargo_id` (`cargo_id`);

--
-- Indices de la tabla `detcompra`
--
ALTER TABLE `detcompra`
  ADD PRIMARY KEY (`com_id`,`art_id`),
  ADD KEY `art_id` (`art_id`);

--
-- Indices de la tabla `detventa`
--
ALTER TABLE `detventa`
  ADD PRIMARY KEY (`ven_id`,`art_id`),
  ADD KEY `art_id` (`art_id`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`pro_id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`ven_id`),
  ADD KEY `emp_id` (`emp_id`),
  ADD KEY `cli_id` (`cli_id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD CONSTRAINT `articulo_ibfk_1` FOREIGN KEY (`pro_id`) REFERENCES `proveedor` (`pro_id`),
  ADD CONSTRAINT `articulo_ibfk_2` FOREIGN KEY (`artC_id`) REFERENCES `articulo_categoria` (`artC_id`);

--
-- Filtros para la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `asistencia_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `empleado` (`emp_id`);

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`pro_id`) REFERENCES `proveedor` (`pro_id`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`cli_id`) REFERENCES `cliente` (`cli_id`),
  ADD CONSTRAINT `compra_ibfk_3` FOREIGN KEY (`emp_id`) REFERENCES `empleado` (`emp_id`);

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `empleado` (`emp_id`),
  ADD CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`cargo_id`) REFERENCES `cargo` (`cargo_id`);

--
-- Filtros para la tabla `contrato_anexo`
--
ALTER TABLE `contrato_anexo`
  ADD CONSTRAINT `contrato_anexo_ibfk_1` FOREIGN KEY (`cont_id`) REFERENCES `contrato` (`cont_id`),
  ADD CONSTRAINT `contrato_anexo_ibfk_2` FOREIGN KEY (`cargo_id`) REFERENCES `cargo` (`cargo_id`);

--
-- Filtros para la tabla `detcompra`
--
ALTER TABLE `detcompra`
  ADD CONSTRAINT `detcompra_ibfk_1` FOREIGN KEY (`com_id`) REFERENCES `compra` (`com_id`),
  ADD CONSTRAINT `detcompra_ibfk_2` FOREIGN KEY (`art_id`) REFERENCES `articulo` (`art_id`);

--
-- Filtros para la tabla `detventa`
--
ALTER TABLE `detventa`
  ADD CONSTRAINT `detventa_ibfk_1` FOREIGN KEY (`ven_id`) REFERENCES `venta` (`ven_id`),
  ADD CONSTRAINT `detventa_ibfk_2` FOREIGN KEY (`art_id`) REFERENCES `articulo` (`art_id`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `empleado` (`emp_id`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`cli_id`) REFERENCES `cliente` (`cli_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
