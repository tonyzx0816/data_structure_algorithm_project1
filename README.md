## FrontBackCappedList Project

This project implements a **Front-Back Capped List**, a list with a fixed capacity that allows elements to be added or removed only from the front or back. It includes two implementations:  
- `ArrayFrontBackCappedList` – Uses an array for internal storage.  
- `ListFrontBackCappedList` – Uses a `List<T>` for internal storage.
-  A driver class (`ProjectADriver.java`) is provided to test the implementations.

## Features  
- Add elements to the front or back (if not full).  
- Remove elements from the front or back (if not empty).  
- Retrieve elements by index.  
- Check if the list is full or empty.  
- Get the list size and capacity.  
- Clear the list.  
- Search for an element by value or index.  

## Files  
- `FrontBackCappedList.java` – Interface defining the list operations.  
- `ArrayFrontBackCappedList.java` – Array-based implementation.  
- `ListFrontBackCappedList.java` – List-based implementation (extra credit).  
- `ProjectADriver.java` – Driver for testing functionality.
