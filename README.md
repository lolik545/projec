This project was created for the Toning and Reservation Service: the sale of service products, services provided by the service.
 
To install this application, run the following commands:

git clone https://github.com/lolik545/projec
This will get a copy of the project installed locally. To install all of its dependencies and start the app, do the following:

cd into the project folder (where pom xml is) and run:

mvn spring-boot:run
Open your browser and enter the following address:
http://localhost:8080/h2-console
Enter the following text in:
    Driver Class:org.h2.Driver
    JDBC URL:jdbc:h2:file:~/bvt
    User Name:sa
    Password:
leave the password blank
and click Connect
    
In the SQL code box, insert the following text from the file:
SQL queries for databases H2

Endpoints for Postman can be downloaded from:
Postman: https://documenter.getpostman.com/view/6693665/S1EL1fqp

