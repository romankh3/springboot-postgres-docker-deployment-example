#!/bin/bash

# Ensure, that docker-compose stopped
docker-compose --env-file ./target/.env stop

# Ensure, that the old application won't be deployed again.
mvn clean