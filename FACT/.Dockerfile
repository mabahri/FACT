FROM openjdk:13-alpine
Volume /tmp
ADD /target/*.jar FACT-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/FACT-0.0.1-SNAPSHOT.jar"]
