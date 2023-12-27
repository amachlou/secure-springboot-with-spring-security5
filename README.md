# Secure Spring Boot Apps using the latest changes in Spring Security 5.7 ##

# You can notice that I've used the Oauth2-ressource-server dependency as it brings explicitely the spring security:
  <dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-oauth2-resource-server</artifactId>
  </dependency>

## Prerequisites
Make sure you have the following installed:
- Java Development Kit (JDK) 17 or higher
- Maven for dependency management


## Configuration
You'll need to configure the necessary properties in `application.properties` for the app to function properly. 
Ensure you provide the required credentials,
# run the following commands to generate a keypaire for Token signture(Make sure you have OpenSSL installed or just use Git cmd tool)
  # create rsa key pair
  openssl genrsa -out keypair.pem 2048
  
  # extract public key
  openssl rsa -in keypair.pem -pubout -out public.pem
  
  # create private key in PKCS#8 format
  openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem

## Acknowledgments
Mention any resources, libraries, or contributors you'd like to acknowledge in your project.
