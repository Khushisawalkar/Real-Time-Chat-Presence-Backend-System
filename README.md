

# 💬 Real-Time Chat & Presence Backend System

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Backend-green?style=for-the-badge)
![WebSocket](https://img.shields.io/badge/Protocol-WebSocket-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/Database-MySQL-orange?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

A **real-time messaging backend system** built using **Spring Boot, WebSocket, and MySQL**.

**Project:** SerenChat
**Focus:** Real-time messaging and user presence system.

---

# 🌍 Project Motivation

Modern digital platforms rely heavily on **instant communication systems**.

Applications such as messaging platforms, collaboration tools, multiplayer applications, and live support systems require **low latency message delivery**.

Traditional HTTP communication follows a **request–response model**, which introduces delays and requires repeated polling.

Real-time systems solve this problem by establishing **persistent connections**, allowing servers to instantly push updates to connected clients.

This project explores how **WebSocket-based architectures** can enable efficient real-time messaging.

---

# 🧠 Key Challenge

Building a real-time messaging system involves several challenges:

• maintaining persistent client-server connections
• broadcasting messages to multiple users instantly
• handling concurrent users efficiently
• integrating persistent message storage

Designing a backend capable of supporting these features requires **asynchronous communication mechanisms and efficient message routing**.

---

# ⚙️ System Pipeline

```
User A (Browser)
       ↓
WebSocket Connection
       ↓
Spring Boot Messaging Endpoint
       ↓
Message Processing
       ↓
Broadcast Channel (/topic/messages)
       ↓
User B (Browser)
```

Messages are transmitted through **persistent WebSocket connections**, allowing instant updates across connected clients.

This architecture ensures **low latency communication and seamless user experience**.

---

# 🛠️ Technologies Used

| Technology      | Purpose                      |
| --------------- | ---------------------------- |
| Java            | Backend programming language |
| Spring Boot     | Backend framework            |
| WebSocket       | Real-time communication      |
| Spring Data JPA | Database interaction         |
| MySQL           | Message storage              |
| HTML / CSS      | Chat interface               |
| JavaScript      | Client-side messaging        |

---

# 📁 Repository Structure

```
real-time-chat-presence-backend-system
│
├── src
│   └── main
│       ├── java/com/khushi/realtime_messaging_backend
│       │
│       │   ├── config
│       │   │   └── WebSocketConfig.java
│       │   │
│       │   ├── controller
│       │   │   ├── ChatController.java
│       │   │   └── RealtimeChatController.java
│       │   │
│       │   ├── model
│       │   │   └── ChatMessage.java
│       │   │
│       │   ├── repository
│       │   │   └── ChatRepository.java
│       │   │
│       │   └── service
│       │       └── ChatService.java
│
├── resources
│   ├── static
│   │   └── index.html
│   └── application.properties
│
├── pom.xml
├── README.md
└── LICENSE
```

---

# 📊 Example Workflow

| Step | Action                                   |
| ---- | ---------------------------------------- |
| 1    | User opens chat interface                |
| 2    | WebSocket connection established         |
| 3    | User sends message                       |
| 4    | Backend processes message                |
| 5    | Message broadcast to all connected users |

Messages appear **instantly in the chat interface without refreshing the page**.

---

# 📈 System Design Observations

Initial implementation demonstrates how **Spring Boot WebSocket architecture** can efficiently support real-time communication.

However, several improvements can further enhance the system:

• improved user presence detection
• optimized message routing
• scalable WebSocket infrastructure

These observations highlight the importance of **efficient backend design for real-time systems**.

---

# 🚀 Future Work

Possible extensions include:

• online user presence detection
• typing indicators
• private chat rooms
• message timestamps
• chat history retrieval
• authentication system
• deployment with cloud infrastructure

These additions would transform the project into a **production-ready messaging platform**.

---

# 🔁 Running the Application

### Clone the repository

```
git clone https://github.com/Khushisawalkar/Real-Time-Chat-Presence-Backend-System.git
```

### Create MySQL database

```
CREATE DATABASE realtime_chat_db;
```

### Run the application

```
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

# 👩‍💻 Author

**Khushi Sawalkar**

B.Tech — Electronics & Telecommunications Engineering
Minor in Information Technology

Technical interests:

• Backend Systems
• Real-Time Communication Architectures
• Signal Processing
• Embedded Systems

Projects:

• Arduino MP3 Player
• Occupancy-Dependent Domestic Power Conservation System

---

# 📜 License

This project is released under the **MIT License**.
