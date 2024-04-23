# tip
The path where the table creation script is stored
* /resources/static/mobile_food_facility_permit.sql

# design
This is a Java system that only provides web APIs. It is implemented by Springboot, Gradle, jdk17, and Mybatis.  San Francisco's food truck open dataset is located in the RDS of Amazon Cloud. Currently. three API interfaces are implemented, as follows:<br>

* Search for food trucks based on food names

  path: /foodtruck/list/{foodItem}
  
  parameter: "foodItem" refers to the name of the food
  
  return: list of food trucks

* Search for nearby food trucks

  path: /foodtruck/nearlist/{longitude}/{latitude}/{distance}
  
  parameter: "distance" refers to the nearby range, in kilometers
  
  return: list of food trucks
   
* Query details based on truck name

  path: /foodtruck/details/{applicant}
  
  parameter: "applicant" refers to the name of the truck
  
  return: food truck details

# test
Due to the simple functional scenarios, there were no test cases written or stress tests conducted, but different parameter scenarios were tested in the development and testing environments respectively


# deploy
After passing the test, package the project as a jar and upload it to Amazon Cloud for deployment

# late extend
For the second iteration in the later stage, the following supplements can be made

* Add a gateway and perform permission verification on the API

* Add API online documentation

* For the security of core configuration parameters, add a configuration center, such as database connection parameters, which must be placed in the configuration center to avoid leakage

