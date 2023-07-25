create table testing(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    idade varchar(100) not null,
    email varchar(100) not null unique,
    telefone varchar(100) not null,
    logradouro varchar(100) not null,
    numero varchar(100) not null,
    bairro varchar(100) not null,
    cidade varchar(100) not null,
    estado varchar(100) not null,
    cep varchar(100) not null,

    primary key(id)

);