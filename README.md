portti
======

OAuth 2.0 authorisation and resource provider with Spring Security OAuth (Java 8 + Java EE 7 + Spring 4.3.0.RELEASE + Spring Security OAuth2 2.0.9.RELEASE). Portti uses a minimal JSON-only configuration.

## Build

Create a package with `mvn clean package`.

## Run App

You might need to change the scope of `javax.servlet-api` and `javax.servlet.jsp-api` in `pom.xml` from `provided` to the default scope of `compile` depending on what versions are provided by your server.
