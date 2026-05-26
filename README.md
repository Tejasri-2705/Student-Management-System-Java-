# 🎓 Student Management System (Java + JDBC)

## 📌 Overview

The Student Management System is a console-based Java application designed to manage student records efficiently. It performs CRUD (Create, Read, Update, Delete) operations using JDBC and MySQL, demonstrating backend development concepts and database integration.

---

## 🚀 Features

* ➕ Add new student records
* 📄 View all students
* ✏️ Update existing student details
* ❌ Delete student records
* 🔐 Secure database operations using PreparedStatement
* 🧱 Structured using Object-Oriented Programming principles

---

## 🛠 Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **Concepts Used:** OOP, Collections (ArrayList, HashMap), Exception Handling

---

## 🏗 Project Structure

```
student-management-system/
│
├── Student.java              // Model class
├── StudentService.java       // Business logic & CRUD operations
├── DatabaseConnection.java   // JDBC connection setup
├── Main.java                 // CLI interface (menu-driven)
└── README.md
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

### 2️⃣ Setup MySQL Database

Run the following SQL:

```
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);
```

---

### 3️⃣ Configure Database Connection

Update credentials in `DatabaseConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "your_password";
```

---

### 4️⃣ Compile & Run

```
javac *.java
java Main
```

---

## 🧠 Concepts Demonstrated

* Object-Oriented Programming (Encapsulation, Modularity)
* JDBC for database connectivity
* Use of PreparedStatement to prevent SQL injection
* Collections (ArrayList, HashMap) for data handling
* Layered architecture (Model, Service, UI)

---

## 📸 Sample Output

```
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```

---

## 🚧 Project Status

🟡 Currently in development

* Core CRUD operations implemented
* Enhancements in progress (input validation, improved UI)

---

## 🌱 Future Enhancements

* Add GUI (JavaFX / Swing)
* Implement login/authentication system
* Add search and filter functionality
* Convert to web-based application (Spring Boot)

---

## 👩‍💻 Author

**Tejasri Maradani**

* GitHub: https://github.com/Tejasri-2705
* Email: tejasrimaradani@gmail.com

---

## ⭐ Acknowledgment

This project was built as part of backend development practice to strengthen Java and database integration skills.
