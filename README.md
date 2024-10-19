# Clean Architecture in Kotlin: Room Mapping

## Project Overview

This repository contains a modified implementation of the penultimate lesson from my Kotlin Udemy course, where I applied **Clean Architecture** principles to enhance my understanding of this design pattern in Android applications.

## Clean Architecture Principles

In this project, I structured the application into three distinct layers, each serving a specific purpose:

### 1. Data Layer
- Responsible for data persistence and retrieval.
- Utilizes Room for local database management and abstracts data sources.
- Contains data models and their corresponding Room entities.

### 2. Domain Layer
- Encapsulates the business logic of the application.
- Defines use cases that represent the core operations the application can perform.
- Implements domain models that are decoupled from data models to maintain independence.

### 3. Presentation Layer
- Manages user interface components such as activities and fragments.
- Integrates ViewModels to facilitate communication between the UI and the domain layer.

## Key Features Implemented

### 1. Data to Entity Mapping
- Developed a dedicated mapper class to translate between data models and Room entities.
- Ensured seamless integration of data formats while adhering to Clean Architecture principles.

### 2. Room Persistence Library
- Leveraged Room to simplify local data storage and querying.
- Established a clear distinction between data models and Room entities to promote maintainability.

### 3. Repository Pattern
- Implemented the repository pattern to act as an intermediary between the data and domain layers.
- Enhanced separation of concerns and facilitated easier testing through well-defined interfaces.
- 
## Learning Outcomes

By applying Clean Architecture principles to this project, I achieved the following:

- Deepened my understanding of separation of concerns and its importance in software design.
- Gained more experience with Jetpack Compose
- LLearned mapping between data classes and Room entities.
- Enhanced my ability to structure Android applications using Clean Architecture principles.


## Conclusion

This project represents a significant learning milestone in my journey to mastering Kotlin and Android development. By applying Clean Architecture principles, I have built a robust and maintainable application that serves as a solid foundation for future development endeavors. I invite you to explore the repository, review the code, and share your feedback.
