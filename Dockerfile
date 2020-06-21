From openjdk:8
Expose 8080
Add target/archa.jar archa.jar
ENTRYPOINT ["java", "-jar", "archa.jar"]