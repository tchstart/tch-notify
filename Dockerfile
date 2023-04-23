FROM java:8
COPY *.jar /app.jar
CMD ["--server.port=8181"]

EXPOSE 8181

ENTRYPOINT ["java","-jar","/app.jar"]