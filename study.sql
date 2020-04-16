/*
 Navicat Premium Data Transfer

 Source Server         : JAVA 
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : study

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 16/04/2020 11:02:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for getjoke
-- ----------------------------
DROP TABLE IF EXISTS `getjoke`;
CREATE TABLE `getjoke`  (
  `page` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of getjoke
-- ----------------------------
INSERT INTO `getjoke` VALUES ('1', 2, 'video');

-- ----------------------------
-- Table structure for getsinglejoke
-- ----------------------------
DROP TABLE IF EXISTS `getsinglejoke`;
CREATE TABLE `getsinglejoke`  (
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of getsinglejoke
-- ----------------------------
INSERT INTO `getsinglejoke` VALUES (28654780);

-- ----------------------------
-- Table structure for getsongpoetry
-- ----------------------------
DROP TABLE IF EXISTS `getsongpoetry`;
CREATE TABLE `getsongpoetry`  (
  `page` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of getsongpoetry
-- ----------------------------
INSERT INTO `getsongpoetry` VALUES ('1', 2);

-- ----------------------------
-- Table structure for gettangpoetry
-- ----------------------------
DROP TABLE IF EXISTS `gettangpoetry`;
CREATE TABLE `gettangpoetry`  (
  `page` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gettangpoetry
-- ----------------------------
INSERT INTO `gettangpoetry` VALUES ('1', 20);

-- ----------------------------
-- Table structure for likepoetry
-- ----------------------------
DROP TABLE IF EXISTS `likepoetry`;
CREATE TABLE `likepoetry`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of likepoetry
-- ----------------------------
INSERT INTO `likepoetry` VALUES ('李白');

-- ----------------------------
-- Table structure for musicbroadcastingdetailsv
-- ----------------------------
DROP TABLE IF EXISTS `musicbroadcastingdetailsv`;
CREATE TABLE `musicbroadcastingdetailsv`  (
  `channelname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of musicbroadcastingdetailsv
-- ----------------------------
INSERT INTO `musicbroadcastingdetailsv` VALUES ('public_tuijian_spring');

-- ----------------------------
-- Table structure for musicrankingsdetails
-- ----------------------------
DROP TABLE IF EXISTS `musicrankingsdetails`;
CREATE TABLE `musicrankingsdetails`  (
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of musicrankingsdetails
-- ----------------------------
INSERT INTO `musicrankingsdetails` VALUES ('1');

-- ----------------------------
-- Table structure for searchauthors
-- ----------------------------
DROP TABLE IF EXISTS `searchauthors`;
CREATE TABLE `searchauthors`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of searchauthors
-- ----------------------------
INSERT INTO `searchauthors` VALUES ('李白');

-- ----------------------------
-- Table structure for searchpoetry
-- ----------------------------
DROP TABLE IF EXISTS `searchpoetry`;
CREATE TABLE `searchpoetry`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of searchpoetry
-- ----------------------------
INSERT INTO `searchpoetry` VALUES ('古风二首%20二');

-- ----------------------------
-- Table structure for videocategorydetails
-- ----------------------------
DROP TABLE IF EXISTS `videocategorydetails`;
CREATE TABLE `videocategorydetails`  (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of videocategorydetails
-- ----------------------------
INSERT INTO `videocategorydetails` VALUES (14);

-- ----------------------------
-- Table structure for videorecommend
-- ----------------------------
DROP TABLE IF EXISTS `videorecommend`;
CREATE TABLE `videorecommend`  (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of videorecommend
-- ----------------------------
INSERT INTO `videorecommend` VALUES (127398);

SET FOREIGN_KEY_CHECKS = 1;
