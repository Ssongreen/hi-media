select count(a.actor_id) , name
from actor a, film_actor f
where count(f.actor) = 2
group by f.actor;