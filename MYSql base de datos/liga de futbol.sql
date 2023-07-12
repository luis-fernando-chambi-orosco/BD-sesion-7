/*
Created: 05/06/2023
Modified: 09/07/2023
Model: modelo liga MySQL 8.0
Database: MySQL 8.0
*/

-- Create tables section -------------------------------------------------

-- Table equipos

CREATE TABLE `equipos`
(
  `EquCod` Int(11) NOT NULL AUTO_INCREMENT,
  `Attribute1` Varchar(45) NOT NULL,
  `EquEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`EquCod`)
)
;

-- Table entrenador

CREATE TABLE `entrenador`
(
  `EntCod` Int NOT NULL AUTO_INCREMENT,
  `EntEquCod` Int(11) NOT NULL,
  `EntNom` Varchar(45) NOT NULL,
  `EntDNI` Varchar(8) NOT NULL,
  `EntEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`EntCod`)
)
;

CREATE INDEX `IX_Relationship25` ON `entrenador` (`EntEquCod`)
;

-- Table jugadores

CREATE TABLE `jugadores`
(
  `JugCod` Int NOT NULL AUTO_INCREMENT,
  `JugNom` Varchar(45) NOT NULL,
  `JugDNI` Varchar(8) NOT NULL,
  `JugPos` Varchar(45) NOT NULL,
  `JugEquCod` Int(11) NOT NULL,
  `JugNumCam` Int NOT NULL,
  `JugEda` Int NOT NULL,
  `JugGol` Int NOT NULL,
  `JugTarAma` Int NOT NULL,
  `JugTarRoj` Int NOT NULL,
  `JugEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`JugCod`)
)
;

CREATE INDEX `IX_4` ON `jugadores` (`JugEquCod`)
;

-- Table evento

CREATE TABLE `evento`
(
  `EveCod` Int NOT NULL AUTO_INCREMENT,
  `EveTip` Varchar(20) NOT NULL,
  `EveJugCod` Int NOT NULL,
  `EveParCod` Int,
  `EveArbCod` Int NOT NULL,
  `EveMin` Int NOT NULL,
  `EveEstReg` Varchar(1) NOT NULL,
  `EveEstCod` Int,
  PRIMARY KEY (`EveCod`)
)
;

CREATE INDEX `IX_10` ON `evento` (`EveJugCod`)
;

CREATE INDEX `IX_11` ON `evento` (`EveArbCod`)
;

CREATE INDEX `IX_Relationship40` ON `evento` (`EveParCod`)
;

CREATE INDEX `IX_Relationship41` ON `evento` (`EveEstCod`)
;

-- Table estadistica_general

CREATE TABLE `estadistica_general`
(
  `EstGenCod` Int NOT NULL AUTO_INCREMENT,
  `EstGenGolNum` Int NOT NULL,
  `EstGenTarAma` Int NOT NULL,
  `EstGenTarRoj` Int NOT NULL,
  `EstGenCodLig` Int NOT NULL,
  `EstGenEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`EstGenCod`)
)
;

CREATE INDEX `IX_8` ON `estadistica_general` (`EstGenCodLig`)
;

-- Table arbitros

CREATE TABLE `arbitros`
(
  `ArbCod` Int NOT NULL AUTO_INCREMENT,
  `ArbNom` Varchar(45) NOT NULL,
  `ArbCat` Varchar(45) NOT NULL,
  `ArbDNI` Varchar(8) NOT NULL,
  `ArbEda` Int NOT NULL,
  `ArbEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`ArbCod`)
)
;

-- Table liga

CREATE TABLE `liga`
(
  `LigCod` Int NOT NULL AUTO_INCREMENT,
  `LigNom` Varchar(45) NOT NULL,
  `LigLugCod` Int NOT NULL,
  `LigEstReg` Varchar(1) NOT NULL,
  `LigTemNum` Int NOT NULL,
  PRIMARY KEY (`LigCod`)
)
;

-- Table partido

CREATE TABLE `partido`
(
  `ParCod` Int NOT NULL AUTO_INCREMENT,
  `ParRes` Int,
  `ParLigCod` Int NOT NULL,
  `ParEquLocCod` Int(11) NOT NULL,
  `ParEquVisCod` Int(11) NOT NULL,
  `ParArbCod1` Int NOT NULL,
  `ParArbCod2` Int NOT NULL,
  `ParArbCod3` Int NOT NULL,
  `ParFecAño` Int NOT NULL,
  `ParFecMes` Int NOT NULL,
  `ParFecDia` Int NOT NULL,
  `ParHorIni` Int NOT NULL,
  `ParHorFin` Int NOT NULL,
  `ParLocGol` Int NOT NULL,
  `ParVisGol` Int NOT NULL,
  `ParEstReg` Int NOT NULL,
  `ParEstCod` Int NOT NULL,
  PRIMARY KEY (`ParCod`)
)
;

CREATE INDEX `IX_3` ON `partido` (`ParEquVisCod`)
;

CREATE INDEX `IX_2` ON `partido` (`ParEquLocCod`)
;

CREATE INDEX `IX_1` ON `partido` (`ParLigCod`)
;

CREATE INDEX `IX_num` ON `partido` (`ParArbCod1`)
;

CREATE INDEX `IX_6` ON `partido` (`ParArbCod2`)
;

CREATE INDEX `IX_7` ON `partido` (`ParArbCod3`)
;

CREATE INDEX `IX_Relationship44` ON `partido` (`ParRes`)
;

CREATE INDEX `IX_Relationship46` ON `partido` (`ParEstCod`)
;

-- Table tabla_posiciones_detalle

CREATE TABLE `tabla_posiciones_detalle`
(
  `TabPosDetCod` Int NOT NULL AUTO_INCREMENT,
  `TabPosDetEquCod` Int(11) NOT NULL,
  `TabPosDetTabPosCod` Int,
  `TabPosDetParJug` Int NOT NULL,
  `TabPosDetParGan` Int NOT NULL,
  `TabPosDetParEmp` Int NOT NULL,
  `TabPosDetParPer` Int NOT NULL,
  `TabPosDetGolFav` Int NOT NULL,
  `TabPosDetGolCon` Int NOT NULL,
  `TabPosDetPun` Int NOT NULL,
  `TabPosDetPue` Int NOT NULL,
  `TabPosDetTabEstReg` Varchar(1) NOT NULL,
  PRIMARY KEY (`TabPosDetCod`)
)
;

CREATE INDEX `IX_5` ON `tabla_posiciones_detalle` (`TabPosDetEquCod`)
;

CREATE INDEX `IX_Relationship53` ON `tabla_posiciones_detalle` (`TabPosDetTabPosCod`)
;

-- Table Resultados

CREATE TABLE `Resultados`
(
  `ResulCod` Int NOT NULL,
  `ResPunGan` Int NOT NULL,
  `ResGolFav` Int NOT NULL,
  `ResGolCon` Int NOT NULL,
  `ResTabPosDetCod` Int
)
;

CREATE INDEX `IX_Relationship52` ON `Resultados` (`ResTabPosDetCod`)
;

ALTER TABLE `Resultados` ADD PRIMARY KEY (`ResulCod`)
;

-- Table estadio

CREATE TABLE `estadio`
(
  `EstCod` Int NOT NULL,
  `EstNom` Varchar(20) NOT NULL,
  `EstEstReg` Varchar(1) NOT NULL
)
;

ALTER TABLE `estadio` ADD PRIMARY KEY (`EstCod`)
;

-- Table fixture_cab

CREATE TABLE `fixture_cab`
(
  `FixCod` Int NOT NULL,
  `FixLigCod` Int NOT NULL,
  `FixEstReg` Varchar(1) NOT NULL
)
;

CREATE INDEX `IX_Relationship48` ON `fixture_cab` (`FixLigCod`)
;

ALTER TABLE `fixture_cab` ADD PRIMARY KEY (`FixCod`)
;

-- Table tabla_posiciones_cab

CREATE TABLE `tabla_posiciones_cab`
(
  `TabPosCod` Int NOT NULL,
  `TabPosLigCod` Int,
  `TabPosEstReg` Varchar(1) NOT NULL
)
;

CREATE INDEX `IX_Relationship48` ON `tabla_posiciones_cab` (`TabPosLigCod`)
;

CREATE INDEX `IX_Relationship55` ON `tabla_posiciones_cab` (`TabPosLigCod`)
;

ALTER TABLE `tabla_posiciones_cab` ADD PRIMARY KEY (`TabPosCod`)
;

-- Table fixture_det

CREATE TABLE `fixture_det`
(
  `FixDetCod` Int NOT NULL,
  `FixDetFixCod` Int NOT NULL,
  `FixParCod` Int NOT NULL,
  `FixDetEstReg` Varchar(1) NOT NULL
)
;

CREATE INDEX `IX_Relationship49` ON `fixture_det` (`FixDetFixCod`)
;

CREATE INDEX `IX_Relationship50` ON `fixture_det` (`FixParCod`)
;

ALTER TABLE `fixture_det` ADD PRIMARY KEY (`FixDetCod`)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE `partido` ADD CONSTRAINT `1` FOREIGN KEY (`ParLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `2` FOREIGN KEY (`ParEquLocCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `3` FOREIGN KEY (`ParEquVisCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `jugadores` ADD CONSTRAINT `4` FOREIGN KEY (`JugEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `tabla_posiciones_detalle` ADD CONSTRAINT `5` FOREIGN KEY (`TabPosDetEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `entrenador` ADD CONSTRAINT `Relationship25` FOREIGN KEY (`EntEquCod`) REFERENCES `equipos` (`EquCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `num` FOREIGN KEY (`ParArbCod1`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `6` FOREIGN KEY (`ParArbCod2`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `7` FOREIGN KEY (`ParArbCod3`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `estadistica_general` ADD CONSTRAINT `8` FOREIGN KEY (`EstGenCodLig`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `evento` ADD CONSTRAINT `10` FOREIGN KEY (`EveJugCod`) REFERENCES `jugadores` (`JugCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `evento` ADD CONSTRAINT `11` FOREIGN KEY (`EveArbCod`) REFERENCES `arbitros` (`ArbCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `evento` ADD CONSTRAINT `12` FOREIGN KEY (`EveParCod`) REFERENCES `partido` (`ParCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `evento` ADD CONSTRAINT `Relationship41` FOREIGN KEY (`EveEstCod`) REFERENCES `estadistica_general` (`EstGenCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `14` FOREIGN KEY (`ParRes`) REFERENCES `Resultados` (`ResulCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `partido` ADD CONSTRAINT `Relationship46` FOREIGN KEY (`ParEstCod`) REFERENCES `estadio` (`EstCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `fixture_cab` ADD CONSTRAINT `Relationship48` FOREIGN KEY (`FixLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `fixture_det` ADD CONSTRAINT `Relationship49` FOREIGN KEY (`FixDetFixCod`) REFERENCES `fixture_cab` (`FixCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `fixture_det` ADD CONSTRAINT `Relationship50` FOREIGN KEY (`FixParCod`) REFERENCES `partido` (`ParCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Resultados` ADD CONSTRAINT `Relationship52` FOREIGN KEY (`ResTabPosDetCod`) REFERENCES `tabla_posiciones_detalle` (`TabPosDetCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `tabla_posiciones_detalle` ADD CONSTRAINT `Relationship53` FOREIGN KEY (`TabPosDetTabPosCod`) REFERENCES `tabla_posiciones_cab` (`TabPosCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `tabla_posiciones_cab` ADD CONSTRAINT `Relationship55` FOREIGN KEY (`TabPosLigCod`) REFERENCES `liga` (`LigCod`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

