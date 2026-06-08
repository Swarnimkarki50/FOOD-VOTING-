# FoodVoting

A Spring Boot web application for voting on food items. Users can browse dishes, cast ratings, and view ranked results.

## Features

- Browse food items with images and descriptions
- Vote with 1-5 star ratings and optional comments
- View ranked results with average ratings
- Add and delete food items
- REST API for programmatic access
- In-memory H2 database (zero setup, auto-seeded with 5 dishes)

## Tech Stack

- Java 21, Spring Boot 3.4, Gradle
- Spring MVC (Thymeleaf) + REST controllers
- Spring Data JPA (H2 database)
- Lombok, Jakarta Validation
- JUnit 5 + Mockito tests

## Quick Start

```bash
./gradlew bootRun
```

Open `http://localhost:8080`

H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:foodvoting`)

## API Endpoints

| Method | Path | Description |
|--------|------|-------------|
| GET | `/api/food-items` | List all food items |
| GET | `/api/food-items/{id}` | Get food item by ID |
| POST | `/api/food-items` | Create food item |
| DELETE | `/api/food-items/{id}` | Delete food item |
| POST | `/api/votes` | Cast a vote |
| GET | `/api/votes/results` | Get ranked results |
| GET | `/api/votes/food-item/{id}` | Get votes for a food item |

## Build & Test

```bash
./gradlew build      # build + test
./gradlew test       # run tests only
```
