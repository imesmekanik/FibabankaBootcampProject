# FibaBankaBootcampProject!

Technologies used in this project:

JDK 17
Java Spring Boot
IntelliJ IDEA
Gradle
  Dependencies:
    - Swagger for tests
    - Spring Boot Web
    - Spring Boot Jpa
    - Lombok for practical annotations
    - Mapstruct for mapping
    - Postgresql
    - Spring Boot Validation for basic validations
    - Spring Open Feign to communicate among microservices
    
For any questions, feel free to contact: miteorhan@gmail.com    

Microservices and Ports:
  - inventory: 8081
  - shopping: 8082
  - commerce: 8080
  
Endpoints:
8081:
  /inventory/categories
  /inventory/products/{categoryId}
  /inventory/product/{id}
8082:  
  /shopping/cart/create
  /shopping/cart/add
  /shopping/cart/{cartId}/remove/{productId}
  /shopping/checkout/{cartIId}
8080:  
  /commerce/inventory/categories
  /commerce/inventory/products/{categoryId}
  /commerce/inventory/product/{id}
  /commerce/shopping/cart/create
  /commerce/shopping/cart/add
  /commerce/shopping/cart/{cartId}/remove/{productId}
  /commerce/shopping/checkout/{cartIId}

To test the project via your own internet browser, you can use these Swagger links:
http://localhost:8081/swagger-ui/index.html#/
http://localhost:8082/swagger-ui/index.html#/
http://localhost:8080/swagger-ui/index.html#/


Working proper screenshots:

![image](https://user-images.githubusercontent.com/107031404/201008110-be8692e1-38e2-43c0-8613-cf645f839d8b.png)


![image](https://user-images.githubusercontent.com/107031404/201008242-81631c99-b4ea-4e7c-932e-f9812d6742fb.png)


![image](https://user-images.githubusercontent.com/107031404/201008296-b8855168-d53b-4653-b40e-b86602b2e042.png)


![image](https://user-images.githubusercontent.com/107031404/201008855-25b791e4-55ba-4e07-ae81-cb56941ab78c.png)


![image](https://user-images.githubusercontent.com/107031404/201009240-58663d91-6130-4227-82ad-b2f1c210c087.png)


![image](https://user-images.githubusercontent.com/107031404/201009322-e850d9f7-b8a2-4e69-ae50-237eccf1912e.png)


![image](https://user-images.githubusercontent.com/107031404/201009633-0075a726-de57-4789-a6da-f48d4f56857a.png)


![image](https://user-images.githubusercontent.com/107031404/201009750-bd18a4f8-4b51-43ff-96e5-959a20f2e790.png)


![image](https://user-images.githubusercontent.com/107031404/201009855-2771220b-6562-492a-b4d4-fcb7ea40b1d6.png)


![image](https://user-images.githubusercontent.com/107031404/201010070-091309f6-6da5-4f15-9e8b-581ca5173e54.png)


This closed through Open-Closed Principle. Thus, Exception packages, graphql, redis, elastic-search like technlogies can be added easily to upgrade.







