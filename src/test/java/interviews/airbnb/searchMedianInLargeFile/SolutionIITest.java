package interviews.airbnb.searchMedianInLargeFile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIITest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new SolutionII();
  }

  @Test
  void testOnlineCase1() {
    final int[] nums = {2, 2, 3, 4, 5, 5, 6};
    assertEquals(4, solution.findMedian(nums));
  }

  @Test
  void testOnlineCase2() {
    final int[] nums = {1};
    assertEquals(1, solution.findMedian(nums));
  }

  @Test
  void testOnlineCase3() {
    final int[] nums = {1, 2};
    assertEquals(1.5, solution.findMedian(nums));
  }
}