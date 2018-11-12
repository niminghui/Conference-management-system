
-- ----------------------------
-- Create database
-- ----------------------------

CREATE DATABASE scb_sms;


-- ----------------------------
-- Table structure for log_account
-- ----------------------------
DROP TABLE IF EXISTS `log_account`;
CREATE TABLE `log_account` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_department
-- ----------------------------
DROP TABLE IF EXISTS `log_department`;
CREATE TABLE `log_department` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_employee
-- ----------------------------
DROP TABLE IF EXISTS `log_employee`;
CREATE TABLE `log_employee` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_logon
-- ----------------------------
DROP TABLE IF EXISTS `log_logon`;
CREATE TABLE `log_logon` (
  `logon_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `opration_account` varchar(32) NOT NULL,
  `operator_time` varchar(20) NOT NULL,
  `logon_ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`logon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_menu
-- ----------------------------
DROP TABLE IF EXISTS `log_menu`;
CREATE TABLE `log_menu` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_position
-- ----------------------------
DROP TABLE IF EXISTS `log_position`;
CREATE TABLE `log_position` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for log_sysparam
-- ----------------------------
DROP TABLE IF EXISTS `log_sysparam`;
CREATE TABLE `log_sysparam` (
  `log_id` varchar(32) NOT NULL,
  `operation_type` varchar(10) NOT NULL,
  `operation_account` varchar(32) NOT NULL,
  `operation_time` varchar(32) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_account
-- ----------------------------
DROP TABLE IF EXISTS `sm_account`;
CREATE TABLE `sm_account` (
  `account_id` varchar(32) NOT NULL,
  `account_name` varchar(50) NOT NULL,
  `account_password` varchar(50) NOT NULL,
  `created_user` varchar(32) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_user` varchar(32) DEFAULT NULL,
  `updated_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_department
-- ----------------------------
DROP TABLE IF EXISTS `sm_department`;
CREATE TABLE `sm_department` (
  `department_id` varchar(32) NOT NULL,
  `department_name` varchar(50) NOT NULL,
  `department_abbreviation` varchar(10) NOT NULL,
  `department_pid` varchar(32) NOT NULL,
  `department_orderId` varchar(20) NOT NULL,
  `created_user` varchar(32) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_user` varchar(32) DEFAULT NULL,
  `updated_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee`;
CREATE TABLE `sm_employee` (
  `employee_id` varchar(32) NOT NULL,
  `employee_name` varchar(50) NOT NULL,
  `employee_nickname` varchar(50) NOT NULL,
  `employee_gender` varchar(2) NOT NULL,
  `position_id` varchar(32) NOT NULL,
  `department_id` varchar(32) NOT NULL,
  `employee_status` varchar(10) NOT NULL,
  `employee_company` varchar(50) NOT NULL,
  `employee_image` mediumblob,
  `employee_entrytime` varchar(35) NOT NULL,
  `created_user` varchar(50) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_user` varchar(50) DEFAULT NULL,
  `updated_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee_address
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee_address`;
CREATE TABLE `sm_employee_address` (
  `employee_id` varchar(32) NOT NULL,
  `employee_address` varchar(200) NOT NULL,
  `employee_nativePlace` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_employee_contactinfo
-- ----------------------------
DROP TABLE IF EXISTS `sm_employee_contactinfo`;
CREATE TABLE `sm_employee_contactinfo` (
  `employee_id` varchar(32) NOT NULL,
  `employee_landline` varchar(20) DEFAULT NULL,
  `employee_phone` varchar(20) DEFAULT NULL,
  `employee_email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_menu
-- ----------------------------
DROP TABLE IF EXISTS `sm_menu`;
CREATE TABLE `sm_menu` (
  `menu_id` varchar(32) NOT NULL,
  `menu_name` varchar(20) NOT NULL,
  `menu_parentId` varchar(32) NOT NULL,
  `menu_orderId` varchar(20) NOT NULL,
  `menu_url` varchar(100) NOT NULL,
  `created_user` varchar(32) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_user` varchar(32) DEFAULT NULL,
  `updated_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_position
-- ----------------------------
DROP TABLE IF EXISTS `sm_position`;
CREATE TABLE `sm_position` (
  `position_id` varchar(32) NOT NULL,
  `position_name` varchar(50) NOT NULL,
  `rolegroup_id` varchar(32) DEFAULT NULL,
  `created_user` varchar(32) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_user` varchar(32) DEFAULT NULL,
  `updated_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_rolegroup
-- ----------------------------
DROP TABLE IF EXISTS `sm_rolegroup`;
CREATE TABLE `sm_rolegroup` (
  `rolegroup_id` varchar(32) NOT NULL,
  `rolegroup_name` varchar(50) NOT NULL,
  `rolegroup_described` varchar(200) NOT NULL,
  `created_user` varchar(32) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `update_user` varchar(32) DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`rolegroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_rolegroup_grant
-- ----------------------------
DROP TABLE IF EXISTS `sm_rolegroup_grant`;
CREATE TABLE `sm_rolegroup_grant` (
  `rolegroup_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sm_role_grant
-- ----------------------------
DROP TABLE IF EXISTS `sm_role_grant`;
CREATE TABLE `sm_role_grant` (
  `position_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
