FROM amazoncorretto:11-alpine-jdk
MAINTAINER giordia
COPY target/BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar  BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BackEndSpringBootAEG75-0.0.1-SNAPSHOT.jar"]