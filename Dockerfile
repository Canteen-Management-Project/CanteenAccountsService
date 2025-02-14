FROM openjdk:17-jdk-slim
#WORKDIR /app
COPY target/canteen-account-service-0.0.1-SNAPSHOT.jar canteen-account-service.jar
EXPOSE 9095
ENTRYPOINT [ "java","-jar","canteen-account-service.jar" ]