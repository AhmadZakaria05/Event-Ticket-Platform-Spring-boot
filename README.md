# 🎟️ Event Ticketing Platform

<p align="center">
  <strong>A secure and scalable event ticketing platform built with Spring Boot, Keycloak, PostgreSQL, and Docker.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue" />
  <img src="https://img.shields.io/badge/Keycloak-Authentication-red" />
  <img src="https://img.shields.io/badge/JWT-Security-yellow" />
  <img src="https://img.shields.io/badge/Docker-Containerized-blue" />
</p>

---

## 📖 Overview

The Event Ticketing Platform is a backend application designed to simplify event management and ticket distribution.

The platform enables organizers to create and manage events while allowing attendees to browse events, purchase tickets, and validate them using QR codes.

Authentication and authorization are handled through Keycloak and JWT-based security, ensuring a secure and scalable architecture.

---

## ✨ Features

### Event Management

* Create events
* Update event details
* Delete events
* Retrieve event information
* Manage organizer-owned events

### Event Discovery

* Browse published events
* Search published events
* Pagination support

### Ticket Management

* Purchase tickets
* View owned tickets
* Retrieve ticket details

### QR Code Integration

* Generate unique QR codes for tickets
* Download ticket QR codes
* Validate tickets using QR codes

### Ticket Validation

* Manual ticket validation
* QR code ticket validation

### Security

* JWT Authentication
* Keycloak Integration
* Role-based authorization
* Protected API endpoints

### Validation & Error Handling

* Request validation
* Global exception handling
* Consistent API error responses

---

## 🏗 Architecture

The application follows a layered architecture to maintain separation of concerns and improve maintainability.

```text
┌──────────────────────┐
│     Controllers      │
└──────────┬───────────┘
           │
┌──────────▼───────────┐
│       Services       │
└──────────┬───────────┘
           │
┌──────────▼───────────┐
│    Repositories      │
└──────────┬───────────┘
           │
┌──────────▼───────────┐
│     PostgreSQL       │
└──────────────────────┘
```

---

## 📂 Project Structure

```text
src/main/java/com/devtiro/tickets

├── config
├── controllers
├── domain
│   ├── dtos
│   └── entity
├── exceptions
├── filters
├── mappers
├── repositories
├── services
├── util
└── TicketsApplication
```

---

## 🛠 Technology Stack

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate

### Authentication & Authorization

* Keycloak
* OAuth2 Resource Server
* JWT

### Database

* PostgreSQL

### DevOps

* Docker
* Docker Compose

### Utilities

* Lombok
* Bean Validation
* QR Code Generation

---

## 🔐 Authentication Flow

```text
User
 │
 ▼
Keycloak Login
 │
 ▼
JWT Access Token
 │
 ▼
Spring Security
 │
 ▼
Protected REST APIs
```

---

## 🗄 Database

The platform uses PostgreSQL for data persistence.

Core domain entities include:

* Users
* Events
* Ticket Types
* Tickets
* Ticket Validations

---

## 🚀 API Endpoints

### Events

```http
POST   /api/v1/events
GET    /api/v1/events
GET    /api/v1/events/{eventId}
PUT    /api/v1/events/{eventId}
DELETE /api/v1/events/{eventId}
```

### Published Events

```http
GET /api/v1/published-events
GET /api/v1/published-events/{eventId}
```

### Tickets

```http
GET /api/v1/tickets
GET /api/v1/tickets/{ticketId}
GET /api/v1/tickets/{ticketId}/qr-codes
```

### Purchase Ticket

```http
POST /api/v1/events/{eventId}/ticket-types/{ticketTypeId}/tickets
```

### Ticket Validation

```http
POST /api/v1/ticket-validations
```

---

## 🐳 Running with Docker

### Start Infrastructure

```bash
docker compose up -d
```

Services:

| Service    | Port |
| ---------- | ---- |
| PostgreSQL | 5432 |
| Keycloak   | 9090 |
| Adminer    | 8888 |

---

## ⚙️ Local Development

### Clone Repository

```bash
git clone https://github.com/your-username/event-ticketing-platform.git
```

### Navigate to Project

```bash
cd event-ticketing-platform
```

### Run Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

## 📸 Screenshots

### Keycloak

Add a screenshot showing:

* Realm
* Roles
* Users

### API Documentation

Add Swagger screenshots here.

### QR Code Example

Add a generated ticket QR code screenshot.

### Database Diagram

Add ERD screenshot here.

---

## 🔮 Future Improvements

* Payment gateway integration
* Email notifications
* Seat reservation system
* Event analytics dashboard
* Multi-tenant support
* OpenAPI / Swagger documentation
* CI/CD pipeline

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience with:

* Secure REST API development
* Authentication & Authorization using Keycloak
* JWT-based security
* Spring Security
* Dockerized environments
* PostgreSQL integration
* Layered architecture
* Exception handling strategies
* QR code generation and validation workflows

---

## 👨‍💻 Author

**Ahmad**

Backend Developer focused on building secure, scalable, and maintainable applications using Java and Spring Boot.

---

⭐ If you found this project interesting, consider giving it a star.
