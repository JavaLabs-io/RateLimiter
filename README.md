# API Rate Limiter

A Java simulation of API rate limiting that tracks user requests and blocks users after they exceed a predefined limit.

---

## How It Works

Each incoming request is associated with a user.

- If the user has not reached the request limit, the request is allowed.
- If the user has already reached the limit, the request is blocked.
- Request counts are tracked separately for each user.

---

## Features

- Tracks requests per user
- Enforces a maximum request limit
- Blocks requests that exceed the limit
- Displays request statistics
- Console-based simulation

---

## Example Output

<p align="center">
  <img src="RateLimiter.png" alt="Rate Limiter Output" width="700">
</p>

---

## Testing

This project uses **JUnit 5** and **Maven** for unit testing.

### Covered Test Cases

- Allows a new user's first request
- Allows requests up to the configured limit
- Blocks requests after exceeding the limit
- Maintains independent request counts for different users

---

## Concepts Used

- Java Collections
- JUnit 5
- Unit Testing
- Maven
- HashMap
- Object-Oriented Programming

---

## Why I Built This

Rate limiting is a common technique used by APIs and web services to control traffic and prevent abuse.

This project was built to explore how backend systems enforce request limits using in-memory data structures. It demonstrates per-user request tracking, simple business logic, and unit testing with JUnit 5.

---

## Run Locally

1. Clone the repository:

```bash
git clone https://github.com/JavaLabs-io/RateLimiter.git

```

2. Navigate to the project directory:

```bash
cd RateLimiter
```

3. Run the unit tests:

```bash
mvn test
```

4. Run the application by opening `RateLimiter.java` in your IDE (such as VS Code, Eclipse, or IntelliJ IDEA) and executing the `main()` method.