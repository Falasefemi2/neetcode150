<!-- @format -->

# NeetCode 150 Java Solutions

This repository contains Java implementations of the problems from the [NeetCode 150](https://neetcode.io/practice?tab=neetcode150) — a curated list of 150 essential data structures and algorithms problems.

The goal is to provide **clear**, **well-documented**, and **efficient** solutions for each proble

---

## 📚 Table of Contents

- [About](#about)
- [Project Structure](#project-structure)
- [How to Use](#how-to-use)
- [How to Contribute](#how-to-contribute)
- [License](#license)
- [Acknowledgements](#acknowledgements)

---

## 📖 About

NeetCode 150 is a popular set of coding interview questions covering a wide range of topics including:

- Arrays
- Linked Lists
- Trees
- Hash Maps
- Graphs
- Dynamic Programming
- Heaps
- Tries
- Backtracking
- Sliding Window

This project provides:

- ✅ Java solutions for each problem
- 📝 Explanations and inline comments
- 🧪 Unit tests for correctness

---

## 📁 Project Structure

```
neetcode150/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/neetcode/
│   │           └── App.java     # Main application (entry point)
│   ├── test/
│   │   └── java/
│   │       └── com/neetcode/
│   │           └── AppTest.java # Unit tests
│   └── README.md                # Project documentation
└── target/                      # Compiled files (auto-generated)
```

## How to Use

### Prerequisites

- Java 8 or higher
- [Maven](https://maven.apache.org/)

### Build and Run

1. **Clone the repository:**

   ```sh
   git clone https://github.com/falasefemi2/neetcode150.git
   cd neetcode150
   ```

2. **Compile the project:**

   ```sh
   mvn compile
   ```

3. **Run tests:**

   ```sh
   mvn test
   ```

4. **Run the main application (if applicable):**
   ```sh
   mvn exec:java -Dexec.mainClass="com.neetcode.App"
   ```

### Adding New Solutions

- Add your solution in the appropriate package under `src/main/java/com/neetcode/`.
- Write corresponding unit tests in `src/test/java/com/neetcode/`.

## How to Contribute

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Add your solution and tests.
4. Commit your changes: `git commit -m "Add solution for [problem name]"`
5. Push to your fork: `git push origin feature/your-feature-name`
6. Open a pull request.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

## Acknowledgements

- [NeetCode](https://neetcode.io/) for the problem list and explanations.
- Java and open-source community for tools and libraries.
