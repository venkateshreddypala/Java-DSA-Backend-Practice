# Java DSA Backend Practice

A tidy Gradle-based Java repo for practicing **data structures & algorithms** the way you’d build and test backend code: clear packages, clean interfaces, fast unit tests, and CI.

## Tech
- Java 21 (toolchain)
- Gradle (KTS)
- JUnit 5 + parameterized tests
- GitHub Actions (CI)

## How to run
```bash
./gradlew test
```

> Want a different Java version? Edit `build.gradle.kts` → `languageVersion`.

## Structure
```
src/
  main/java/dev/dsa/
    arrays/twopointers/       # Two-pointer family (and friends)
    search/                   # Binary search family
    strings/slidingwindow/    # Sliding window variants
    hashing/                  # Hash-table patterns
    dp/                       # Dynamic programming
    util/                     # Small helpers
  test/java/dev/dsa/
docs/
  Algorithm_Relationships.md  # Your systematic pattern guide
templates/
  AlgorithmTemplate.java      # Copy-start for new problems
```

## Start here
- Browse `docs/Algorithm_Relationships.md` (your guide, verbatim).
- Read and run tests under `src/test/java/...` — treat them like acceptance criteria.
- Add more problems following the pattern folders and `templates/AlgorithmTemplate.java`.

## Roadmap
- [ ] Add heaps/priority-queue problems (Top-K, streaming)
- [ ] Graph algorithms (Dijkstra, Union-Find, TopoSort)
- [ ] Property-based tests (jqwik) for more robustness
