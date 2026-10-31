# caffeine_prac

Independent, from-scratch implementation of Caffeine's cache core, built challenge by challenge.

## Layout

```
src/main/java/prac/cache/   <- production code
src/test/java/prac/cache/   <- JUnit 5 + Truth tests
```

## Commands

```bash
./gradlew test          # run all tests
./gradlew test --tests '*BasicCacheTest*'   # run one test class
./gradlew compileJava   # compile only
```

Java 21 language/API level; the wrapper uses Gradle 9.8.0-rc-2 (matching the real repo).

## Stage progress

- [ ] Stage 0: `Cache`, `CacheStats`, `Caffeine` builder
- [ ] Stage 1: `BasicCache` (CHM-backed, stats)
- [ ] Stage 2: bounded LRU
- [ ] Stage 3: time-based expiry
- [ ] Stage 4: weighted size
- [ ] Stage 5: frequency sketch
- [ ] Stage 6: TinyLFU admission
- [ ] Stage 7: lock-free read buffering
- [ ] Stage 8: striped write locks
- [ ] Stage 9: timer wheel
- [ ] Stage 10: loading / async caches
- [ ] Stage 11: polish (spec parsing, listeners, serialization, weak refs)
