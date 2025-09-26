# ---------- STAGE 1: Build ----------
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /workspace

COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY src ./src
RUN mvn -B package -DskipTests

# ---------- STAGE 2: Runtime ----------
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

RUN addgroup --system app && adduser --system --ingroup app app
COPY --from=builder /workspace/target/*.jar app.jar
RUN chown app:app app.jar
USER app

EXPOSE 8080
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Dspring.profiles.active=dev -jar /app/app.jar"]
