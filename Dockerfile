FROM openjdk:24-jdk-oracle

EXPOSE 8080

COPY target/AuthService-0.0.1-SNAPSHOT.jar auth.jar

CMD ["java", "-jar", "auth.jar"]