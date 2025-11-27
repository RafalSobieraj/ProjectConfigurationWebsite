FROM openjdk:17.0.2-jdk-slim

COPY target/Strona-0.0.1-SNAPSHOT.jar /tmp

RUN mkdir -p /tmp/images
VOLUME /tmp/images

WORKDIR /tmp
EXPOSE 80
ENTRYPOINT ["java", "-jar", "Strona-0.0.1-SNAPSHOT.jar"]
