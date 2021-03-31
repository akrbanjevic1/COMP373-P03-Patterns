# COMP373-P03-Patterns
A repo for Project 3 of Dr. Zewdie's COMP373 class

For this project, we were tasked with studying and implementing the following patterns:

Bridge
Observer
Visitor

For each of these patterns, our group worked together to think of specific scenarios where each of these patterns would be best leveraged.

Bridge:
-For this project, 2 of our patterns relate to a "Car dealership" context, and Bridge happened to be a pattern that we decided to leverage for this context. With the bridge pattern, we assumed that our software was running at a large dealership that carried both economy class vehicles and luxury/premium class vehicles. At first, we drew up a sketch that demonstrated how we originally would have built this software. 
![image](https://user-images.githubusercontent.com/44167073/113216958-bcebd100-9242-11eb-9c57-252b6ff77548.png)

-Then we had to think about how we could do this more efficiently, and we realized that the bridge pattern would work really well for our situation. Since we envisioned our program telling the user what type of vehicle (Sedan or SUV) a specific car was along with it's price class (economy or premium), we decided to map out our project in this manner. 
![image](https://user-images.githubusercontent.com/44167073/113217066-f3c1e700-9242-11eb-89e8-673deab0a253.png)

With the previous design, if a change needed to be made to the structure of the code (for example, adding an "exotic" price class), then we would have had to change multiple classes; potentially exposing our software to an increase in bugs/issues. 

Observer:
-For our car dealership context, we envisioned having a state of the art bodyshop that would autonomously bring in vehicles for service and checkups. While we had to simplify this theory in order to fit the scope of this class, we still had to spend time thinking about how we wanted this to look.
-As it stands, our bodyshop would need to have the ability to keep track of current vehicles being worked on, and it would need to have a way of letting vehicles currently waiting the status of the shop. If the shop has reached capacity, our system should be able to let them know that the bodyshop has reached capacity. If a vehicle has been removed from the shop, our system should be able to update the vehicles that are waiting of this fact.

-This is the sketch we drew to support us when it came to coding:
![image](https://user-images.githubusercontent.com/44167073/113217872-291b0480-9244-11eb-8753-f0047bb4e64e.png)

-We ended up making a "Bodyshop" class that had the ability to store the "concrete implementations" of the Observer class (which, in this case, are Sedans and SUV's). Our program keeps track of the observers in an arrayList, and changes it's status depending on when vehicles are being worked on. The observer pattern allows us to continuously keep the concrete observer implementations aware of what's going on at the bodyshop, and this is a large benefit to using the Observer pattern. 

Visitor:
TODO. 
