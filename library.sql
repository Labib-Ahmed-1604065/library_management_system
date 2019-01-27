-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2019 at 03:04 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_Name` varchar(20) NOT NULL,
  `Admin_Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Admin_Name`, `Admin_Password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bookinfo`
--

CREATE TABLE `bookinfo` (
  `Book_ID` int(11) NOT NULL,
  `Book_Name` varchar(20) NOT NULL,
  `Author_Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookinfo`
--

INSERT INTO `bookinfo` (`Book_ID`, `Book_Name`, `Author_Name`) VALUES
(4, 'phy', 'shah'),
(7, 'physics', 'topon'),
(16, 'chem', 'guha'),
(17, 'ICT', 'MUJIB'),
(18, 'ICT', 'nitol');

-- --------------------------------------------------------

--
-- Table structure for table `issueinfo`
--

CREATE TABLE `issueinfo` (
  `Book_ID` int(11) NOT NULL,
  `Student_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issueinfo`
--

INSERT INTO `issueinfo` (`Book_ID`, `Student_ID`) VALUES
(4, 1604001),
(4, 1604051),
(4, 1604065),
(16, 1604001);

-- --------------------------------------------------------

--
-- Table structure for table `librarianinfo`
--

CREATE TABLE `librarianinfo` (
  `ID` int(15) NOT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Mobile` varchar(15) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `librarianinfo`
--

INSERT INTO `librarianinfo` (`ID`, `Name`, `Mobile`, `Password`) VALUES
(3, 'Labib', '+8801732169133', '12345'),
(4, 'Sharif', '+8801797419246', '54321');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `ID` varchar(20) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Mobile` varchar(15) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`ID`, `Name`, `Mobile`, `Password`) VALUES
('1604001', 'Suborno', '+8801111111111', '12346'),
('1604051', 'Fahim', '+8801911629799', '98765'),
('1604061', 'Rimon', '+8801774692804', '98764');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_Name`);

--
-- Indexes for table `bookinfo`
--
ALTER TABLE `bookinfo`
  ADD PRIMARY KEY (`Book_ID`);

--
-- Indexes for table `issueinfo`
--
ALTER TABLE `issueinfo`
  ADD PRIMARY KEY (`Book_ID`,`Student_ID`);

--
-- Indexes for table `librarianinfo`
--
ALTER TABLE `librarianinfo`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookinfo`
--
ALTER TABLE `bookinfo`
  MODIFY `Book_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `librarianinfo`
--
ALTER TABLE `librarianinfo`
  MODIFY `ID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
