# Student Management System

## Language and Framework
![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description
The Student Management System is designed to interact with different entities and manage relationships between them efficiently. This system allows you to manage student information, addresses, books, courses, laptops, and their associations.

## Models

### Address Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each address.
  - `landmark (String)`: Landmark of the address.
  - `zipcode (String)`: ZIP code of the address.
  - `district (String)`: District of the address.
  - `state (String)`: State of the address.
  - `country (String)`: Country of the address.

### Book Entity
- **Attributes:**
  - `ID (Integer)`: Unique identifier for each book.
  - `title (String)`: Title of the book.
  - `author (String)`: Author of the book.
  - `description (String)`: Description of the book.
  - `price (String)`: Price of the book.
  - `student (Student)`: Student associated with the book.

### Course Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each course.
  - `title (String)`: Title of the course.
  - `description (String)`: Description of the course.
  - `duration (String)`: Duration of the course.
  - `studentSet (Set<Student>)`: Set of students enrolled in the course.

### Laptop Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each laptop.
  - `name (String)`: Name of the laptop.
  - `brand (String)`: Brand of the laptop.
  - `price (Integer)`: Price of the laptop.
  - `student (Student)`: Student associated with the laptop.

### Student Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each student.
  - `name (String)`: Name of the student.
  - `age (String)`: Age of the student.
  - `phoneNumber (String)`: Phone number of the student.
  - `branch (String)`: Branch of the student.
  - `department (String)`: Department of the student.
  - `address (Address)`: Address associated with the student.

## Repositories

### IAddressRepo
Interface extending JpaRepository for the Address entity.

### IBookRepo
Interface extending JpaRepository for the Book entity.

### ICourseRepo
Interface extending JpaRepository for the Course entity.

### ILaptopRepo
Interface extending JpaRepository for the Laptop entity.

### IStudentRepo
Interface extending JpaRepository for the Student entity.

## Controllers

### AddressController
- **Endpoints:**
  - `POST /address`: Add a new address by providing address details in the request body.
  - `PUT /address/{id}/landmark`: Update the landmark of an address by its ID.
  - `GET /addresses`: Retrieve a list of all addresses.
  - `DELETE /address/id/{id}`: Delete an address by its ID.

### BookController
- **Endpoints:**
  - `POST /book`: Add a new book by providing book details in the request body.
  - `PUT /book/id/{bookId}/student`: Update the student associated with a book by book ID.
  - `PUT /book/id/{bookId}/price/{newPrice}`: Update the price of a book by book ID.
  - `GET /books`: Retrieve a list of all books.
  - `DELETE /book/id/{id}`: Delete a book by its ID.

### CourseController
- **Endpoints:**
  - `POST /course`: Add a new course by providing course details in the request body.
  - `PUT /course/id/{courseId}`: Update course details by providing the course ID.
  - `PUT /course/id/{courseId}/students`: Add students to a course by providing course ID and student IDs.
  - `GET /courses`: Retrieve a list of all courses.
  - `DELETE /course/id/{id}`: Delete a course by its ID.

### LaptopController
- **Endpoints:**
  - `POST /laptop`: Add a new laptop by providing laptop details in the request body.
  - `PUT /laptop/id/{laptopId}/student`: Link a laptop to a student by providing laptop ID and student ID.
  - `GET /laptops`: Retrieve a list of all laptops.
  - `DELETE /laptop/id/{id}`: Delete a laptop by its ID.

### StudentController
- **Endpoints:**
  - `POST /student`: Add a new student by providing student details in the request body.
  - `PUT /student/id/{studentId}/address`: Link a student to an address by providing student ID and address ID.
  - `GET /students`: Retrieve a list of all students.
  - `DELETE /student/id/{id}`: Delete a student by its ID.

## Services

### AddressServices
Manages address-related operations, including adding, updating, retrieving, and deleting addresses.

### BookServices
Manages book-related operations, including adding, updating, retrieving, and deleting books, and updating book prices and associated students.

### CourseServices
Manages course-related operations, including adding, retrieving, and deleting courses, and adding students to courses.

### LaptopServices
Manages laptop-related operations, including adding, retrieving, linking laptops to students, and deleting laptops.

### StudentServices
Manages student-related operations, including adding, retrieving, linking students to addresses, and deleting students.


## Database Schema (MySQL)
The system uses a MySQL database. Below are the database schemas for the "Address," "Book," "Course," "Laptop," and "Student" entities:

  ## Prerequisites
Make sure you have the following prerequisites installed on your system:

- Java Development Kit (JDK)
- Maven
- all the dependencies from poem.xml or active internet connection

## Installation
1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Abdul12527/student-Managemen.git
   
2. Navigate to the project directory

    ```bash
    cd studentManagemen

  
## Usage
You can use the NewMonster Jobs application by making HTTP requests to the provided API endpoints using your preferred API testing tool or framework.

## Swagger UI
For a more interactive experience and to explore the available APIs, you can use the Swagger UI at http://localhost:8080/swagger-ui/index.html when running the application on your local system.



