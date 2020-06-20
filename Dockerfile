From openjdk:8
Expose 8080
Add target/archa-0.0.1-SNAPSHOT.jar archa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "archa-0.0.1-SNAPSHOT.jar"]