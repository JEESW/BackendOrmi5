-- CREATE TABLE accounts (
-- 	name VARCHAR(100) NOT NULL,
-- 	balance INT NOT NULL
-- );

-- 1
-- INSERT INTO accounts(name, balance) VALUES('A', 10000);

-- 2
-- COMMIT;

-- 4
-- BEGIN;
-- INSERT INTO accounts(name, balance) VALUES('B', 10000);
-- SELECT * FROM accounts;

-- 5
-- ROLLBACK;
-- SELECT * FROM accounts;

-- 6
-- INSERT INTO accounts (name, balance) VALUES ('B', 10000);
-- COMMIT;
-- SELECT * FROM accounts;