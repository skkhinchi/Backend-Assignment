# Backend-Assignment
This application contains : 1) Project should have REST Apis. 2) DB Connection 3) Validation.      i) REST Api lavel validations.      ii) DB lavel validations using spring @notations 4) Application should cover @autowired concepts 5) Dependency Injections. 6) Application should follow standard code base structure. 7) Application should cover spring security concepts (Oauth2 token authenticaaation)



It provides a platform for admin. Admin can manage users. 
Uses of Spring Boot,Java,JSP,Dependencies,CrudRepository,MySQL database etc.

Tools: Spring IDE
Language and Frameworks: Spring Boot,JS,HTML and CSS,Java



1.Download

2.create a Table with (mydata) name
  My Database name Logindata


----------------------------------------------------------------
CREATE TABLE `logindata`.`mydata` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
-------------------------------------------------------

3.Import Project as Existing Project

4.Update Maven (for dependency installation)

5.Run As Spring Boot Application 

6. Go To Browser Put (http://localhost:8080/)
