use tienganhchoem;

insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('TEACHER','giáo viên');
insert into role(code,name) values('USER','người dùng');

insert into user(username,password,fullname,status, roleid) values('admin','123456','admin',1,1);
insert into user(username,password,fullname,status, roleid) values('giaovien','123456','Nguyễn Văn A',1,2);
insert into user(username,password,fullname,status, roleid) values('nguoidung','123456','Nguyễn Văn B',1,3);