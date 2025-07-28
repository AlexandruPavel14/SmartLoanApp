# Step 2: System Software Design

## 📘 Entity Relationship Design (ERD)

### 🔹 Entity 1: User
- `IdUser`
- `Username`
- `FirstName`
- `LastName`
- `DateOfBirth`
- `Email`
- `Password`
- `AccountCreatedTime` – when the account was created
- `CNP`
- `IdRole` – role type
- `PhoneNumber`
- `IdCountry` – country and phone number format
- `IdPersonType`

### 🔹 Entity 2: Continents
- `IdContinent`
- `ContinentName`

### 🔹 Entity 3: Countries
- `IdCountry`
- `CountryName`
- `IdContinent`
- `IdPhoneNumberFormat`
- `IdCurrency`

### 🔹 Entity 4: County (Region)
- `IdCounty`
- `CountyName`

### 🔹 Linking Table 5: Country_City
- `IdCountryCity`
- `IdCity`
- `IdCounty`
- `IdCountry`

### 🔹 Entity 6: City
- `IdCity`
- `CityName`

### 🔹 Entity 7: PhoneNumberFormat
- `IdPhoneNumberFormat`
- `CountryCode`

### 🔹 Entity 8: Role
- `IdRole`
- `RoleName`

### 🔹 Entity 9: IncomeBracket
- `IdIncomeBracket`
- `IncomeOverview` – e.g. Sub 100, 100-200, Over 1000

### 🔹 Entity 10: Currency
- `IdCurrency`
- `CurrencyCode` – RON, EUR, USD
- `CurrencySymbol` – lei, euro, dollars, etc.

### 🔹 Entity 11: CurrentIncome
- `IdCurrentIncome`
- `IdUser`
- `IdIncomeBracket`
- `IdCurrency`
- `ExactAmount`
- `RecordedAt`

### 🔹 Entity 12: PastIncome
- Same structure as `CurrentIncome`

### 🔹 Entity 13: Bank
- `IdBank`
- `BankName`

### 🔹 Entity 14: UserBankAccount
- `IdUserBank`
- `IdUser`
- `IBAN`
- `IdBank`
- `IdCurrency`
- `IsPreferred` – for selecting preferred bank account

_Model allows multiple bank accounts per user, with one marked as preferred for loan transfers._

### 🔹 Entity 15: PersonType
- `IdPersonType`
- `TypeLabel`

### 🔹 Entity 16: Company
- `IdCompany`
- `CompanyName` – without legal prefix
- `IdLegalPrefix`
- `IdLegalType`
- `RegistrationCode` – CUI
- `DunsCode` – optional
- `FiscalAddress`
- `CountryId`
- `IsActive`

### 🔹 Entity 17: UserCompany / UserCompanyHistory
- `IdUserCompany`
- `IdUser`
- `IdCompany`
- `IdRoleInCompany`
- `DeclaredAt`
- `IsCurrent`

### 🔹 Entity 18: RoleInCompany
- `IdRoleInCompany`
- `RoleName`
- `Description`

### 🔹 Entity 19: CompanyLegalPrefix
- `IdLegalPrefix`
- `Prefix` – SC, SCA

### 🔹 Entity 20: CompanyLegalType
- `IdLegalType`
- `TypeLabel` – SRL, SA, NGO

### 🔹 Entity 21: GreenLoanApplication
- `IdLoanApplication`
- `IdUser`
- `IdCompany` (nullable)
- `LoanTypeId`
- `IdPersonType`
- `RequestedAmount`
- `IdCurrency`
- `ProjectTitle`
- `ProjectDescription`
- `ProjectTypeId`
- `ESGScore`
- `IdStatus`
- `PreferredBankAccount`
- `IdPreferredReviewBank` – preferred reviewer bank
- `IsPublishedInMarketplace`
- `SubmittedAt`

### 🔹 Entity 22: LoanType
- `IdLoanType`
- `LoanName`
- `Description`

### 🔹 Entity 23: ProjectType
- `IdProjectType`
- `Name`

### 🔹 Entity 24: LoanApplicationStatus
- `IdStatus`
- `StatusLabel`

### 🔹 Entity 25: MarketplaceListing
- `IdMarketplace`
- `IdLoanApplication`
- `DatePublished`
- `ApprovedBy`
- `IsActive`

### 🔹 Entity 26: LoanReview
- `IdReview`
- `IdLoanApplication`
- `IdReviewer`
- `ESGScore`
- `Comment`
- `ReviewedAt`

### 🔹 Entity 27: LoanMessageThread
- `IdThread`
- `IdLoanApplication`
- `IsResolved`
- `CreatedAt`

### 🔹 Entity 28: LoanMessage
- `IdMessage`
- `IdThread`
- `SenderId`
- `Content`
- `SentAt`

### 🔹 Entity 29: LoanRejectionReason
- `IdReason`
- `IdLoanApplication`
- `ReasonTitle`
- `Description`
- `CreatedAt`

### 🔹 Entity 30: LoanApplicationAttachment
- `IdAttachment`
- `IdLoanApplication`
- `FileName`
- `FileType`
- `UploadedAt`

### 🔹 Entity 31: Notifications
- `IdNotification`
- `IdUser`
- `Message`
- `IsRead`
- `CreatedAt`

### 🔹 Entity 32: ESG Public Ratings
- `IdRating`
- `IdCompany`
- `ESGScore`
- `PublishedAt`

### 🔹 Entity 33: LoanApplicationStatusHistory
- `IdHistory`
- `IdLoanApplication`
- `IdStatus`
- `ChangedBy`
- `ChangedAt`
- `Note`

### 🔹 Entity 34: AttachmentType
- `IdAttachmentType`
- `TypeLabel`
- `Description`

### 🔹 Entity 35: InvestmentCategory
- `IdCategory`
- `Label`
- `Description`

### 🔹 Entity 36: AuditLog
- `IdAudit`
- `EntityName`
- `FieldChanged`
- `OldValue`
- `NewValue`
- `ChangedBy`
- `ChangedAt`

### 🔹 Entity 37: UserActivityLog
- `IdLog`
- `IdUser`
- `ActionLabel`
- `Details`
- `CreatedAt`

### 🔹 Entity 38: CommonBasePath
- `IdCommonBasePath`
- `BasePath`
- `Description`

### 🔹 Entity 39: SpecificBasePath
- `IdSpecificBasePath`
- `BasePath`
- `Description`

### 🔹 Entity 41: ResourcePath
- `IdResourcePath`
- `IdCommonBasePath`
- `IdSpecificBasePath`
- `FullPath`
- `FileName`
- `ResourceOwnerId`
- `IdResourceType`
- `IdFileExtension`
- `CreatedAt`

### 🔹 Entity 42: ResourceType
- `IdResourceType`
- `TypeLabel`
- `Description`

### 🔹 Entity 43: FileExtension
- `IdFileExtension`
- `Extension`
- `MimeType`
- `IdResourceType`

### 🔹 Entity 44: Entitlements
- `IdEntitlement`
- `ActionName`

### 🔹 Entity 45: NotificationTypes
- `IdNotification`
- `Name`

---

## 📏 Naming Conventions

### 1. Table Naming: Singular or Plural?
✅ **Plural (recommended)**  
Example: `users`, `companies`  
- Feels natural in queries: `SELECT * FROM users`
- Common convention in SQL modeling

### 2. ID Columns: `iduser` vs `user_id`?
✅ **Use `snake_case` with entity prefix**  
Example: `user_id`, `loan_id`, `company_id`  
- Improves readability
- Highlights ownership of the field
- Follows PostgreSQL and SQL conventions

---

## 🚧 Status

**WIP – Work in Progress**  
The schema and design are actively evolving. Some changes and refinements will follow during **Step3-Application-implementation**
