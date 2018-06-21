
-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `items_id` int(11) NOT NULL AUTO_INCREMENT,
  `items_name` varchar(32) NOT NULL COMMENT '商品名称',
  `items_price` float(10,1) NOT NULL COMMENT '商品定价',
  `items_detail` varchar(100) COMMENT '商品描述',
  `items_pic`  varchar(100) DEFAULT NULL COMMENT '商品图片',
  `items_detailpic`  varchar(1000) DEFAULT NULL COMMENT '详细图片',
  `items_createtime` datetime NOT NULL COMMENT '生产日期',
  `items_fitpeople` varchar(32) NOT NULL COMMENT '使用人群',
  `items_sellinglevel` varchar(5) NOT NULL COMMENT '销售级别',
  `items_itemtype` varchar(5) NOT NULL COMMENT '商品种类',
  PRIMARY KEY (`items_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_region_province_code` char(3) ,
  `user_region_city_code` char(3) ,
  `user_region_county_code` char(3) ,
  `user_addressdetail` varchar(255) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_hobbies` varchar(50) DEFAULT NULL,
  `user_mobilephone` varchar(15) NOT NULL,
  `user_password` varchar(15) NOT NULL,
  `user_sex` varchar(1) NOT NULL,
  `user_name` varchar(15) NOT NULL,
  `user_img` varchar(100) DEFAULT NULL,
  `user_detail` varchar(100) COMMENT '用户描述',
  `user_email` varchar(50) DEFAULT NULL,
  `user_favoritecolor` varchar(20) DEFAULT NULL,
  `user_salary` integer DEFAULT NULL,
  `user_favoriteurl` varchar(50) DEFAULT NULL,
  `user_grade` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `region_id` int(11) NOT NULL AUTO_INCREMENT,
  `region_province_code` char(3) NOT NULL,
  `region_city_code` char(3) NOT NULL,
  `region_county_code` char(3) NOT NULL,
  `region_kind` char(1) NOT NULL COMMENT '1:province 2:city 3 county',
  `region_name` varchar(20) NOT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userlog
-- ----------------------------
DROP TABLE IF EXISTS `userlog`;
CREATE TABLE `userlog` (
  `userlog_id` int(11) NOT NULL AUTO_INCREMENT,
  `userlog_log` varchar(300) COMMENT 'log message',
  PRIMARY KEY (`userlog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `region` VALUES (default,'001','000','000','1','北京市');
INSERT INTO `region` VALUES (default,'002','000','000','1','上海市');
INSERT INTO `region` VALUES (default,'003','000','000','1','江西省');
INSERT INTO `region` VALUES (default,'001','001','000','2','东城区');
INSERT INTO `region` VALUES (default,'001','002','000','2','西城区');
INSERT INTO `region` VALUES (default,'001','003','000','2','海淀区');
INSERT INTO `region` VALUES (default,'001','004','000','2','朝阳区');
INSERT INTO `region` VALUES (default,'001','005','000','2','昌平区');
INSERT INTO `region` VALUES (default,'001','006','000','2','丰台区');
INSERT INTO `region` VALUES (default,'002','001','000','2','闸北区');
INSERT INTO `region` VALUES (default,'002','002','000','2','虹口区');
INSERT INTO `region` VALUES (default,'002','003','000','2','长宁区');
INSERT INTO `region` VALUES (default,'002','004','000','2','徐汇区');
INSERT INTO `region` VALUES (default,'002','005','000','2','宝山区');
INSERT INTO `region` VALUES (default,'002','006','000','2','嘉定区');
INSERT INTO `region` VALUES (default,'003','001','000','2','南昌市');
INSERT INTO `region` VALUES (default,'003','002','000','2','吉安市');
INSERT INTO `region` VALUES (default,'003','003','000','2','九江市');
INSERT INTO `region` VALUES (default,'003','004','000','2','赣州市');
INSERT INTO `region` VALUES (default,'003','005','000','2','宜春市');
INSERT INTO `region` VALUES (default,'003','006','000','2','上饶市');
INSERT INTO `region` VALUES (default,'003','001','001','3','西湖区');
INSERT INTO `region` VALUES (default,'003','001','002','3','东湖区');
INSERT INTO `region` VALUES (default,'003','001','003','3','青山湖区');
INSERT INTO `region` VALUES (default,'003','001','004','3','新建区');
INSERT INTO `region` VALUES (default,'003','002','001','3','市区');
INSERT INTO `region` VALUES (default,'003','002','002','3','泰和县');
INSERT INTO `region` VALUES (default,'003','002','003','3','吉安县');
