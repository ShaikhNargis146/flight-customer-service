FROM java:8-jdk
MAINTAINER shaikh Nargis <shaikhnargis20@gmail.com>

RUN apt-get update \
    && apt-get install -y git

RUN git clone https://github.com/ShaikhNargis146/flight-customer-service.git \
    && cd flight-customer-service \
    && chmod +x mvnw \
    && ./mvnw -DskipTests=true package

ADD ./target/flight-customer-service-0.0.1-SNAPSHOT.jar /root/
CMD ["java", "-jar", "/root/flight-customer-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 9004