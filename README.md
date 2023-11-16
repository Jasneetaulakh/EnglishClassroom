# English Classroom

## Description

This application can: 
- take morse code as a parameter and return the corresponding english text
- take english text as a parameter and return the corresponding morse code

*Morse code rules:*

-  the space between letters is one unit (ie one space)
- the space between words is three units (ie three spaces)
- the only punctuation accepted in this application is a full stop 


---

## How to

- run the application [here](src/com/jasneet/Main.java), two arguments are required:

    - boolean `isMorse`: `true` if you are converting morse to text or `false` if you are converting text to morse
    - string `textToConvert`: eg `".... . .-.. .-.. ---"` or `"hello there"`
    
- if no arguments are entered, the boolean will return false and an error message will appear 
- if invalid text is entered, eg `67f20` an error message will be shown 

---

Tests can be found [here](src/com/jasneet/tests/EnglishClassroomTests.java)