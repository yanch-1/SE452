create TABLE accounts(
    id INT AUTO_INCREMENT PRIMARY KEY,
    customerId VARCHAR(20),
    accountName VARCHAR(20),
    password VARCHAR(20),
    PRIMARY Key (id)
);

create table customer(
    customerId varchar(20),
    userName varchar(20),
    address varchar(50),
    zip int,
    PRIMARY KEY(customerId)
);

create table items(
    itemId varchar (50),
    supplierId varchar(50),
    category varchar(50),
    PRIMARY KEY(itemId)
);

create TABLE supplier( 
    supplierId VARCHAR(20),
    name VARCHAR(20),
    PRIMARY KEY(supplierId)
);

CREATE TABLE displayShop(
    address VARCHAR(30),
    itemId VARCHAR(20),
    PRIMARY kEY(address)
);

CREATE TABLE storage (
    itemId VARCHAR(20),
    quantity int
);

CREATE TABLE orders (
    orderId VARCHAR(20),
    customerId VARCHAR(20),
    itemId VARCHAR(20),
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20),
    PRIMARY KEY(orderId)
);

CREATE TABLE Blacklist(
    userId VARCHAR(20)
);

CREATE TABLE loyalCustomer(
    userId VARCHAR(20)
);

CREATE TABLE admin(
    adminId VARCHAR(20)
);