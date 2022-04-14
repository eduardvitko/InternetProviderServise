drop database internet_provider_base;

create database internet_provider_base;
use internet_provider_base;



create table users
(
    id       int(10) auto_increment,
    phone    varchar(16)  not null unique,
    password varchar(100) not null,
    isActive boolean   default true,
    role     varchar(10),
    created  timestamp default now(),
    updated  timestamp default now() on update NOW(),
    primary key (id)
);



create table customers
(
    id           int(10) primary key auto_increment,
    name         varchar(25) not null,
    surname      varchar(25) not null,
    phone_number varchar(13) not null unique,
    email        varchar(25) not null unique,
    isActive     boolean   default true,
    created      timestamp default now(),
    updated      timestamp default now() on update NOW()
);

create table wallets
(
    id           int(10) primary key auto_increment,
    number       varchar(25)  not null unique,
    balance      double(5, 2) not null,
    customers_id int(10),
    foreign key (customers_id) references customers (id)
);

create table tariffs
(
    id            int(10) primary key auto_increment,
    name          varchar(25)                            not null unique,
    service_type  enum ('TV','INTERNET','IPTV','MOBILE') not null,
    price_per_day int(10)                                not null,
    isActive      boolean   default true,
    created       timestamp default now(),
    updated       timestamp default now() on update NOW()

);
create table limits
(
    id         int(10) primary key auto_increment,
    name       varchar(25) not null unique,
    amount     int(10)     not null,
    isActive   boolean   default true,
    created    timestamp default now(),
    updated    timestamp default now() on update NOW(),
    tariffs_id int(10),
    foreign key (tariffs_id) references tariffs (id)
);


create table subscriptions
(
    id           int(10) auto_increment not null,
    name         varchar(25)            not null,
    days_amount  int(10)                not null,
    isActive     boolean   default true,
    created      timestamp default now(),
    updated      timestamp default now() on update NOW(),
    primary key (id),
    customers_id int(10),
    foreign key (customers_id) references customers (id)
);



create table subscs_tarfiffs
(
    sub_id int(10) not null,
    tar_id int(10) not null,
    primary key (sub_id, tar_id),
    foreign key (sub_id) references subscriptions (id),
    foreign key (tar_id) references tariffs (id)
);


