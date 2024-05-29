## JSTL
        <dependency>
            <groupId>jakarta.servlet.jsp.jstl</groupId>
            <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
            <version>3.0.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.eclipse.jetty/glassfish-jstl -->
        <dependency>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>glassfish-jstl</artifactId>
            <version>11.0.20</version>
        </dependency>


## Taglib

        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib prefix="c" uri="jakarta.tags.core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


## Vadidation hibernate
<!-- https://mvnrepository.com/artifact/jakarta.validation/jakarta.validation-api -->
        <dependency>
            <groupId>jakarta.validation</groupId>
            <artifactId>jakarta.validation-api</artifactId>
            <version>3.0.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-validator -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>8.0.1.Final</version>
        </dependency>

## Tomcat Embed Jasper
<!-- https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <version>10.1.24</version>
        </dependency>

## Config jsp
        spring.mvc.view.prefix: webapp/WEB-INF/views/
        spring.mvc.view.suffix: .jsp

## Config SQL Server
        spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=SOF203;encrypt=true;trustServerCertificate=true;
        spring.datasource.username=sa
        spring.datasource.password=Aa@123456
        spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
        logging.level.org.hibernate.SQL=DEBUG
        logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
        spring.jpa.hibernate.ddl-auto=none
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.format_sql=true
        spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
