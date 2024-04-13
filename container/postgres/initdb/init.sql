CREATE DATABASE develop;

\c develop;

CREATE SCHEMA IF NOT EXISTS public;

CREATE TABLE IF NOT EXISTS public.USERS
(
    id          varchar(8) PRIMARY KEY,
    name        varchar(40) not null,
    birthday    date,
    sex         boolean     not null,
    create_datetime timestamp   not null,
    update_datetime timestamp   not null
);

-- nameはdefault値で入れさせる
INSERT INTO public.USERS (id,name, birthday, sex, create_datetime, update_datetime)
VALUES ('test0123','testUser', '1995-10-15', true, NOW(), NOW());