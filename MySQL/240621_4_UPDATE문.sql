-- DROP TABLE STUDENTS;

-- CREATE TABLE STUDENTS (
--     NAME VARCHAR(255) NOT NULL,
--     AGE INT NOT NULL,
--     ADDRESS VARCHAR(255)
-- );

-- INSERT INTO students (name, age, address) VALUES
-- ('이황', 28, '경상북도'),
-- ('정약용', 29, '경기도'),
-- ('김정호', 30, '전라북도'),
-- ('박지원', 31, '전라북도'),
-- ('김홍도', 32, '경기도'),
-- ('신윤복', 33, '서울특별시'),
-- ('김광균', 34, '서울특별시'),
-- ('한용운', 35, '경상남도'),
-- ('박두진', 36, '경기도');

-- SET SQL_SAFE_UPDATES = 0;

-- SELECT * FROM STUDENTS;

-- UPDATE STUDENTS
-- SET ADDRESS = '강원도'
-- WHERE AGE <= 29;

-- SELECT * FROM STUDENTS;

-- UPDATE STUDENTS
-- SET ADDRESS = '강원도', age = 19
-- WHERE AGE <= 29;