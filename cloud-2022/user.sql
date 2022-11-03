/*
Navicat MySQL Data Transfer

Source Server         : springboot
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : jwtfinal

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2022-10-21 22:04:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('00000000001', 'jiayuhang', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-11 10:00:36', '2022-10-13 03:34:01');
INSERT INTO `user` VALUES ('00000000002', 'qiaoxuze', '202cb962ac59075b964b07152d234b70', '2022-10-11 10:01:04', '2022-10-21 10:56:29');
INSERT INTO `user` VALUES ('00000000003', 'liujunjian', 'e10adc3949ba59abbe56e057f20f883e', '2022-10-12 00:37:55', '2022-10-12 00:38:46');
INSERT INTO `user` VALUES ('00000000004', 'fanjinbao', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-14 03:53:00', '2022-10-14 08:22:38');
INSERT INTO `user` VALUES ('00000000005', 'lisi', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-14 07:25:27', '2022-10-14 07:31:37');
INSERT INTO `user` VALUES ('00000000006', 'daijiawei', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-14 07:40:06', '2022-10-14 07:58:37');
INSERT INTO `user` VALUES ('00000000007', 'xiaojia', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-14 08:00:46', null);
INSERT INTO `user` VALUES ('00000000008', 'xiaohe', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-14 08:01:07', '2022-10-14 08:01:29');
INSERT INTO `user` VALUES ('00000000009', 'chengba', 'e10adc3949ba59abbe56e057f20f883e', '2022-10-15 08:23:06', '2022-10-17 00:37:56');
INSERT INTO `user` VALUES ('00000000010', 'chengba', 'e10adc3949ba59abbe56e057f20f883e', '2022-10-17 00:47:17', '2022-10-17 00:47:28');
INSERT INTO `user` VALUES ('00000000011', 'chengba', 'e10adc3949ba59abbe56e057f20f883e', '2022-10-17 01:55:38', '2022-10-17 01:55:50');
INSERT INTO `user` VALUES ('00000000012', 'chengba', 'e10adc3949ba59abbe56e057f20f883e', '2022-10-17 01:57:56', '2022-10-17 01:58:14');
INSERT INTO `user` VALUES ('00000000013', 'finally', '202cb962ac59075b964b07152d234b70', '2022-10-17 01:59:43', '2022-10-17 02:46:22');
INSERT INTO `user` VALUES ('00000000014', 'lalala', '827ccb0eea8a706c4c34a16891f84e7b', '2022-10-17 02:47:49', '2022-10-20 07:09:39');
INSERT INTO `user` VALUES ('00000000015', 'lalala', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-20 02:20:41', '2022-10-20 07:31:04');
INSERT INTO `user` VALUES ('00000000016', 'qq123', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-20 07:46:58', '2022-10-21 07:16:27');
INSERT INTO `user` VALUES ('00000000017', 'aiya', '202cb962ac59075b964b07152d234b70', '2022-10-21 07:45:31', '2022-10-21 07:45:41');
INSERT INTO `user` VALUES ('00000000018', 'finaltest', 'f379eaf3c831b04de153469d1bec345e', '2022-10-21 08:24:08', '2022-10-21 08:29:32');
INSERT INTO `user` VALUES ('00000000019', 'test1', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-21 08:45:36', '2022-10-21 09:21:19');
INSERT INTO `user` VALUES ('00000000020', 'test2', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-21 09:23:20', '2022-10-21 09:55:36');
INSERT INTO `user` VALUES ('00000000021', 'xiaodai', '81dc9bdb52d04dc20036dbd8313ed055', '2022-10-21 11:27:08', '2022-10-21 11:28:15');
INSERT INTO `user` VALUES ('00000000022', 'test3', '202cb962ac59075b964b07152d234b70', '2022-10-21 21:59:32', '2022-10-21 22:03:11');
