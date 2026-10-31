package prac.cache;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies the practice project's build and test wiring.
 *
 * <p>If this test runs and passes, then Gradle, the JUnit 5 engine, and Truth are all configured
 * correctly. You can safely delete this file once real cache tests exist.
 */
final class SetupSmokeTest {

  @Test
  @DisplayName("Gradle + JUnit 5 + Truth are wired up")
  void buildIsWiredUp() {
    assertThat(1 + 1).isEqualTo(2);
    assertThat("caffeine").contains("ffei");
    assertThat(new int[] {1, 2, 3}).hasLength(3);
  }

  @Test
  @DisplayName("Running on a supported Java version (21+)")
  void javaVersionIsSupported() {
    assertThat(Runtime.version().feature()).isAtLeast(21);
  }
}
