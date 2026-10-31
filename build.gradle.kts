plugins {
  java
}

group = "prac"
version = "0.1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

java {
  // Compile with the installed JDK (26) but target the Java 21 language/API level.
  // This keeps the practice repo compatible with common toolchains.
  sourceCompatibility = JavaVersion.VERSION_21
  targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
  testImplementation(platform("org.junit:junit-bom:5.11.4"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("com.google.truth:truth:1.4.4")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile>().configureEach {
  options.release = 21
  options.encoding = "UTF-8"
  options.compilerArgs.addAll(listOf("-Xlint:all", "-Xlint:-processing", "-parameters"))
}

tasks.withType<Test>().configureEach {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
    exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
  }
  // Surface assertion messages and make flaky ordering obvious during learning.
  maxParallelForks = 1
}
