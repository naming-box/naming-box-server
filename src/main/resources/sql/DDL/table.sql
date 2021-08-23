create table Member
(
    id bigint auto_increment,
    type varchar(10) not null comment '타입',
    email text not null comment '이메일',
    password varchar(60) null comment '비밀번호',
    nick_name varchar(20) null comment '별명',
    constraint Member_pk
        primary key (id)
);

