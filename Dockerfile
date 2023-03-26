FROM amazoncorretto:8-alpine-jdk
MAINTAINER giordia
COPY target/BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar EXPOSE 8080
ENTRYPOINT ["java","-jar","/BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar"]