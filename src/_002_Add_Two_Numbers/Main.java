package _002_Add_Two_Numbers;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class InitList {
    public ListNode CreateList(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[nums.length - 1]);
        ListNode currentNode = head;
        for (int i = nums.length - 2; i >=0; i--) {
            currentNode.next = new ListNode(nums[i]);
            currentNode = currentNode.next;
        }
        return head;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); // 初始化头结点
        ListNode currentNode = head;
        int carry = 0; // 代表进位
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
//        if (carry > 0) {
//            currentNode.next = new ListNode(carry);
//        }
        return head.next;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[] {5};
        int[] nums2 = new int[] {5};
        ListNode l1 = new InitList().CreateList(nums1);
        ListNode l2 = new InitList().CreateList(nums2);
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
