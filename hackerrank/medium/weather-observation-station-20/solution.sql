/*
Enter your query here.
*/
select round(lat_n,4) from(
    SELECT lat_n ,
     row_number() over (order by lat_n) as n  
     from station) as tab where n=250;
