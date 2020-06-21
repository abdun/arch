From openjdk:8
Expose 8080
Add target/archa-0.0.1-snapshot.jar archa-0.0.1-snapshot.jar
ENTRYPOINT ["java", "-jar", "archa-0.0.1-snapshot.jar"]