CREATE TABLE tb_users(
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    role VARCHAR(5),
    createdAt TIMESTAMP,
    updatedAt TIMESTAMP
);