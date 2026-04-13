FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY C:\Users\batch1.VITUNIVERSITY\Pictures\Screenshots\target\simple-java-app-1.0.jar
CMD ["java", "-jar", "app.jar"]