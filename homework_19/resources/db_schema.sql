-- user can have only one role
drop table roles;
create table roles
(
  id integer primary key,
  name text,
  description text
);

insert into roles (name, description) values
  ('visitor', 'readonly user'),
  ('user','Can create data, update and delete own data'),
  ('content_manage', 'can create, update, and delete any data'),
  ('administrator', 'full data access, can create users');


drop table users;

create table users
(
  id integer primary key,
  name text,
  login text,
  password text,
  role integer  references roles (id)
);

insert into users (name, login, password, role) values
  ('Alexandr Alexandrov', 'alex', 'asd123',1),
  ('Ivan Ivanov', 'vanya', '123456',2),
  ('Pavel Pavlov', 'pasha', '1q2w3e',3),
  ('Vladimir Vladimirov', 'vova', 'qwe123',4);

-- user can be a member of many groups
drop table groups;

create table groups
(
  id integer primary key,
  name text,
  description text
);

insert into groups (name, description) values
('inters', 'potential workers'),
('workers', 'only company workers'),
('managers', 'managers only'),
('contractors', 'part time workers'),
('guests', 'potential clients'),
('clients', 'company clients');

create table user_groups
(
  user_id  integer references users (id),
  group_id integer references groups (id),
  primary key (user_id, group_id)
);

drop table user_groups;

insert into user_groups (user_id, group_id) values
(1,1),
(1,2),
(1,3),
(2,4),
(2,5),
(2,6),
(3,1),
(3,2),
(3,3),
(4,4),
(4,5),
(4,6);

SELECT * from users;

SELECT * from roles;

SELECT * from groups;

SELECT * from users WHERE role = '1';

SELECT * from user_groups ug
join users u on user_id = id
where group_id ='4';

SELECT * FROM user_groups WHERE user_id = 2;

INSERT INTO user_groups (user_id, group_id) VALUES (5, 1);

DELETE  FROM user_groups where user_id = 5;

select *  FROM user_groups;

delete from users where id (5,6,7,8,9,10);