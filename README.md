
# 📓 Journal Entry Manager – RESTful API with Spring Boot

A secure and scalable journal entry management backend application built using **Java Spring Boot**. This API enables users to create, retrieve, update, and delete journal entries with role-based access control for admins and users.

[🔗 GitHub Repository](https://github.com/Nayanbhadane72/JournalManager)

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Security
- **Database:** MongoDB
- **API Testing:** Postman
- **Build Tool:** Maven
- **Security:** JWT, Role-Based Access Control
- **Others:** Lombok, RESTful API, Git

---

## 📌 Features

- 📝 Add journal entries by username and ID
- 📖 View all entries or specific ones by ID
- ✏️ Update or delete journal entries
- 🔐 Spring Security with Admin and User roles
- 💾 MongoDB integration for persistent storage
- 🔗 Clean RESTful endpoints with proper HTTP status codes

---

## 🚀 Getting Started

### 1. Clone the repository:

```bash
git clone https://github.com/Nayanbhadane72/JournalManager.git
cd JournalManager
```

### 2. Build and run the app:

Make sure MongoDB is running on your system.

```bash
./mvnw spring-boot:run
```

---

## 🧪 API Endpoints

Use [Postman](https://www.postman.com/) to test the API:

| Method | Endpoint                  | Description                |
|--------|---------------------------|----------------------------|
| POST   | `/api/journals`           | Create journal entry       |
| GET    | `/api/journals/{id}`      | Get journal by ID          |
| GET    | `/api/journals/user/{username}` | Get entries by user  |
| PUT    | `/api/journals/{id}`      | Update journal             |
| DELETE | `/api/journals/{id}`      | Delete journal             |

---

## 🔐 Authentication

- Integrated **Spring Security** with **JWT** authentication.
- Only authenticated users with valid roles (Admin/User) can access specific endpoints.
- Admins can perform all operations; Users can only manage their own entries.

---

## 📄 License

This project is open-source and free to use..

---

## 👨‍💻 Author

**Nayan Bhadane**  
- [Portfolio](https://nayanbhadane72.github.io/nayans-personal-portfolio/)
- [LinkedIn](https://www.linkedin.com/in/nayan-bhadane-256240227)
- [GitHub](https://github.com/Nayanbhadane72)
