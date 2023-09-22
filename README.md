# Project BankAccount 💼💰

## Introduction 🚀

Welcome to the Project BankAccount repository! Our project offers a robust and versatile API designed to handle financial transactions effortlessly. Whether you're crafting a banking application, a payment gateway, or simply need to manage financial data, our API has you covered.

## Key Features ✨

- **Transaction Creation:** Seamlessly create financial transactions with comprehensive validation.
  
- **Transaction Retrieval:** Fetch transaction details with ease.
  
- **Transaction Verification:** Quickly verify transactions by updating their status to "VERIFIED."

## Technologies We Use 🛠️

- **Spring Boot:** Our API leverages Spring Boot, a powerful and flexible framework for Java application development.
  
- **Java Persistence API (JPA):** JPA ensures seamless integration with your database for effortless data management.
  
- **GitHub:** Collaborate with our vibrant open-source community on GitHub. Contribute, report issues, and stay informed about the latest updates.

## Getting Started 🚀

To run this project locally, follow these simple steps:

1. Clone the repository to your local machine.
   
2. Navigate to the project directory.
   
3. Build and run the application.

4. Access the API at [http://localhost:8080](http://localhost:8080).

## API Endpoints 🌐

### Create Transaction ✍️

- **Endpoint:** `/api/transaction`
- **Method:** POST
- **Description:** Create a new financial transaction with validation requirements.

### Get Transaction 📊

- **Endpoint:** `/api/transactions/{transactionId}`
- **Method:** GET
- **Description:** Retrieve transaction details by providing its unique identifier.

### Verify Transaction 🙌

- **Endpoint:** `/api/transactions/{transactionId}/verify`
- **Method:** PUT
- **Description:** Update the status of a transaction to "VERIFIED."

## Usage 💡

Our API is designed to be user-friendly and developer-friendly. Here's an example of how you can create a new transaction:

```json
{
  "transactionReference": "1234567890AB",
  "accountNo": "987654321",
  "amount": 1000.0000,
  "createdOn": "2023-09-15T10:30:00.000+00:00",
  "accountName": "John Doe",
  "status": "PENDING",
  "iban": "QWERTYUIOPLKJHGFDSAZXCVB"
}
