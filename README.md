### Number-Game
The Java program you provided is a simple guessing game called "Number Game". The game works by asking the user a series of questions to determine a number they have chosen between 0 and 31. 
### Game Description
Objective: 
The user is prompted to think of any number between 0 and 31. The program then tries to guess the number by presenting the user with a series of predefined sets of numbers.

Game Setup:
The program initializes a variable number to 0, which will eventually hold the guessed number.
The user is first asked to confirm that they are ready to proceed by inputting true (this is a somewhat redundant step, but it ensures the game starts properly).

Gameplay:
The program shows the user several sets of numbers (five sets in total). Each set contains numbers from 0 to 31.
After displaying each set, the program asks the user if their chosen number is present in that set. The user responds with true if the number is in the set or false if it is not.
Based on the user's response, the program adds a specific value to the number variable:
This corresponds to binary addition, where each set represents a bit in the binary representation of the number.
![WhatsApp Image 2024-08-28 at 7 11 39 PM](https://github.com/user-attachments/assets/4beed184-0821-4a09-83a6-7fd1e008b2b6)
![WhatsApp Image 2024-08-28 at 7 11 39 PM (4)](https://github.com/user-attachments/assets/8cf8a251-3aec-4793-93ee-c0dc20c2c639)
![WhatsApp Image 2024-08-28 at 7 11 39 PM (3)](https://github.com/user-attachments/assets/b883f6d0-0006-4441-9147-427f8c6f2ed3)
![WhatsApp Image 2024-08-28 at 7 11 39 PM (2)](https://github.com/user-attachments/assets/852283da-7121-40bf-90d1-23679c16d931)
![WhatsApp Image 2024-08-28 at 7 11 39 PM (1)](https://github.com/user-attachments/assets/b5105b95-96b6-45f4-a21c-fce5b54830bb)


Binary Logic:
The sets are arranged such that each number between 0 and 31 can be uniquely represented in binary. For example, if the chosen number is 5, it will appear in sets corresponding to the binary positions that add up to 5 (101 in binary: sets 1 and 3).
By summing up the values for each set in which the number appears, the program can accurately determine the number the user has in mind.
End of Game:

Once all sets have been checked, the program outputs the final number it has computed based on the user's responses. This number is the user's chosen number.
