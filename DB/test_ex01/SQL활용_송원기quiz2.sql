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
   primary key(film_id, actor_id),
   foreign key(film_id) references film(film_id),
   foreign key(actor_id) references actor(actor_id) 
    on delete cascade
    on update cascade
);