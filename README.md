# observability
#springboot #java #loki #prometheus #grafana

# Running Instructions
Download opentelemetry-javaagent-all v1.3.1
https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/tag/v1.3.1

## Localhost with docker
service1>mvnw clean package \
service2>mvnw clean package \
service3>mvnw clean package \

<u><b>Open wsl prompt</b></u> \
observability$ docker compose up -d

<u><b>Open Browser</u></b>
http://localhost:8081/service1/process


# Prometheus
http://localhost:9090

# Grafana
http://localhost:3000
Import dashboard - https://grafana.com/grafana/dashboards/18812-jvm-overview-opentelemetry/