drop database internetprovider;

create database InternetProvider;
use InternetProvider;

create table Wallet(
                       id int(10) primary key auto_increment,
                       id_Wallet varchar(25) not null,
                       amount_in_account  int(10) not null);

create table customer (
                          id int(10) primary key auto_increment not null,
                          name varchar(25) not null,
                          surname varchar(25) not null,
                          phone_number varchar(13) not null,
                          email varchar(25) not null,
                          wallet_id int(10) unique key references Wallet(id));
create table user(
                     id int (10) auto_increment primary key,
                     name varchar(20) not null,
                     surname varchar(20) not null,
                     phone varchar(16) not null,
                     password varchar(100) not null,
                     email varchar(50) not null,
                     data_registration varchar(15) not null);

create table Subscriptions(
                              id int(10) primary key auto_increment not null,
                              name_subscription varchar(25) not null,
                              days_amount int(10) not null,
                              customer_id int(10),
                              foreign key (customer_id) references customer(id)
);

create table Tariff(
                       id int(10) primary key auto_increment,
                       name varchar(25) not null,
                       typeces enum ('TV','INTERNET','IPTV','MOBILE') ,
                       pricePerDay int(10) not null,
                       subscription_id int(10),
                       FOREIGN KEY (subscription_id) references subscriptions(id) );

create table Limits(
                       id int(10) primary key auto_increment,
                       name_limit varchar(25) not null,
                       amount int (10) not null,
                       tariff_id int(10),
                       foreign key (tariff_id) references tariff(id)
);
