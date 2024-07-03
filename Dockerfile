FROM openjdk:11
WORKDIR /app
COPY target/achat-1.0.jar /app/my-app.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","/app/my-app.jar"]