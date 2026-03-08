# Pokemon CRUD API

## Description
An API for managing Pokemon characters built with Spring Boot, PostgreSQL, and Bruno

## Installation
1. Clone the repo
2. Set up a Neon.tech PostgreSQL database
3. Add credentials to application.properties
4. Run: ./mvnw spring-boot:run

## API Endpoints
- GET /characters — get all pokemon
- GET /characters/{id} — get one by ID
- POST /characters — create a new pokemon
- PUT /characters/{id} — update a pokemon
- DELETE /characters/{id} — delete a pokemon
- GET /characters/category/{type} — get by type
- GET /characters/search?name={name} — search by name

## Demo Video
[Link to video](https://uncg-my.sharepoint.com/:v:/g/personal/b_ramirez_uncg_edu/IQAwPnBBOqu7SY3eSuAhqTfrAcHW6ISPpgRzxZH9tA34gkQ?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=ZiZwZc)
