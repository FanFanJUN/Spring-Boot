/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : crud

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 25/06/2019 19:08:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `sex` varchar(255) NOT NULL,
  `IDnumber` int(40) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `birthDate` varchar(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of test_user
-- ----------------------------
BEGIN;
INSERT INTO `test_user` VALUES (1, 'SpringBoot', '123456', '1', 772763, '我叫SpringBooot', '19960122');
INSERT INTO `test_user` VALUES (2, '李彩', '654321', '2', 445555, '我叫李彩', '16676890');
INSERT INTO `test_user` VALUES (3, '姚军', 'yaojun123456', '1', 333330, '姚军yaojun', '20000923');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
