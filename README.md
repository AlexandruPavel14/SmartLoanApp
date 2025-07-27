<img width="1024" height="325" alt="logo2" src="https://github.com/user-attachments/assets/04896e84-ecaf-4020-aa78-6160f923574a" />

# General description

SmartLoanAppAPI is a backend application built with Spring Boot, designed to handle loan requests efficiently and securely. The project provides a scalable foundation for modern financial services, simulating a lightweight digital lending platform.

# Main features

* **User & Company Management** – Register users as individuals or legal entities, associate them with companies, roles, and bank accounts.
* **Loan Applications** – Submit green loan applications with ESG scoring, attach documents, and choose preferred banks.
* **Multi-role Structure** – Support for both individual (private) and corporate loan applications with role tracking across time.
* **Marketplace Integration** – Publish approved loan requests in a public marketplace for investors or banks to review.
* **Advanced ESG Evaluation** – Assign and store ESG scores, project types, and public company ratings.
* **Audit & Activity Logging** – GDPR-compliant logging of actions and changes for transparency and traceability.
* **Notification System** – In-app notifications and message threads between users and reviewers.
* **Attachment & File Path Handling** – Structured resource path model with support for different file types and storage paths.
* **Access Control (Entitlements)** – Fine-grained access control using entitlement definitions.
* **Historical Data Tracking** – Keep track of past income, company history, application status changes, and reviews.
* **Clean Architecture** – Designed to support scalable backend infrastructure and modern financial workflows.
# Project Steps

- [Step 1: Software Analysis](Step1-Software-analysis/Step1.md)
- [Step 2: System Software Design](Step2-System-software-design/Step2.md)
- [Step 3: Application Implementation](Step3-Application-implementation/Step3.md)
- [Step 4: User Guide](Step4-User-Guide-SmartLoanApp/Step4.md)
- [Step 5: SWOT Analysis](Step5-SWOT-Analysis/Step5.md)

# Technologies Used

- Java 21
- Spring Boot 3.5.4
- Maven
- JDK: temurin-21 Eclipse Temurin 21.0.7 - aarch64
- Python
- Sqlite
- ReactJS

# Development Environment

- Operating System: macOS Sequoia Version 15.1
- IDE: IntelliJ IDEA 2025.1.4.1 (Ultimate Edition) with Build #IU-251.27812.49, built on July 24, 20255

# How to run the application

## 1. Clone the repository:
   ```bash
   git clone https://github.com/AlexandruPavel14/SmartLoanApp.git
   cd Step3-Application-implementation/backend/SmartLoanAppAPI
   ```

## 2. For Backend (SmartLoanAppAPI)

### 2.1 Access the backend directory:

   ```bash
   cd backend/SmartLoanAppAPI
   ```

### 2.2 Build the application using Maven:
   ```bash
   ./mvnw clean install
   ```

### 2.3 To start the development server, run:
- Make sure you have Java 21 and Maven installed.
- Navigate to the project directory and run:
   ```bash
   ./mvnw spring-boot:run
   ```
- Once started, the application will be available at:
    ```
    http://localhost:8080
    ```

## 3. For Frontend (SmartLoanAppUI)

### 3.1 Access the frontend directory:

   ```bash
   cd Application-implementation/frontend/smartloanappclient
   ```

### 3.2 Install all dependencies:
   ```bash
   npm install
   # npm run build # Builds the project
   ```

### 3.3 To start the client, run:

```sh
npm run start
```

- Once started, the application will be available at:
    ```
    http://localhost:3000
    ```

## 4. For Database (SmartLoanAppDB)

### 4.1 Access the database directory:

   ```bash
   cd Application-implementation/database/SmartLoanAppDB
   ```