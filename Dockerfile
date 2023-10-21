FROM openjdk:17
WORKDIR /app
ADD target/fas10ver-0.0.1-SNAPSHOT.jar fas10ver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","fas10ver-0.0.1-SNAPSHOT.jar"]