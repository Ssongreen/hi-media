#문제 1#############
create database movie;
#문제 2#############
use movie;
create table film(
   film_id int not null auto_increment primary key,
   title varchar(255)not null,
   release_year year not null,
   production_company varchar(100)not null,
   description text not null
);
create table actor(
    actor_id int not null primary key,
    name varchar(45) not null,
    birth_date date
);
create table film_actor(
	film_id int not null,
    actor_id int not null,
   constraint PK primary key(film_id, actor_id),
   foreign key(film_id) references film(film_id),
   foreign key(actor_id) references actor(actor_id) 
    on delete cascade
    on update cascade
);
#문제 3#############
SET FOREIGN_KEY_CHECKS = 0;
insert into film_actor (actor_id, film_id) values
(2,1001),
(3,1001),
(2,1002),
(5,1002),
(2,1003),
(4,1003),
(1,1004),
(2,1004),
(2,1005),
(4,1005),
(6,1006);
select*from film_actor;
insert into film (film_id, title, description, release_year, production_company) values
(1001, "초록물고기", "이창동감독의 데뷔작", "1997", "이스트필름"), 
(1002, "접속", "PC통신을 통해 신청자에게 접속하면서 생기는 로맨스", "1997", "명필름"), 
(1003, "8월의 크리스마스", "허진호감독의 데뷔작", "1998", "우노필름"), 
(1004, "쉬리", "국내 첩보 액션 스릴러 영화", "1999", "(주) 강제규필름"), 
(1005, "텔미썸딩", "이승현 감독의 멜로 영화", "1999", "쿠앤씨필름"), 
(1006, "시월애", "이승현 감독의 멜로 영화", "2000", "싸이더스"); 
select*from film;
insert into actor (actor_id, name, birth_date) values
(1,"송강호","1967-01-17"),
(2,"한석규","1964-11-03"),
(3,"문성근","1953-05-28"),
(4,"심은하","1972-09-23"),
(5,"전도연","1973-02-11"),
(6,"이정재","1981-10-30");
select*from actor;

#문제 4#############
select count(title) as "1999년 이후 영화"
from film
where release_year >= "1999";
#문제 5#############
select title as "영화" , release_year as "년도"
from film
where release_year like "1999";
#문제 6#############
select f.film_id, title
from film f, film_actor fa 
where fa.film_id in ("1004");

#문제 7#############
select a.actor_id
from actor a, film_actor fa
where a.actor_id in ;

#문제 8#############
select count(a.actor_id) , name
from actor a, film_actor f
where count(f.actor) = 2
group by f.actor;

select actor.name, birth_date 
from actor
where date(select * from actor where between "1970-01-01" and "1979-12-31");
select * from actor where date between "1970-01-01" and "1980-01-01";

select count(name) from actor where birth_date = date between "1970-01-01" and "1970-12-31";

#문제 9#############
create user "hyun"@"localhost" identified by "1234";
grant select on movie.film to "hyun"@"localhost";
show grants for "hyun"@"localhost";