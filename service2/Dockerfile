FROM eclipse-temurin:17-jre

COPY target/service-2-0.0.1.jar /app.jar
COPY opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT ["java", "-javaagent:opentelemetry-javaagent.jar", \
        "-jar", "app.jar"]

EXPOSE 8082
