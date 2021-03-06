package linkedin._155_Min_Stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStack1StacksTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(MinStack minStack) {
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());  //  --> Returns -3.
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase2(MinStack minStack) {
    minStack.push(0);
    minStack.push(1);
    minStack.push(0);
    assertEquals(0, minStack.getMin());  //  --> Returns 0.
    minStack.pop();
    assertEquals(0, minStack.getMin());
  }

  static Stream<MinStack> solutionStream() {
    return Stream.of(
        new MinStack1Stacks(),
        new MinStack2Stacks(),
        new MinStack2StackI(),
        new MinStack1StackI(),
        new MinStack2StackII(),
        new MinStack1StackII()
    );
  }
}