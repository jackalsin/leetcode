package _0701_0750._730_Count_Different_Palindromic_Subsequences;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 1/14/2018.
 */
class ThreeDimensionDpTest {
  private Solution solution;

  @BeforeEach
  void setUp() throws Exception {
    solution = new ThreeDimensionDp();
  }

  @Test
  void testOnlineCase1() throws Exception {
    final String input = "bccb";
    assertEquals(6, solution.countPalindromicSubsequences(input));
  }

  @Test
  void testOnlineCase2() throws Exception {
    final String input = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
    assertEquals(104860361, solution.countPalindromicSubsequences(input));
  }
}