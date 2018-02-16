drop table board if exists;
create table MY_SEQUENCE (
  sequence_name VARCHAR (2550) not null,
  next_val bigint,
  PRIMARY KEY (sequence_name)
);
