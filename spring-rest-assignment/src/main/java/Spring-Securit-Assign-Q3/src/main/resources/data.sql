
INSERT INTO users(username,password,enabled)
values('admin','pass','true');

INSERT INTO authorities (username,authority)
values('admin','ROLE_ADMIN');