insert into ORDERS(userid, summ, currency)
values (1, 100, 'rur'),
       (1, 200, 'rur'),
       (2, 220, 'eu');

insert into PRODUCTS(description, price)
values ('water', 100),
       ('mineral', 120),
       ('pepsi', 200);

insert into ORDERPRODUCT(orderid, productid, count)
values (1, 1, 2),
       (1, 2, 1);




