--Insert Data Productos
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("netus et",390),("eu lacus.",152),("condimentum. Donec",555),("ligula. Nullam",551),("Sed id",793),("sit amet,",812),("sagittis. Nullam",181),("convallis erat,",269),("lorem ipsum",376),("imperdiet non,",983);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("arcu. Vestibulum",708),("a, enim.",638),("vulputate, risus",915),("euismod urna.",106),("sit amet",611),("a, malesuada",770),("bibendum ullamcorper.",565),("sit amet",427),("magna tellus",928),("Proin vel",706);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("Duis ac",542),("commodo tincidunt",370),("eget nisi",641),("non, luctus",593),("egestas hendrerit",552),("dictum ultricies",979),("ac nulla.",590),("vitae nibh.",508),("augue ac",643),("mi enim,",796);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("sit amet,",358),("Duis at",272),("auctor vitae,",305),("sed libero.",962),("dolor. Fusce",536),("enim. Mauris",790),("erat, eget",564),("Integer vitae",252),("vitae erat",206),("Pellentesque ut",897);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("nulla magna,",1000),("nascetur ridiculus",121),("Aliquam erat",562),("vitae aliquam",843),("Donec egestas.",702),("nisi. Aenean",666),("sollicitudin orci",428),("vulputate, nisi",110),("metus eu",281),("semper cursus.",633);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("nibh. Donec",317),("tempus eu,",945),("placerat, augue.",686),("dignissim magna",572),("quis arcu",380),("Nunc lectus",928),("Donec tincidunt.",577),("egestas blandit.",377),("tristique pharetra.",366),("Suspendisse aliquet,",640);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("Integer in",119),("pharetra nibh.",118),("non, cursus",135),("lorem. Donec",286),("Fusce fermentum",877),("nunc id",273),("scelerisque scelerisque",750),("libero. Morbi",983),("dictum. Phasellus",798),("commodo auctor",978);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("erat nonummy",932),("venenatis a,",725),("velit in",970),("ligula elit,",592),("fringilla. Donec",227),("erat volutpat.",262),("pede sagittis",650),("a felis",342),("auctor velit.",856),("posuere at,",479);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("risus varius",718),("sociis natoque",107),("metus facilisis",683),("facilisis, magna",436),("Curabitur sed",550),("vestibulum massa",691),("Duis at",993),("sit amet",174),("a mi",513),("ullamcorper magna.",423);
INSERT INTO `Productos` (`Nombre`,`Precio`) VALUES ("in, hendrerit",859),("dui lectus",538),("nec luctus",528),("non sapien",673),("ipsum sodales",654),("magna. Duis",230),("rutrum urna,",426),("Cras dictum",189),("nascetur ridiculus",335),("sociis natoque",787);

--Insert Data Cajeros
INSERT INTO `Cajeros` (`NomApels`) VALUES ("vulputate mauris"),("sed sem"),("dis parturient"),("nec enim."),("risus. Donec"),("posuere vulputate,"),("eleifend. Cras"),("Fusce aliquam,"),("lobortis quam"),("sit amet");


--Insert Data Maquinas
INSERT INTO `Maquinas_Registradoras` (`Piso`) VALUES (1),(3),(2),(4),(1),(4),(5),(2),(4),(5);


--Insert Data Venta
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (7,7,2),(10,2,1),(4,1,42),(5,9,23),(7,4,17),(3,3,1),(9,6,27),(6,2,19),(2,4,35),(9,5,13);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (2,1,19),(4,10,46),(7,10,1),(6,9,32),(1,6,10),(7,7,43),(4,2,4),(8,6,45),(9,3,1),(4,3,1);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (10,4,29),(2,2,16),(9,3,14),(1,9,44),(4,2,3),(10,1,36),(4,4,44),(6,9,40),(7,7,49),(7,5,26);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (5,1,13),(2,9,47),(3,7,26),(2,3,50),(3,7,27),(2,8,39),(7,9,2),(1,3,9),(8,3,41),(1,2,37);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (10,7,44),(2,5,48),(7,8,46),(8,8,46),(10,9,34),(5,9,42),(10,2,47),(5,10,27),(10,9,45),(5,7,45);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (8,5,49),(6,9,29),(9,5,6),(3,1,6),(9,3,7),(3,1,43),(6,9,28),(10,2,41),(4,6,20),(7,6,33);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (9,7,16),(4,2,9),(3,9,22),(6,8,7),(3,5,20),(2,1,39),(10,3,47),(8,6,27),(7,4,25),(9,10,13);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (5,8,41),(4,3,29),(9,7,12),(7,4,45),(3,10,40),(2,10,7),(1,8,12),(2,8,47),(9,3,31),(1,9,21);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (6,7,34),(2,8,49),(5,8,13),(10,8,22),(5,4,10),(4,1,47),(2,1,21),(10,3,43),(3,1,3),(2,1,13);
INSERT INTO `Venta` (`Cajero`,`Maquina`,`Producto`) VALUES (3,4,17),(2,5,46),(10,6,23),(5,5,35),(3,1,6),(6,9,7),(4,10,29),(9,1,5),(1,7,46),(3,7,17);

