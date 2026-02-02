#FROM maven:3.9.12-eclipse-temurin-17 AS build
FROM maven:3.9.12-eclipse-temurin-25-alpine AS build
WORKDIR /app
COPY pom.xml ./
RUN mvn dependency:go-offline
COPY /src ./src

#RUN mvn clean package -DskipTests
RUN mvn clean package -DskipTests
RUN ls -la /app/target
#FROM eclipse-temurin:17-alpine
#FROM openjdk:17-ea-5-jdk-alpine
FROM openjdk:25-ea-2-jdk-slim


WORKDIR /app
COPY --from=build /app/target/sbFinalLuc-0.0.1-SNAPSHOT.jar /app/sbFinalLu.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar","/app/sbFinalLu.jar"]