FROM openjdk:11

WORKDIR /app

COPY ./target/prueba-java-0.0.1-SNAPSHOT.jar .

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "prueba-java-0.0.1-SNAPSHOT.jar"]

