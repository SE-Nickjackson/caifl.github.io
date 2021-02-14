Drop table  if exists articleb;
CREATE TABLE `article` (
                           `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'int文章的唯一ID',
                           `author` varchar(50) NOT NULL COMMENT '作者',
                           `title` varchar(100) NOT NULL COMMENT '标题',
                           `content` longtext NOT NULL COMMENT '文章的内容',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8