package interviews.airbnb.findAllKEditDistance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrieSolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new TrieSolution();
  }

  @Test
  void testOnlineCase1() {
    final String[] input = {
        "abc", "acc", "a"
    };
    final String target = "adc";
    final List<String> actual = solution.getKEditDistance(input, target, 1);
    final Set<String> expected = Set.of(
        "abc", "acc"
    );
    System.out.println(actual.size());
    assertEquals(expected, new HashSet<>(actual));
  }

  @Test
  void testOnlineCaseOnAdding() {
    final String[] input = {
        "abc", "acc", "a"
    };
    final String target = "adc";
    final List<String> actual = solution.getKEditDistance(input, target, 2);
    final Set<String> expected = Set.of("a");
    assertEquals(expected, new HashSet<>(actual));
  }

  @Test
  void testOnlineCaseOnRemoving() {
    final String[] input = {
        "abd", "bcc", "adcd"
    };
    final String target = "adc";
    final List<String> actual = solution.getKEditDistance(input, target, 1);
    final Set<String> expected = Set.of("adcd");
    assertEquals(expected, new HashSet<>(actual));
  }
}