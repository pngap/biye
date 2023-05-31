/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80032
Source Host           : localhost:3306
Source Database       : system

Target Server Type    : MYSQL
Target Server Version : 80032
File Encoding         : 65001

Date: 2023-06-01 00:50:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` int NOT NULL,
  PRIMARY KEY (`admin`,`pwd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('123', '123', '123');
INSERT INTO `admin` VALUES ('1234', '124', '12413');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `classroom` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `classname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`classroom`),
  KEY `stunumber` (`classname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('2013', '1');
INSERT INTO `class` VALUES ('2004', '10');
INSERT INTO `class` VALUES ('2003', '11');
INSERT INTO `class` VALUES ('2002', '12');
INSERT INTO `class` VALUES ('2001', '13');
INSERT INTO `class` VALUES ('2012', '2');
INSERT INTO `class` VALUES ('2011', '3');
INSERT INTO `class` VALUES ('2010', '4');
INSERT INTO `class` VALUES ('2009', '5');
INSERT INTO `class` VALUES ('2008', '6');
INSERT INTO `class` VALUES ('2007', '7');
INSERT INTO `class` VALUES ('2015', '计算机技术1班');
INSERT INTO `class` VALUES ('2014', '计算机技术2班');
INSERT INTO `class` VALUES ('2222', '计算机技术3班');
INSERT INTO `class` VALUES ('2006', '计算机技术4班');

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `stuid` int NOT NULL,
  `paperid` varchar(255) NOT NULL,
  `chengji` varchar(255) DEFAULT NULL,
  `classa` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuid`,`paperid`,`classa`),
  KEY `class` (`classa`),
  KEY `id` (`id`),
  KEY `paperid` (`paperid`),
  CONSTRAINT `class` FOREIGN KEY (`classa`) REFERENCES `class` (`classroom`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `testpaper` (`name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `paperid` FOREIGN KEY (`paperid`) REFERENCES `testpaper` (`number`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `stuid` FOREIGN KEY (`stuid`) REFERENCES `stu` (`number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('4467', '202305097846', '10', '2015', '测试试卷');
INSERT INTO `grade` VALUES ('12345', '202305097846', '10', '2015', '测试试卷');
INSERT INTO `grade` VALUES ('56785', '202305097846', '0', '2015', '测试试卷');
INSERT INTO `grade` VALUES ('123451', '202305097846', '10', '2015', '测试试卷');
INSERT INTO `grade` VALUES ('2019042', '202305096290', '70', '2015', '测试3');
INSERT INTO `grade` VALUES ('2019042', '202305097846', '40', '2015', '测试试卷');
INSERT INTO `grade` VALUES ('20190401', '202305094069', '0', '2015', '测试试卷2');
INSERT INTO `grade` VALUES ('20190401', '202305096290', '0', '2015', '测试3');

-- ----------------------------
-- Table structure for magess
-- ----------------------------
DROP TABLE IF EXISTS `magess`;
CREATE TABLE `magess` (
  `timea` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Fasongnumber` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `neirong` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Fasongnumber`,`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of magess
-- ----------------------------
INSERT INTO `magess` VALUES ('2023-5-12 20:25:17', '123', '7iggvhzg', 'aaa');

-- ----------------------------
-- Table structure for paperquestion
-- ----------------------------
DROP TABLE IF EXISTS `paperquestion`;
CREATE TABLE `paperquestion` (
  `papernumber` varchar(255) NOT NULL,
  `questionNumber` varchar(255) NOT NULL,
  `questionstyke` varchar(255) DEFAULT NULL,
  `questionneirong` varchar(255) DEFAULT NULL,
  `anwer` varchar(255) DEFAULT NULL,
  `xuanxianga` varchar(255) DEFAULT NULL,
  `xuanxiangb` varchar(255) DEFAULT NULL,
  `xuanxiangc` varchar(255) DEFAULT NULL,
  `xuanxiangd` varchar(255) DEFAULT NULL,
  `xuanxiange` varchar(255) DEFAULT NULL,
  `fenshu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`questionNumber`,`papernumber`),
  KEY `questionNumber` (`questionNumber`),
  KEY `papernumber` (`papernumber`),
  CONSTRAINT `papernumber` FOREIGN KEY (`papernumber`) REFERENCES `testpaper` (`number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of paperquestion
-- ----------------------------
INSERT INTO `paperquestion` VALUES ('202305094069', '1', '2', '23', 'BC', '1', '2', '3', '4', '5', '5');
INSERT INTO `paperquestion` VALUES ('202305094328', '1', '1', '1', 'C', '2', '3', '4', '5', '', '5');
INSERT INTO `paperquestion` VALUES ('202305096290', '1', '1', '1', '7', '2', '3', '4', '5', '', '6');
INSERT INTO `paperquestion` VALUES ('202305097846', '1', '1', '小明在课堂上突然大叫，有的同学也跟着起哄。下列处理方式，最恰当的一项是', 'D', '马上制止，让小明站到讲台边', '不予理睬，继续课堂教学', '稍作停顿，批评训斥学生', '幽默化解，缓和课堂气氛', '', '5');
INSERT INTO `paperquestion` VALUES ('202305129084', '1', '4', '1', '对', '对', '错', '', '', '', '5');
INSERT INTO `paperquestion` VALUES ('202305134643', '1', '3', '333', '', '', '', '', '', '', '444');
INSERT INTO `paperquestion` VALUES ('202305097846', '2', '4', '“五岳”是我国的五大名山，泰山不属于“五岳”的一项是', '错', '对', '错', '黄山', '衡山', '', '5');
INSERT INTO `paperquestion` VALUES ('202305097846', '3', '3', '( )就是人们对素质教育作用范围和内容的期待', '', '', '', '', '', '', '5');
INSERT INTO `paperquestion` VALUES ('202305097846', '4', '2', '哲学的基本问题，即思维和存在关系的问题应包括，物质与意识（ ）。', 'B,C', '谁具有永恒性，谁具有可变性', '谁是第一性，谁是第二性', '是否具有同一性', '是否具有相似性', '划分唯物论和唯心论的唯一标准', '5');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `username` int NOT NULL,
  `number` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `xueyan` varchar(255) DEFAULT NULL,
  `zhany` varchar(255) DEFAULT NULL,
  `nianji` int DEFAULT NULL,
  `banji` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `pwd` int NOT NULL,
  PRIMARY KEY (`number`,`username`,`pwd`),
  KEY `banji` (`banji`),
  KEY `number` (`number`),
  CONSTRAINT `banjix` FOREIGN KEY (`banji`) REFERENCES `class` (`classroom`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('670', '4467', '刘三', '计算机学院', '计算机技术', '2015', '2015', '123');
INSERT INTO `stu` VALUES ('111', '12345', '123', '计算机学院', '计算机技术', '2015', '2015', '666');
INSERT INTO `stu` VALUES ('570', '56785', '刘一', '计算机学院', '计算机技术', '2015', '2015', '666');
INSERT INTO `stu` VALUES ('789', '123451', '王五', '计算机学院', '计算机技术', '2015', '2015', '666');
INSERT INTO `stu` VALUES ('777', '2019042', '端', '计算机学院', '计算机技术', '2015', '2015', '666');
INSERT INTO `stu` VALUES ('563', '2090132', 'duana', '计算机学院', '计算机技术', '2015', '2015', '563');
INSERT INTO `stu` VALUES ('345', '20190401', '刘', '计算机学院', '计算机技术', '2015', '2015', '666');

-- ----------------------------
-- Table structure for stupaper
-- ----------------------------
DROP TABLE IF EXISTS `stupaper`;
CREATE TABLE `stupaper` (
  `stuid` int NOT NULL AUTO_INCREMENT,
  `classa` varchar(255) DEFAULT NULL,
  `paperid` varchar(255) NOT NULL,
  `questionid` varchar(255) NOT NULL,
  `stuanwer` varchar(255) DEFAULT NULL,
  `zhuantai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuid`,`paperid`,`questionid`),
  KEY `classa` (`classa`),
  KEY `paperid1` (`paperid`),
  KEY `question` (`questionid`),
  CONSTRAINT `classa` FOREIGN KEY (`classa`) REFERENCES `class` (`classroom`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `paperid1` FOREIGN KEY (`paperid`) REFERENCES `testpaper` (`number`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `question` FOREIGN KEY (`questionid`) REFERENCES `paperquestion` (`questionNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `stuid1` FOREIGN KEY (`stuid`) REFERENCES `stu` (`number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20190402 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stupaper
-- ----------------------------
INSERT INTO `stupaper` VALUES ('4467', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('4467', '2015', '202305097846', '3', '111', '学生已提交');
INSERT INTO `stupaper` VALUES ('4467', '2015', '202305097846', '4', 'B,C', '学生已提交');
INSERT INTO `stupaper` VALUES ('12345', '2015', '202305097846', '1', 'C', '完成');
INSERT INTO `stupaper` VALUES ('12345', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('12345', '2015', '202305097846', '3', '11', '学生已提交');
INSERT INTO `stupaper` VALUES ('12345', '2015', '202305097846', '4', 'C,B', '学生已提交');
INSERT INTO `stupaper` VALUES ('56785', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('56785', '2015', '202305097846', '3', '123', '学生已提交');
INSERT INTO `stupaper` VALUES ('56785', '2015', '202305097846', '4', 'C,B', '学生已提交');
INSERT INTO `stupaper` VALUES ('123451', '2015', '202305097846', '1', 'C', '完成');
INSERT INTO `stupaper` VALUES ('123451', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('123451', '2015', '202305097846', '3', '11', '学生已提交');
INSERT INTO `stupaper` VALUES ('123451', '2015', '202305097846', '4', 'B,C', '学生已提交');
INSERT INTO `stupaper` VALUES ('2019042', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('2019042', '2015', '202305097846', '3', '11', '学生已提交');
INSERT INTO `stupaper` VALUES ('2019042', '2015', '202305097846', '4', 'B,C', '学生已提交');
INSERT INTO `stupaper` VALUES ('20190401', '2015', '202305097846', '2', '错', '学生已提交');
INSERT INTO `stupaper` VALUES ('20190401', '2015', '202305097846', '3', '12', '学生已提交');
INSERT INTO `stupaper` VALUES ('20190401', '2015', '202305097846', '4', 'C,B', '学生已提交');

-- ----------------------------
-- Table structure for ter
-- ----------------------------
DROP TABLE IF EXISTS `ter`;
CREATE TABLE `ter` (
  `username` int NOT NULL,
  `number` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `xingbei` varchar(255) DEFAULT NULL,
  `nianling` int DEFAULT NULL,
  `pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `bianjibum` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`,`pwd`,`number`),
  KEY `bianjibum` (`bianjibum`),
  CONSTRAINT `banjibum` FOREIGN KEY (`bianjibum`) REFERENCES `class` (`classroom`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of ter
-- ----------------------------
INSERT INTO `ter` VALUES ('333', '123', '56', '男', '56', '666', '2015');
INSERT INTO `ter` VALUES ('1123', '4563', '刘7', '男', '24', '1123', '2014');

-- ----------------------------
-- Table structure for testpaper
-- ----------------------------
DROP TABLE IF EXISTS `testpaper`;
CREATE TABLE `testpaper` (
  `name` varchar(255) DEFAULT NULL,
  `number` varchar(255) NOT NULL,
  `stylea` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`number`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of testpaper
-- ----------------------------
INSERT INTO `testpaper` VALUES ('测试试卷2', '202305094069', '未参加');
INSERT INTO `testpaper` VALUES ('测试4', '202305094328', '结束');
INSERT INTO `testpaper` VALUES ('测试3', '202305096290', '未参加');
INSERT INTO `testpaper` VALUES ('测试试卷', '202305097846', '未参加');
INSERT INTO `testpaper` VALUES ('测试6', '202305129084', '未参加');
INSERT INTO `testpaper` VALUES ('202305134643', '202305134643', '未参加');
