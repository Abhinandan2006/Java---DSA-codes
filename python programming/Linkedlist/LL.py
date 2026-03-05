class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def insert_begin(self, data):
        new_node = Node(data)
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

    def delete(self, key):
        temp = self.head
        if temp and temp.data == key:
            self.head = temp.next
            return
        prev = None

        while temp and temp.data != key:
            prev = temp
            temp = temp.next
        
        if temp is None:
            return
        
        prev.next = temp.next

    def display(self):
        temp = self.head

        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next

        print("None")


def main():
    ll = LinkedList()

    ll.insert_begin(3)
    ll.insert_begin(1)

    ll.insert_end(5)
    ll.insert_end(7)

    ll.display()

    ll.delete(5)

    ll.display()


if __name__ == "__main__":
    main()