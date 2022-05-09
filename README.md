# Spring Framework Integration in Mule 4
The Spring module enables Mule apps to use the Spring framework.

# Steps to run application
* Clone the repo.
* Update the db credentials in application properties. 
* Run the application 
* Create accounts table in the postgresql DB. 
```
CREATE TABLE accounts (
	user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL,
        last_login TIMESTAMP 
);
```
* Add one entry into accounts table
```
INSERT INTO public.accounts
(username, "password", email,created_on, last_login)
VALUES('mule', 'max', 'mule@liquibase.com', now(), now());
```
* Hit the below url to get the account details from DB. 
```
curl --location --request GET 'http://localhost:8081/accounts' 
```
* Hit the below url to test the person dependency using spring. 
``` bash
curl --location --request GET 'localhost:8081/spring'
```
