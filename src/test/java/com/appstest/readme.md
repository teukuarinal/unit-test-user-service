# User Registration Example with TDD in Java

This is a simple Java project demonstrating the use of **Test-Driven Development (TDD)** approach to build a basic `UserService` for creating user objects.

## 📁 Project Structure

```
src/
├── com.appstest
│   ├── UserServiceTest.java         # Unit tests using JUnit 5
│
├── com.appstest.model
│   └── User.java                    # User data model
│
├── com.appstest.service
│   ├── UserService.java             # Service interface
│   └── UserServiceImpl.java         # Service implementation
```

## ✅ Features

- Create a new user with `firstName`, `lastName`, `email`, and `password`.
- Generate a unique user ID.
- Validate input (e.g., first and last names must not be empty).
- Unit tests for:
    - Successful user creation
    - Empty first name
    - Empty last name

## 🧪 Tests

The project uses **JUnit 5** for unit testing.

### Sample Test Cases:

- ✅ `testCreateUser_whenUserDetailsProvided_returnsUserObject`  
  Ensures user object is correctly created with valid inputs.

- ❌ `testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException`  
  Verifies the system throws the right exception when first name is missing.

- ❌ `testCreateUser_whenLastNameIsEmpty_throwsIllegalArgumentException`  
  Verifies the system throws the right exception when last name is missing.

## ⚙️ How It Works

### UserService Interface

```java
User createUser(String firstName, String lastName, String email, String password, String repeatPassword);
```

### Implementation: `UserServiceImpl`

- Checks that `firstName` and `lastName` are not empty.
- Returns a new `User` object with a unique ID using `UUID`.

### Model: `User`

A simple POJO with:
- `firstName`
- `lastName`
- `email`
- `id` (generated using `UUID`)

## 🧑‍💻 How to Run the Tests

1. Clone the repository
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA)
3. Run `UserServiceTest` as a JUnit test

## 🧪 TDD Cycle Followed

This project follows the **TDD workflow**:

1. **Write a failing test**
2. **Write just enough code to pass the test**
3. **Refactor the code while keeping the test green**

## 📦 Requirements

- Java 8 or higher
- JUnit 5