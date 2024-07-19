-- --------------------------------------------------------
-- 主机:                           124.223.10.250
-- 服务器版本:                        8.0.26 - MySQL Community Server - GPL
-- 服务器操作系统:                      Linux
-- HeidiSQL 版本:                  12.7.0.6850
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 导出  表 my_blog.t_blog 结构
CREATE TABLE IF NOT EXISTS `t_blog` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` text,
  `sub_url` varchar(50) NOT NULL,
  `cover_image` varchar(50) DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  `category_name` varchar(50) DEFAULT NULL,
  `tags` varchar(50) DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `views` bigint DEFAULT NULL,
  `enable_comment` tinyint DEFAULT NULL,
  `is_deleted` tinyint(3) unsigned zerofill DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_blog 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_category 结构
CREATE TABLE IF NOT EXISTS `t_category` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `icon` varchar(50) DEFAULT NULL,
  `rank` int DEFAULT NULL,
  `is_deleted` tinyint(3) unsigned zerofill DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_category 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_comment 结构
CREATE TABLE IF NOT EXISTS `t_comment` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `blog_id` bigint NOT NULL,
  `commentator` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `website_url` varchar(50) DEFAULT NULL,
  `comment_body` varchar(50) DEFAULT NULL,
  `comment_create_time` timestamp NULL DEFAULT NULL,
  `commentator_ip` varchar(50) DEFAULT NULL,
  `reply_body` varchar(50) DEFAULT NULL,
  `reply_create_time` timestamp NULL DEFAULT NULL,
  `comment_status` tinyint(3) unsigned zerofill DEFAULT NULL,
  `is_deleted` tinyint(3) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_comment 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_config 结构
CREATE TABLE IF NOT EXISTS `t_config` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `value` varchar(50) NOT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_config 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_link 结构
CREATE TABLE IF NOT EXISTS `t_link` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `type` tinyint NOT NULL,
  `name` varchar(50) NOT NULL,
  `url` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `rank` int DEFAULT NULL,
  `is_deleted` tinyint(3) unsigned zerofill DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_link 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_tag 结构
CREATE TABLE IF NOT EXISTS `t_tag` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `count` int DEFAULT NULL,
  `is_deleted` tinyint(3) unsigned zerofill DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_tag 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_tag_relation 结构
CREATE TABLE IF NOT EXISTS `t_tag_relation` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `blog_id` bigint NOT NULL,
  `tag_id` bigint NOT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_tag_relation 的数据：~0 rows (大约)

-- 导出  表 my_blog.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nickname` varchar(50) NOT NULL,
  `locked` tinyint(3) unsigned zerofill NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  my_blog.t_user 的数据：~0 rows (大约)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
