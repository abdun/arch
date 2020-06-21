From openjdk:8
Expose 8080
Add target/arch.jar arch.jar
ENTRYPOINT ["java", "-jar", "arch.jar"]