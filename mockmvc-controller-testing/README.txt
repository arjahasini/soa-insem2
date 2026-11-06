MOCKMVC CONTROLLER TESTING - JAVA 8 VERSION

This project follows the paper task only:
- MS1Controller web-layer test using @WebMvcTest and MockMvc
- GET /math/add?a=5&b=10
- Assert HTTP 200 OK
- Assert exact response body: 5 + 10 = 15

No Eureka Server and no Eureka dependency are included.

ECLIPSE STEPS
1. Extract this ZIP.
2. Eclipse > File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted mockmvc-controller-testing folder.
4. Select the pom.xml project and click Finish.
5. Right-click the project > Maven > Update Project > OK.
6. Expand src/test/java.
7. Right-click MS1ControllerTest.java > Run As > JUnit Test.

Expected: 1 test, 0 failures.

JAVA
Configured for Java 8 with Spring Boot 2.7.18.
Make sure Eclipse project JRE System Library uses JavaSE-1.8.

NOTE
MockMvc test runs the controller slice with a mocked service. It does not need
to start the application or an embedded web server.
