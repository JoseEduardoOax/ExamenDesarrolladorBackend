use grandes_almacenes;

-- 2. Mostrar el número de ventas de cada producto, ordenado de más a menos ventas.

select Productos.Producto, Productos.Nombre, count(Venta.Producto) as Numero_Ventas from Venta
inner join Productos on Productos.Producto = Venta.Producto
group by Productos.Producto
order by Numero_Ventas desc;

-- 3. Obtener un informe completo de ventas, indicando el nombre del cajero que realizo la venta, nombre y precios 
-- de los productos vendidos, y el piso en el que se encuentra la máquina registradora donde se realizó la venta

select c.NomApels as Cajero, p.Nombre as Producto, p.Precio as Precio, m.Piso as Piso
from Venta as v
inner join Cajeros as c on c.Cajero = v.Cajero
inner join Productos as p on p.Producto = v.Producto
inner join Maquinas_Registradoras as m on m.Maquina = v.Maquina;

-- 4. Obtener las ventas totales realizadas en cada piso. 
select m.Piso as Piso, sum(p.Precio) as Total_Ventas 
from Venta as v
inner join Productos as p on p.Producto = v.Producto
inner join Maquinas_Registradoras as m on m.Maquina = v.Maquina group by m.Piso;

-- 5. Obtener el código y nombre de cada cajero junto con el importe total de sus ventas

select v.Cajero, c.NomApels, sum(p.Precio) as suma from Venta as v 
inner join Productos as p on p.Producto = v.Producto 
inner join Cajeros as c on c.Cajero = v.Cajero
group by v.Cajero;

-- 6. Obtener el código y nombre de aquellos cajeros que hayan realizado ventas en pisos cuyas ventas totales 
-- sean inferiores a los 5000 pesos.
select c.Cajero, c.NomApels
from Venta as v
inner join Cajeros as c on c.Cajero = v.Cajero
inner join Maquinas_Registradoras as m on m.Maquina = v.Maquina
where m.Piso in (select m.Piso as Piso from Venta as v
inner join Productos as p on p.Producto = v.Producto
inner join Maquinas_Registradoras as m on m.Maquina = v.Maquina 
group by m.Piso
having sum(p.Precio) < 5000)
group by c.Cajero;


