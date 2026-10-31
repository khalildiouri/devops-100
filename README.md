# Spring Boot AWS CodeBuild sample
This project exposes a simple endpoint:
- GET /hello?name=xxxx
Example:
- http://localhost:8080/hello?name=John
- response: `Hello John!`
## Local run
```bash
mvn spring-boot:run
```
## Build on AWS CodeBuild
The included `buildspec.yml` runs:
```bash
mvn clean package -DskipTests
```
## Cloud testing
Deploy the generated JAR from `target/*.jar` to Elastic Beanstalk, ECS, or EC2, then call:
```bash
curl http://<your-url>/hello?name=Alice
```
