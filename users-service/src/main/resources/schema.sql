CREATE TABLE if not exists USERS (
	id SERIAL PRIMARY key,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    address VARCHAR(50),
    phone_number VARCHAR(20),
    email VARCHAR(50)
);
