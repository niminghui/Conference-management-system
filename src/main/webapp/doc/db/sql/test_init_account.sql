/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50723
Source Host           : 140.143.160.173:3306
Source Database       : scb_sms

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Author: Minghui.Ni
Date: 2018-11-15 09:32:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sm_account
-- ----------------------------
DROP TABLE IF EXISTS `sm_account`;
CREATE TABLE `sm_account` (
  `account_id` varchar(32) NOT NULL DEFAULT '' COMMENT '账户编号',
  `account_name` varchar(50) NOT NULL COMMENT '账户名称',
  `account_password` varchar(50) NOT NULL COMMENT '账户密码',
  `account_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `account_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_name` (`account_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_employee
-- ----------------------------
insert into sm_account values(replace(uuid(),'-',''), 'Amy_Li', '123', NULL, NULL);
insert into sm_account values(replace(uuid(),'-',''), 'Steve_Ni', '147258369', NULL, NULL);