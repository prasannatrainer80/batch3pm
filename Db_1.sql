drop database if exists maildb;

create database maildb;

use maildb;

create table Users
(
   userName varchar(30) Primary key,
   passcode varchar(30)
);

create table MailSubject
(
    MailId int primary key auto_increment,
    userName varchar(30) references users(userName),
    mailSubject varchar(30)
);

create table MailDetails
(
    mdid int primary key auto_increment,
    mailBody varchar(30)
);