
# 🏦 Multi-Task Banking & Utility Java Application

## 📌 Overview

This repository contains a **Java Swing GUI application** with multiple modules designed for banking and utility tasks. Users can interact with the system through a **graphical interface**, perform basic arithmetic, manage account information, and handle banking operations.

The application is modular, with each functionality in its own class/file, making it easy to maintain and extend.

---

## ⚡ Features

### Banking Operations

* **SignUp & SignIn** 📝 – Create and access user accounts
* **Deposit** 💰 – Add money to your account
* **Withdraw** 💸 – Withdraw money from your account
* **Account Info** 📋 – View account details

### Utility Tools

* **Calculator** ➕➖✖️➗ – Perform arithmetic operations and simplify fractions
* **AutoFill Forms** 🖊️ – Automatically fill repeated data
* **Client Info** 👤 – View client details

### Miscellaneous

* Randomized simulations, e.g., obstacle navigation in 2D grid
* Point/Time classes for handling coordinates and time differences
* Pattern drawing with ASCII art

---

## 🗂️ Project Structure

```
src/
│
├─ AccountInfo.java      // Display account details
├─ Calculator.java       // Arithmetic operations
├─ ClientInfo.java       // Client information interface
├─ AutoFill.java         // Auto-fill forms
├─ Deposit.java          // Deposit money module
├─ Withdrawn.java        // Withdraw money module
├─ SignIn.java           // Login form
├─ SignUp.java           // Signup form
├─ Main.java             // Optional main dashboard GUI
├─ PointD.java           // 3D point class utility
├─ Time.java             // Time calculation utilities
├─ ...                   // Other utility or task files
```

---

## 💻 Technologies Used

* **Java SE**
* **Swing GUI** (`JFrame`, `JDialog`, `JPanel`, `JButton`, `JTextField`)
* **Event Handling** (`ActionListener`, `WindowAdapter`)
* **Random & Math** classes
* **File I/O** (optional for data persistence)

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/YourRepoName.git
```

2. Navigate to the `src` folder.
3. Compile all `.java` files:

```bash
javac *.java
```

4. Run the main class (for example, `Main.java` if you have a dashboard):

```bash
java Main
```

5. Use the GUI buttons to access the various modules.

---

## 🎨 Notes

* All arithmetic and banking operations are GUI-based.
* Data persistence can be implemented via files or databases if required.
* Each module is **modular and independent**, so you can extend the application easily.
* Emojis are used for better visualization and user experience.

---

## 📌 Future Improvements

* Add **database integration** for account storage (MySQL/SQLite)
* Implement **user authentication**
* Add **graphs or charts** for transactions
* Enhance **UI design** with colors, fonts, and layouts
* Add **real-time notifications** for banking operations

---

## 📧 Contact

For any questions or suggestions, reach out to **\[Hasan Zarook]** – [hasanzarook46@gmail.com](hasanzarook46@gmail.com)

---

