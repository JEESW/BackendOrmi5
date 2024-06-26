-- CREATE TABLE test_db.tmp1 (
--     date_type DATE,
--     time_type TIME,
--     timestamp_type TIMESTAMP DEFAULT now()
-- );


-- INSERT INTO tmp1(date_type, time_type, timestamp_type)
-- VALUES (now(), now(), now());

-- SELECT * FROM tmp1;

-- CREATE TABLE customer (
--         id INT PRIMARY KEY, 
--         name VARCHAR(10) NOT NULL, 
--         address VARCHAR(200), 
--         contact VARCHAR(100)
-- );

-- CREATE TABLE orders (
--         id INT PRIMARY KEY,
--         customer_id INT, 
--         date TIMESTAMP DEFAULT now(),
--         payment VARCHAR(50),
--         amount INT,
--         delivery_amount INT,
--        FOREIGN KEY (customer_id) REFERENCES customer(id) 
-- )

-- INSERT INTO customer VALUES 
-- (1, '동해물', '서울', '010-1234-5678'),
-- (2, '백두산', '부산', '010-8765-4321');

-- INSERT INTO orders VALUES 
-- (1, 1, '2023-11-12', '신용카드', 10000, 2500),
-- (2, 1, '2023-11-13', '신용카드', 20000, 2500),
-- (3, 2, '2023-11-12', '계좌이체', 30000, 3000);

-- DELETE FROM customer
-- WHERE id = 1;

-- SELECT * FROM customer;
-- SELECT * FROM orders;

-- DELETE FROM orders WHERE customer_id = 1;
-- DELETE FROM customer WHERE id = 1;

-- SELECT * FROM customer;
-- SELECT * FROM orders;


-- INSERT INTO customer VALUES (1, '동해물', '서울', '010-1234-5678');

-- DROP TABLE orders;

-- CREATE TABLE orders (
--         id INT PRIMARY KEY,
--         customer_id INT, 
--         date TIMESTAMP DEFAULT now(),
--         payment VARCHAR(50),
--         amount INT,
--         delivery_amount INT,
--         FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE CASCADE
-- );

-- INSERT INTO orders VALUES 
-- (1, 1, '2023-11-12', '신용카드', 10000, 2500),
-- (2, 1, '2023-11-13', '신용카드', 20000, 2500),
-- (3, 2, '2023-11-12', '계좌이체', 30000, 3000);

-- SELECT * FROM customer;
-- SELECT * FROM orders;

-- DELETE FROM customer WHERE id = 1;

-- SELECT * FROM customer;
-- SELECT * FROM orders;



-- INSERT INTO customer VALUES (1, '동해물', '서울', '010-1234-5678');

-- DROP TABLE orders;

-- CREATE TABLE orders (
--         id INT PRIMARY KEY,
--         customer_id INT, 
--         date TIMESTAMP DEFAULT now(),
--         payment VARCHAR(50),
--         amount INT,
--         delivery_amount INT,
--         FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE SET NULL
-- );

-- INSERT INTO orders VALUES 
-- (1, 1, '2023-11-12', '신용카드', 10000, 2500),
-- (2, 1, '2023-11-13', '신용카드', 20000, 2500),
-- (3, 2, '2023-11-12', '계좌이체', 30000, 3000);

-- SELECT * FROM customer;
-- SELECT * FROM orders

-- DELETE FROM customer WHERE id = 1;

-- SELECT * FROM customer;
-- SELECT * FROM orders