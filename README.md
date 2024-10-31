# Parcial1DesarrolloDeSoftwareBackend

El proyecto esta Formado de la siguiente manera 1 Clase llamada Peticion, la clase Main llamada DemoApplication, y la clase del controlador en el paquete llamado rest , la misma lleva el nombre de RestController
en esta se obtiene el arreglo previamente enviado por el metodo POST en POSTMAN a la direccion localhost:puerto/Endpoint en formato JSON como el siguiente ejemplo

JSON EJEMPLO : 
{"dna":
[
"TTGCGA",
"GCTGTA",
"GAGGAC",
"GAGGAC",
"GAGGAC",
"GAGGAC"
]
}

Luego este JSON se mappean en un objeto del tipo Peticion en un array llamado DNA, luego si cumple las condiciones previas es decir que el arreglo enviado sea de nxn y contenga solo las letras A T C G 
se hara llamada a la funcion isMutant mandandole como argumento el arreglo DNA del objeto Peticion
isMutant esta alojada en el main de dicho programa, cabe destacar que esta funcion es estatica.
De lo contrario se respondera a la solicitud con un mensaje de error no esta en el formato solicitado.
Si es mutante se mostrara el mensaje Es mutante : TRUE o False.

#COMO VERIFICAR EL FUNCIONAMIENTO DE DICHA API

Lo primero que se debe hacer es compilar el proyecto de forma local mediante algun gestor de codigo.
Luego una vez comience el funcionamiento se debe mandar una solicitud POST mediante POSTMAN con el formato del ejemplo.
