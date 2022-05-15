create database stadium_booking_2;
use stadium_booking_2;
create table user(
	cus_id int(25) not null unique auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    gender varchar(10),
    age int,
    phone varchar(11) not null,
    cus_gmail varchar(255) not null unique,
    cus_pass varchar(255) not null,
    primary key(cus_id)
);
create table ticket(
	ticket_id int(11) not null unique auto_increment,
    ticket_type varchar(30) not null,
    price float(9,2) not null,
    seat_number int(11) not null,
    team1 varchar(100)  not null ,
    team2 varchar(100)  not null ,
    time_match time not null,
    date_ticket date,
    isActive boolean default True,
    primary key (ticket_id)
);
create table booking (
	booking_id int(25) not null unique auto_increment,
    ticket_id int(11) not null,
    cus_id int(25) not null,
    booking_date date default(curdate()) ,
	time_match time not null,
    total_payment float(9.2) not null,
    type_payment varchar(10) not null,
    primary key (booking_id),
    FOREIGN KEY (ticket_id) references ticket(ticket_id),
	FOREIGN KEY (cus_id) references user(cus_id)
);
SET FOREIGN_KEY_CHECKS = 1;
select * from ticket;
