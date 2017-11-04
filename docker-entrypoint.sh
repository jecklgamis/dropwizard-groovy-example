#!/bin/bash
set -ex
cd /usr/local/app
exec java -jar "bin/dropwizard-groovy-example.jar" server "config/config.yml"

