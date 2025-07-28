# Step 1: Software Analysiss

We will cover:
- The application's objective
- System actors (roles)
- Use cases
- Concrete scenarios (User flow)
- Functional and non-functional requirements

---

## 🎯 Application Objective

The application enables users (individuals or legal entities) to apply for **green loans**, and supports:
- ESG score and financial eligibility evaluation
- Human approval via a **review system**
- Optionally publishing approved projects to a **green investment marketplace** for co-financing/investment

---

## 👥 Main Actors

| Actor         | Description                                                                 |
|---------------|-----------------------------------------------------------------------------|
| Client        | Individual or company applying for a loan                                   |
| Reviewer      | Member of the review team who votes on applications                         |
| Admin         | User with full permissions (system and user management)                     |
| Investor (opt)| Can view green projects and optionally contribute financially               |
| System        | Automatic logic calculating ESG + financial score                           |

---

## 📌 Use Cases (Detailed)

### 👤 Client
- Register an account
- Log in
- Select user type: Individual / Company
- Select funding type: Loan / Leasing / Investment
- Fill out dynamic loan application form
- Receive ESG score + financial eligibility score
- Submit application for review
- Receive decision (approved/rejected)
- Optionally publish project to ESG marketplace
- View history of applications and scores

### 🧑‍⚖️ Reviewer
- View pending loan applications
- Analyze application details and ESG score
- Vote (approve/reject) and add comments
- See votes from other reviewers
- Confirm final decision when majority is reached

### 🛠️ Admin
- Manage users and permissions
- View all applications
- Intervene in voting system if needed
- Manually adjust scores (if applicable)

### 💼 Investor (Optional)
- View approved green projects
- Filter by ESG category, score, amount, etc.
- Contribute financially (simulated or real)

---

## 🚶‍♀️ Example Scenario – User Flow (Individual)

1. Ana Popescu registers an account on the platform
2. Selects **Individual** – Electric car leasing
3. Fills out the form: electric car, 85,000 RON, 4-year term
4. Opts to publish the project to the ESG Marketplace
5. The system calculates: ESG Score = 78, Debt ratio = 28%
6. The request is sent to 5 reviewers  
   (if the amount is under 20,000 RON – only 1 reviewer is needed, above that more reviewers are required)
7. 4 out of 5 reviewers approve – the application is approved
8. Project is published in the **Approved Green Projects** section
9. Ana receives a notification with the contract offer and is asked to visit a physical location  
   Later, after signing the contract, she can access her documents in the app.

---

## ✅ Functional Requirements

| #   | Requirement                                                     |
|-----|------------------------------------------------------------------|
| F1  | Users can register and authenticate                             |
| F2  | Forms adapt based on user type                                  |
| F3  | Users can submit loan/leasing/investment applications           |
| F4  | System automatically calculates ESG and financial score         |
| F5  | Applications are sent to 3–5 reviewers                          |
| F6  | Reviewers can vote and leave comments                           |
| F7  | Projects can be listed on ESG marketplace                       |
| F8  | Users can view application history, decisions, and scores       |

---

## 🛡️ Non-Functional Requirements

| #   | Requirement                                                     |
|-----|------------------------------------------------------------------|
| NF1 | Security: JWT-based authentication                              |
| NF2 | Performance: scoring should complete in under 2 seconds         |
| NF3 | Easily extendable with additional ESG / AI algorithms           |
| NF4 | REST API documented with Swagger                                |
| NF5 | Logging and audit trails for reviewer decisions                 |
