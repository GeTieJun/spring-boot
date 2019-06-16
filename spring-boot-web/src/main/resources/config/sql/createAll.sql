SET NAMES 'utf8';

DROP DATABASE
IF EXISTS spring_boot_test;

CREATE DATABASE spring_boot_test DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
USE spring_boot_test;


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `age` int(3) DEFAULT NULL COMMENT '用户年龄',
  `address` varchar(64) DEFAULT NULL COMMENT '用户地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='用户测试表';