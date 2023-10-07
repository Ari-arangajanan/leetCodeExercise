import ListNode.*;

public class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode temp = node;
        int carry = 0;
            while(null != l1 || null != l2 || carry ==1){
                int sum =0;
                if (l1 != null){
                    sum += l1.val;
                    l1=l1.next;
                }
                if (l2 != null){
                    sum += l2.val;
                    l2=l2.next;
                }
                sum += carry;
                carry = sum / 10;
                sum %= 10;
                temp.next = new ListNode(sum);
                temp = temp.next;
            }

        return node.next;
    }
}
