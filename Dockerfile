FROM openjdk:8
EXPOSE 8082
ADD target/review-0.0.1-SNAPSHOT.jar ReviewMS-docker.jar
ENTRYPOINT ["java", "-jar", "ReviewMS-docker.jar"]
