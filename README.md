# Achievment-List---Project-Back-End
Introduction:
The specification brief was to create a CRUD application that covered both front-end and a back-end, and it was to be built using the technology that I had been taught.

I chose to make my project list about showing video game achievements.

Below outlines the technology I learned for this project, and I will cover each in depth in this document.

 •	Project Management = Jira
 
 •	Source Control = Github
 
•	Databases = Mysql

•	IDE used = MYSQL workbench, ECLIPSE, VISUAL STUDIO

•	Java SE

•	Spring Boot = used within eclipse project

•	Front-End Development = HTML CSS and JavaScript

•	Automated Testing = Mockito JUNIT

•	Intergration Testing = MockMVC

# Project Management:
 - My first step for this project was reading the specification and determining what would give me the minimum viable product; I would then take this information to create user stories.

 Jira Board type used = Scrum
I approached the introduction section within the specification I had been given, by taking this information and using it to make up my minimum viable product for the application. I then wrote them as user stories in Jira, and then created a Sprint.

Jira Board URL = https://joshuawillmott.atlassian.net/jira/software/projects/ALP/boards/3

- The overall objective was to create CRUD application using a range of supporting tools, methodologies and technologies.
- I created user stories tasking myself to configure and use certain technologies during the project.
An example of this was maintaining a version control system throughout, and to use Spring boot in eclipse; another example was also to use the Axios Library for my HTTP CRUD requests.

--Jira Board Image--
![image](https://user-images.githubusercontent.com/93252771/146392754-c55aad72-38ce-418e-926b-e0007f7f38af.png)

Before starting I also completed a Risk Assessment.

Image of Risk Assessment
![Risk Assessment](https://user-images.githubusercontent.com/93252771/146399749-d49ee122-6d7c-4cb0-91f4-3458554e9571.PNG)

# Version Control:
- During my learning period, I had also been taught how to use GitHub and how to use it to maintain version control.
- Throughout the project, I wanted to stick to the feature branch model, to ensure I followed the best practices where possible.

- Version Control
![image](https://user-images.githubusercontent.com/93252771/146408127-ca4e7750-f658-432a-bfc0-499a00abc954.png)

# Databases:
 - I had been taught how to use MySQL workbench and how to create databases. As the developer, I needed to implement a relational database within MySQL; I needed this to store my data persistently for the project once complete, and I needed a H2 database to run tests against.
 -- picture of ERD --
 ![ERD diagram](https://user-images.githubusercontent.com/93252771/146384401-96cd6ff3-6ffe-4b15-b13b-f0c47cddb481.PNG)

--Testing create in postman--

![testing create in postman](https://user-images.githubusercontent.com/93252771/146399655-690a2b44-22c2-4498-9075-4012c82d31ca.PNG)

-- Testing read all in postman --

![testing read in postman](https://user-images.githubusercontent.com/93252771/146399589-e4b128d0-0044-40ca-bd07-68450c8a5f44.PNG)

-- Testing to see if values show in database --

![testing sql](https://user-images.githubusercontent.com/93252771/146399527-179df63a-82ce-4012-8b08-ec19ec50c739.PNG)


Java SE & Spring Boot:
 - During my learning period, I was shown Spring Boot and how it can be used to create an application that can act as an API to join a front-end system, and back-end system together.

The back-end of this project was created using Java in a Spring Boot framework; I used the @Mapping annotation to carry out my Crud functions.
POST = create
GET = READ
PUT/PATCH = UPDATE
DELETE = DELETE
![image](https://user-images.githubusercontent.com/93252771/146404970-fc90dac9-91f2-4e46-8114-05825ee66ba3.png)

Testing:
 - I have attempted to reach an acceptable level of test coverage on back-end; this was done by using primaraly MockMVC but also (JUnit4/5 and Mockito).
 - 
-- Picture of MockMVC --

![image](https://user-images.githubusercontent.com/93252771/146384477-04e71b6f-e1f7-415f-8e0f-ab45978a9cb0.png)

 - The above shows my intergration testing, this was done by using MockMVC.
The test was done by using MockMVC testing tools.

- In the test MockMVC is used to mock a controller class.
The tests performed pulls the MockMVC object from the context (all beans) and then performs the request to capture the response.
 
In this test I have used a RequestBuilder to convert my Java to JSON format.
I have used a ResultMatcher to check two things have occured in the test that runs:
Firstly, that the status code returned was 201 (Created).
Secondly, that my Java is now in JSON format.
this.mvc is then used to check and told to expect my status to be 201 and the body to be JSON format.


- I have attempted to complete a UNIT test for my achievmentController class. Thus far I have completed a JUNIT/MOCKITO test, which tests the customer controller, and the create method isolated on its own.
- In this test, it injects a mock version of "Achievement Service" and injects it into the controller.
- ![image](https://user-images.githubusercontent.com/93252771/146394214-9ddea93a-2b4e-44ea-81c4-152a39d6e447.png)


Front-End Development:
 - During my learning I have been taught about 3 new programming languages HTML, CSS, and JavaScript. 
 - I used these to to build my front-end webpage.
 - I used HTML to build my basic structure for all my data to be inserted into.
 - I used Bootstrap and CSS to help build a structure to my webpage; for example, I implimented a navbar on my webpage so that users can navigate between the HTML pages.
 - A key technology found in my project was Axios library. I used the javascript language to utilise this library to make HTTP requests for my CRUD functions; this is how my API intergration took place. 


--WireFrame of webpage
![image](https://user-images.githubusercontent.com/93252771/146399275-2288e6ff-c513-4007-8788-8d832bf2a3d5.png)

-- Final Build --
![image](https://user-images.githubusercontent.com/93252771/146393593-34a1ea1f-4646-4fd7-8f54-36e57f26aa6a.png)


A Powerpoint presentation explaining a few additional steps can be found at this location: https://1drv.ms/p/s!AtF_8CvAeq1zueo9ztats6UxXCWmcA?e=q05g6R
Jira Board URL = https://joshuawillmott.atlassian.net/jira/software/projects/ALP/boards/3

## Authors
* **Josh Willmott** - Achievement Project work* - [josho563](https://github.com/josho563)

## Acknowledgments
A big thanks to the QA team of trainers:
Jordan Harrison.
Jordan Benbelaid.
Anoush Lowton.
Pawel Stypulkowski.
