package interviews.linkedin._339_Nested_List_Weight_Sum;

import java.util.List;

import utils.nestedInteger.NestedInteger;

/**
 * @author jacka
 * @version 1.0 on 10/22/2017.
 */
public class Solution {
  public int depthSum(List<NestedInteger> nestedList) {
    return depthSum(nestedList, 1);
  }

  private int depthSum(List<NestedInteger> nestedList, int depth) {
    int result = 0;
    for (NestedInteger nestedInteger : nestedList) {
      if (nestedInteger.isInteger()) {
        result += nestedInteger.getInteger() * depth;
      } else {
        result += depthSum(nestedInteger.getList(), depth + 1);
      }
    }
    return result;
  }
}
