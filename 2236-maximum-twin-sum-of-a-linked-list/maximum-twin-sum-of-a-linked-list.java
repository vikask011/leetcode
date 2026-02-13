/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int left=0;
        int right=list.size()-1;
        int maxsum=0;

        while(left<right){
            int sum=list.get(left)+list.get(right);
            maxsum=Math.max(maxsum,sum);
            left++;
            right--;
        }
        return maxsum;
    }
}