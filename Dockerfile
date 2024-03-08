# Use a base image with Java and Gradle installed
FROM gradle:jdk21 as build

# Set the working directory in the container
WORKDIR /inseason

# Copy the Gradle project files
COPY build.gradle settings.gradle gradlew ./

# Copy the Gradle wrapper
COPY gradle ./gradle

# Copy the source code into the container
COPY src ./src

# Build the application
RUN ./gradlew clean bootJar

# Use a lightweight base image for the application runtime
FROM amazoncorretto:21

# Set the working directory in the container
WORKDIR /inseason

# Copy the JAR file built in the previous stage
COPY --from=build /inseason/build/libs/*.jar app.jar

# Expose the port your application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]