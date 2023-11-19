# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

**SOLID principles of OOP (Object Oriented Programming)**
Robert Martin

1. **S**ingle Responsibility;  a class should only have one responsibility. Furthermore, it should only have one reason to change. Classes should be small How does this principle help us to build better software?
   * **Testing** – A class with one responsibility will have far fewer test cases.
   * **Lower coupling** - Less functionality in a single class will have fewer dependencies.
   * **Organization** – Smaller, well-organized classes are easier to search than monolithic ones.
  
2. **O**pen/Closed; classes should be open for extension but closed for modification
   * classes should be open for extension
   * classes should be closed for modification
   * extend behaviour without modifying
   * use private variables with getter and setters 
   * use abstract classes
3. **L**iskov Substitution; if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program
   * Babara Liskov, 1998
   * Objects in a program would be replaceable with instances of their subtypes without altering the correctness of the program
   * _een vierkant is een rechthoek maar een rechthoek is niet (altijd) een vierkant_
4. **I**nterface Segregation; larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them
   * make fine-grained interfaces
   * many client specific interfaces are better than one "general purpose" interface
   * less dependency between components
5. **D**ependency Inversion; the principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions
   * abstractions should not depend on details
   * details should not depend on abstractions
   * higher and lower level objects depend on de the same abstraction interaction

