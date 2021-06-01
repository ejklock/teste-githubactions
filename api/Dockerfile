FROM openjdk:11

ARG TAG=0.0.1-DEV

WORKDIR /usr/app

RUN curl -L https://github.com/ejklock/teste-githubactions/releases/download/${TAG}/api-${TAG}.jar -o api.jar

CMD ["java","-jar","api.jar"]



