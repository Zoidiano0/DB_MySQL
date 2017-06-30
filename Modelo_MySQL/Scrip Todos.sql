## Problema 1 
/*
Select * from articulos 
where ciudad ='CACERES';
*/
##Problema 2
/*
Select distinct pno from envios
where tno='T1';
*/
##Problema 3
/*
select distinct color, ciudad 
from componentes;
*/
##Problema 4 
/*
Select tno , ciudad from articulos 
where ciudad like '%D' or
ciudad like '%E%';
*/
##Problema 5
/*
Select pno from envios 
where tno ='T1' and cno='C1';
*/
##Problema 6 
/*
select tnombre from articulos 
natural join envios
where pno='P1' order by tnombre;
*/
##Problema 7
/*
select distinct cno from envios 
where tno in ( select tno from articulos where ciudad='MADRID');
*/
##Problema 8 
/*
select cno 
from componentes where peso=(select min(peso) from componentes);
*/
##Problema 9
/*
SELECT pno
FROM envios
where envios.tno='T1'
and exists(Select * from envios where envios.pno='T2');
*/
##Problema 10
/*
SELECT pno FROM envios e, componentes c, articulos a 
WHERE e.cno=c.cno AND e.tno=a.tno AND c.color='ROJO' AND a.ciudad IN('SEVILLA', 'MADRID'); 
SELECT pno FROM componentes c JOIN (envios e NATURAL JOIN articulos a) ON c.cno=e.cno 
WHERE c.color='ROJO' AND a.ciudad IN('SEVILLA', 'MADRID');
*/
##Problema 11
/*
SELECT cno FROM envios WHERE tno IN ( SELECT tno FROM articulos WHERE ciudad='SEVILLA') 
AND pno IN ( SELECT pno FROM proveedores WHERE ciudad='SEVILLA');
*/
#Problema 12
/*
SELECT DISTINCT tno
FROM envios WHERE cno IN ( SELECT DISTINCT cno
FROM envios WHERE pno='P1' );
*/
##Problema 13
/*
SELECT p.ciudad ,e.cno, a.ciudad
FROM proveedores p JOIN (envios e NATURAL
JOIN articulos a) ON p.pno=e.pno;
*/
##Problema 14
/*
SELECT p.ciudad ,e.cno, a.ciudad
FROM proveedores p JOIN (envios e NATURAL JOIN
articulos a) ON p.pno=e.pno and p.ciudad <>a.ciudad;
*/
##Problema 15
/*
SELECT COUNT(*) Número_Suministros,
COUNT (DISTINCT tno) Articulos_Suministrados,
SUM(cantidad) Total_Articulos_Suministrados
FROM envios
WHERE pno='P2';
*/
##Problema 16
/*
SELECT cno,tno, SUM(cantidad) Total
FROM envios GROUP BY cno,tno;
*/
##Problema 17
/*
SELECT DISTINCT e.tno
FROM envios e,articulos a
WHERE e.tno = a.tno AND EXISTS
(SELECT * FROM proveedores p
WHERE p.ciudad!= a.ciudad AND p.pno = e.pno AND p.ciudad!='MADRID' );
*/
##Problema 18
/*
SELECT distinct pno
FROM envios
WHERE cno IN
(SELECT cno FROM envios WHERE pno IN ( 
SELECT pno FROM envios NATURAL JOIN componentes WHERE color='ROJO') );
*/
##Problema 19
/*
SELECT DISTINCT tno
FROM envios
WHERE cno IN ( SELECT cno FROM envios 
GROUP BY cno HAVING AVG(cantidad) > 320 );
*/
##Problema 20
/*
SELECT distinct pno
FROM envios a
WHERE cantidad > (SELECT AVG(cantidad)
FROM envios b
WHERE b.cno=a.cno );
/*