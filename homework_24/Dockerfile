FROM tomcat:10.0.5-jdk8-openjdk-slim-buster

RUN adduser -D tomcat; chown -R tomcat:tomcat /usr/local/tomcat

USER tomcat

COPY captcha.war /usr/local/tomcat/webapps/
COPY sample.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]
