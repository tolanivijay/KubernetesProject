FROM openjdk:7
COPY ./src /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac print/SimplePrinter.java
CMD ["java", "print.SimplePrinter"]