DROP TABLE IF EXISTS jaegers;

\c Robots;

CREATE TABLE jaegers (
    id         SERIAL PRIMARY KEY,
    model_name VARCHAR(20),
    mark       INTEGER,
    height     INTEGER,
    weight     INTEGER,
    status     VARCHAR(16),
    origin     VARCHAR(30),
    launch     DATE,
    kaiju_kill INTEGER
);

\ir 'init_db.sql'
\ir 'queries.sql'