# SonyServiceCenter Admin portal


# 🛠️ Admin Portal - Spring Boot Application

Welcome to the **Admin Portal**, a Spring Boot-based backend application designed for managing customers and products efficiently. This project demonstrates clean architecture with layers such as Controller, Service, Repository, Model, and Aspect-oriented programming.

---

## 📁 Project Structure
com.admin.adminportal 
**Contains AOP advices for logging or monitoring**
├── advice 
  │├── AfterAdvice 
  │└── BeforeAdvice 
**AOP aspects for cross-cutting concerns like caching** 
├── aspect 
  │└── CacheAspect 
**Utility class for cache operations** 
├── cacheUtil 
  │└── CacheUtil 
**REST API controllers**
├── controller 
  │└── AdminController 
**Custom exceptions** 
├── exception
  │└── InvalidBrandNameException 
**Domain models and DTOs** 
├── model 
  │└── Customer 
  │└── Product 
  │└── RequestModel 
  │└── ResponseModel 
  │└── ValidityCheck 
**Spring Data JPA repositories** 
├── repository 
  │└── CustomerRepository 
  │└── ProductRepository 
**Business logic layer**
├── service 
  │└── AdminService 
  │└── AdminServiceImpl

---

## 🔧 Features

- 📦 **Customer & Product Management**
- 🧠 **AOP for Caching and Logging**
- ✅ **Validation Handling**
- 🔁 **Custom Exception Handling**
- 🔍 **Modular and Scalable Architecture**

---

## 🧪 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- AOP (Aspect-Oriented Programming)
- Hibernate
- Maven

---
Built with ❤️ by 
# Rohit Choudhary

