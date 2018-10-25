package interviews.linkedin._040_Combination_Sum_II;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIITest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new SolutionII();
  }

  @Test
  void testWithOnlineCase() {
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(1, 7));
    expect.add(Arrays.asList(1, 2, 5));
    expect.add(Arrays.asList(2, 6));
    expect.add(Arrays.asList(1, 1, 6));

    List<List<Integer>> actual = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    assertEquals(expect.size(), actual.size());
    assertEquals(new HashSet<>(expect), new HashSet<>(actual));

  }

  @Test
  void testWithTripleElements() {
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(1, 1, 6));

    List<List<Integer>> actual = solution.combinationSum2(new int[]{1, 1, 1, 6, 10}, 8);
    assertEquals(expect.size(), actual.size());
    assertEquals(new HashSet<>(expect), new HashSet<>(actual));

  }
}