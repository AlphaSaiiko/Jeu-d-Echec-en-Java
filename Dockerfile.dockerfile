FROM debian:latest

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk coreutils

WORKDIR /echec/serveur

COPY ./src/Reseau .

ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

EXPOSE 6666

CMD bash -c "javac *.java && java Serveur"
