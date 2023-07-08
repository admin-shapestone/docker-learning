FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file and any other necessary files
COPY target/docker-learning-0.0.1-SNAPSHOT.jar /app

# Set the entry point command to run your application
ENTRYPOINT ["java", "-jar", "docker-learning-0.0.1-SNAPSHOT.jar"]