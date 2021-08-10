FROM openjdk:8
ADD java-app-devops-demo/target/java-jenkins-docker.jar java-jenkins-docker.jar
ENTRYPOINT ["java", "-jar","java-jenkins-docker.jar"]
EXPOSE 8080