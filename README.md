# Audio Player - DSA Project

A GUI-based audio player application built with Java Swing, featuring a custom implementation of LinkedList data structure for efficient playlist management.

## Overview

This project demonstrates the practical application of Data Structures and Algorithms (DSA) concepts by implementing a fully functional audio player. The playlist is managed using a custom LinkedList implementation without relying on Java's built-in Collections framework.

## Features

- **Add Tracks**: Add songs to the playlist
- **Remove Tracks**: Remove specific tracks from playlist
- **Play Controls**: Play, Pause, and Stop functionality
- **Next Track**: Navigate to the next song in queue
- **View Playlist**: Display all tracks currently in the playlist
- **Custom LinkedList**: Built from scratch using nodes and pointers

## Technologies Used

- **Language**: Java
- **GUI Framework**: Swing
- **Data Structure**: Custom LinkedList implementation
- **Paradigm**: Object-Oriented Programming

## Project Structure
```
audio-player-dsa-java/
├── AudioPlayerFrame.java    # GUI implementation and event handlers
├── PlayList.java             # Playlist management logic
├── LinkedList.java           # Custom LinkedList implementation
└── Main.java                 # Application entry point
```

## How It Works

1. **LinkedList Implementation**: Uses a node-based structure with head and tail pointers
2. **Playlist Management**: Maintains track order using the custom LinkedList
3. **GUI Interface**: Provides interactive buttons for all player operations
4. **Event Handling**: ActionListeners handle user interactions

## How to Run

1. Clone the repository:
```bash
   git clone https://github.com/yourusername/audio-player-dsa-java.git
```

2. Open the project in your Java IDE (NetBeans, Eclipse, or IntelliJ IDEA)

3. Navigate to the `Main.java` file

4. Run the application

## Key Components

### LinkedList.java
Custom implementation featuring:
- Node-based structure
- Add/Remove operations
- Traversal methods
- Head and tail pointer management

### PlayList.java
Manages the audio tracks using LinkedList operations:
- Track addition and removal
- Next track retrieval
- Playlist traversal

### AudioPlayerFrame.java
GUI components including:
- Control buttons (Play, Pause, Stop, Next)
- Track input field
- Action listeners for user interactions

## Learning Outcomes

- Implemented LinkedList data structure from scratch
- Applied DSA concepts in a real-world application
- Developed GUI using Java Swing
- Practiced event-driven programming
- Understood node-based data structure operations

## Future Enhancements

- Add actual audio file playback functionality
- Implement shuffle and repeat modes
- Add volume controls
- Create playlist save/load feature
- Add track duration display

## Author

**Abdul Rehman Saeed**

## Acknowledgments

Created as part of Data Structures and Algorithms coursework to demonstrate practical understanding of linked list implementation and GUI development.

---

*Note: This is a demonstration project focusing on DSA concepts. Actual audio playback is simulated through dialog messages.*
