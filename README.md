# FibaBankaBootcampProject!

Technologies used in this project:<br />

JDK 17<br />
Java Spring Boot<br />
IntelliJ IDEA<br />
Gradle<br />
  Dependencies:<br />
    - Swagger for tests<br />
    - Spring Boot Web<br />
    - Spring Boot Jpa<br />
    - Lombok for practical annotations<br />
    - Mapstruct for mapping<br />
    - Postgresql<br />
    - Spring Boot Validation for basic validations<br />
    - Spring Open Feign to communicate among microservices<br />
    
For any questions, feel free to contact: miteorhan@gmail.com   <br /> 

Microservices and Ports:<br />
  - inventory: 8081
  - shopping: 8082
  - commerce: 8080<br />
  
Endpoints:<br />
8081:<br />
  /inventory/categories<br />
  /inventory/products/{categoryId}<br />
  /inventory/product/{id}<br />
8082:  <br />
  /shopping/cart/create<br />
  /shopping/cart/add<br />
  /shopping/cart/{cartId}/remove/{productId}<br />
  /shopping/checkout/{cartIId}<br />
8080:  <br />
  /commerce/inventory/categories<br />
  /commerce/inventory/products/{categoryId}<br />
  /commerce/inventory/product/{id}<br />
  /commerce/shopping/cart/create<br />
  /commerce/shopping/cart/add<br />
  /commerce/shopping/cart/{cartId}/remove/{productId}<br />
  /commerce/shopping/checkout/{cartIId}<br />
<br />
To test the project via your own internet browser, you can use these Swagger links:<br />
http://localhost:8081/swagger-ui/index.html#/<br />
http://localhost:8082/swagger-ui/index.html#/<br />
http://localhost:8080/swagger-ui/index.html#/<br />

<br />
Working proper screenshots:<br />

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

<br />
This closed through Open-Closed Principle. Thus, Exception packages, graphql, redis, elastic-search like technlogies can be added easily to upgrade.







