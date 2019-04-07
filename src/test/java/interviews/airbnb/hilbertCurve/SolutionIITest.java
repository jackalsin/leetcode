package interviews.airbnb.hilbertCurve;

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
    assertEquals(3, solution.hilbertCurve(1, 1, 2));
  }

  @Test
  void testOnlineCase2() {
    assertEquals(2, solution.hilbertCurve(0, 1, 1));
  }

  @Test
  void testOnlineCase3() {
    assertEquals(1, solution.hilbertCurve(0, 0, 2));
    assertEquals(2, solution.hilbertCurve(1, 0, 2));
    assertEquals(3, solution.hilbertCurve(1, 1, 2));
    assertEquals(4, solution.hilbertCurve(0, 1, 2));
    assertEquals(5, solution.hilbertCurve(0, 2, 2));
    assertEquals(6, solution.hilbertCurve(0, 3, 2));
    assertEquals(7, solution.hilbertCurve(1, 3, 2));
    assertEquals(8, solution.hilbertCurve(1, 2, 2));
    assertEquals(9, solution.hilbertCurve(2, 2, 2));
    assertEquals(10, solution.hilbertCurve(2, 3, 2));
    assertEquals(11, solution.hilbertCurve(3, 3, 2));
    assertEquals(12, solution.hilbertCurve(3, 2, 2));
    assertEquals(13, solution.hilbertCurve(3, 1, 2));
    assertEquals(14, solution.hilbertCurve(2, 1, 2));
    assertEquals(15, solution.hilbertCurve(2, 0, 2));
    assertEquals(16, solution.hilbertCurve(3, 0, 2));
  }
}