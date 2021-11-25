FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /usr/src/app

COPY pom.xml pom.xml
RUN mvn -B package -Dmaven.test.skip

COPY src src
RUN mvn -o -B package

FROM openjdk:17.0.1-jdk-slim-bullseye

WORKDIR /usr/app

COPY --from=build /usr/src/app/target/kotlin-consumer.jar kotlin-consumer.jar
ENTRYPOINT ["java", "-jar", "kotlin-consumer.jar"]