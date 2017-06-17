From java:8
EXPOSE 8761
ADD /build/libs/eureka-0.1.0.jar  eureka-0.1.0.jar
ENTRYPOINT ["java","-jar","eureka-0.1.0.jar"]