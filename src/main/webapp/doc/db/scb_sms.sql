/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50723
Source Host           : 140.143.160.173:3306
Source Database       : scb_sms

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-13 21:07:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for log_account
-- ----------------------------
DROP TABLE IF EXISTS `log_account`;
CREATE TABLE `log_account` (
  `log_account_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '日志编号',
  `log_account_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_account_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_account_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_department
-- ----------------------------
DROP TABLE IF EXISTS `log_department`;
CREATE TABLE `log_department` (
  `log_department_id` varchar(32) NOT NULL DEFAULT '1',
  `log_department_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_department_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_department_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_employee
-- ----------------------------
DROP TABLE IF EXISTS `log_employee`;
CREATE TABLE `log_employee` (
  `log_employee_id` varchar(32) NOT NULL DEFAULT '1',
  `log_employee_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_employee_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_employee_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_logon
-- ----------------------------
DROP TABLE IF EXISTS `log_logon`;
CREATE TABLE `log_logon` (
  `log_logon_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '日志编号',
  `log_logon_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_logon_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_logon_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  `log_logon_ip` varchar(20) DEFAULT NULL COMMENT '登录ip',
  PRIMARY KEY (`log_logon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_menu
-- ----------------------------
DROP TABLE IF EXISTS `log_menu`;
CREATE TABLE `log_menu` (
  `log_menu_id` varchar(32) NOT NULL DEFAULT '1',
  `log_menu_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_menu_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_menu_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_position
-- ----------------------------
DROP TABLE IF EXISTS `log_position`;
CREATE TABLE `log_position` (
  `log_position_id` varchar(32) NOT NULL DEFAULT '1',
  `log_position_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_position_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_position_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_rolegroup
-- ----------------------------
DROP TABLE IF EXISTS `log_rolegroup`;
CREATE TABLE `log_rolegroup` (
  `log_rolegroup_id` varchar(32) NOT NULL DEFAULT '1',
  `log_rolegroup_operator_type` varchar(32) NOT NULL COMMENT '操作类型',
  `log_rolegroup_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_rolegroup_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_rolegroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_sysparam
-- ----------------------------
DROP TABLE IF EXISTS `log_sysparam`;
CREATE TABLE `log_sysparam` (
  `log_sysparam_id` varchar(32) NOT NULL DEFAULT '1',
  `log_sysparam_operator_type` varchar(10) NOT NULL COMMENT '操作类型',
  `log_sysparam_operator_eid` varchar(32) NOT NULL COMMENT '操作账户',
  `log_sysparam_operator_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`log_sysparam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_account
-- ----------------------------
DROP TABLE IF EXISTS `sm_account`;
CREATE TABLE `sm_account` (
  `account_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '账户编号',
  `account_name` varchar(50) NOT NULL COMMENT '账户名称',
  `account_password` varchar(50) NOT NULL COMMENT '账户密码',
  `account_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `account_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `employee_id` varchar(32) NOT NULL COMMENT '职员编号',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_department
-- ----------------------------
DROP TABLE IF EXISTS `sm_department`;
CREATE TABLE `sm_department` (
  `department_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '部门编号',
  `department_name` varchar(50) NOT NULL COMMENT '部门名称',
  `department_abbreviation` varchar(10) NOT NULL COMMENT '部门缩写',
  `department_pid` varchar(32) NOT NULL COMMENT '上级部门',
  `department_orderId` varchar(20) NOT NULL COMMENT '排序编号',
  `department_phone` varchar(100) DEFAULT NULL COMMENT '部门电话',
  `department_email` varchar(30) DEFAULT NULL COMMENT '部门邮箱',
  `department_detail` varchar(500) DEFAULT NULL COMMENT '部门描述',
  `department_head` varchar(32) DEFAULT NULL COMMENT '部门领导',
  `department_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `department_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `department_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `department_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee`;
CREATE TABLE `sm_employee` (
  `employee_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '职员编号',
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
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee_address
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee_address`;
CREATE TABLE `sm_employee_address` (
  `employee_id` varchar(32) NOT NULL COMMENT '职员编号',
  `employee_address` varchar(200) NOT NULL COMMENT '职员现住址',
  `employee_nativePlace` varchar(200) DEFAULT NULL COMMENT '职员籍贯',
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee_contactinfo
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee_contactinfo`;
CREATE TABLE `sm_employee_contactinfo` (
  `employee_id` varchar(32) NOT NULL COMMENT '职员编号',
  `employee_landline` varchar(100) DEFAULT NULL COMMENT '职员座机',
  `employee_phone` varchar(20) DEFAULT NULL COMMENT '职员手机',
  `employee_email` varchar(30) DEFAULT NULL COMMENT '职员邮箱',
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_menu
-- ----------------------------
DROP TABLE IF EXISTS `sm_menu`;
CREATE TABLE `sm_menu` (
  `menu_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '菜单编号',
  `menu_name` varchar(20) NOT NULL COMMENT '菜单名称',
  `menu_parentId` varchar(32) NOT NULL COMMENT '父节点',
  `menu_orderId` varchar(20) NOT NULL COMMENT '排序编号',
  `menu_url` varchar(100) NOT NULL COMMENT '菜单URL',
  `menu_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `menu_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `menu_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `menu_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_permission
-- ----------------------------
DROP TABLE IF EXISTS `sm_permission`;
CREATE TABLE `sm_permission` (
  `permission_id` varchar(32) NOT NULL COMMENT '功能编号',
  `permission_name` varchar(50) NOT NULL COMMENT '功能名称',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_position
-- ----------------------------
DROP TABLE IF EXISTS `sm_position`;
CREATE TABLE `sm_position` (
  `position_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '职位编号',
  `position_name` varchar(50) NOT NULL COMMENT '职位名称',
  `rolegroup_id` varchar(32) DEFAULT NULL COMMENT '角色组编号',
  `position_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `position_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `position_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `position_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_position_grant
-- ----------------------------
DROP TABLE IF EXISTS `sm_position_grant`;
CREATE TABLE `sm_position_grant` (
  `pg_position_id` varchar(32) NOT NULL COMMENT '职位编号',
  `pg_menu_id` varchar(32) NOT NULL COMMENT '菜单编号',
  `pg_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `pg_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `pg_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `pg_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`pg_position_id`,`pg_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_rolegroup
-- ----------------------------
DROP TABLE IF EXISTS `sm_rolegroup`;
CREATE TABLE `sm_rolegroup` (
  `rolegroup_id` varchar(32) NOT NULL DEFAULT '1' COMMENT '角色组编号',
  `rolegroup_name` varchar(50) NOT NULL COMMENT '角色组名称',
  `rolegroup_described` varchar(200) NOT NULL COMMENT '角色组描述',
  `rolegroup_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `rolegroup_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `rolegroup_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `rolegroup_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`rolegroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_rolegroup_grant
-- ----------------------------
DROP TABLE IF EXISTS `sm_rolegroup_grant`;
CREATE TABLE `sm_rolegroup_grant` (
  `rg_rolegroup_id` varchar(32) NOT NULL COMMENT '角色组编号',
  `rg_menu_id` varchar(32) NOT NULL COMMENT '菜单编号',
  `rg_created_user` varchar(32) NOT NULL COMMENT '创建人名',
  `rg_created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `rg_updated_user` varchar(32) DEFAULT NULL COMMENT '修改人名',
  `rg_updated_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`rg_rolegroup_id`,`rg_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
DROP TRIGGER IF EXISTS `log_account_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_account_auto_uuid` BEFORE INSERT ON `log_account` FOR EACH ROW BEGIN
 if new.log_account_id = '1' THEN set new.log_account_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_department_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_department_auto_uuid` BEFORE INSERT ON `log_department` FOR EACH ROW BEGIN
 if new.log_department_id = '1' THEN set new.log_department_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_employee_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_employee_auto_uuid` BEFORE INSERT ON `log_employee` FOR EACH ROW BEGIN
 if new.log_employee_id = '1' THEN set new.log_employee_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_logon_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_logon_auto_uuid` BEFORE INSERT ON `log_logon` FOR EACH ROW BEGIN
 if new.log_logon_id = '1' THEN set new.log_logon_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_menu_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_menu_auto_uuid` BEFORE INSERT ON `log_menu` FOR EACH ROW BEGIN
 if new.log_menu_id = '1' THEN set new.log_menu_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_position_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_position_auto_uuid` BEFORE INSERT ON `log_position` FOR EACH ROW BEGIN
 if new.log_position_id = '1' THEN set new.log_position_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_rolegroup_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_rolegroup_auto_uuid` BEFORE INSERT ON `log_rolegroup` FOR EACH ROW BEGIN
 if new.log_rolegroup_id = '1' THEN set new.log_rolegroup_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `log_sysparam_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `log_sysparam_auto_uuid` BEFORE INSERT ON `log_sysparam` FOR EACH ROW BEGIN
 if new.log_sysparam_id = '1' THEN set new.log_sysparam_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `account_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `account_auto_uuid` BEFORE INSERT ON `sm_account` FOR EACH ROW BEGIN
 if new.account_id = '1' THEN set new.account_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `department_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `department_auto_uuid` BEFORE INSERT ON `sm_department` FOR EACH ROW BEGIN
 if new.department_id = '1' THEN set new.department_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `employee_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `employee_auto_uuid` BEFORE INSERT ON `sm_employee` FOR EACH ROW BEGIN
 if new.employee_id = '1' THEN set new.employee_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `menu_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `menu_auto_uuid` BEFORE INSERT ON `sm_menu` FOR EACH ROW BEGIN
 if new.menu_id = '1' THEN set new.menu_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `permission_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `permission_auto_uuid` BEFORE INSERT ON `sm_permission` FOR EACH ROW BEGIN
 if new.permission_id = '1' THEN set new.permission_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `position_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `position_auto_uuid` BEFORE INSERT ON `sm_position` FOR EACH ROW BEGIN
 if new.position_id = '1' THEN set new.position_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `rolegroup_auto_uuid`;
DELIMITER ;;
CREATE TRIGGER `rolegroup_auto_uuid` BEFORE INSERT ON `sm_rolegroup` FOR EACH ROW BEGIN
 if new.rolegroup_id = '1' THEN set new.rolegroup_id = (select REPLACE(uuid(), '-', ''));
 end if;
END
;;
DELIMITER ;
