select actor.name, birth_date 
from actor
where date(select * from actor where between "1970-01-01" and "1979-12-31");
select * from actor where date between "1970-01-01" and "1980-01-01";

select count(name) from actor where birth_date = date between "1970-01-01" and "1970-12-31";
insert into actor (actor_id, name, birth_date) values
(1,"송강호","1967-01-17"),
(2,"한석규","1964-11-03"),
(3,"문성근","1953-05-28"),
(4,"심은하","1972-09-23"),
(5,"전도연","1973-02-11"),
(6,"이정재","1981-10-30");
select*from actor;