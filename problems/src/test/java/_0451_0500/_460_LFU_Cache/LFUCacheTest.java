package _0451_0500._460_LFU_Cache;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author jacka
 * @version 1.0 on 7/7/2017.
 */
class LFUCacheTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase(Class<LFUCache> cacheClass) throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    LFUCache cache = cacheClass.getConstructor(Integer.TYPE).newInstance(2);

    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(1, cache.get(1));       // returns 1
    cache.put(3, 3);    // evicts key 2
    assertEquals(-1, cache.get(2));       // returns -1 (not found)
    assertEquals(3, cache.get(3));       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    assertEquals(-1, cache.get(1));       // returns -1 (not found)
    assertEquals(3, cache.get(3));       // returns 3
    assertEquals(4, cache.get(4));       // returns 4
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testEmpty(Class<LFUCache> cacheClass) throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    LFUCache cache = cacheClass.getConstructor(Integer.TYPE).newInstance(2);
    cache.put(0, 0);
    cache.get(0);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testFailedCase1(Class<LFUCache> cacheClass) throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    LFUCache cache = cacheClass.getConstructor(Integer.TYPE).newInstance(2);
    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(1, cache.get(1));
    cache.put(3, 3);
    assertEquals(-1, cache.get(2));
    assertEquals(3, cache.get(3));
    cache.put(4, 4);
    assertEquals(-1, cache.get(1));
    assertEquals(3, cache.get(3));
    assertEquals(4, cache.get(4));

  }

  static Stream<Class> solutionStream() {
    return Stream.of(
        LFUCache.class
    );
  }
}
