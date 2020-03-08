FROM maven:3.6.3-jdk-11-slim AS build

WORKDIR /usr/src/app

COPY pom.xml pom.xml
RUN mvn dependency:go-offline

COPY src src
RUN mvn package

FROM openjdk:11.0.6-jre-slim-buster

WORKDIR /usr/app

COPY --from=build /usr/src/app/target/kotlin-consumer.jar kotlin-consumer.jar
ENTRYPOINT ["java", "-jar", "kotlin-consumer.jar"]