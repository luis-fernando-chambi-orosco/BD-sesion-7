-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: liga_de_futbol
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `arbitros`
--

DROP TABLE IF EXISTS `arbitros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `arbitros` (
  `ArbCod` int NOT NULL AUTO_INCREMENT,
  `ArbNom` varchar(45) NOT NULL,
  `ArbCat` varchar(45) NOT NULL,
  `ArbDNI` varchar(8) NOT NULL,
  `ArbEda` int NOT NULL,
  `ArbEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`ArbCod`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `arbitros`
--

LOCK TABLES `arbitros` WRITE;
/*!40000 ALTER TABLE `arbitros` DISABLE KEYS */;
INSERT INTO `arbitros` VALUES (101,'Juan Perez','Nacional','74586326',35,'A'),(102,'Danilo Hernandes','Nacional','62654598',28,'A'),(103,'Micchael Polasky','Internacional','52369825',32,'A'),(104,'Chisthian Mccvoy ','Porfesional ','74583625',31,'A'),(105,'Ramon Valdez','Asistenete','78549658',45,'A');
/*!40000 ALTER TABLE `arbitros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenador`
--

DROP TABLE IF EXISTS `entrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrenador` (
  `EntCod` int NOT NULL AUTO_INCREMENT,
  `EntEquCod` int NOT NULL,
  `EntNom` varchar(45) NOT NULL,
  `EntDNI` varchar(8) NOT NULL,
  `EntEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`EntCod`),
  KEY `IX_Relationship25` (`EntEquCod`),
  CONSTRAINT `Relationship25` FOREIGN KEY (`EntEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenador`
--

LOCK TABLES `entrenador` WRITE;
/*!40000 ALTER TABLE `entrenador` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrenador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipos` (
  `EquCod` int NOT NULL AUTO_INCREMENT,
  `EquNom` varchar(45) NOT NULL,
  `EquEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`EquCod`)
) ENGINE=InnoDB AUTO_INCREMENT=3009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (3001,'UTC Cerro Colorado','A'),(3002,'Sport Yanahuara','A'),(3003,'Atletico Misti','A'),(3004,'Tecnico del sur','A'),(3005,'Leon del Sillar FC ','A'),(3006,'UTC San Camilo','A'),(3007,'Union Municipal','A'),(3008,'Leoncio Prado FC ','A');
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadio`
--

DROP TABLE IF EXISTS `estadio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estadio` (
  `EstCod` int NOT NULL AUTO_INCREMENT,
  `EstNom` varchar(20) NOT NULL,
  `EstEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`EstCod`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadio`
--

LOCK TABLES `estadio` WRITE;
/*!40000 ALTER TABLE `estadio` DISABLE KEYS */;
INSERT INTO `estadio` VALUES (201,'monumental Unsa','A'),(202,'NisaImport','A'),(203,'Ho Chi Minh','A');
/*!40000 ALTER TABLE `estadio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadistica_general`
--

DROP TABLE IF EXISTS `estadistica_general`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estadistica_general` (
  `EstGenCod` int NOT NULL AUTO_INCREMENT,
  `EstGenGolNum` int NOT NULL,
  `EstGenTarAma` int NOT NULL,
  `EstGenTarRoj` int NOT NULL,
  `EstGenCodLig` int NOT NULL,
  `EstGenEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`EstGenCod`),
  KEY `IX_8` (`EstGenCodLig`),
  CONSTRAINT `8` FOREIGN KEY (`EstGenCodLig`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadistica_general`
--

LOCK TABLES `estadistica_general` WRITE;
/*!40000 ALTER TABLE `estadistica_general` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadistica_general` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `EveCod` int NOT NULL AUTO_INCREMENT,
  `EveTip` varchar(20) NOT NULL,
  `EveJugCod` int NOT NULL,
  `EveParCod` int DEFAULT NULL,
  `EveArbCod` int NOT NULL,
  `EveMin` int NOT NULL,
  `EveEstReg` varchar(1) NOT NULL,
  `EveEstCod` int DEFAULT NULL,
  PRIMARY KEY (`EveCod`),
  KEY `IX_10` (`EveJugCod`),
  KEY `IX_11` (`EveArbCod`),
  KEY `IX_Relationship40` (`EveParCod`),
  KEY `IX_Relationship41` (`EveEstCod`),
  CONSTRAINT `10` FOREIGN KEY (`EveJugCod`) REFERENCES `jugadores` (`JugCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `11` FOREIGN KEY (`EveArbCod`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `12` FOREIGN KEY (`EveParCod`) REFERENCES `partido` (`ParCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Relationship41` FOREIGN KEY (`EveEstCod`) REFERENCES `estadistica_general` (`EstGenCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fixture_cab`
--

DROP TABLE IF EXISTS `fixture_cab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fixture_cab` (
  `FixCod` int NOT NULL,
  `FixLigCod` int NOT NULL,
  `FixEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`FixCod`),
  KEY `IX_Relationship48` (`FixLigCod`),
  CONSTRAINT `Relationship48` FOREIGN KEY (`FixLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fixture_cab`
--

LOCK TABLES `fixture_cab` WRITE;
/*!40000 ALTER TABLE `fixture_cab` DISABLE KEYS */;
/*!40000 ALTER TABLE `fixture_cab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fixture_det`
--

DROP TABLE IF EXISTS `fixture_det`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fixture_det` (
  `FixDetCod` int NOT NULL AUTO_INCREMENT,
  `FixDetFixCod` int NOT NULL,
  `FixParCod` int NOT NULL,
  `FixDetEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`FixDetCod`),
  KEY `IX_Relationship49` (`FixDetFixCod`),
  KEY `IX_Relationship50` (`FixParCod`),
  CONSTRAINT `Relationship49` FOREIGN KEY (`FixDetFixCod`) REFERENCES `fixture_cab` (`FixCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Relationship50` FOREIGN KEY (`FixParCod`) REFERENCES `partido` (`ParCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fixture_det`
--

LOCK TABLES `fixture_det` WRITE;
/*!40000 ALTER TABLE `fixture_det` DISABLE KEYS */;
/*!40000 ALTER TABLE `fixture_det` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugadores` (
  `JugCod` int NOT NULL AUTO_INCREMENT,
  `JugNom` varchar(45) NOT NULL,
  `JugDNI` varchar(8) NOT NULL,
  `JugPos` varchar(45) NOT NULL,
  `JugEquCod` int NOT NULL,
  `JugNumCam` int NOT NULL,
  `JugEda` int NOT NULL,
  `JugGol` int NOT NULL,
  `JugTarAma` int NOT NULL,
  `JugTarRoj` int NOT NULL,
  `JugEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`JugCod`),
  KEY `IX_4` (`JugEquCod`),
  CONSTRAINT `4` FOREIGN KEY (`JugEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=61008 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores`
--

LOCK TABLES `jugadores` WRITE;
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
INSERT INTO `jugadores` VALUES (61000,'Fredi Sina','74415845','Delantero',3001,7,23,0,0,0,'A'),(61001,'Alfonso Ugarte','78554323','Defensa',3001,9,25,0,0,0,'A'),(61002,'Ollanta Humala ','78250664','Portero ',3001,12,26,0,0,0,'A'),(61003,'Tobias Topson','63259815','Central',3002,14,19,0,0,0,'A'),(61004,'Pascu Rodriguez','66698534','Defensa',3003,5,31,0,0,0,'A'),(61005,'Jorge Otarola','78965236','Delantero',3002,19,22,0,0,0,'A'),(61006,'Gabriel Garcia','78998578','Defensa',3002,21,27,0,0,0,'A'),(61007,'Rene de la vega','70001238','Central',3003,16,28,0,0,0,'A');
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liga`
--

DROP TABLE IF EXISTS `liga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `liga` (
  `LigCod` int NOT NULL AUTO_INCREMENT,
  `LigNom` varchar(45) NOT NULL,
  `LigEstReg` varchar(1) NOT NULL,
  `LigTemNum` int NOT NULL,
  PRIMARY KEY (`LigCod`)
) ENGINE=InnoDB AUTO_INCREMENT=3302 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liga`
--

LOCK TABLES `liga` WRITE;
/*!40000 ALTER TABLE `liga` DISABLE KEYS */;
INSERT INTO `liga` VALUES (3301,'Liga 1 Robistar','A',1);
/*!40000 ALTER TABLE `liga` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partido` (
  `ParCod` int NOT NULL AUTO_INCREMENT,
  `ParEstCur` varchar(10) NOT NULL,
  `ParLigCod` int NOT NULL,
  `ParEquLocCod` int NOT NULL,
  `ParEquVisCod` int NOT NULL,
  `ParArbCod1` int NOT NULL,
  `ParArbCod2` int NOT NULL,
  `ParArbCod3` int NOT NULL,
  `ParFecAño` int NOT NULL,
  `ParFecMes` int NOT NULL,
  `ParFecDia` int NOT NULL,
  `ParHorIni` int NOT NULL,
  `ParHorFin` int NOT NULL,
  `ParLocGol` int NOT NULL,
  `ParVisGol` int NOT NULL,
  `ParEstReg` varchar(1) NOT NULL,
  `ParEstCod` int NOT NULL,
  PRIMARY KEY (`ParCod`),
  KEY `IX_3` (`ParEquVisCod`),
  KEY `IX_2` (`ParEquLocCod`),
  KEY `IX_1` (`ParLigCod`),
  KEY `IX_num` (`ParArbCod1`),
  KEY `IX_6` (`ParArbCod2`),
  KEY `IX_7` (`ParArbCod3`),
  KEY `IX_Relationship46` (`ParEstCod`),
  CONSTRAINT `1` FOREIGN KEY (`ParLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `2` FOREIGN KEY (`ParEquLocCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `3` FOREIGN KEY (`ParEquVisCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `6` FOREIGN KEY (`ParArbCod2`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `7` FOREIGN KEY (`ParArbCod3`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `num` FOREIGN KEY (`ParArbCod1`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Relationship46` FOREIGN KEY (`ParEstCod`) REFERENCES `estadio` (`EstCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=82004 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido`
--

LOCK TABLES `partido` WRITE;
/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
INSERT INTO `partido` VALUES (82001,'Programado',3301,3001,3002,101,103,105,2023,6,18,15,17,0,0,'A',201),(82002,'Programado',3301,3003,3004,102,101,104,2023,6,19,13,15,0,0,'A',201),(82003,'Programado',3301,3001,3004,105,102,104,2023,6,23,10,12,0,0,'A',203);
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultados`
--

DROP TABLE IF EXISTS `resultados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultados` (
  `ResulCod` int NOT NULL AUTO_INCREMENT,
  `ResPunGan` int NOT NULL,
  `ResGolFav` int NOT NULL,
  `ResGolCon` int NOT NULL,
  `ResTabPosDetCod` int NOT NULL,
  `ResParCod` int NOT NULL,
  `ResEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`ResulCod`),
  KEY `IX_Relationship52` (`ResTabPosDetCod`),
  KEY `IX_Relationship57` (`ResParCod`),
  CONSTRAINT `Relationship52` FOREIGN KEY (`ResTabPosDetCod`) REFERENCES `tabla_posiciones_detalle` (`TabPosDetCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Relationship57` FOREIGN KEY (`ResParCod`) REFERENCES `partido` (`ParCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultados`
--

LOCK TABLES `resultados` WRITE;
/*!40000 ALTER TABLE `resultados` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_posiciones_cab`
--

DROP TABLE IF EXISTS `tabla_posiciones_cab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_posiciones_cab` (
  `TabPosCod` int NOT NULL AUTO_INCREMENT,
  `TabPosLigCod` int DEFAULT NULL,
  `TabPosEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`TabPosCod`),
  KEY `IX_Relationship48` (`TabPosLigCod`),
  KEY `IX_Relationship55` (`TabPosLigCod`),
  CONSTRAINT `Relationship55` FOREIGN KEY (`TabPosLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_posiciones_cab`
--

LOCK TABLES `tabla_posiciones_cab` WRITE;
/*!40000 ALTER TABLE `tabla_posiciones_cab` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_posiciones_cab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_posiciones_detalle`
--

DROP TABLE IF EXISTS `tabla_posiciones_detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_posiciones_detalle` (
  `TabPosDetCod` int NOT NULL AUTO_INCREMENT,
  `TabPosDetEquCod` int NOT NULL,
  `TabPosDetTabPosCod` int DEFAULT NULL,
  `TabPosDetParJug` int NOT NULL,
  `TabPosDetParGan` int NOT NULL,
  `TabPosDetParEmp` int NOT NULL,
  `TabPosDetParPer` int NOT NULL,
  `TabPosDetGolFav` int NOT NULL,
  `TabPosDetGolCon` int NOT NULL,
  `TabPosDetPun` int NOT NULL,
  `TabPosDetPue` int NOT NULL,
  `TabPosDetTabEstReg` varchar(1) NOT NULL,
  PRIMARY KEY (`TabPosDetCod`),
  KEY `IX_5` (`TabPosDetEquCod`),
  KEY `IX_Relationship53` (`TabPosDetTabPosCod`),
  CONSTRAINT `5` FOREIGN KEY (`TabPosDetEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `Relationship53` FOREIGN KEY (`TabPosDetTabPosCod`) REFERENCES `tabla_posiciones_cab` (`TabPosCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_posiciones_detalle`
--

LOCK TABLES `tabla_posiciones_detalle` WRITE;
/*!40000 ALTER TABLE `tabla_posiciones_detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_posiciones_detalle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-12  5:19:33
