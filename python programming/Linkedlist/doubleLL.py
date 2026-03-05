class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_begin(self, data):
        new_node = Node(data)

        if self.head is not None:
            self.head.prev = new_node
            new_node.next = self.head
        
        self.head = new_node

    def insert_end(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return
        temp = self.head

        while temp.next:
            temp = temp.next
        
        temp.next = new_node
        new_node.prev = temp

    def display_forward(self):
        temp = self.head

        while temp:
            print(temp.data, end=" <-> ")
            temp = temp.next

        print("None")

def main():
    dll = DoublyLinkedList()

    dll.insert_begin(3)
    dll.insert_begin(1)

    dll.insert_end(5)
    dll.insert_end(7)

    print("Forward:")
    dll.display_forward()


if __name__ == "__main__":
    main()