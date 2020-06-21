From openjdk:8
Expose 8080
Add target/archa-1.jar archa-1.jar
ENTRYPOINT ["java", "-jar", "archa-1.jar"]