# Usar una imagen base de JDK de Amazon Corretto
FROM amazoncorretto:17-alpine-jdk
# Establecer el directorio de trabajo
WORKDIR /app
# Copiar el archivo JAR generado en el contenedor
COPY target/*.jar app.jar
# Exponer el puerto en el que la aplicacion se ejecutara
EXPOSE 8080
# Comando para ejecutar la aplicacion
ENTRYPOINT ["java","-jar","app.jar"]