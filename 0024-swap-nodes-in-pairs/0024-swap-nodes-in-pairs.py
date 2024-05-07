class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head

        dummy = ListNode(0)  # Create a dummy node with value 0
        dummy.next = head
        prev = dummy  # prev starts as the dummy node
        curr = head

        while curr and curr.next:
            nextNode = curr.next.next
            
            # Swap the current pair
            prev.next = curr.next
            curr.next.next = curr
            curr.next = nextNode

            # Move to the next pair
            prev = curr
            curr = nextNode

        return dummy.next
