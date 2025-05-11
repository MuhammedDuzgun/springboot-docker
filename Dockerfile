FROM eclipse-temurin:17

LABEL authors="MUHAMMED"

WORKDIR /app

COPY /target/springboot-docker-0.0.1-SNAPSHOT.jar /app/springboot-docker-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-0.0.1-SNAPSHOT.jar"]