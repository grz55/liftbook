FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
COPY --from=build /target/liftbook-0.0.1-SNAPSHOT.jar liftbook.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","liftbook.jar"]