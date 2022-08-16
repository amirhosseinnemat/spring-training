**readme :**
# spring security sample:
### in this sample, display user `based on content`.

```html
    <sec:authorize access="hasRole('MANAGER')">
      <a href="${pageContext.request.contextPath}/leaders">Manager Page</a> (only for manager) <br>
    </sec:authorize>
```
**update 2 :**

## Spring security sample with `JDBC`

+ dependency added in this sample :

```xml
        <!--mysql-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.27</version>
        </dependency>

        <!--c3p0-->
        <dependency>
            <groupId>com.mchange</groupId>
            <artifactId>c3p0</artifactId>
            <version>0.9.5.2</version>
        </dependency>
```

### also i use this sql script for creating database :
```sql
DROP DATABASE  IF EXISTS `spring_security_demo_plaintext`;

CREATE DATABASE  IF NOT EXISTS `spring_security_demo_plaintext`;
USE `spring_security_demo_plaintext`;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `users`
--

INSERT INTO `users` 
VALUES 
('john','{noop}test123',1),
('mary','{noop}test123',1),
('susan','{noop}test123',1);


--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `authorities`
--

INSERT INTO `authorities` 
VALUES 
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susan','ROLE_EMPLOYEE'),
('susan','ROLE_ADMIN');



```
## about @PropertySource()

```java
@PropertySource("classpath: persistence-mysql.properties")
```
+ this annotation will read the props file in `src/main/resources` file are automatically
copied to classpath during maven build.

### `Environment` class 
+ from package `org.springframework.core.env.Environment;`  :
  + will hold data read from properties file.


### Note:
```text
data value in properties file are just String, so for convert it to integer we use 
helper method getIntProperty to convert it to int.
```
```java
    private int getIntProperty(String propName) {
        String propVal = environment.getProperty(propName);

        // now convert to int
        int intPropVal = Integer.parseInt(propVal);
        return intPropVal;
    }

```
