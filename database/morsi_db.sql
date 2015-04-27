-- MySQL dump 10.13  Distrib 5.5.41, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: morsi
-- ------------------------------------------------------
-- Server version	5.5.41-0ubuntu0.14.04.1

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
-- Table structure for table `alert`
--

DROP TABLE IF EXISTS `alert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alert` (
  `id` int(1) NOT NULL,
  `type` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alert`
--

LOCK TABLES `alert` WRITE;
/*!40000 ALTER TABLE `alert` DISABLE KEYS */;
INSERT INTO `alert` VALUES (1,'schedule'),(2,'messages'),(3,'alarm'),(4,'timer'),(5,'general');
/*!40000 ALTER TABLE `alert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `system`
--

DROP TABLE IF EXISTS `system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system` (
  `id` int(1) NOT NULL,
  `get` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system`
--

LOCK TABLES `system` WRITE;
/*!40000 ALTER TABLE `system` DISABLE KEYS */;
INSERT INTO `system` VALUES (1,'time'),(2,'alert');
/*!40000 ALTER TABLE `system` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `time`
--

DROP TABLE IF EXISTS `time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `time` (
  `id` int(1) NOT NULL,
  `hour` int(1) NOT NULL,
  `day` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time`
--

LOCK TABLES `time` WRITE;
/*!40000 ALTER TABLE `time` DISABLE KEYS */;
INSERT INTO `time` VALUES (0,12,'am'),(1,1,'am'),(2,2,'am'),(3,3,'am'),(4,4,'am'),(5,5,'am'),(6,6,'am'),(7,7,'am'),(8,8,'am'),(9,9,'am'),(10,10,'am'),(11,11,'am'),(12,12,'pm'),(13,1,'pm'),(14,2,'pm'),(15,3,'pm'),(16,4,'pm'),(17,5,'pm'),(18,6,'pm'),(19,7,'pm'),(20,8,'pm'),(21,9,'pm'),(22,10,'pm'),(23,11,'pm');
/*!40000 ALTER TABLE `time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vibration`
--

DROP TABLE IF EXISTS `vibration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vibration` (
  `id` int(1) NOT NULL,
  `attribute` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vibration`
--

LOCK TABLES `vibration` WRITE;
/*!40000 ALTER TABLE `vibration` DISABLE KEYS */;
INSERT INTO `vibration` VALUES (1,'frequency'),(2,'intensity'),(3,'length');
/*!40000 ALTER TABLE `vibration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-27 16:32:23
