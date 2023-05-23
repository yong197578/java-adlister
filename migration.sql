use adlister_db;

create table if not exists users(
    id int unsigned not null auto_increment,
    username varchar(240) not null,
    email varchar(240) not null,
    password varchar(255) not null,
    primary key(id)

);

create table if not exists ads (
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(240) not null,
    description text not null,
    primary key (id),
    foreign key (user_id) references users(id)
)
