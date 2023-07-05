select f.film_id, title

from film f, film_actor fa 

where fa.film_id in ("1004");


select a.actor_id
from actor a, film_actor fa
where a.actor_id in (";