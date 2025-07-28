# Step 3: Application Implementation – Overview

This document provides an overview of how the three main components of the **SmartLoanApp** application are built and interconnected:

---

## 1. Backend (SmartLoanAppAPI)

- **Technology:** Java 21, Spring Boot
- **Role:** Exposes a REST API that handles business logic, processes loan requests, and ensures secure interactions.
- **Structure:** Follows the typical Spring MVC architecture (Controller, Service, Repository, Model, DTO, Validator, Util).
- **Interaction:** Receives HTTP requests from the frontend and communicates with the database for CRUD operations.

---

## 2. Database (SmartLoanAppDB)

- **Technology:** SQLite, Python
- **Role:** Provides a fast backend for prototyping, data analysis, and CSV report generation.
- **Structure:** Python scripts for populating, analyzing, and exporting data; the main file is the SQLite database.
- **Interaction:** Can be accessed directly by the backend or via scripts for administration and reporting tasks.

---

## 3. Frontend (SmartLoanAppClient)

- **Technology:** ReactJS
- **Role:** Provides the graphical interface for users (applicants, reviewers, administrators).
- **Structure:** React components organized by functionality (authentication, loan applications, marketplace, etc).
- **Interaction:** Sends requests to the backend via HTTP (REST API) and displays the received data.

---

## Data Flow

1. **The user** interacts with the React frontend.
2. The frontend sends requests to the Spring Boot backend.
3. The backend processes the requests, validates data, and interacts with the database.
4. For analysis or export operations, Python scripts can access the database directly and generate reports.

---

> This file provides technical and architectural context for the application implementation, without duplicating installation or running instructions already present in the main [README.md](../README.md)