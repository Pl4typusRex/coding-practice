# coding-practice
Little projects in different languages to practice logic, algorithms, etc.
_________________________________

<strong>Quick Select</strong>

A selection algorithm that combines elements of quick sort and binary sort to find kth smallest item in a sequence of integers.

______________________________________

<strong>Grade book</strong>

Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.

______________________________________

<strong>Fake Binary</strong>

Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

______________________________________

<strong>Fibonacci.rb</strong>

Calculates and prints the first x numbers of the Fibonacci sequence where x is user input.

______________________________________

<strong>Take a Ten Minute Walk</strong>

You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block in a direction and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
______________________________________

<strong>Highest and Lowest</strong>

In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5")  // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

______________________________________

<strong>Disemvowel Trolls</strong>

Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.

______________________________________

<strong>Regex Validate PIN Codes</strong>

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

eg:

Solution.validatePin("1234") === true
Solution.validatePin("12345") === false
Solution.validatePin("a234") === false

______________________________________


