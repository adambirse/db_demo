create table comments (id bigint not null auto_increment, text longtext not null, post_id bigint not null, primary key (id)) engine=InnoDB
create table posts (id bigint not null auto_increment, content longtext not null, description varchar(250) not null, title varchar(100) not null, primary key (id)) engine=InnoDB
alter table posts add constraint UK_mchce1gm7f6otpphxd6ixsdps unique (title)
alter table comments add constraint FKh4c7lvsc298whoyd4w9ta25cr foreign key (post_id) references posts (id) on delete cascade
