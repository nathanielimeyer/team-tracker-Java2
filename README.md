# _Team Tracker_

#### _An application to track teams and their members for a startup weekend or hack-a-thon._

#### By _**Nathaniel Meyer**_

## Description

_This is a simple, lightweight web application to allow the coordinator of a startup weekend or hack-a-thon to create and manage teams and create and assign members to them._

_Project specifications / BDD_

|Requirement|input|output|
|-----------|:---:|:----:|
|Create a team based on a name and a project goal|"Fiery Phoenix", "Integrate application A with app B"|Team{"Fiery Phoenix", "Integrate application A with app B", Id: 1, ListOfMembers(initially empty)}|
|Lookup team attributes based on id|squad 1 name?|"Fiery Phoenix"|
|Lookup team attributes based on id|squad 1 goal?|"Integrate application A with app B"|
|Lookup team attributes based on id|squad 1 members?|"Agnes", "Agatha", "Jermaine", "Jack"|
|Create team members based on current team, name, specialty|(Team 1) "Bonita Appelbaum", "lisp"|Member{Name: "Bonita Appelbaum"; Specialty: "lisp"} Add to Team 1 members|
|Display all teams on a page|navigate to home page|show list of teams|
|Click a team|Click|Show team details and list of members|
|Add a member|Form submit|Adds member to the currently selected team|
|Click a member|Click|Shows member details|


## Setup/Installation Requirements

* _In any folder with git installed, run "git clone https://github.com/nathanielimeyer/team-tracker-java.git"._
* _type "cd ./team-tracker-java" and enter_
* _type "gradle run" and enter_
* _In a browser load localhost:4567_

## Known Bugs



## Support and contact details

_nathanielimeyer@gmail.com_

## Technologies Used

Java, JUnit, Gradle, Spark, Velocity

### License

*All rights reserved*

Copyright (c) 2017 **_Nathaniel Meyer_**
