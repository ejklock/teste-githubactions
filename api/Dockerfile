FROM openjdk:11

RUN mkdir /src

COPY . ./src

WORKDIR /src

RUN ./gradlew build

RUN mkdir /usr/app 

RUN cp build/libs/api-build.jar /usr/app/api.jar

WORKDIR /usr/app

CMD ["java","-jar","api.jar"]



