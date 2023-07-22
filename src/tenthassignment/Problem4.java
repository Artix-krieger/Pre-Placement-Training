package tenthassignment;

public class Problem4 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 steps
            if (slow == fast) break; // meeting point
        }
        if (fast == null || fast.next == null) return null; // No Cycle
        fast = head;
        while (fast != slow) {
            if (slow == null) return null;
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
