-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ciercom_pre_matricula
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aulas`
--

DROP TABLE IF EXISTS `aulas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aulas` (
  `Código` varchar(45) NOT NULL,
  `Edificio` varchar(45) DEFAULT NULL,
  `Laboratorio` varchar(45) DEFAULT NULL,
  `CApacidad` varchar(45) DEFAULT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aulas`
--

LOCK TABLES `aulas` WRITE;
/*!40000 ALTER TABLE `aulas` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aulas_has_materias`
--

DROP TABLE IF EXISTS `aulas_has_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aulas_has_materias` (
  `Aulas_Código` varchar(45) NOT NULL,
  `Materias_Código` varchar(45) NOT NULL,
  PRIMARY KEY (`Aulas_Código`,`Materias_Código`),
  KEY `fk_Aulas_has_Materias_Materias1_idx` (`Materias_Código`),
  KEY `fk_Aulas_has_Materias_Aulas1_idx` (`Aulas_Código`),
  CONSTRAINT `fk_Aulas_has_Materias_Aulas1` FOREIGN KEY (`Aulas_Código`) REFERENCES `aulas` (`Código`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aulas_has_Materias_Materias1` FOREIGN KEY (`Materias_Código`) REFERENCES `materias` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aulas_has_materias`
--

LOCK TABLES `aulas_has_materias` WRITE;
/*!40000 ALTER TABLE `aulas_has_materias` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulas_has_materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `docente` (
  `Ci` varchar(45) NOT NULL,
  `Nombres` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Nivel Formación` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Ci`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente_has_materias`
--

DROP TABLE IF EXISTS `docente_has_materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `docente_has_materias` (
  `Docente_Ci` varchar(45) NOT NULL,
  `Materias_Código` varchar(45) NOT NULL,
  PRIMARY KEY (`Docente_Ci`,`Materias_Código`),
  KEY `fk_Docente_has_Materias_Materias1_idx` (`Materias_Código`),
  KEY `fk_Docente_has_Materias_Docente_idx` (`Docente_Ci`),
  CONSTRAINT `fk_Docente_has_Materias_Docente` FOREIGN KEY (`Docente_Ci`) REFERENCES `docente` (`Ci`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Docente_has_Materias_Materias1` FOREIGN KEY (`Materias_Código`) REFERENCES `materias` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente_has_materias`
--

LOCK TABLES `docente_has_materias` WRITE;
/*!40000 ALTER TABLE `docente_has_materias` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente_has_materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante` (
  `Cedula` varchar(45) NOT NULL,
  `Nombre_1` varchar(45) DEFAULT NULL,
  `Nombre_2` varchar(45) DEFAULT NULL,
  `Apellido_1` varchar(45) DEFAULT NULL,
  `Apellido_2` varchar(45) DEFAULT NULL,
  `F_Nacimiento` varchar(45) DEFAULT NULL,
  `Estado_Matricula` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES ('0401503779','Henry','anderson','laguna','ponce','96',1),('0803901628','Angel','Jampier','Velasco','Suarez','sadas',1),('1001454212','Rocio','de los Angeles','Almeida','Almeida','16 02 1964',1),('1003111067','santiago','israel','estevez','Almeida','22/08/199',1),('128256','Ahri','Isabel','Estevez','Cargatena','sasad',0),('256512','diogo','armagro','asd','sdfs','sdf',0),('456789','daniel','algo','asd','asd','asd',1);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materias` (
  `Codigo` varchar(45) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `N_Matricula` int(11) DEFAULT NULL,
  `Nivel_Materia` int(11) DEFAULT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `N:Materias_Index` (`N_Matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES ('CIERCOM-00001','Acústica y Óptica',3,3),('CIERCOM-00003','Administración y Gestion de Redes',9,9),('CIERCOM-00005','Algebra Lineal',1,1),('CIERCOM-00007','Análisis de Señales',5,5),('CIERCOM-00009','Análisis Matemático I',1,1),('CIERCOM-00010','Análisis Matemático II',2,2),('CIERCOM-00016','Circuitos Electrónicos',5,5),('CIERCOM-00017','Cálculo Vectorial',3,3),('CIERCOM-00019','Circuitos Eléctricos',3,3),('CIERCOM-00023','Comunicación Analógica',6,6),('CIERCOM-00026','Comunicación Digital',7,7),('CIERCOM-00028','Cominicación Inalámbrica',8,8),('CIERCOM-00029','Comunicación Satelital',8,8),('CIERCOM-00031','Costos',5,5),('CIERCOM-00034','Derecho Apli. Telecom.',8,8),('CIERCOM-00036','Diseño Sist. Comunicación',9,9),('CIERCOM-00038','Ecuaciones Diferenciales',3,3),('CIERCOM-00042','Energias Alternativas',8,8),('CIERCOM-00044','Expreción Oral y Escrita',1,1),('CIERCOM-00047','Fisica I',2,2),('CIERCOM-00050','Geometria Analítica',2,2),('CIERCOM-00051','Geometria Plana',1,1),('CIERCOM-00052','Gerencia de Empresas',6,6),('CIERCOM-00056','Ing. Económica',5,5),('CIERCOM-00058','Instalaciones Eléctricas',6,6),('CIERCOM-00063','Int. Ingenieria',1,1),('CIERCOM-00064','Investigación científica',1,1),('CIERCOM-00065','Invest, de Operaciones',5,5),('CIERCOM-00068','Legislación Laboral',2,2),('CIERCOM-00077','Liderazgo Y Motivación',4,4),('CIERCOM-00080','Matemáticas Aplicadas',4,4),('CIERCOM-00086','Networking I',7,7),('CIERCOM-00087','Networking II',8,8),('CIERCOM-00088','Networking III',9,9),('CIERCOM-00092','Micros Avanzados',7,7),('CIERCOM-00094','Sist. Fibra Optica',8,8),('CIERCOM-00097','Trat. Digital de Señales',6,6),('CIERCOM-00099','WLAN',8,8),('CIERCOM-00100','Prob. y Proc. Estoás',4,4),('CIERCOM-00105','Prog. De Sist. Multimedia',5,5),('CIERCOM-00106','Programación I',2,2),('CIERCOM-00107','Programación II',3,3),('CIERCOM-00111','Proyectos de Redes',9,9),('CIERCOM-00112','Realidad Nacional',1,1),('CIERCOM-00115','NGN',9,9),('CIERCOM-00116','Seguridad de Redes',9,9),('CIERCOM-00117','Seguridad  Higiene y Ambiente',7,7),('CIERCOM-00120','Sist. Analógicos Digitales',6,6),('CIERCOM-00121','Sist. De Com. Radiante',6,6),('CIERCOM-00123','Sistemas de Transmición',7,7),('CIERCOM-00124','Sistemas Digitales',5,5),('CIERCOM-00129','Sist. MicroProcesados',6,6),('CIERCOM-00130','Sistemas Operativos',3,3),('CIERCOM-00131','Técnicas de Aprendizaje',1,1),('CIERCOM-00132','Tecnoloía Eléctrica',2,2),('CIERCOM-00137','Teoría Electromagnética',4,4),('CIERCOM-00143','Trabajo de Grado II',10,10),('CIERCOM-00144','Trabajo de Grado I',9,9),('CIERCOM-00416','Cableado Estructurado',7,7);
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias_has_estudiante`
--

DROP TABLE IF EXISTS `materias_has_estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `materias_has_estudiante` (
  `Materias_Codigo` varchar(45) NOT NULL,
  `Estudiante_Cedula` varchar(45) NOT NULL,
  `N_Matricula` int(11) DEFAULT NULL,
  PRIMARY KEY (`Materias_Codigo`,`Estudiante_Cedula`),
  KEY `fk_Materias_has_Estudiante_Estudiante1_idx` (`Estudiante_Cedula`),
  KEY `fk_Materias_has_Estudiante_Materias1_idx` (`Materias_Codigo`),
  KEY `N_Matricula` (`N_Matricula`),
  CONSTRAINT `Fk_N_Mat` FOREIGN KEY (`N_Matricula`) REFERENCES `materias` (`N_Matricula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Materias_has_Estudiante_Estudiante1` FOREIGN KEY (`Estudiante_Cedula`) REFERENCES `estudiante` (`Cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Materias_has_Estudiante_Materias1` FOREIGN KEY (`Materias_Codigo`) REFERENCES `materias` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias_has_estudiante`
--

LOCK TABLES `materias_has_estudiante` WRITE;
/*!40000 ALTER TABLE `materias_has_estudiante` DISABLE KEYS */;
INSERT INTO `materias_has_estudiante` VALUES ('CIERCOM-00001','0803901628',1),('CIERCOM-00001','128256',1),('CIERCOM-00007','0803901628',1),('CIERCOM-00007','256512',1),('CIERCOM-00010','0803901628',1),('CIERCOM-00010','128256',1),('CIERCOM-00016','128256',1),('CIERCOM-00017','1003111067',1),('CIERCOM-00017','456789',1),('CIERCOM-00028','1003111067',1),('CIERCOM-00028','456789',1),('CIERCOM-00031','1001454212',1),('CIERCOM-00036','128256',1),('CIERCOM-00144','0803901628',1),('CIERCOM-00009','128256',2),('CIERCOM-00010','256512',2),('CIERCOM-00130','0803901628',2),('CIERCOM-00132','0803901628',2),('CIERCOM-00143','128256',2),('CIERCOM-00144','1003111067',2),('CIERCOM-00416','1003111067',2),('CIERCOM-00005','0803901628',3),('CIERCOM-00132','1003111067',3),('CIERCOM-00132','256512',3),('CIERCOM-00137','128256',3);
/*!40000 ALTER TABLE `materias_has_estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matricula` (
  `Código` varchar(45) NOT NULL,
  `Periodo Académico_Código` varchar(45) NOT NULL,
  PRIMARY KEY (`Código`,`Periodo Académico_Código`),
  KEY `fk_Matricula_Periodo Académico1_idx` (`Periodo Académico_Código`),
  CONSTRAINT `fk_Matricula_Periodo Académico1` FOREIGN KEY (`Periodo Académico_Código`) REFERENCES `periodo académico` (`Código`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel`
--

DROP TABLE IF EXISTS `nivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nivel` (
  `Codigo` varchar(45) NOT NULL,
  `NOmbre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel`
--

LOCK TABLES `nivel` WRITE;
/*!40000 ALTER TABLE `nivel` DISABLE KEYS */;
/*!40000 ALTER TABLE `nivel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodo académico`
--

DROP TABLE IF EXISTS `periodo académico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `periodo académico` (
  `Código` varchar(45) NOT NULL,
  `NOmbre` varchar(45) DEFAULT NULL,
  `Fecha Inicio` date DEFAULT NULL,
  `FEcha FIn` date DEFAULT NULL,
  `MOdalidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Código`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodo académico`
--

LOCK TABLES `periodo académico` WRITE;
/*!40000 ALTER TABLE `periodo académico` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodo académico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-07  9:21:53
