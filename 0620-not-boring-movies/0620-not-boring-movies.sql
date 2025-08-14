# Write your MySQL query statement below
select * from Cinema c where mod(id,2) != 0 and c.description != 'boring' order by c.rating desc;