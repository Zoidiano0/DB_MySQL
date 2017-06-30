/*Problema 7

SELECT DISTINCT cno FROM envios WHERE tno IN ( SELECT tno FROM articulos WHERE ciudad='MADRID');

*/

/*Problema 9 
SELECT pno FROM envios WHERE tno='T1' UNION all (  SELECT pno FROM envios WHERE tno='T2');

*/



/* Problema 10
SELECT pno FROM envios e, componentes c, articulos a 
WHERE e.cno=c.cno AND e.tno=a.tno AND c.color='ROJO' AND a.ciudad IN('SEVILLA', 'MADRID'); 
SELECT pno FROM componentes c JOIN (envios e NATURAL JOIN articulos a) ON c.cno=e.cno 
WHERE c.color='ROJO' AND a.ciudad IN('SEVILLA', 'MADRID');
*/


/*problema 11
SELECT cno FROM envios WHERE tno IN ( SELECT tno FROM articulos WHERE ciudad='SEVILLA') 
AND pno IN ( SELECT pno FROM proveedores WHERE ciudad='SEVILLA');
*/
SELECT cno
FROM envios
WHERE tno IN ( SELECT tno
FROM articulos
WHERE ciudad='SEVILLA')
AND pno IN ( SELECT pno
FROM proveedores
WHERE ciudad='SEVILLA');