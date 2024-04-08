# Custom Bean Validation in Spring Boot

This is a simple Spring Boot application that demonstrates how to use custom bean validation annotations.

Custom bean validation annotations can be useful for implementing domain-specific validation rules.

## Overview
The application includes a CarController class with a createCar method that validates a Car object using custom bean validation annotations (@CheckCase).

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-custom-bean-validation.git
```
2. Navigate to the project directory:
```bash
  cd spring-custom-bean-validation
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:8081

### Usage
- The application includes a CheckCaseValidator class that validates the case mode of a Car object's licensePlate field.
- It defines a custom annotation @CheckCase to specify the enum class that defines the valid case modes (CaseMode).
- The CarController class handles POST requests to create a new Car object and validates it using the @CheckCase annotation.

### Custom Validation
- The CheckCaseValidator class implements the logic to validate the case mode of the licensePlate field.
- The @CheckCase annotation specifies the enum class CaseMode that defines the valid case modes for the licensePlate field.

### Configuration
- The application uses a MessageSourceConfig class to configure meThe messages.properties file contains validation messages for custom annotations.

### Docker build

1. Create docker image
```bash
docker build -t spring-bean-validation .
```

2. Create container

```bash
docker run -p 8080:8081 <image-id>
```
