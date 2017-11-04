## Dropwizard Groovy Example

[![Build Status](https://travis-ci.org/jecklgamis/dropwizard-groovy-example.svg?branch=master)](https://travis-ci.org/jecklgamis/dropwizard-groovy-example)

This is an example Dropwizard app using Groovy.

## Building The App

Ensure you have Java 8 or later.
```
./gradlew clean build
```

## Running The App
```
java -jar build/libs/dropwizard-groovy-example.jar server src/main/resources/config.yml
```

## Running The App In Docker

```
docker build -t dropwizard-groovy-example .
docker run dropwizard-groovy-example
```

Now, point your browser to `http://localhost:8080/` or use curl test the root end point.

```
curl -v http://localhost:8080/
```

## Links
* Dropwizard: http://www.dropwizard.io
* Groovy Programming Language: http://groovy-lang.org
* Gradle Build Tool: https://gradle.org







