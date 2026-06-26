<div align="center">

# ✦ SerenChat: Real-Time Chat & Presence Backend ✦

*A beautifully engineered backend system built with Spring Boot, WebSockets & MySQL for seamless real-time messaging.* 🎀✨

[![Java](https://img.shields.io/badge/Java-17-ffb3ba?style=for-the-badge&logo=openjdk&logoColor=white)](https://java.com/)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-Backend-baffc9?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![WebSocket](https://img.shields.io/badge/Protocol-WebSocket-bae1ff?style=for-the-badge&logo=socket.io&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API)
[![MySQL](https://img.shields.io/badge/Database-MySQL-ffdfba?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-ffffba?style=for-the-badge)](LICENSE)

---
</div>

### 🌸 Overview

Welcome to **SerenChat**! 🤍 Modern digital platforms rely heavily on instant communication. This project explores how **WebSocket-based architectures** can solve the latency issues of traditional HTTP polling by establishing persistent connections. 

The result? A robust real-time messaging and user presence system that pushes updates instantly to connected clients! 💬✨

<br>

### ✨ Project Highlights

Here are the key achievements and technical implementations of this system:

✦ **Real-Time Communication:** Developed a real-time messaging backend using Spring Boot and WebSocket for instant communication and user presence tracking. <br>
✦ **Robust RESTful APIs:** Built RESTful APIs for seamless message management, chat history retrieval, and user status updates. <br>
✦ **Optimized Storage:** Designed and integrated a MySQL database schema for persistent storage and efficient data management. <br>

<br>

### 🎀 System Pipeline

Here's a little peek into how messages flow through the architecture:

```text
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
This asynchronous architecture ensures **low latency communication and a seamless user experience!** 🚀

<br>

### 💻 Tech Stack

Everything needed to keep the system running flawlessly:

| 🌸 Technology | 🎀 Purpose |
| :--- | :--- |
| **Java 17** | Backend programming language |
| **Spring Boot** | Backend framework |
| **WebSocket** | Real-time communication |
| **Spring Data JPA** | Database interaction |
| **MySQL** | Persistent message storage |
| **HTML/CSS/JS** | Cute & functional client-side interface |

<br>

### 📁 Repository Structure

```text
real-time-chat-presence-backend-system
│
├── src/main/java/com/khushi/realtime_messaging_backend
│   ├── config/WebSocketConfig.java         ✨ (WebSocket setup)
│   ├── controller/RealtimeChatController.java 🎀 (Message routing)
│   ├── model/ChatMessage.java              🤍 (Data structure)
│   ├── repository/ChatRepository.java      🗄️ (DB interactions)
│   └── service/ChatService.java            ⚙️ (Business logic)
│
├── resources
│   ├── static/index.html                   🌸 (Chat interface)
│   └── application.properties              🛠️ (Configuration)
│
├── pom.xml
├── README.md
└── LICENSE
```

<br>

### 🚀 Future Work

While the current system efficiently demonstrates real-time communication, there is always room to grow! Future enhancements include:

✦ Online user presence detection & typing indicators ⌨️ <br>
✦ Private aesthetic chat rooms 🌸 <br>
✦ Message timestamps & chat history retrieval 🕰️ <br>
✦ Secure authentication system 🔒 <br>
✦ Deployment on cloud infrastructure ☁️ <br>

<br>

### 🤍 Getting Started

Want to run this real-time backend locally? Just follow these steps! 

**1. Clone the repository**
```bash
git clone https://github.com/Khushisawalkar/Real-Time-Chat-Presence-Backend-System.git
```

**2. Setup the Database**
```sql
CREATE DATABASE realtime_chat_db;
```

**3. Run the Application**
```bash
mvn spring-boot:run
```
The server will start up beautifully on `http://localhost:8080`. ✨

<br>

<div align="center">
<i>Crafted with 🤍 and lots of ✨ by <a href="https://github.com/Khushisawalkar">Khushi Sawalkar</a></i>
<br>
B.Tech — Electronics & Telecommunications Engineering | Minor in IT
<br><br>
︶꒦︶꒷︶︶꒦︶꒷︶︶꒦︶꒷︶︶꒦︶
</div>
