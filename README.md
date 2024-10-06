Training Center Registry - Spring Boot Project

This is a Spring Boot application designed to manage the registry of government-funded training centers. The application provides two REST APIs:

POST API: To create and save a new training center.

GET API: To fetch a list of all saved training centers.


Features

Create a training center with fields like center name, code, address, student capacity, courses offered, and contact details.

Fetch all saved training centers.

Field validation for name, center code, email, phone number, and more.

Server-side timestamp generation for the createdOn field.


Prerequisites

Ensure that the following software is installed on your system before running this project:

1. Java Development Kit (JDK) - version 17 or above.

Download JDK



2. Maven - A build tool for managing dependencies and running the project.

Download Maven



3. IntelliJ IDEA or any other IDE that supports Spring Boot.

Download IntelliJ IDEA




How to Run the Project

1. Extract the ZIP File:

Unzip the folder containing the project to a directory of your choice.



2. Open the Project in IntelliJ (or your preferred IDE):

Open IntelliJ IDEA and select File > Open.

Navigate to the unzipped folder and select it. IntelliJ will load the project.



3. Build the Project:

If using IntelliJ, the project might automatically detect the pom.xml file and load the dependencies.

If not, manually reload Maven by opening the Maven window (View > Tool Windows > Maven) and selecting Reload.



4. Run the Project:

Once everything is set up, locate the main class (TrainingCenterRegistryApplication.java) in the src/main/java/com/example/training_center_registry/ folder.

Right-click on the file and select Run.


Alternatively, run the following command from the terminal at the root of the project:

mvn spring-boot:run


5. Access the APIs:

The application will start at http://localhost:8080.

You can interact with the API using tools like Postman or cURL.


POST API (Create a New Training Center)

URL: http://localhost:8080/api/training-centers

Method: POST

Request Body (JSON):

{
  "centerName": "Example Center",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "Sample City",
    "state": "Sample State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course 1", "Course 2"],
  "contactEmail": "center@example.com",
  "contactPhone": "9876543210"
}


GET API (Fetch All Training Centers)

URL: http://localhost:8080/api/training-centers

Method: GET

Response Body (JSON):

[
  {
    "id": 1,
    "centerName": "Example Center",
    "centerCode": "ABC123456789",
    "address": {
      "detailedAddress": "123 Main St",
      "city": "Sample City",
      "state": "Sample State",
      "pincode": "123456"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Course 1", "Course 2"],
    "createdOn": 1696483200,
    "contactEmail": "center@example.com",
    "contactPhone": "9876543210"
  }
]




Troubleshooting

Dependencies not downloading: Ensure that Maven is correctly configured and that the IDE is pointing to the correct Maven installation.

Port already in use: If 8080 is already in use, you can change the port by modifying the application.properties file located in src/main/resources/. Add the following:

server.port=8081
