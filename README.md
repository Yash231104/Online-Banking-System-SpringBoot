# 🏦 Banking Application

A secure Banking Management System developed using Java, Spring Boot, Spring Security, JWT Authentication, Hibernate/JPA, and MySQL. The application provides REST APIs for user authentication, account management, balance inquiry, transactions, and fund transfers.

## 🚀 Features

* User Registration and Login
* JWT-Based Authentication and Authorization
* Secure Password Encryption using BCrypt
* Account Creation and Management
* Balance Inquiry
* Deposit and Withdrawal Operations
* Money Transfer Between Accounts
* Transaction History Tracking
* Forgot Password with OTP Verification
* RESTful API Architecture
* MySQL Database Integration

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* JWT Authentication
* Hibernate / JPA
* Maven

### Database

* MySQL

### Tools

* Postman
* Git & GitHub
* Eclipse IDE

## 📂 Project Structure

```text
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
 ├── security/
 ├── dtos/
 ├── exception/
 └── enums/
```

## 🔐 Security Features

* JWT Token Authentication
* Password Encryption using BCrypt
* Stateless Session Management
* Protected Banking APIs
* Role-Based Access Support

## 📌 Available APIs

### Authentication

* POST /api/auth/register
* POST /api/auth/login
* POST /api/auth/forgot-password
* POST /api/auth/verify-otp
* POST /api/auth/reset-password

### Account

* GET /api/account/details
* GET /api/account/balance
* GET /api/account/transactions

### Transactions

* POST /api/transaction/CREDIT
* POST /api/transaction/DEBIT
* POST /api/transaction/transfer

## ⚙️ Setup Instructions

1. Clone the repository

```bash
git clone <repository-url>
```

2. Configure MySQL database in application.properties

3. Build the project

```bash
mvn clean install
```

4. Run the application

```bash
mvn spring-boot:run
```

5. Test APIs using Postman

## 🎯 Learning Outcomes

* Spring Boot REST API Development
* Spring Security Implementation
* JWT Authentication
* Hibernate ORM
* MySQL Database Integration
* Backend Project Architecture
* API Testing with Postman

## 👨‍💻 Author

Yash Sonawane

Aspiring Java Full Stack Developer passionate about building secure and scalable web applications.
