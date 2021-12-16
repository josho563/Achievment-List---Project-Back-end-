# Achievment-List---Project-Front-End
Introduction:
The Specifications was to create a CRUD application that covered both front-end and back-end using the technology that I had been taught.

Below outlines the technology I learned for this project
 •	Project Management = Jira
 •	Source Control = Github
•	Databases = Mysql
•	IDE used = MYSQL workbench, ECLIPSE, VISUAL STUDIO
•	Java SE
•	Spring Boot = used within eclipse project
•	Front-End Development = HTML CSS and JavaScript
•	Automated Testing = Mockito JUNIT
•	Intergration Testing = MockMVC

To read how I implemented what I learned see below.

Project Management:
 - My First step for this project was reading the specification, determining what would give me the Minimum viable product and then take this information to create user stories, this is where I began.

 Jira Board type used = Scrum
On this project firstly, I approached the Introduction section within the specification I had been given. I took on this information and used to make up my minimum viable product for the application, I then wrote them as User Stories in Jira and once done then created a Sprint.

Jira Board URL = https://joshuawillmott.atlassian.net/jira/software/projects/ALP/boards/3

- The overall objective was to create CRUD application using a range of supporting tools, methodologies and technologies.
- I created user stories tasking myself to configure and use certain technologies during the project.
An example of this was maintaining a version control system throughout and to use Spring boot in eclipse, one other example was also to use the Axios Library for my HTTP CRUD requests.

--Jira Board Image--
![image](https://user-images.githubusercontent.com/93252771/146392754-c55aad72-38ce-418e-926b-e0007f7f38af.png)


Version Control:
- During my learning period I had also been taught how to use GitHub and how its used for version control.
- Throughout the project I wanted to stick to the feature branch model to ensure I followed the best practices where possible.

Databases:
 - I had been taught how to use MySQL workbench and how to create databases. As the Developer I needed to implement a relational database within MySQL, I needed this to store my data persistently for the project once complete, I also needed a H2 database to run tests against.
 -- picture of ERD --
 ![ERD diagram](https://user-images.githubusercontent.com/93252771/146384401-96cd6ff3-6ffe-4b15-b13b-f0c47cddb481.PNG)


Java SE & Spring Boot:
 - During my learning period I was shown Spring Boot and how it can be used to create an application which can act as an API to join a front-end system and back-end system together.

Testing:
 - I have attempted to reach an acceptable level of test coverage on back-end this was done by using primaraly MockMVC but also (JUnit4/5 and Mockito).
-- Picture of MockMVC --
![image](https://user-images.githubusercontent.com/93252771/146384477-04e71b6f-e1f7-415f-8e0f-ab45978a9cb0.png)

 - The above shows my intergration testing, this was done by using MockMVC.
 - My tests used MockMVC to mock a controller class,
 - The tests performed would pull the MockMVC object from the context (all beans) and then peform the request and capture the response.
 
- The test would use RequestBuilder to convert my Java to JSON format it would then use a ResultMatcher to check two things.

Firstly that the Status code returned was 201 (Created)
Secondly that my Java is now in JSON format.

Once done it uses this.mvc to send the request this then checks the status as mentioned above and checks the body for JSON format.

- I have attempted to complte a UNIT test for my achievmentController class. Thus far I have completed a JUNIT/MOCKITO test which tests the customer controller and tests its create method isolated on its own.
- In this test it injects a mock version of Achievement Service and injects it into the Controller
- ![image](https://user-images.githubusercontent.com/93252771/146394214-9ddea93a-2b4e-44ea-81c4-152a39d6e447.png)


Front-End Development:
 - During my learning I have been taught about 3 new programming languages HTML, CSS, and JavaScript. 
 - I used these to to build my front-end webpage.
- I used HTML to build my basic structure for all my data to be inserted into.
 - I used Bootstrap and CSS to help build a structure to my webpage for example I implimented a navbar on my webpage so that users can navigate between the HTML pages.
  - A key technology found in my project was Axios Library I used the javascript language to utilise this Library to make HTTP requests for my CRUD functions this is what let my API intergration take place. 

-- Final Build --
![image](https://user-images.githubusercontent.com/93252771/146393593-34a1ea1f-4646-4fd7-8f54-36e57f26aa6a.png)




A Powerpoint Presentation explaining a few additional steps can be found at this location = https://1drv.ms/p/s!AtF_8CvAeq1zueo9ztats6UxXCWmcA?e=q05g6R

## Authors
* **Josh Willmott** - Achievement Project work* - [josho563](https://github.com/josho563)

## Acknowledgments
a big thanks to the QA team of trainers who have helped me learn.
Special shout out to QA team
Jordan Harrison
Jordan Benbelaid.
Anoush Lowton.
Pawel Stypulkowski
