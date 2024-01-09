CREATE TABLE tb_users(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    access_key VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    role smallint check (role between 0 and 2)
);