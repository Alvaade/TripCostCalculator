FROM maven:latest
LABEL authors="adeai"
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/TripCostCalculator-1.0-SNAPSHOT.jar"]