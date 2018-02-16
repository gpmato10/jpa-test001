create table board(
  id bigint not null primary key,
  data varchar(255)
);
create sequence board_sdq start with 1 increment by 1;