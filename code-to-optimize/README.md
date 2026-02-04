# Code Optimization Demo

This project demonstrates code optimization opportunities in Java, with comprehensive test coverage using both JUnit 4 and JUnit 5.

## Project Structure

- `src/main/java/com/example/optimization/` - Classes with inefficient code that needs optimization
- `src/test/java/com/example/optimization/` - Test suite using JUnit 4 and JUnit 5

## Classes with Optimization Opportunities

### 1. StringProcessor
Contains inefficient string operations:
- **concatenateStrings()**: Uses String concatenation in loop (O(n²)) → Should use StringBuilder (O(n))
- **sanitizeInput()**: Creates multiple intermediate String objects → Should use StringBuilder
- **reverseWords()**: Uses repeated string concatenation → Should use StringBuilder

### 2. CollectionProcessor
Contains inefficient collection operations:
- **removeDuplicates()**: Uses ArrayList.contains() (O(n²)) → Should use HashSet (O(n))
- **sumOfEvens()**: Multiple passes through collection → Should use single pass
- **filterPositive()**: Inefficient recursion with subList → Should use iterative approach

### 3. DataCalculator
Contains inefficient algorithms:
- **fibonacci()**: Exponential time complexity O(2ⁿ) → Should use dynamic programming O(n)
- **isPrime()**: Checks all numbers up to n → Should check only up to √n
- **powerModulo()**: Simple loop → Should use fast modular exponentiation

## Testing Framework

### JUnit 5 Tests
- `StringProcessorTest.java` - Uses JUnit 5 features (@DisplayName, @BeforeEach)
- `DataCalculatorTest.java` - Uses JUnit 5 with parameterized tests

### JUnit 4 Tests
- `CollectionProcessorTest.java` - Uses JUnit 4 (@Before, @Test)

Both frameworks work together using JUnit Vintage Engine.

## Build and Test

### Run all tests
```bash
./gradlew test
```

### Run specific test class
```bash
./gradlew test --tests StringProcessorTest
./gradlew test --tests CollectionProcessorTest
./gradlew test --tests DataCalculatorTest
```

### Build project
```bash
./gradlew build
```

### Clean build
```bash
./gradlew clean build
```

## Optimization Tasks

Each class method includes comments explaining:
1. Why the current implementation is inefficient
2. What optimization approach should be used
3. Time/space complexity improvements

## Requirements

- Java 11 or higher
- Gradle 7.x or higher
