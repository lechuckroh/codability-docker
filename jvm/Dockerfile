FROM frekele/gradle:2.14-jdk8

COPY . /app

WORKDIR /app

VOLUME ["/app/src", "/app/build/test-results"]

RUN mkdir -p /gradle_home

ENV GRADLE_USER_HOME=/gradle_home

RUN gradle test


CMD ["gradle", "-b", "build-run.gradle", "test"]
