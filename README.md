# sentinelx
Projeto: SentinelX – Plataforma de Monitoramento e Análise de Ameaças Cibernéticas

SentinelX is a backend-focused cybersecurity monitoring platform designed to simulate real-world threat detection systems.  
It processes log events, detects suspicious activity patterns, applies rate limiting, and exposes security metrics via REST APIs.

This project demonstrates advanced backend architecture, security implementation, asynchronous processing concepts, and DevOps practices.

---

## Features

-  JWT Authentication
-  Role-Based Access Control (ADMIN / ANALYST)
-  Threat Detection Engine (Brute Force & SQL Injection detection)
-  Metrics API
-  Redis Rate Limiting
-  PostgreSQL Persistence
-  Unit Testing
-  Dockerized Environment
-  Kafka-based Log Processing (structure prepared)

---

## Architecture Overview

SentinelX follows a layered architecture pattern:

Controller → Service → Repository → Database

Security is handled using Spring Security and JWT-based authentication.


