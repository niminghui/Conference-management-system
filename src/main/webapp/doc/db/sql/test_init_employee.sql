/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50723
Source Host           : 140.143.160.173:3306
Source Database       : scb_sms

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Author:Ryan.Li
Date: 2018-11-14 22:59:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sm_employee
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee`;
CREATE TABLE `sm_employee` (
  `employee_id` varchar(32) NOT NULL DEFAULT '' COMMENT '职员编号',
  `employee_name` varchar(50) NOT NULL COMMENT '职员姓名',
  `employee_nickname` varchar(50) NOT NULL COMMENT '职员昵称',
  `employee_gender` varchar(2) NOT NULL COMMENT '职员性别',
  `position_id` varchar(32) NOT NULL COMMENT '职位编号',
  `department_id` varchar(32) NOT NULL COMMENT '部门编号',
  `employee_status` varchar(10) NOT NULL COMMENT '职员状态',
  `employee_company` varchar(50) NOT NULL COMMENT '所在公司',
  `employee_image` mediumblob COMMENT '职员照片',
  `employee_entrytime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职日期',
  `employee_updated_user` varchar(50) DEFAULT NULL COMMENT '修改人名',
  `employee_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `employee_created_user` varchar(50) NOT NULL COMMENT '创建人名',
  `employee_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `employee_work_id` char(7) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `employee_work_id` (`employee_work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_employee
-- ----------------------------
INSERT INTO `sm_employee` VALUES ('0dea625ffbac4a64b5cb264bc7932357', '林浩天', 'Bob', '男', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592368');
INSERT INTO `sm_employee` VALUES ('5278b78c070d4a28a930ea4975eaaee7', '田冬菊', 'Linda', '女', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592364');
INSERT INTO `sm_employee` VALUES ('6cd3d2ae27c3492995e2164b2edbed8b', '陈丽', 'Mary', '女', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592365');
INSERT INTO `sm_employee` VALUES ('a6199888606d44279ff2b06723c94477', '张栋梁', 'Bill', '男', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592366');
INSERT INTO `sm_employee` VALUES ('c6b24e39e3174dd58af68b8e74e26c58', '崔建芬', 'Helen', '女', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592369');
INSERT INTO `sm_employee` VALUES ('d8877dd1a035429ab21eb93b49c7d0c2', '李娜', 'Cindy', '女', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592370');
INSERT INTO `sm_employee` VALUES ('f41e3d26dc4f42e9b8d3778e5ebddd9f', '王喜良', 'Ryan', '男', '127ab7d18903fe0916ac74df896cdac6', '0c8723ad251acd5225fbc56743d813ad', '001', '渣打', null, '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1467312', '2018-11-14 22:25:29', '1592367');
