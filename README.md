# Contact Manager in Java

This repository contains a simple yet functional **Contact Manager** application implemented in Java. The application allows users to manage a list of contacts by performing basic operations such as adding, removing, and viewing contacts, as well as sorting them alphabetically by first name.

---

## Project Overview
The Contact Manager is a console-based program that demonstrates the following functionalities:

1. **Add Contact**: Create new contact entries with a first name, last name, and phone number.
2. **Remove Contact**: Delete a contact based on their first and last name.
3. **View All Contacts**: Display all stored contacts.
4. **Sort Contacts by Name**: List all contacts sorted alphabetically by their first name.

---

## Files in This Repository
### Source Code
- **`Contact.java`**: Defines the `Contact` class, encapsulating the attributes and behaviors of an individual contact.
- **`main.java`**: Contains the main logic for managing the contact list, including the user interface and operational methods.

---

## Features
- **LinkedList Implementation**:
  - Contacts are stored in a `LinkedList`, ensuring dynamic resizing and efficient insertion and deletion.
- **Sorting**:
  - Utilizes a custom comparator to sort contacts alphabetically by their first name.
- **Interactive Menu**:
  - Simple console-based menu system for user interaction.

---

## Prerequisites
### Software Requirements
- **Java Development Kit (JDK)** version 8 or higher.

### Installation
1. Clone the repository to your local system:
   ```bash
   git clone https://github.com/your-username/contact-manager.git
   ```
2. Navigate to the project directory:
   ```bash
   cd contact-manager
   ```

---

## Usage Instructions
### Compiling the Code
Compile all Java files:
```bash
javac *.java
```

### Running the Program
Run the `main` class to start the application:
```bash
java main
```

### Example Interaction
1. Launch the program.
2. Follow the on-screen menu to:
   - Add new contacts.
   - Remove contacts by their first and last name.
   - View the complete list of stored contacts.
   - Sort the contacts alphabetically.
3. Exit the program by selecting the "Quit" option.

---

## Example Output
### Initial Menu
```
~ Contacts List ~
[1] Add Contact
[2] Remove Contact
[3] View All Contacts
[4] View Contacts By Name
[5] Quit
Choose:
```

### Adding a Contact
```
First Name: John
Last Name: Doe
Phone Number: 1234567890
```

### Viewing All Contacts
```
--> 0
John
Doe
1234567890
```

### Sorted Contacts
```
--> 0
Alice
Smith
5551234567

--> 1
John
Doe
1234567890
```

---

