-- SELECT *
-- FROM students AS A
-- INNER JOIN classes AS B
-- ON A.name = B.name;

-- SELECT *
-- FROM students AS A
-- LEFT OUTER JOIN classes AS B
-- ON A.name = B.name;

-- SELECT name, age FROM students WHERE age < 30
-- UNION
-- SELECT name, age FROM students WHERE age < 32;

-- SELECT name, age FROM students WHERE age < 30
-- UNION ALL
-- SELECT name, age FROM students WHERE age < 32;

-- SELECT * FROM students WHERE age < 31
-- UNION
-- SELECT * FROM students WHERE age < 33;