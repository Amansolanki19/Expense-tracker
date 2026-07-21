# Expense Tracker REST API

A secure and scalable **Expense Tracker REST API** built using **Java, Spring Boot, Spring Security, Spring Data JPA, Hibernate, and MySQL**. The application enables users to manage their personal expenses with features like authentication, password recovery using OTP, expense categorization, and CRUD operations.

---

## 🚀 Features

### User Management

* User Registration
* User Login
* Fetch User Details
* Update User Information
* Delete User

### Password Recovery

* Forgot Password using Email
* 6-digit OTP Generation
* Email-based OTP Verification
* Secure Password Reset
* BCrypt Password Encryption

### Expense Management

* Add Expense
* Update Expense
* Delete Expense
* Get Expense by ID
* Get All Expenses
* Categorize Expenses
* Track Expense Status

### Security

* Spring Security
* Password Encryption using BCrypt
* Email OTP Verification
* Validation using Jakarta Validation

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* Spring Security
* Hibernate
* MySQL
* Maven
* Lombok
* JavaMailSender
* REST APIs

---

## 📂 Project Structure

```text
src
├── controller
├── service
├── serviceImplementation
├── repository
├── model
├── dto
├── config
├── exception
└── resources
```

---

## ⚙️ Prerequisites

* Java 21+
* Maven
* MySQL Server
* IntelliJ IDEA (Recommended)

---

## 🔧 Installation

### Clone Repository

```bash
git clone https://github.com/your-username/expense-tracker.git
```

```bash
cd expense-tracker
```

---

### Configure Database

Create a MySQL database.

```sql
CREATE DATABASE expense_tracker;
```

Update `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### Configure Email

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password

spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

> **Note:** Use a Gmail **App Password** instead of your normal Gmail password.

---

## ▶️ Run the Project

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main Spring Boot application from IntelliJ IDEA.

---

## 📌 API Endpoints

### User APIs

| Method | Endpoint                                | Description    |
| ------ | --------------------------------------- | -------------- |
| POST   | `/expense/tracker/user/create`          | Register User  |
| POST   | `/expense/tracker/user/forgot-password` | Generate OTP   |
| POST   | `/expense/tracker/user/verify-otp`      | Verify OTP     |
| POST   | `/expense/tracker/user/reset-password`  | Reset Password |
| GET    | `/expense/tracker/user/find/{id}`       | Get User by ID |
| GET    | `/expense/tracker/user/findAll`         | Get All Users  |

---

### Expense APIs

| Method | Endpoint               | Description       |
| ------ | ---------------------- | ----------------- |
| POST   | `/expense/create`      | Create Expense    |
| GET    | `/expense/find/{id}`   | Get Expense by ID |
| GET    | `/expense/findAll`     | Get All Expenses  |
| PUT    | `/expense/update/{id}` | Update Expense    |
| DELETE | `/expense/delete/{id}` | Delete Expense    |

---

## 📧 Password Reset Workflow

```text
User
   │
   ▼
Forgot Password
   │
   ▼
Generate OTP
   │
   ▼
Send OTP via Email
   │
   ▼
Verify OTP
   │
   ▼
Reset Password
   │
   ▼
Login with New Password
```

---

## 🧪 Testing

Use **Postman** to test the REST APIs.

Example:

```http
POST /expense/tracker/user/create
```

```json
{
    "name":"Aman",
    "email":"aman@gmail.com",
    "password":"Password@123"
}
```

---

## 📈 Future Enhancements

* JWT Authentication
* Role-Based Authorization (Admin/User)
* Expense Analytics Dashboard
* Monthly Expense Reports
* Budget Management
* Recurring Expenses
* File Upload for Receipts
* Swagger/OpenAPI Documentation
* Docker Support
* Unit & Integration Testing

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Push to your branch.
5. Open a Pull Request.

---

## 📜 License

This project is intended for learning and portfolio purposes. You are free to modify and use it for educational purposes.

---

## 👨‍💻 Author

**Aman Pratap Solanki**

* Java Backend Developer
* Spring Boot Enthusiast
* Passionate about REST APIs, Backend Development, and Clean Code
