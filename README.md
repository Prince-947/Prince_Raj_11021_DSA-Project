Shopping Wishlist Manager

A console-based Java application that manages a shopping wishlist using a singly linked list. You can add items with prices, display the wishlist, sort it by price, remove an item and view the total cost. The wishlist is saved to a text file, so it is still there the next time you run the program.

PS No. 40 | Data Structures and Algorithms (DSA) project | Session 2026-27

Features
Menu option	What it does
1 - Add Item	Reads the item name and price and adds the item with an automatic ID (first ID is W101).
2 - Display All	Shows every item in the wishlist.
3 - Sort by Price	Sorts the wishlist from low to high price (hand-written sort) and displays it.
4 - Remove Item	Removes the item with the given ID.
5 - Total Cost	Shows the total cost of all items and the number of items.
6 - Exit	Saves the wishlist to wishlist.txt and closes the program.
Rules followed
The price must be greater than 0.
Removing an item does not change the IDs of the remaining items.
The sorting and searching logic is written by hand (no built-in sort or search methods).
Data is loaded from wishlist.txt at start and saved on exit.
Invalid input (wrong menu choice, bad price, unknown ID) is handled with a message instead of a crash.
Concepts Used
Singly linked list with a user-defined Node class (data + next)
Bubble sort (written manually) on the linked list
Linear search by ID (written manually)
Methods for each feature
File handling (BufferedReader, FileReader, PrintWriter, FileWriter)
Requirements
JDK 21 (recommended; any recent JDK should work)
A terminal or command prompt
How to Run
bash
# 1. Clone the repository
git clone https://github.com/<your-username>/<your-repository>.git
cd <your-repository>

# 2. Compile
javac ShoppingWishlistManager.java

# 3. Run
java ShoppingWishlistManager

wishlist.txt is created in the folder where you run the program.

Sample Run
===== SHOPPING WISHLIST MANAGER =====
1 - Add Item
2 - Display All
3 - Sort by Price
4 - Remove Item
5 - Total Cost
6 - Exit
Enter your choice: 1
Item: Headphones
Price: 2500
Item added. ID: W101 | Headphones | 2500
Test Cases
#	Test case	Input	Expected output
1	Normal input	Option 1, Item: Headphones, Price: 2500	Item added. ID: W101 | Headphones | 2500
2	Boundary / minimum input	Only W101 (Headphones, 2500) exists; option 5	Total wishlist cost: 2500 | Items: 1
3	Invalid input	Option 4, ID: W999	Item W999 not found.
4	Different valid scenario	Existing W101 (Headphones, 2500). (a) Option 1: Backpack, 1200 (b) Option 3 (c) Option 5	(a) Item added. ID: W102 | Backpack | 1200
(b) 1. W102 | Backpack | 1200
    2. W101 | Headphones | 2500
(c) Total wishlist cost: 3700 | Items: 2
Data File Format

Items are stored in wishlist.txt, one item per line, in the form ID|Name|Price:

W101|Headphones|2500
W102|Backpack|1200
Time Complexity

n is the number of items in the wishlist.

Operation	Time
Add Item (at the end of the list)	O(n)
Display All	O(n)
Sort by Price	O(n²)
Remove Item (by ID)	O(n)
Total Cost	O(n)
Load from / save to file	O(n)
Project Structure
.
├── ShoppingWishlistManager.java   # complete source code (single file)
├── wishlist.txt                   # created automatically when you exit the program
└── README.md
Author

Prince Raj ERP ID: RU-25-11021 B.Tech in Computer Science & Engineering with AI and ML (in association with Google) School of Computer Science and Engineering, Rungta International Skills University, Bhilai, Chhattisgarh

Guide: Mrs Naina Singh
