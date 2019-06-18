#!/bin/sh

/usr/bin/java -Xms${JVM_XMS} \
              -Xmx${JVM_XMX} \
              -Dspring.profiles.active=${SPRING_PROFILE} \
              -Dlogging.level.=${SPRING_LOGGING_LEVEL} \
              -jar /app/app.jar \
              --server.port=${PORT}