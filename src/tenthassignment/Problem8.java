package tenthassignment;

import java.util.HashMap;
import java.util.Map;

public class Problem8 {
    public ListNode removeZeroSumSubLists(ListNode head) {
        int prefixSum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> hashMap = new HashMap<>();
        hashMap.put(0, dummy);
        for (ListNode i = dummy; i != null; i = i.next) {
            prefixSum += i.val;
            hashMap.put(prefixSum, i);
        }
        prefixSum = 0;
        for (ListNode i = dummy; i != null; i = i.next) {
            prefixSum += i.val;
            i.next = hashMap.get(prefixSum).next;
        }
        return dummy.next;
    }
}
