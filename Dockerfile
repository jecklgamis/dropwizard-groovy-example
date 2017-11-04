FROM jecklgamis/oracle-java-runtime:latest
MAINTAINER Jerrico Gamis <jecklgamis@gmail.com>

RUN groupadd -r app && useradd -r -gapp app
RUN mkdir -m 0755 -p /usr/local/app/bin
RUN mkdir -m 0755 -p /usr/local/app/config
RUN mkdir -m 0755 -p /usr/local/app/logs/

COPY build/libs/dropwizard-groovy-example.jar /usr/local/app/bin
COPY docker-entrypoint.sh /usr/local/app/bin
COPY src/main/resources/config.yml /usr/local/app/config

RUN chown -R app:app /usr/local/app
RUN chmod +x /usr/local/app/bin/docker-entrypoint.sh

EXPOSE 8080
EXPOSE 8081

CMD ["/usr/local/app/bin/docker-entrypoint.sh"]

