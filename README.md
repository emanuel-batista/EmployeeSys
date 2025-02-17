# Employee Management System

## Description
This is a simple Java console application for managing employee records. It allows users to register employees, assign unique IDs, and update salaries based on a percentage increase. Made while doing a Java course in Udemy.
Please, visit it in: [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo)

## Features
- Register employees with an ID, name, and salary.
- Prevent duplicate employee IDs.
- Increase an employee's salary by a specified percentage.
- Display a list of all registered employees.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Collections (ArrayList)
- Streams API

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/employee-management.git
   ```
2. Navigate to the project directory:
   ```sh
   cd employee-management
   ```
3. Compile the project:
   ```sh
   javac application/Program.java entities/Employee.java
   ```
4. Run the application:
   ```sh
   java application.Program
   ```

## Project Structure
```
employee-management/
├── src/
│   ├── application/
│   │   ├── Program.java
│   ├── entities/
│   │   ├── Employee.java
└── README.md
```

## Example Usage
```
How many employees will be registered? 2
Employee #1
Id: 1
Name: John Doe
Salary: 3000.00
Employee #2
Id: 2
Name: Jane Smith
Salary: 3500.00

Enter the employee id that will have salary increase: 1
Enter the percentage: 10

List of employees:
1, John Doe, 3300.00
2, Jane Smith, 3500.00
```

## Author
- Emanuel Silva

## License
This project is open-source and available under the MIT License.

