# UrlHitCounter

## Description

This project besically work as urlhit counting means whenever a user will click on link it will increase the counitng.

## Frameworks and Languages Used

- Spring Boot
- Java

## Data Flow

### Controller

- `GET /api/v1/visitor-count-app/count`: Retrieves the hit count for all users.
- `GET /api/v1/visitor-count-app/username/{username}/count`: Retrieves the hit count for a specific user.

### Service

- `increseHitCount(String username)`: Increments the hit count for a specific user.

### Repository

- `void save(UrlHit urlHit)`: Saves a new UrlHit to the database.
- `UrlHit findByUsername(String username)`: Retrieves a UrlHit by username from the database.

### Database Design

Table: UrlHit

| Column Name | Data Type |
|-------------|-----------|
| username    | String    |
| hitCount    | Integer   |


---
