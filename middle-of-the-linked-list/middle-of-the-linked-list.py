# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        dummy = head
        length = 0
        
        while dummy:
            length += 1
            dummy = dummy.next
            
        index = 0
        while head and index < (length // 2):
            head = head.next
            index += 1
        
        return head
        