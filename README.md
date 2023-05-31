# TechnicalTestBackend
Prueba para programador backend

Se usaron tecnologías como:
Java 11
Springboot 2.7.12
Java Persistence API (JPA)
Gestor de base de datos H2
Spring Security
JWT
Swagger 2
Docker

Instrucciones de uso: 
La API se compone de 3 endpoints : 

1.	Login
POST :  localhost:8080/api/login/login 
 	Con este endpoint se puede logear y obtener el token. Se envia el siguiente objeto JSON en el body del request.
  
  {
    "username":"pablo123",
    "password":"123456"
  }
  
  Los usuarios que tienen acceso son : 
  username : pablo123
  password : 123456
  
  username : andrea123
  password : 123456  
  
  username : juan123
  password : 123456   
  
2.	Crear Nota
POST : localhost:8080/api/notas
Con este endpoint se crean notas a partir de el id del curso y id del alumno. Se necesita un objeto JSON con tres parámetros. Además se necesita un token.
{
    "nota":5.0,
    "userId":1,
    "courseId":2
}

3.	Obtener Notas por Usuario
GET : localhost:8080/api/notas/getNotasByUsuario/1
Con este endpoint se obtienen notas por usuario. El id del usuario se envia en la cabecera. Se necesita un token .

