# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head.next == None:
                return None

        fast = head
        slow = head
        count = 0

        while fast and fast.next:
            slow.next
            fast = fast.next.next
            count += 1

        for  _ in range(count - 1):
            slow = slow.next

        slow.next = slow.next.next

        return head