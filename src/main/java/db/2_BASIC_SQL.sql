INSERT INTO TEST1 (ID, SOME_TEXT)
VALUES (101, 'Some test value! SQL');

INSERT INTO TEST1 (ID, SOME_TEXT)
VALUES (104, 'Test2');

INSERT INTO TEST1 (ID)
VALUES (104);

SELECT COUNT(*) FROM TEST1;

--comment
UPDATE TEST1 SET SOME_TEXT = '!!!!!' WHERE ID = 101;

DELETE FROM TEST1 WHERE SOME_TEXT='!!!!!';

ALTER TABLE TEST1
ADD TEST_TEXT NVARCHAR2(10);

ALTER TABLE TEST1
ADD USER_NAME NVARCHAR2(50) DEFAULT 'NA' NOT NULL;

ALTER TABLE TEST1
DROP COLUMN TEST_TEXT;

ALTER TABLE TEST1
MODIFY USER_NAME NVARCHAR2(10) NULL;

DROP TABLE TEST1;