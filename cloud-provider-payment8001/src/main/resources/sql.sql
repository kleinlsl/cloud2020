create table payment(
    id bigint(20) not null AUTO_INCREMENT comment 'ID',
    serial varchar(200) DEFAULT '',
    primary key (id)
) engine = innodb auto_increment=1 DEFAULT CHARSET=utf8;