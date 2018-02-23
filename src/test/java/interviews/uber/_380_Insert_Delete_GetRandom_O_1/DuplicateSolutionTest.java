package interviews.uber._380_Insert_Delete_GetRandom_O_1;

import _351_400._381_Insert_Delete_GetRandom_O_1_Duplicates_allowed.RandomizedCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DuplicateSolutionTest {
  @Test
  public void testFailedCase1() throws Exception {
//    ["RandomizedCollection","insert","insert","insert","insert","insert","remove","remove","remove","remove"]
//    [[],                      [4],      [3],      [4],    [2],    [4],      [4],    [ 3],     [4],    [4]]
    final RandomizedCollection randomizedCollection = new RandomizedCollection();
    assertTrue(randomizedCollection.insert(4));
    assertTrue(randomizedCollection.insert(3));
    assertFalse(randomizedCollection.insert(4));
    assertTrue(randomizedCollection.insert(2));
    assertFalse(randomizedCollection.insert(4));

    assertTrue(randomizedCollection.remove(4));
    assertTrue(randomizedCollection.remove(3));
    assertTrue(randomizedCollection.remove(4));
    assertTrue(randomizedCollection.remove(4));
  }
}