### 빌드 ###
# 1. Java 21 이미지를 기반으로 사용
FROM openjdk:21-jdk-slim

# 2. JAR 파일을 컨테이너에 복사
COPY build/libs/aws-test-0.0.1-SNAPSHOT.jar app.jar

# 3. 애플리케이션 실행 명령
ENTRYPOINT ["java", "-jar", "/app.jar"]