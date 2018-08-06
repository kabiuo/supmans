/*
 Navicat Premium Data Transfer

 Source Server         : kabiuo
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : supmans

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 20/06/2018 15:20:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `adminID` int(11) NOT NULL AUTO_INCREMENT,
  `adminNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adminPass` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for merch
-- ----------------------------
DROP TABLE IF EXISTS `merch`;
CREATE TABLE `merch`  (
  `merchID` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `merchname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `merchaddress` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产地',
  `merchPD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产日期',
  `merchGP` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '有效期',
  `merchprice` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品价格',
  `merchtype` int(20) NOT NULL COMMENT '商品类型',
  `merchnumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品数量',
  PRIMARY KEY (`merchID`) USING BTREE,
  INDEX `me_ty_id`(`merchtype`) USING BTREE,
  CONSTRAINT `me_ty_id` FOREIGN KEY (`merchtype`) REFERENCES `type` (`typeID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of merch
-- ----------------------------
INSERT INTO `merch` VALUES (1, '和其正', 'x', '2018-06-02', '2018-06-16', '5', 1, '180');
INSERT INTO `merch` VALUES (2, '王老吉', 'xxxxx', '2018-06-01', '2018-06-30', '5', 1, '200');
INSERT INTO `merch` VALUES (3, '雪碧', 'xxxxx', '2018-06-02', '2018-06-30', '5', 1, '200');
INSERT INTO `merch` VALUES (4, '百事可乐', 'xxxxxx', '2018-06-09', '2018-06-30', '5', 1, '150');

-- ----------------------------
-- Table structure for sold
-- ----------------------------
DROP TABLE IF EXISTS `sold`;
CREATE TABLE `sold`  (
  `soldID` int(20) NOT NULL AUTO_INCREMENT COMMENT '销售编号',
  `soldnID` int(20) NOT NULL COMMENT '销售商品编号',
  `soldnumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '销售商品数量',
  `soldprice` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '销售商品金额',
  `soldtID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`soldID`) USING BTREE,
  INDEX `so_me_info_id`(`soldnID`) USING BTREE,
  INDEX `so_ty_id`(`soldtID`) USING BTREE,
  CONSTRAINT `so_me_info_id` FOREIGN KEY (`soldnID`) REFERENCES `merch` (`merchID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `so_ty_id` FOREIGN KEY (`soldtID`) REFERENCES `type` (`typeID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sold
-- ----------------------------
INSERT INTO `sold` VALUES (1, 1, '20', '50', 1);
INSERT INTO `sold` VALUES (3, 2, '20', '100', 1);
INSERT INTO `sold` VALUES (6, 4, '20', '100', 1);
INSERT INTO `sold` VALUES (7, 1, '20', '100', 1);
INSERT INTO `sold` VALUES (8, 4, '30', '150', 1);

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff`  (
  `staffID` int(20) NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `staffnumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工账号',
  `staffpassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工密码',
  `staffname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staffsex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staffcontact` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`staffID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES (1, 'zhangsan', 'zhangsan', '张三', '1', 'afadf');

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock`  (
  `stockID` int(20) NOT NULL AUTO_INCREMENT COMMENT '库存商品编号',
  `stockmID` int(20) NOT NULL COMMENT '库存商品名称',
  `stocktypeID` int(20) NOT NULL COMMENT '库存商品类型',
  PRIMARY KEY (`stockID`) USING BTREE,
  INDEX `st_me_id`(`stockmID`) USING BTREE,
  INDEX `st_ty_id`(`stocktypeID`) USING BTREE,
  CONSTRAINT `st_me_id` FOREIGN KEY (`stockmID`) REFERENCES `merch` (`merchID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `st_ty_id` FOREIGN KEY (`stocktypeID`) REFERENCES `type` (`typeID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES (1, 1, 1);

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `typeID` int(20) NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `typename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`typeID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '饮料');
INSERT INTO `type` VALUES (2, '零食');

-- ----------------------------
-- Triggers structure for table sold
-- ----------------------------
DROP TRIGGER IF EXISTS `new_insert`;
delimiter ;;
CREATE TRIGGER `new_insert` AFTER INSERT ON `sold` FOR EACH ROW UPDATE merch set merchnumber = merchnumber - new.soldnumber WHERE merchID = new.soldnID
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table sold
-- ----------------------------
DROP TRIGGER IF EXISTS `del_row`;
delimiter ;;
CREATE TRIGGER `del_row` AFTER DELETE ON `sold` FOR EACH ROW UPDATE merch set merchnumber = merchnumber + old.soldnumber WHERE merchID = old.soldnID
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
