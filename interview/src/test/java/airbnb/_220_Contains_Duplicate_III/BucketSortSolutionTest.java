package airbnb._220_Contains_Duplicate_III;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 1/27/2019.
 */
class BucketSortSolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new BucketSortSolution();
  }

  @Test
  void testNegativeT() {
    final int[] input = new int[]{1, 5, 1, 66, 5, 3};
    assertTrue(solution.containsNearbyAlmostDuplicate(input, 1, 65));
  }

  @Test
  void testNegativeK() {
    final int[] input = new int[]{1, 10000, 66};
    assertFalse(solution.containsNearbyAlmostDuplicate(input, 1, 65));
  }

  @Test
  void test1And1() {
    final int[] input = new int[]{1};
    assertFalse(solution.containsNearbyAlmostDuplicate(input, 1, 1));
  }

  @Test
  void test1And3And1() {
    final int[] input = new int[]{1, 3, 1};
    assertTrue(solution.containsNearbyAlmostDuplicate(input, 2, 1));
  }

  @Test
  void testK0() {
    final int[] input = new int[]{1, 2};
    assertFalse(solution.containsNearbyAlmostDuplicate(input, 0, 1));
  }

  @Test
  void testOverflow() {
    final int a = 2147483647;
    final int[] input = new int[]{0, a};
    assertTrue(solution.containsNearbyAlmostDuplicate(input, 1, a));
  }

  @Test
  void testT0() {
    final int[] input = new int[]{-1, -1};
    assertTrue(solution.containsNearbyAlmostDuplicate(input, 1, 0));
  }

  @Test
  void testFailed() {
    final int[] input = new int[]{2, 1};
    assertTrue(solution.containsNearbyAlmostDuplicate(input, 1, 1));
  }

  @Test
  void testFailed2() {
    final int[] input = new int[]{-1, 2147483647};
    assertFalse(solution.containsNearbyAlmostDuplicate(input, 1, 2147483647));
  }
}