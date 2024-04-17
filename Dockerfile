FROM openjdk:8-jre 

ARG Jar_file=/target/*.jar
COPY ${Jar_file} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]



