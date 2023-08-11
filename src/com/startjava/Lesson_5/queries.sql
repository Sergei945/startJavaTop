\echo Вывод всю таблицу
SELECT * 
  FROM jaegers;

\echo Вывод неунечтоженных роботов
SELECT * 
  FROM jaegers
 WHERE status = 'Destroyed';

\echo Вывод роботов серии: Mark-1 и Mark-4
SELECT * 
  FROM jaegers
 WHERE mark = 1 OR mark = 4;

\echo Вывод роботов кроме: Mark-1 и Mark-4
SELECT * 
  FROM jaegers
 WHERE mark NOT IN(1, 4);

\echo Вывод таблицы по убиыванию по mark
SELECT * 
  FROM jaegers
 ORDER BY mark DESC;

\echo Вывод самого старого робота
SELECT * 
  FROM jaegers
 WHERE launch <= (SELECT MIN(launch) FROM jaegers);

\echo Робот который уничтожил больше всех kaiju
SELECT * 
  FROM jaegers
 WHERE kaiju_kill >= (SELECT MAX(kaiju_kill) FROM jaegers);

\echo Средний вес
SELECT ROUND(AVG(weight)) AS "Средний вес" 
  FROM jaegers;

\echo Увеличение количества убитых kaiju у не уничтоженных роботов
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';

\echo Удаление уничтоженных роботов
DELETE FROM jaegers
 WHERE status = 'Destroyed';