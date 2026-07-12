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
    public boolean isPalindrome(ListNode head) {
        ListNode reverse = head;
        
        Stack<Integer> st = new Stack<>();
        while(reverse != null){
            st.push(reverse.val);
            reverse=reverse.next;
           

        }
        reverse = head;
        while(reverse != null){
            if(st.pop() !=reverse.val){
                return false;
            }
            else{
                reverse=reverse.next;
                
            }
        }
        return true;
       

        
        
    }
}