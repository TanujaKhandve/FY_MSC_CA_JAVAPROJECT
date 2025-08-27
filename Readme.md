📝 To-Do List Application (Java Console Project)

📌 Project Overview

This is a console-based To-Do List Application built in Java.
It allows users to:

Add tasks

View tasks

Mark tasks as complete

Delete tasks
This project demonstrates Object-Oriented Programming (OOP) concepts like classes, objects, encapsulation, and lists.




🎯 Features

➕ Add new tasks

📃 Display all tasks

✅ Mark tasks as completed

❌ Delete tasks

💾 Data stored during runtime using ArrayList




🛠️ Technologies Used

Java (JDK 8+)

OOP Concepts

ArrayList Collection





📂 Project Structure

FYMSCCA_JAVA_PROJECT/
│── Main.java         # Entry point of the application
│── Task.java         # Defines Task class (id, title, status)
│── ToDoList.java     # Manages tasks (add, view, delete, mark complete)




🚀 How to Run the Project

1. Open terminal/command prompt and navigate to the project folder:

cd FYMSCCA_JAVA_PROJECT


2. Compile the Java files:

javac *.java


3. Run the project:

java Main





📊 Class Diagram

classDiagram
    class Task {
      - int id
      - String title
      - boolean isCompleted
      + markAsComplete()
      + toString()
    }

    class ToDoList {
      - List<Task> tasks
      + addTask(String title)
      + viewTasks()
      + deleteTask(int id)
      + markTaskComplete(int id)
    }

    class Main {
      + main(String[] args)
    }

    Task --> ToDoList
    Main --> ToDoList



📈 Flow Diagram

flowchart TD
    A[Start] --> B[Show Menu]
    B -->|1. Add Task| C[Enter Task]
    B -->|2. View Tasks| D[Display All Tasks]
    B -->|3. Complete Task| E[Mark Task Complete]
    B -->|4. Delete Task| F[Remove Task]
    B -->|5. Exit| G[End Program]
    C --> B
    D --> B
    E --> B
    F --> B



📖 Learning Outcomes

Understanding Object-Oriented Design in Java

Working with ArrayList for dynamic data handling

Implementing modular code with multiple classes

Building menu-driven console applications




👩‍💻 Author

Tanuja Khandve
📌 FYMSc (CA) Student
📌 Passionate about Java & Full Stack Development
