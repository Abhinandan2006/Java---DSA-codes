#include <stdio.h>
#include <stdlib.h>

// Structure for a singly linked list node
struct Node {
    int data;
    struct Node* next;
};

// Function to traverse and print the list
void traverse(struct Node* head) {
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to search for a node with a given key
struct Node* search(struct Node* head, int key) {
    struct Node* temp = head;
    while (temp != NULL) {
        if (temp->data == key)
            return temp;
        temp = temp->next;
    }
    return NULL;
}

// Function to insert a node at the front
void insertAtFront(struct Node** head, int data) {
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = data;
    new_node->next = *head;
    *head = new_node;
}

// Function to insert a node at the end
void insertAtLast(struct Node** head, int data) {
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = data;
    new_node->next = NULL;

    if (*head == NULL) {
        *head = new_node;
        return;
    }

    struct Node* temp = *head;
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = new_node;
}

// Function to insert a node after a given node
void insertAfterNode(struct Node* prev_node, int data) {
    if (prev_node == NULL) {
        printf("Previous node cannot be NULL\n");
        return;
    }

    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = data;
    new_node->next = prev_node->next;
    prev_node->next = new_node;
}

// Function to insert a node before a given node with a specific key
void insertBeforeNode(struct Node** head, int key, int data) {
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = data;

    if (*head == NULL || (*head)->data == key) {
        new_node->next = *head;
        *head = new_node;
        return;
    }

    struct Node* temp = *head;
    while (temp->next != NULL && temp->next->data != key) {
        temp = temp->next;
    }

    if (temp->next == NULL) {
        printf("Node with value %d not found\n", key);
        return;
    }

    new_node->next = temp->next;
    temp->next = new_node;
}

// Function to delete the first node
void deleteFirstNode(struct Node** head) {
    if (*head == NULL)
        return;

    struct Node* temp = *head;
    *head = (*head)->next;
    free(temp);
}

// Function to delete the last node
void deleteLastNode(struct Node** head) {
    if (*head == NULL)
        return;

    struct Node* temp = *head;

    if (temp->next == NULL) {
        free(temp);
        *head = NULL;
        return;
    }

    while (temp->next->next != NULL)
        temp = temp->next;

    free(temp->next);
    temp->next = NULL;
}

// Function to delete a node with a given key
void deleteNode(struct Node** head, int key) {
    struct Node* temp = *head, *prev = NULL;

    if (temp != NULL && temp->data == key) {
        *head = temp->next;
        free(temp);
        return;
    }

    while (temp != NULL && temp->data != key) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) return;

    prev->next = temp->next;
    free(temp);
}

// Function to reverse the linked list
void reverse(struct Node** head) {
    struct Node *prev = NULL, *current = *head, *next = NULL;

    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    *head = prev;
}

// Main function to test the above operations
int main() {
    struct Node* head = NULL;

    insertAtFront(&head, 10);
    insertAtFront(&head, 20);
    insertAtLast(&head, 30);
    insertAfterNode(head->next, 25);
    traverse(head);

    deleteFirstNode(&head);
    deleteLastNode(&head);
    traverse(head);

    insertBeforeNode(&head, 25, 15);
    traverse(head);

    reverse(&head);
    traverse(head);

    struct Node* searchNode = search(head, 15);
    if (searchNode != NULL)
        printf("Node with data %d found\n", searchNode->data);
    else
        printf("Node not found\n");

    return 0;
}

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void linked(struct node *head)
{
    struct node *temp = head;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

void circularlinked(struct node *head)
{
    struct node *temp = head;
    while (temp != head)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

void print(struct node *head, int k)
{
    struct node *temp = head;
    int count = 0;
    if (count != k)
    {
        printf("%d", temp->data);
    }
    temp = temp->next;
    count++;
}

int main()
{
    struct node *head = malloc(sizeof(struct node));
    struct node *second = malloc(sizeof(struct node));
    struct node *third = malloc(sizeof(struct node));
    struct node *forth = malloc(sizeof(struct node));
    head->data = 10;
    head->next = second;
    second->data = 20;
    second->next = third;
    third->data = 30;
    third->next = forth;
    forth->data = 40;
    forth->next = NULL;
    linked(head);
    print(head, 1);
    circularlinked(second);
    return 0;
}


 