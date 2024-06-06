#FROM adoptopenjdk/openjdk11:centos

# 选择一个较小的基础镜像
FROM openjdk:8-jdk-alpine

COPY target/*.jar /app.jar

CMD ["--server.port=8080"]

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]