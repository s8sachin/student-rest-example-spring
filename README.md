# student-rest-example-spring

## Run

### Migrate db through flywaydb
```
mvn flyway:migrate -Dflyway.url=jdbc:postgresql://localhost:5432/mysampl2 -Dflyway.user=postgres -Dflyway.password=password
```

### Start application

```
mvn spring-boot:run
```
or
```
mvn exec:java -Dexec.mainClass="com.student.rest.studentrestexample.StudentRestExampleApplication" -Dexec.classpathScope=runtime
```
