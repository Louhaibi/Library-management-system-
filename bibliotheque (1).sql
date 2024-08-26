-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2022 at 11:41 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bibliotheque`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorie`
--

CREATE TABLE `categorie` (
  `idCat` int(10) NOT NULL,
  `nomCat` varchar(255) NOT NULL,
  `division` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorie`
--

INSERT INTO `categorie` (`idCat`, `nomCat`, `division`) VALUES
(1, 'Informatique', '000'),
(2, 'Bibliographies', '100'),
(3, 'Bibliothéconomie et ', '200'),
(4, 'Encyclopédies et livre', '030'),
(5, 'Magazines, journaux ', '050'),
(6, 'Associations, organi', '060'),
(7, 'Métaphysique', '110'),
(8, 'Psychologie', '150'),
(9, 'Logique', '160'),
(10, 'Philosophie et théor', '210'),
(11, 'Économie', '330'),
(12, 'Droit', '340'),
(13, 'Éducation', '370');

-- --------------------------------------------------------

--
-- Table structure for table `doc`
--

CREATE TABLE `doc` (
  `idDoc` int(11) NOT NULL,
  `titre` varchar(20) DEFAULT NULL,
  `nom_autheur` varchar(20) DEFAULT NULL,
  `nbCopie` int(11) DEFAULT NULL,
  `datePublication` varchar(10) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `champ1` varchar(20) DEFAULT NULL,
  `idCat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doc`
--

INSERT INTO `doc` (`idDoc`, `titre`, `nom_autheur`, `nbCopie`, `datePublication`, `type`, `champ1`, `idCat`) VALUES
(1, 'Avatar', 'James Cameron', 100, '2009', 'disqueCompact', '162 min', 2),
(3, 'I Am Legend', 'Francis Lawrence', 800, '2007', 'disqueCompact', '101 min', 1),
(4, 'The Avengers', 'Joss Whedon', 50, '2012', 'disqueCompact', '143 min', 1),
(5, 'The Wolf of Wall Str', 'Martin Scorsese', 73, '2013', 'disqueCompact', '180 min', 4),
(6, 'Interstellar', 'Christopher Nolan', 40, '2014', 'disqueCompact', '169 min', 1),
(7, 'Breaking Bad', 'N/A', 90, '2008–2013', 'disqueCompact', '49 min', 1),
(8, 'Assassin s Creed', 'Justin Kurzel', 100, '2016', 'cassettesVideo', '162 min', 2),
(9, 'Luke Cage', 'Cheo Hodari Coker', 100, '2016', 'cassettesVideo', '101 min', 1),
(10, 'The Avengers', 'Joss Whedon', 50, '2012', 'cassettesVideo', '143 min', 1),
(11, 'The Wolf of Wall Str', 'Martin Scorsese', 73, '2013', 'cassettesVideo', '200 min', 4),
(12, 'Interstellar', 'Christopher Nolan', 40, '2014', 'cassettesVideo', '169 min', 1),
(13, 'Breaking Bad', 'N/A', 90, '2008-2013', 'cassettesVideo', '49 min', 1),
(14, 'Northanger Abbey', 'Austen, Jane', 800, '1814', 'livreRegulier', 'A12345', 1),
(16, 'Anna Karenina', 'Tolstoy, Leo', 800, '1875', 'livreDemander', 'C12345', 4),
(17, 'Mrs. Dalloway', 'Woolf, Virginia', 800, '1925', 'livreDemander', 'D12345', 6),
(18, 'Cunnningham, Michael', 'Cunnningham, Michael', 800, '1999', 'livreRegulier', 'E12345', 7),
(21, 'Tom Sawyer', 'Twain, Mark', 800, '1862', 'livreDemander', 'H12345', 1),
(22, 'titre1', 'autheur1', 1200, '10/12/2000', 'disqueCompact', '123 min', 1),
(23, 'QSFQ', 'DQSDQS', 12, '12/23/2000', 'cassettesVideo', '23 min', 1);

-- --------------------------------------------------------

--
-- Table structure for table `exemplaire`
--

CREATE TABLE `exemplaire` (
  `codeBar` varchar(20) DEFAULT NULL,
  `idExemplaire` int(11) NOT NULL,
  `prix` float DEFAULT NULL,
  `dateAchat` varchar(10) DEFAULT NULL,
  `idDoc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `listeattente`
--

CREATE TABLE `listeattente` (
  `idlisteAttente` int(11) NOT NULL,
  `idUser` int(11) DEFAULT NULL,
  `idDoc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `penalite`
--

CREATE TABLE `penalite` (
  `idPenalite` int(11) NOT NULL,
  `amende` int(11) DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  `idRes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `idRes` int(11) NOT NULL,
  `dateDebutRes` varchar(10) DEFAULT NULL,
  `dateFinRes` varchar(10) DEFAULT NULL,
  `isReturned` int(1) DEFAULT NULL,
  `prixApaye` float DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  `idExemplaire` int(11) DEFAULT NULL,
  `typeRes` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idUser` int(10) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `numTel` varchar(10) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mdp` varchar(255) NOT NULL,
  `type` varchar(10) NOT NULL,
  `isResid` int(1) NOT NULL,
  `image` blob NOT NULL,
  `cin` varchar(30) NOT NULL,
  `login` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`idUser`, `prenom`, `nom`, `numTel`, `email`, `mdp`, `type`, `isResid`, `image`, `cin`, `login`) VALUES
(1, 'youssef', 'mhd', '0678787620', 'A@gmail.com', '', 'admin', 1, '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`idCat`);

--
-- Indexes for table `doc`
--
ALTER TABLE `doc`
  ADD PRIMARY KEY (`idDoc`),
  ADD KEY `doc_idID_fk` (`idCat`);

--
-- Indexes for table `exemplaire`
--
ALTER TABLE `exemplaire`
  ADD PRIMARY KEY (`idExemplaire`),
  ADD KEY `exemplaire_idDoc_fk` (`idDoc`);

--
-- Indexes for table `listeattente`
--
ALTER TABLE `listeattente`
  ADD PRIMARY KEY (`idlisteAttente`),
  ADD KEY `listeAttente_idUser_fk` (`idUser`),
  ADD KEY `listeAttente_idDoc_fk` (`idDoc`);

--
-- Indexes for table `penalite`
--
ALTER TABLE `penalite`
  ADD PRIMARY KEY (`idPenalite`),
  ADD KEY `penalite_idUser_fk` (`idUser`),
  ADD KEY `penalite_idRes_fk` (`idRes`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idRes`),
  ADD KEY `reservation_idU_fk` (`idUser`),
  ADD KEY `reservation_idID_fk` (`idExemplaire`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `idCat` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `doc`
--
ALTER TABLE `doc`
  MODIFY `idDoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `exemplaire`
--
ALTER TABLE `exemplaire`
  MODIFY `idExemplaire` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `listeattente`
--
ALTER TABLE `listeattente`
  MODIFY `idlisteAttente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `penalite`
--
ALTER TABLE `penalite`
  MODIFY `idPenalite` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `idRes` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `idUser` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `doc`
--
ALTER TABLE `doc`
  ADD CONSTRAINT `doc_idID_fk` FOREIGN KEY (`idCat`) REFERENCES `categorie` (`idCat`);

--
-- Constraints for table `exemplaire`
--
ALTER TABLE `exemplaire`
  ADD CONSTRAINT `exemplaire_idDoc_fk` FOREIGN KEY (`idDoc`) REFERENCES `doc` (`idDoc`);

--
-- Constraints for table `listeattente`
--
ALTER TABLE `listeattente`
  ADD CONSTRAINT `listeAttente_idDoc_fk` FOREIGN KEY (`idDoc`) REFERENCES `doc` (`idDoc`),
  ADD CONSTRAINT `listeAttente_idUser_fk` FOREIGN KEY (`idUser`) REFERENCES `users` (`idUser`);

--
-- Constraints for table `penalite`
--
ALTER TABLE `penalite`
  ADD CONSTRAINT `penalite_idRes_fk` FOREIGN KEY (`idRes`) REFERENCES `reservation` (`idRes`),
  ADD CONSTRAINT `penalite_idUser_fk` FOREIGN KEY (`idUser`) REFERENCES `users` (`idUser`);

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_idID_fk` FOREIGN KEY (`idExemplaire`) REFERENCES `exemplaire` (`idExemplaire`),
  ADD CONSTRAINT `reservation_idU_fk` FOREIGN KEY (`idUser`) REFERENCES `users` (`idUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
