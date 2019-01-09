## 这个项目是什么

###### 一个Java编写的云网盘项目，在这里你可以自由地搜索文件，上传文件，以及下载文件。
###### 特色：可以决定分享或者私有化文件。


## 历史版本
* Version 0.2
   目前采用SpringBoot+Mybatis对项目进行了重构,增加了新功能:
   MD5校验->一致文件急速上传，
   断点续连->经过迅雷等下载软件和浏览器测试

* Version 0.1
   目前采用struts+mybaits+Spring框架完成了云网盘的架构；以后会考虑用springMVC和其他框架重构。
   前端页面为jsp
## How to use
   打包成war放到Tomcat中,注意application.properties中的配置需要修改,前端文件中的href需要修改。
## 预览
 ![Image text](https://github.com/BlackmodeN/iCloudDisk/blob/master/WebRoot/images/index.png)
 
 
## sql


USE `icloud`;


CREATE TABLE `file` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `filename` varchar(255) NOT NULL COMMENT '文件名',
  `filepath` varchar(600) NOT NULL COMMENT '文件路径',
  `filesize` varchar(255) NOT NULL COMMENT '文件大小',
  `createtime` date DEFAULT NULL COMMENT '创建日期',
  `canshare` int(2) NOT NULL COMMENT '0表示私有 1表示共享',
  `user_id` int(11) unsigned NOT NULL,
  `MD5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `file_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;


CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(16) NOT NULL,
  `comment` varchar(255) DEFAULT NULL COMMENT '注释',
  `isvip` int(11) NOT NULL COMMENT '1是vip 0不是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


 
 


## 问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 邮件(739388464@qq.com)

