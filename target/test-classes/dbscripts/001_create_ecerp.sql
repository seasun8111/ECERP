/*
SQLyog Enterprise - MySQL GUI v8.1 
MySQL - 5.5.25a : Database - ecerp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`ecerp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ecerp`;

/*Table structure for table `ceerp_brand` */

DROP TABLE IF EXISTS `ceerp_brand`;

CREATE TABLE `ceerp_brand` (
  `id` int(4) NOT NULL,
  `brandName` varchar(10) DEFAULT '""' COMMENT '品牌名', 
  `providerName` varchar(10) DEFAULT '""' COMMENT '供应商名',
  `brandTypeName` varchar(10) DEFAULT '""' COMMENT '品牌类型名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `ecerp_product` */

DROP TABLE IF EXISTS `ecerp_product`;

CREATE TABLE `ecerp_product` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT '""' COMMENT '商品名',
  `cost` double(6,2) DEFAULT '0.00' COMMENT '成本价',
  `price` double(6,2) DEFAULT '0.00' COMMENT '价格',
  `storage` int(6) DEFAULT '0' COMMENT '库存',
  `brandName` varchar(10) DEFAULT '""' COMMENT '品牌名',
  `brandId` int(4) DEFAULT NULL,
  `productTypeName` varchar(10) DEFAULT '""',
  `productTypeId` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
