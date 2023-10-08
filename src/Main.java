import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
//         int[] nums={3,2,4};
//         int target = 6;
//        Solution solution = new Solution();
//        solution.twoSum(nums,target);
//        System.out.println("Hello world!");
//
//        System.out.println(100 + 100 + "Simplilearn");
//
//                System.out.println("E-Learning Company" + 100 + 100);



        // liked list : Add 2 numbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        LinkedListAddition addition = new LinkedListAddition();
        ListNode result = addition.addTwoNumbers(l1,l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

        // longest String
        String s = "abcabcbb";
        FindLongString findLongString = new FindLongString();
        int y = findLongString.longestSubString(s);
        System.out.println(y);
    }


}