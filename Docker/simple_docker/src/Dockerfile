#FROM openjdk:17
#LABEL maintainer="jeesw1221@gmail.com"
#WORKDIR /app
#COPY HelloDocker.java /
#RUN javac HelloDocker.java
#EXPOSE 8080
#CMD ["java", "HelloDocker"]

FROM mysql:8.0

# 환경 변수 설정
ENV MYSQL_ROOT_PASSWORD=rootpassword
ENV MYSQL_DATABASE=myapp
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=userpassword

# SQL 스크립트를 도커 이미지 내부로 복사
COPY sql_scripts/ /docker-entrypoint-initdb.d/

# MySQL이 사용할 포트 설정 (기본값은 3306)
EXPOSE 3306