# The Singleton Pattern: The One True Way to Create Objects

## Introduction 
If you're a "Software Engineer/Developer or a student of CSE" you must have heard of this term. 
Ever wondered what is a 'Design Pattern' Or what is the 'Singleton Design Pattern' if not we are here to save you. In this blog we will discuss about the Design Patterns and Singleton Design Pattern.<br>
Imagine you're building a Lego masterpiece without any instructions. It's fun at first, but soon you realize you're missing a piece or two, and things aren't fitting together as smoothly as you'd like. This is where 'Design Patterns' come in, like the missing Lego instructions for software developers. They're like proven recipes for solving common problems in a way that makes your code both efficient and easy to manage. So, whether you're a coder or just curious about how software works, let's explore the world of design patterns and how they make software building a lot easier!

## Design Pattern
Before knowing Design Pattern can you tell me what is a class ? 
A blueprint for object creation, Right ? <br>Great, In the same way you can refer the 'Design Patterns' are also some well tested approach or the best practices that can be used to solve the common problems while designing the applications or system. It is a description or template for how to solve a problem that can be used in many different situations.
<br> But don't be confused that Design Patterns are the solutions for a specific problem rather than It is a description or template for how to solve a problem that can be used in many different situations. 
<br>Design patterns had originally been categorized into 3 sub-classifications based on what kind of problem they solve.<br>
* **Creational Pattern:-** It provides the capability deal with the creation of objects. They are used to abstract the process of object creation, making it more flexible and reusable.
* **Structural Pattern:-** This design pattern is about organizing the different classed and objects to form larger structures and provide new functionality.deal with the composition of objects. They are used to create relationships between objects so that they can work together more effectively
* **Behavioral Pattern:-** It is about identifying common communication patterns between objects. It deals with the interaction between objects. They are used to define how objects communicate and collaborate with each other.

Now you must have this question that :- <br>
* *Why we need Design Patterns ?*
* *Is it necessary to have a design pattern in our projects or code ?*
* *What are the advantages of the design patterns ?* <br>
<p>Hmm, Let's have a scenario :- Suppose you are building a house, I am sure you must have seen some houses or buildings and wished you might build one house for you as well, like that building. There are many ways to build a house, Right ? but some methods are more effective and efficient than others. Of course, you can build a house for you as you want without following anyone else, You could just wing it and hope for best. But if you want to build a sturdy and well-designed house, it's a great idea to use blueprints.<br>
The same is true for software development. Design Patterns are the house or the method using which you can create an effective, efficient and reusable software. You don't have to use design patterns, but they can help you to write code that is more readable, maintainable, and extensible.</p>

## Singleton Design Pattern 
The singleton design pattern is a one of the most use design pattern software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to co-ordinate the actions across the system.<br>Sounds too technical is it?, Imagine you are living in a PG or a hostel and for the whole PG there is only one washing machine is there. 
So now everyone has to use that washing machine only for washing their cloth.<br> Now assume we are developing a Java Application to a school. Therefore, A School can have only one principal. As a result, a singleton class is used to represent a principal. These are the examples of 'Singleton Design Pattern'.
<br> In other words it is used to create a class that can have only one instance that can be accessed globally. Singleton is classified as a Creational Design Pattern.
* **Note:-** If you're a Java developer you'll get only one instance per JVM which means only one singleton object can be made, per container.

### Use cases for the Singleton Design Pattern 
Some of the most common use cases are :-<br>
* **For database connection:-** When you want to ensure that you have only one connection to a database throughout your application, you can use a Singleton to manage the database connection object.
* **For a logging object:-** A Singleton can be used to create a single logger instance that logs messages throughout your application. This ensures that log messages are written to a single log file or destination.
*  **For a thread pool:-** Singleton can be used to create and manage a shared thread pool instance that can be used for parallel processing tasks.
*  **For a global configuration object:-** When you need to manage configuration settings for your application and ensure that there's only one source of configuration data, you can implement a Singleton for configuration management.
*  **User Sessions:-** In web applications, you might want to maintain user session information in a central place. A Singleton can help manage user sessions.
* **Caching:-** If you have a caching mechanism in your application and want to ensure that there's only one cache manager, you can implement the cache manager as a Singleton.
* **Application State:-** To manage global application state or settings, such as user preferences, theme selection, or language settings.

### Pros and Cons of Singleton Design Pattern 
* **Pros :-** Single instance, Global point of Access, Lazy Instantiation, Thread safety etc. Since an object is not produced for each request, memory is saved. Just one instance is used again and again.

* **Cons:-** Testability, Tight Coupling, Hard to subclass, Concurrency Challenges etc.
**Note:-** We will discuss these pros and cons in detail in upcoming blogs.

### How to implement Singleton Design Pattern ?
<p>Now I believe you have a better understanding about the Singleton Design Pattern,Now here is a common way of implementing the Singleton Design Pattern in JAVA :- </p>

public class Animal {

    private static Animal instance;

    private Animal() {}

    public static synchronized Animal getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
<br>
**Here is the breakdown of the code:-**
* The constructor is private, so it cannot be called from outside the class.
* The getInstance() method is synchronized, so it prevents multiple threads from accessing the instance variable at the same time.
* The instance variable is initialized to null.
* The getInstance() method first checks if the instance variable is null. If it is, then a new instance of the Animal class is created and assigned to the instance variable. Otherwise, the existing instance of the Animal class is returned.

### Final Takeway
The singleton design pattern is a creational pattern that ensures that a class has only one instance, and provides a global point of access to it. The singleton pattern can be a good choice when you need to ensure that there is only one instance of a class, such as when the class represents a shared resource.
The singleton pattern can be a useful tool, but it is important to use it carefully. If not used correctly, the singleton pattern can lead to problems such as tight coupling and code that is difficult to test. 




