# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        # create slow and fast pointers
        # spread them by n distance
        # once fast is done, slow.next = the node after
        fast = head
        slow = head

        if not head or not head.next:
            return None

        for _ in range(n):
            fast = fast.next

        
        if not fast:
            return head.next

        while fast.next and fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
    

        return head
        
