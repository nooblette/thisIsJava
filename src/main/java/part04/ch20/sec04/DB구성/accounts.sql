create table this_is_java.accounts (
    ano     varchar(20) primary key,
    owner   varchar(20) not null,
    balance numeric     not null
);

insert into this_is_java.accounts (ano, owner, balance)
values ('111-111-1111', '하여름', 10000000);


insert into this_is_java.accounts (ano, owner, balance)
values ('222-222-2222', '한겨울', 0);