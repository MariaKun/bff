CREATE TABLE if not exists ORDERS(
	id SERIAL PRIMARY key,
    userid INTEGER REFERENCES USERS (id),
    summ INTEGER,
    currency VARCHAR(50)
);

CREATE TABLE if not exists PRODUCTS(
    id SERIAL PRIMARY key,
    description VARCHAR(50),
    price INTEGER
);

CREATE TABLE if not exists ORDERPRODUCT(
    orderid INTEGER REFERENCES ORDERS (id),
    productid INTEGER REFERENCES PRODUCTS (id),
    count INTEGER
);
