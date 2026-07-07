# JavaTrainingIV

A structured Java practice workspace focused on fundamentals, problem-solving, and algorithm drills.

![Language](https://img.shields.io/badge/Language-Java-blue)
![Style](https://img.shields.io/badge/Type-Learning%20Exercises-2ea44f)
![Projects](https://img.shields.io/badge/Modules-3-orange)

## Project Snapshot

This repository is organized as three IntelliJ-style modules:

- `TrainingIV` -> core Java fundamentals and beginner-to-intermediate problem solving.
- `Practice` -> algorithm and interview-style exercises (sorting, searching, strings, arrays).
- `StringProblems` -> focused recursion and string manipulation patterns.

| Module | Theme | Class Count |
|---|---|---:|
| `TrainingIV` | Java fundamentals, arrays, recursion basics | 39 |
| `Practice` | Algorithm drills and interview-style problems | 21 |
| `StringProblems` | Recursive string patterns | 2 |

### Measured Size (current)

- Total Java classes: **62**
- `TrainingIV/src`: **39** classes
- `Practice/src`: **21** classes
- `StringProblems/src`: **2** classes

## Deep Analysis

### 1) Learning Progression

The codebase shows a clear progression from basics to algorithmic thinking:

- Input/output and arithmetic: `AreaOfCircle`, `AVGOf3Numbers`, `Calc`, `SumOfTwoNumbers`
- Conditional logic: `BiggestOfThree`, `OddOrEven`, `LeapYear`, `Weekdays`
- Loops and arrays: `UseForLoop`, `ArrayPractice`, `Array2D`, `ArraySum`, `LargestElement`
- Methods and overloading: `Welcome`, `OverloadingExample`
- Searching/sorting: `Search`, `BS`, `BubbleSort`, `MergeSort`, `QuickSort`
- String and hash-based problems: `Anagram`, `FirstNonRepeating`, `FirstUnique`, `Twosum`, `StringPalindrome`
- Recursion foundations: `RecursionBasics`, `RecFact`, `RecursiveFibo`, `Subsequence`

This is a good staircase for mastering DSA-style interview questions after Java fundamentals.

### 2) Technical Characteristics

- Most files are standalone classes with `main` methods, ideal for focused experimentation.
- Heavy use of Java standard library (`Scanner`, `Arrays`, `HashMap`, `ArrayList`, `StringBuilder`).
- No package declarations: this keeps beginner setup simple but limits scalability.
- Naming is mostly descriptive and problem-oriented, making intent easy to follow.

### 3) Strengths

- Broad topic coverage with practical exercises.
- Good mix of iterative and recursive problem-solving styles.
- Many examples are concise and easy to run independently.
- Includes core interview patterns: two-sum, binary search, merge sort, string filtering, palindrome checks.

### 4) Gaps / Risks

- There is no unified build system (`pom.xml`/`build.gradle`) or automated test suite.
- Some files appear exploratory/in-progress (`Subsquences` is mostly a stub).
- Since classes are independent and package-less, large-scale refactoring will be harder later.
- Edge-case handling and input validation are not standardized across files.

### 5) Recommended Evolution Path

1. Add package structure (example: `fundamentals`, `arrays`, `strings`, `recursion`, `sorting`, `searching`).
2. Introduce JUnit tests for each algorithm class.
3. Move logic into reusable methods/classes and keep `main` only as a runner.
4. Add complexity notes (time/space) in comments or markdown docs.
5. Add one build tool (Maven or Gradle) for repeatable builds.

## Module Breakdown

### `TrainingIV`

Focus: Java basics, control flow, arrays, introductory recursion.

Key examples:

- Fundamentals: `WithVariable`, `WithoutVariable`, `Operators`, `Number`
- Conditionals: `GradeSystem`, `BiggestOfThree`, `OddOrEven`, `LeapYear`
- Arrays: `ArrayPractice`, `Array2D`, `ArrayRecursive`, `Leader`, `LargestElement`
- Strings: `StringPractice`, `ReverseAWords`, `RlettersOnly`
- Recursion: `RecursionBasics`, `RecFact`, `RecursiveFibo`

### `Practice`

Focus: algorithm drills and interview-style coding tasks.

Key examples:

- Searching/sorting: `BS`, `BubbleSort`, `MergeSort`, `QuickSort`
- String logic: `Anagram`, `StringPalindrome`, `RemoveDuplicates`
- Hashing patterns: `Twosum`, `FirstUnique`, `FirstNonRepeating`
- Number/array problems: `MissingNumber`, `SecondLarge`, `Intersection`, `Prime`, `SumOfDigits`

### `StringProblems`

Focus: recursive string transformations and subsequence generation.

Key examples:

- `Skip`: skip/remove character patterns and substring rules.
- `Subsequence`: recursive subsequence generation including ASCII variants.

## How To Run

### Option A: IntelliJ IDEA (recommended for this workspace)

1. Open the folder root in IntelliJ.
2. Mark each `src` folder as a Sources Root if needed.
3. Run any class containing `public static void main(String[] args)`.

### Option B: Command Line (JDK required)

From a module `src` directory:

```powershell
javac *.java
java ClassName
```

Example:

```powershell
cd TrainingIV/src
javac Welcome.java
java Welcome
```

## Build Status Note

A Java compiler was not available in the current execution environment while generating this README, so runtime compilation was not validated in-session.

## Suggested Next Enhancements

- Add `README` files inside each module with curated problem lists.
- Add a `tests` folder with JUnit 5 tests for core algorithms.
- Add a single consolidated `ProblemsIndex.md` with tags (array/string/recursion/sort/search).

---

If you want, I can next generate:

1. A clean package refactor plan and folder structure.
2. A starter JUnit test suite for the top 10 algorithms.
3. A Maven or Gradle setup without breaking the current learning flow.


With Love From Subash 💘