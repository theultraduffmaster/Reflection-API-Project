# Reflection-API-Project

###Things I included for my project
Under help is an option to include new software I used this to add JDepend and Metrics to my project. I also added the external Jar of Jdepend to my project. Also Junit 4 needs to be in place to use the Junit test case.

######Metrics
Metrics - http://metrics.sourceforge.net/update

######JDepend
Jdepend - http://andrei.gmxhome.de/eclipse/

######JDepend Jar
http://clarkware.com/software/JDepend.html <- Download from here, I used Jdepend-2.9.1

###How to Run
From within Eclipse run the runner class and it should deploy the App window which has some options for looking at the classed of a default jar at the top of the class. A custom control seperates this from the bottom part where there is an option to choose a jar to work with instead. All the buttons all the top will run the reflection on that class while the bottom buttons will load a 2D array with the info about the jar including className, afferent coupling and efferent coupling and the instability measured.

###Design Choices
I though the best option for this project was to include a program (Jdepend) which could calculate afferent and efferent coupling for me so that I could focus more on getting the instability measured and the code for including a jar off a file system. I also decided to give the user an opton to load the default jar just incase they don't have any on their immediate machines. Also the design choice meant the user didn't have to keep exiting the program to test different classes.

###Whats inside?
In this project are 9 reflection classes based on the default jar I included so that the buttons at the top of the window are designed for those different classes within that jar. There are also the 9 classes from the jar which are being reflected as well as 3 classes used for calculating the instability of the jar and of course the 5 classes which comprise the Swingui including the Runner class to run it

###Github URL
Here is the url to my github for this project -> https://github.com/theultraduffmaster/Reflection-API-Project

###References
Here is links to where I learned about the reflection API

https://www.youtube.com/watch?v=agnblS47F18

As well as these sites for errors encountered

https://docs.oracle.com/en/

http://stackoverflow.com/
