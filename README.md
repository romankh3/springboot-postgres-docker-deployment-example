# java-postgres-docker-deployment-example
The project shows how to fast and easy add deployment process to Java app with database

## How to use it:

For running test env, use start-test.sh script. As an argument of script would be added env vars:

```shell
bash start.sh ${GIT_BRANCH_NAME} DB_USERNAME=${DB_USERNAME} DB_PASSWORD=${DB_PASSWORD} DB_NAME=${DB_NAME} DB_PORT={DB_PORT} APP_PORT={APP_PORT}
```

To stop test env, run stop.sh