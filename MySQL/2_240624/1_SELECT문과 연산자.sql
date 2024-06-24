-- SELECT *
-- FROM students
-- WHERE address LIKE '경%';

-- SELECT *
-- FROM students
-- WHERE name LIKE "이%";

-- SELECT *
-- FROM students
-- WHERE name IN ("김정호", "김광균");

-- SELECT *
-- FROM students
-- WHERE address = "경기도" AND age = 29;

-- SELECT *
-- FROM students
-- WHERE address = "경기도" OR address = "전라북도";
-- -- WHERE address IN ("경기도", "전라북도");와 결과가 같음.

-- SELECT *
-- FROM students
-- WHERE NOT address = "경기도";
-- -- WHERE address <> "경기도";
-- -- WHERE address != "경기도";

-- SELECT *
-- FROM students
-- WHERE address IS NULL;