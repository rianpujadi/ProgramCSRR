/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : db_program

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-10-29 11:39:02
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `program`
-- ----------------------------
DROP TABLE IF EXISTS `program`;
CREATE TABLE `program` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `category` varchar(200) NOT NULL,
  `location` varchar(200) NOT NULL,
  `plandate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of program
-- ----------------------------
INSERT INTO `program` VALUES ('6', 'Khoir', 'Masyarakat', 'Jawa Barat', '2019-10-10');
INSERT INTO `program` VALUES ('7', 'Mirna', 'Kesehatan', 'Jawa Tengah', '2019-10-08');
INSERT INTO `program` VALUES ('8', 'Nissa', 'Pendidikan', 'DKI Jakarta', '2019-10-12');
INSERT INTO `program` VALUES ('9', 'Naruto Uzumaki', 'Lingkungan Hidup', 'Jawa Timur', '2019-10-18');
