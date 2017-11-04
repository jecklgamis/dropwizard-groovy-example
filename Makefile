default:
	cat ./Makefile
dist:
	./gradlew clean build
image:
	docker build -t dropwizard-groovy-example:latest .
run:
	docker run -p 8080:8080 -p 8081:8081 dropwizard-groovy-example:latest
run-bash:
	docker run -i -t dropwizard-groovy-example:latest /bin/bash
