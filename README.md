# SmartClaim – AI-powered Insurance Claims Portal

SmartClaim is a full-stack enterprise-grade insurance claims management platform built with microservices, Kafka-based messaging, fraud detection, and real-time notifications. It features secure user authentication, JWT/OAuth2, caching, CI/CD, and is deployed using Docker and AWS.

---

## Tech Stack

**Backend:** Java 17, Spring Boot, Spring Security, Spring Cloud, Spring Data JPA, Hibernate  
**Frontend:** Angular 15+  
**Messaging:** Apache Kafka  
**Caching:** Redis  
**Authentication:** JWT + OAuth2 (Okta/Firebase simulation)  
**Database:** MySQL/PostgreSQL  
**Containerization:** Docker + Docker Compose  
**DevOps:** GitHub Actions, Jenkins (optional)  
**Cloud:** AWS (EC2, RDS, S3)

---

## 📁 Project Structure

```
SmartClaim/
├── README.md
├── docker-compose.yml
├── .github/workflows/ci.yml
├── discovery-service/              # Eureka
├── api-gateway/                   # Spring Cloud Gateway
├── user-service/                 # Login/Register + JWT
├── claim-service/                # Claim management CRUD
├── fraud-detector/               # ML mock scoring engine
├── notification-service/         # Kafka consumer & alerts
├── common-lib/                   # Shared DTOs & utils
├── redis-cache/                  # Redis config if separated
└── frontend/
    └── admin-dashboard/          # Angular UI
```

---

## Getting Started

### Prerequisites
- Java 17
- Node.js (v18+)
- Docker + Docker Compose
- MySQL/PostgreSQL (optional if using Docker)

### Clone the Project
```bash
git clone https://github.com/yourusername/SmartClaim.git
cd SmartClaim
```

### Build All Services (Backend)
```bash
./mvnw clean install
```

### Start with Docker Compose
```bash
docker-compose up --build
```

### Frontend
```bash
cd frontend/admin-dashboard
npm install
ng serve --open
```

---

## Security Features
- JWT-based authentication
- Role-based access (RBAC)
- OAuth2 provider simulation (Okta/Firebase)
- Secure Spring Boot config

---

## Services Summary

| Service | Port | Description |
|--------|------|-------------|
| `discovery-service` | 8761 | Eureka registry |
| `api-gateway` | 8080 | Unified entry point |
| `user-service` | 8081 | Registration/Login + JWT |
| `claim-service` | 8082 | Submit & track claims |
| `fraud-detector` | 8083 | ML scoring simulation |
| `notification-service` | 8084 | Kafka-driven alerts |
| `frontend` | 4200 | Angular Admin Dashboard |

---

## Testing
```bash
# Run tests for each service
cd user-service
./mvnw test
```

---

## CI/CD
- GitHub Actions workflow: `.github/workflows/ci.yml`
- Includes: Maven Build, Lint, Docker Build, Push to Registry

---

## ☁️ Cloud Deployment (Optional)
- EC2 for hosting backend
- RDS (MySQL) for DB
- S3 for file storage
- Dockerized deployment using `docker-compose`

---

## Contact
Created by **Sruthi Mullaguri**  
📧 sruthimullagurii@gmail.com  
📱 9409055282


