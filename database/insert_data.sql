use springmvcbasicfree;

insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('USER','Người dùng');

insert into user(username,password,fullname,status)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','trương tùng lâm',1);
insert into user(username,password,fullname,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);
insert into user(username,password,fullname,status)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn B',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);

INSERT INTO `springmvcbasicfree`.`category` (`code`, `name`) VALUES ('the-thao', 'the thao');
INSERT INTO `springmvcbasicfree`.`category` (`code`, `name`) VALUES ('chinh-tri', 'chinh tri');

INSERT INTO `springmvcbasicfree`.`new` (`content`, `shortdescription`, `thumbnail`, `title`, `category_id`) VALUES ('dasdas', 'dasdas', 'dasdasd', 'adsd', '1');
INSERT INTO `springmvcbasicfree`.`new` (`content`, `shortdescription`, `thumbnail`, `title`, `category_id`) VALUES ('dasdas', 'dasdasd', 'asdasd', 'asdas', '2');