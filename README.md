# observability
#springboot #java #loki #prometheus #grafana
This is a demonstration of observability with Java and OpenTelemetry, utilizing the Java Agent for zero code instrumentation.

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

# Jaeger
http://localhost:16686
In the Service dropdown, there three services, service1, service2, service3 should be listed.

# Loki
Login in Grafana
Got to Datasources -> Loki
Click on Explore.
Choose Lable filters and select value. Click Run query.

# Docker - Useful commands

docker compose up -d
docker compose up --force-recreate // (In case of n/w error)
docker rmi -f $(docker images -aq) // to remove all images
docker logs <image-name>
docker compose down
