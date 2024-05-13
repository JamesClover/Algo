# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # re-assign the node before the midddle node to point to node after middle
        # create a fast and slow pointer
        
        if not head.next:
            return None
        
        slow = head
        fast = head
        counter = 0
        
        # iterate once through the linked list moving slow by one and fast by two
        # create a variable to keep track of the length of the list
        # once we find middle, iterate again, re-assigning next pointers
        # return head
        
        while fast and fast.next:
            fast = fast.next.next
            counter += 1
        
        
        for _ in range(counter - 1):
            slow = slow.next
        
        slow.next = slow.next.next
        
        return head
        
        