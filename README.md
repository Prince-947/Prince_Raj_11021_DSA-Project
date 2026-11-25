****Shopping Wishlist Manager****

A Java console-based shopping wishlist application built using a
singly linked list and file handling. This project was developed
as a Data Structures and Algorithms (DSA) project (PS No. 40).
Project Overview
Shopping Wishlist Manager helps users keep track of items they plan to
buy. Users can add items with prices, view the wishlist, sort items by
price, remove items, and calculate the total wishlist cost.

The application stores wishlist data in wishlist.txt, loading saved
items when it starts and saving the list when the user exits.
Features
- Add Item: Add an item with a name and price. Each item receives
  an automatic ID starting from W101.
- Display All: View all items in the wishlist.
- Sort by Price: Arrange wishlist items from lowest to highest
  price using hand-written sorting logic (without built-in sort
  methods).
- Remove Item: Remove an item by its ID. Remaining item IDs are
  not renumbered.
- Total Cost: Calculate the total price and count of wishlist
  items.
- File Persistence: Load items from wishlist.txt at startup and
  save them on exit.
- Input Validation: Accept only prices greater than zero and
  report when an entered ID is not found.
Data Structure and Design
The project uses a singly linked list.

Each Node stores: - Item ID - Item name - Item price - A reference to
the next node

The ShoppingWishlistManager manages the head of the list and provides
the application operations. Each node links to the next node; the last
node points to null.
Menu Operations
The console application provides five main operations:
1. Add Item
2. Display All
3. Sort by Price
4. Remove Item
5. Total Cost
The application returns to the menu after an operation. Choosing Exit
saves the wishlist to wishlist.txt and ends the program.
Requirements
- Java Development Kit (JDK): 21
- RAM: 4 GB
- IDE (optional): IntelliJ IDEA, Eclipse, or Visual Studio Code
- Tools: Terminal, Git, and GitHub
How It Works
1. At startup, the application reads wishlist.txt and loads the saved
   items into the linked list. If the file is missing, it starts with
   an empty list.
2. The user selects an operation from the console menu.
3. The selected operation is performed on the linked list.
4. The menu is displayed again after the operation.
5. When the user chooses Exit, the application writes the wishlist to
   wishlist.txt.
Running the Project
Open the project in an IDE configured with JDK 21, or compile and run it
from a terminal.

If the Java source file is named ShoppingWishlistManager.java and has
no package declaration, use:
javac ShoppingWishlistManager.java
java ShoppingWishlistManager
Keep wishlist.txt in the program's working directory if you want the
application to load an existing wishlist. The file is created or updated
when the application saves on exit.
Time Complexity
Let n be the number of wishlist items.
  Operation                          Time Complexity Explanation
  Add Item (at end)                             O(n) Traverses the list to
find the last node

  Display All                                   O(n) Visits each node once

  Sort by Price                                O(n²) Uses hand-written
comparison sorting

  Remove Item (by ID)                           O(n) Searches for the ID,
then unlinks the node

  Total Cost                                    O(n) Traverses the list
once
Save / Load File                              O(n) Processes one line
per item
Sample Test Scenarios
  Test scenario           Action                  Expected result
  Normal input            Add Headphones at price Item added with ID
2500                    W101

  Minimum/boundary case   Calculate total with    Total cost 2500; item
one item priced at 2500 count 1

  Invalid input           Remove ID W999 when   Item W999 not found.
it does not exist       
Multiple items and      Add Backpack at 1200    Backpack (W102)
sorting                 alongside Headphones at appears before
2500, then sort         Headphones (W101);
total is 3700 for 2
items
Project Scope
The current version is a single-file Java console application. It
supports item IDs, item names and prices, the five menu operations,
basic input validation, and saving/loading through wishlist.txt.

The following are not included in the current version: - Graphical
user interface (GUI) - Database integration - Search and update
functionality - Online price tracking
Future Enhancements
Possible extensions for a future version include:
- Add a graphical user interface.
- Store wishlist data in a database.
- Add search and update options for existing items.
- Add a budget limit and warnings when the total exceeds it.
- Export wishlist data to CSV.
These are proposed future enhancements and are not part of the current
version.
References
- Cormen et al., Introduction to Algorithms, 4th Edition, 2022.
- Sedgewick and Wayne, Algorithms, 4th Edition, 2011.
- Oracle, Java Documentation.
Project Information
- Project: Shopping Wishlist Manager
- Project Number: PS No. 40
- Technology: Java
- Core Concept: Singly Linked List and File Handling
- Course: Data Structures and Algorithms (DSA)
- Academic Session: 2026--27
- Institution: School of Computer Science and Engineering, Rungta
  International Skills University, Bhilai
- Guide: Mrs Naina Singh
- Submitted by: Prince Raj
