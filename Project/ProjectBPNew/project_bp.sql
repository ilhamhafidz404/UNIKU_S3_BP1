-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 21, 2024 at 02:32 PM
-- Server version: 5.7.33
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_bp`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `mua`
--

CREATE TABLE `mua` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `telp` varchar(12) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mua`
--

INSERT INTO `mua` (`id`, `nama`, `username`, `password`, `telp`, `alamat`) VALUES
(1, 'Ilham', 'Ilham', 'ilhambanget', '083871352030', 'Wawarung'),
(2, 'Lilis', 'lilis', 'lilis', '083871352031', 'Cageur'),
(5, 'mua baru', 'mua baru', 'password', '08387123421', 'alamat baru');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `nama`, `username`, `password`) VALUES
(1, 'Ilham', 'ham', 'pass'),
(2, 'passq', 'pass', 'pass'),
(3, 'weopfh', 'passw', '123'),
(4, 'pelanggan', 'pelanggan', 'pelanggan'),
(5, 'lilis', 'lilis', 'lilis'),
(6, 'lilisaa', 'lilisaa', '123'),
(7, 'user baru', 'userbaru', 'password');

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `acara` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`id`, `nama`, `acara`, `tanggal`, `alamat`) VALUES
(5, 'pelanggan', 'Pernikahan', 'Thu Jan 18 13:47:17 ICT 2024', 'wawarung'),
(6, 'pelanggan', 'Pernikahan', 'Thu Jan 18 13:47:17 ICT 2024', 'wawarung'),
(7, 'lilisaa', 'Wisuda', 'Sat Jan 27 11:21:09 ICT 2024', 'Kuningan');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `mua` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `acara` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `mua`, `nama`, `acara`, `tanggal`, `alamat`) VALUES
(4, 'Ilham', 'Mutia', 'Pernikahan', 'Thu Jan 11 13:34:36 ICT 2024', 'Desa Cageur RT 18, RW 05'),
(5, 'Lilis', 'Dera', 'Pernikahan', 'Thu Jan 11 13:36:44 ICT 2024', 'Desa Ciniru RT 18, RW 05'),
(6, 'Lilis', 'Helva', 'Pernikahan', 'Thu Jan 04 13:37:36 ICT 2024', 'Desa Wawarung RT 18, RW 05'),
(7, 'Lilis', 'Fitri', 'Pernikahan', 'Tue Jan 16 15:18:29 ICT 2024', 'Desa Sukamaju RT 18, RW 05'),
(8, 'Ilham', 'User Baru', 'Pernikahan', 'Tue Jan 23 09:49:46 ICT 2024', 'Sukarasa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `mua`
--
ALTER TABLE `mua`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mua`
--
ALTER TABLE `mua`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `request`
--
ALTER TABLE `request`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
