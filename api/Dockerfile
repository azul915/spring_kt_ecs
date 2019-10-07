# use alpine as base image
FROM openjdk:8-jdk-alpine

# recommended by spring boot
VOLUME /tmp

# create directory for application
RUN mkdir /api
WORKDIR /api

# jar target
ENV JAR_TARGET=api-0.0.1-SNAPSHOT.jar

# set entrypoint to execute spring boot application
RUN ifconfig
ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=docker build/libs/${JAR_TARGET}"]