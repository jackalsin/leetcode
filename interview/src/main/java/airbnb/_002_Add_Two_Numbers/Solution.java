package airbnb._002_Add_Two_Numbers;

import definition.ListNode;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    final ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    int carry = 0;
    while (carry != 0 || l1 != null || l2 != null) {
      int l1Val = l1 == null ? 0 : l1.val, l2Val = l2 == null ? 0 : l2.val;
      final int sum = l1Val + l2Val + carry;
      cur.next = new ListNode(sum % 10);
      carry = sum / 10;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
      cur = cur.next;
    }

    return dummy.next;
  }
}
