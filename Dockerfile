FROM openjdk:latest
ADD target/spring-security.jar spring-security.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","spring-security.jar"]