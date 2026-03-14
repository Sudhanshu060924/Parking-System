# 🚗 Parking Management System (Java OOP Project)

![Java](https://img.shields.io/badge/Language-Java-orange)
![OOP](https://img.shields.io/badge/Concept-OOP-blue)
![Project](https://img.shields.io/badge/Type-Console%20Application-green)

## 📌 Overview

The **Parking Management System** is a Java-based console application that simulates how a real-world parking lot works.
It allows users to park vehicles, remove vehicles, generate parking tickets, and calculate parking fees based on parking duration.

This project is built using **Object-Oriented Programming (OOP)** concepts and demonstrates how different classes interact to manage a parking system.

---

## ✨ Features

* Park vehicles (Car / Bike)
* Remove vehicles from parking
* Automatic parking slot allocation
* Parking ticket generation
* Entry time and exit time tracking
* Parking fee calculation
* Display parking slot status
* Object-Oriented design implementation

---

## 🧠 OOP Concepts Used

This project demonstrates the following OOP principles:

* **Encapsulation** – Private variables with getters and setters
* **Inheritance** – `Car` and `Bike` classes extend the `Vehicle` class
* **Polymorphism** – Different vehicle types handled using a common interface
* **Abstraction** – Parking logic handled inside the `ParkingLot` class

---

## 🏗 Project Structure

```
Parking-Management-System
│
├── Vehicle.java
├── Car.java
├── Bike.java
├── ParkingSlot.java
├── ParkingLot.java
├── Ticket.java
└── Main.java
```

---

## ⚙️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList)
* Java Date & Time API

---

## 🚀 How the System Works

1. The system creates a parking lot with a fixed number of parking slots.
2. When a vehicle enters the parking lot:

   * A parking slot is assigned.
   * A parking ticket is generated.
   * Entry time is recorded.
3. When the vehicle exits:

   * Exit time is recorded.
   * Parking fee is calculated.
4. The user can also check the current parking status.

---

## 💻 Example Console Menu

```
--- Parking System ---
1. Park Vehicle
2. Remove Vehicle
3. Show Parking Status
4. Exit
```

---

## 🔮 Future Improvements

* GUI version using JavaFX
* Database integration (MySQL)
* Parking history tracking
* Different pricing for cars and bikes
* Online parking booking system

---

## 👨‍💻 Author

**Sudhanshu Singh**
B.Tech CSE Student
Java Developer | Full-Stack Developer

---

⭐ If you like this project, consider giving it a star on GitHub.
