FROM openjdk:11

ARG TAG=0.0.1-DEV

RUN mkdir /src

COPY . ./src

WORKDIR /src

RUN ./gradlew build -Prelease.useAutomaticVersion=true \         
-Prelease.releaseVersion=${TAG} \
-Prelease.newVersion=${TAG}

RUN mkdir /usr/app 

RUN cp build/libs/api-${TAG}.jar /usr/app/api.jar

WORKDIR /usr/app

CMD ["java","-jar","api.jar"]



