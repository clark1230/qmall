/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.18-log : Database - qmall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qmall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qmall`;

/*Table structure for table `tb_brand` */

DROP TABLE IF EXISTS `tb_brand`;

CREATE TABLE `tb_brand` (
  `brand_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `brand_name` varchar(30) DEFAULT NULL COMMENT '品牌名称',
  `brand_logo` varchar(100) DEFAULT NULL COMMENT '品牌logo',
  `brand_desc` varchar(200) DEFAULT NULL COMMENT '品牌描述',
  `site_url` varchar(100) DEFAULT NULL COMMENT '品牌的网站',
  `sort_order` int(11) DEFAULT NULL COMMENT '品牌在前台页面的展示顺序，数字越靠后',
  `is_show` int(11) DEFAULT NULL COMMENT '是否展示, 0:不展示 1:展示',
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tb_brand` */

insert  into `tb_brand`(`brand_id`,`brand_name`,`brand_logo`,`brand_desc`,`site_url`,`sort_order`,`is_show`) values (1,'电脑','https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=3034132144,4091860566&fm=96','电子产品','http://',NULL,1),(2,'电脑','https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=3034132144,4091860566&fm=96','电子产品','http://',NULL,0),(3,'电脑2','logog.png','电子产品2','http://',NULL,1),(4,'电脑3','https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=3034132144,4091860566&fm=96','电子产品3','http://',NULL,0);

/*Table structure for table `tb_collect_goods` */

DROP TABLE IF EXISTS `tb_collect_goods`;

CREATE TABLE `tb_collect_goods` (
  `col_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏编号',
  `user_id` int(11) DEFAULT NULL COMMENT '客户编号',
  `user_name` varchar(30) DEFAULT NULL COMMENT '客户名称,采用冗余设计',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品编号',
  `goods_thumb` varchar(100) DEFAULT NULL,
  `col_time` datetime DEFAULT NULL COMMENT '收藏时间',
  `is_attention` int(11) DEFAULT NULL COMMENT '是否关注,0；不关注,1:关注',
  PRIMARY KEY (`col_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_collect_goods` */

/*Table structure for table `tb_goods` */

DROP TABLE IF EXISTS `tb_goods`;

CREATE TABLE `tb_goods` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `cat_id` int(11) DEFAULT NULL COMMENT '商品所属分类',
  `goods_cn` varchar(60) DEFAULT NULL COMMENT '商品的唯一货号',
  `goods_name` varchar(50) DEFAULT NULL,
  `click_count` int(11) DEFAULT NULL COMMENT '商品点击次数',
  `brand_id` int(11) DEFAULT NULL COMMENT '品牌编号',
  `numberr` int(11) DEFAULT NULL COMMENT '商品库存数量',
  `price` decimal(9,2) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '商品状态,0:未上架,1:已上架,2:已下架',
  `other_attr` varchar(500) DEFAULT NULL COMMENT '其他属性,存储的是json格式的属性',
  `goods_thumb` varchar(100) DEFAULT NULL COMMENT '商品的缩略图,商品在前天展示的缩略图片',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods` */

/*Table structure for table `tb_goods_category` */

DROP TABLE IF EXISTS `tb_goods_category`;

CREATE TABLE `tb_goods_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) DEFAULT NULL COMMENT '父级类目编号，如果为0时，表示的是一级的类目',
  `name` varchar(50) DEFAULT NULL COMMENT '类目名称',
  `status` int(11) DEFAULT NULL COMMENT '状态, 可选  1:正常  2:删除  默认为正常',
  `sort_order` int(4) DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `is_parent` tinyint(4) DEFAULT NULL COMMENT '该类目是否为父类目，1为true，0为false',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods_category` */

/*Table structure for table `tb_goods_comment` */

DROP TABLE IF EXISTS `tb_goods_comment`;

CREATE TABLE `tb_goods_comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `comment_type` int(11) DEFAULT NULL COMMENT '评论类型,0:商品 1:文章',
  `id` int(11) DEFAULT NULL COMMENT '商品编号/文章编号',
  `user_id` int(11) DEFAULT NULL COMMENT '评论者编号',
  `user_name` varchar(30) DEFAULT NULL,
  `comment_content` text COMMENT '评论内容',
  `comment_rank` int(11) DEFAULT NULL COMMENT '评论等级,1~5  1 表示1星评论',
  `comment_time` datetime DEFAULT NULL COMMENT '评论时间',
  `comment_ip` char(15) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '需要被管理员批准才能在前端页面展示,0:为未批准.1:批准,2:不通过',
  `parent_id` int(11) DEFAULT NULL COMMENT '评论的父节点,取值该表的comment_id字段,如果该字段为0,则是一个普通评论,否则该条评论就是该字段的值所对应的评论的回复',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods_comment` */

/*Table structure for table `tb_goods_desc` */

DROP TABLE IF EXISTS `tb_goods_desc`;

CREATE TABLE `tb_goods_desc` (
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `goods_desc` text COMMENT '商品详细描述',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods_desc` */

/*Table structure for table `tb_goods_images` */

DROP TABLE IF EXISTS `tb_goods_images`;

CREATE TABLE `tb_goods_images` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图片编号',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品编号',
  `big_img_path` varchar(300) DEFAULT NULL COMMENT '大图路径',
  `small_img_path` varchar(300) DEFAULT NULL COMMENT '小图路径',
  `is_cover` int(11) DEFAULT NULL COMMENT '是否是封面,0:不是,1:是',
  `create_by` int(11) DEFAULT NULL COMMENT '添加人',
  `create_time` datetime DEFAULT NULL COMMENT '添加时间',
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态,0:禁用,1:启用',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_goods_images` */

/*Table structure for table `tb_login_log` */

DROP TABLE IF EXISTS `tb_login_log`;

CREATE TABLE `tb_login_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志编号',
  `user_id` int(11) DEFAULT NULL,
  `login_user` varchar(30) DEFAULT NULL COMMENT '登陆用户',
  `broswer` varchar(20) DEFAULT NULL COMMENT '浏览器',
  `last_ip` char(15) DEFAULT NULL COMMENT '登陆ip',
  `last_time` datetime DEFAULT NULL COMMENT '最近登陆时间',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_login_log` */

/*Table structure for table `tb_message` */

DROP TABLE IF EXISTS `tb_message`;

CREATE TABLE `tb_message` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息编号',
  `sender_id` int(11) DEFAULT NULL COMMENT '发送者编号',
  `sender` varchar(30) DEFAULT NULL COMMENT '发送者名称',
  `receiver_id` int(11) DEFAULT NULL COMMENT '接收者编号',
  `receiver` varchar(30) DEFAULT NULL COMMENT '接收者名称',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '消息内容',
  `is_read` int(11) DEFAULT NULL COMMENT '是否阅读, 0:未读  1；已读\n            ',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_message` */

/*Table structure for table `tb_operate_log` */

DROP TABLE IF EXISTS `tb_operate_log`;

CREATE TABLE `tb_operate_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `oper_msg` varchar(100) DEFAULT NULL COMMENT '操作消息',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `ip` char(15) DEFAULT NULL COMMENT '操作者ip地址',
  `status` int(11) DEFAULT NULL COMMENT '操作状态,0:失败 1:成功',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_operate_log` */

/*Table structure for table `tb_order_log` */

DROP TABLE IF EXISTS `tb_order_log`;

CREATE TABLE `tb_order_log` (
  `log_id` int(11) NOT NULL COMMENT '日志编号',
  `order_id` int(11) DEFAULT NULL COMMENT '订单编号,订单表的主键',
  `user_id` int(11) DEFAULT NULL COMMENT '客户编号',
  `user_name` varchar(30) DEFAULT NULL COMMENT '客户名称',
  `order_date` datetime DEFAULT NULL COMMENT '订单生成日期',
  `status` int(11) DEFAULT NULL COMMENT '订单状态',
  `ip` char(15) DEFAULT NULL COMMENT 'ip地址',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_order_log` */

/*Table structure for table `tb_permission` */

DROP TABLE IF EXISTS `tb_permission`;

CREATE TABLE `tb_permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `name` varchar(15) DEFAULT NULL COMMENT '权限名称,比如添加用户',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级编号对应本表的权限编号',
  `parent_anme` varchar(15) DEFAULT NULL COMMENT '父级权限名称',
  `spread` char(10) DEFAULT NULL COMMENT '是否展开, false:表示不展开  true:表示展开',
  `is_lock` tinyint(4) DEFAULT NULL COMMENT '是否禁用: 0:表示禁用 1:表示启用',
  `create_by` int(11) DEFAULT NULL COMMENT '录入人',
  `create_time` datetime DEFAULT NULL,
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_permission` */

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `is_lock` tinyint(4) DEFAULT NULL COMMENT '是否禁用,0：表示禁用 1:表示启用',
  `description` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `create_by` int(11) DEFAULT NULL COMMENT '录入人',
  `create_time` datetime DEFAULT NULL COMMENT '录入时间',
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_role` */

/*Table structure for table `tb_role_permission` */

DROP TABLE IF EXISTS `tb_role_permission`;

CREATE TABLE `tb_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `role_id` int(11) DEFAULT NULL COMMENT '角色编号',
  `permission_id` int(11) DEFAULT NULL COMMENT '权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_role_permission` */

/*Table structure for table `tb_system_user` */

DROP TABLE IF EXISTS `tb_system_user`;

CREATE TABLE `tb_system_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `account` varchar(30) DEFAULT NULL COMMENT '登陆账号',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(50) DEFAULT NULL COMMENT '密码,md5二次加密',
  `question` varchar(30) DEFAULT NULL COMMENT '找回密码问题',
  `answer` varchar(20) DEFAULT NULL COMMENT '找回密码答案',
  `last_time` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `last_ip` char(15) DEFAULT NULL COMMENT '最后登陆ip',
  `create_by` int(11) DEFAULT NULL COMMENT '录入人',
  `create_time` datetime DEFAULT NULL COMMENT '录入时间',
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_system_user` */

/*Table structure for table `tb_system_user_role` */

DROP TABLE IF EXISTS `tb_system_user_role`;

CREATE TABLE `tb_system_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_system_user_role` */

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(30) DEFAULT NULL COMMENT '登陆名称',
  `real_name` varchar(30) DEFAULT NULL COMMENT '真实名称',
  `gender` int(11) DEFAULT NULL COMMENT '性别,0:表示女  1:表示男',
  `phone` char(15) DEFAULT NULL COMMENT '手机号码',
  `email` char(20) DEFAULT NULL COMMENT '邮箱',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `question` varchar(40) DEFAULT NULL COMMENT '找回密码提问',
  `answer` varchar(30) DEFAULT NULL,
  `reg_time` datetime DEFAULT NULL,
  `last_time` datetime DEFAULT NULL,
  `last_ip` char(15) DEFAULT NULL COMMENT '最后登陆ip',
  `status` int(11) DEFAULT NULL COMMENT '0:表示禁用,1:表示启用',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
