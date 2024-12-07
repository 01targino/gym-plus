create table cliente(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(25) not null,
    email varchar(50) not null,
    senha varchar(50) not null,
    plano varchar(20) not null,

    primary key (id)
);
