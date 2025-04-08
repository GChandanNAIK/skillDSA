class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def remove_duplicates(head):
    current = head
    while current and current.next:
        if current.val == current.next.val:
            current.next = current.next.next  # Skip the duplicate node
        else:
            current = current.next  # Move to the next node
    return head

# Helper function to print the linked list
def print_list(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example Usage:
head = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3, None)))))
print("Before removing duplicates:")
print_list(head)
head = remove_duplicates(head)
print("After removing duplicates:")
print_list(head)
