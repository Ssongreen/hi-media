create user "hyun"@"localhost" identified by "1234";
grant select on movie.film to "hyun"@"localhost";
show grants for "hyun"@"localhost";