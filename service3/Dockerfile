FROM eclipse-temurin:17-jre

COPY target/service-3-0.0.1.jar /app.jar
COPY opentelemetry-javaagent-all.jar /opentelemetry-javaagent-all.jar

ENTRYPOINT ["java", "-javaagent:opentelemetry-javaagent-all.jar", \
        "-jar", "app.jar"]

EXPOSE 8083
