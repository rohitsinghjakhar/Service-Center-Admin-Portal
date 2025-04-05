# SonyServiceCenter Admin portal


# 🛠️ Admin Portal - Spring Boot Application

Welcome to the **Admin Portal**, a Spring Boot-based backend application designed for managing customers and products efficiently. This project demonstrates clean architecture with layers such as Controller, Service, Repository, Model, and Aspect-oriented programming.

---

## 📁 Project Structure
com.admin.adminportal 
├── advice 
# Contains AOP advices for logging or monitoring │ 
  ├── AfterAdvice │ 
  └── BeforeAdvice │ 
├── aspect 
# AOP aspects for cross-cutting concerns like caching │ 
  └── CacheAspect │ 
├── cacheUtil 
# Utility class for cache operations │ 
  └── CacheUtil │ 
├── controller 
# REST API controllers │ 
  └── AdminController │ 
├── exception
# Custom exceptions │ 
  └── InvalidBrandNameException │ 
├── model 
# Domain models and DTOs │ 
  └── Customer │
  └── Product │ 
  └── RequestModel │ 
  └── ResponseModel │ 
  └── ValidityCheck │ 
├── repository 
# Spring Data JPA repositories │ 
  └── CustomerRepository │ 
  └── ProductRepository │ 
├── service 
  # Business logic layer 
  └── AdminService 
  └── AdminServiceImpl


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

