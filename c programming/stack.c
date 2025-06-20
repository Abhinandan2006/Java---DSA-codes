#include <stdio.h>
#include <stdlib.h>
#define MAX 100
struct Stack
{
    int top;
    int arr[MAX];
};

void initializeStack(struct Stack *stack)
{
    stack->top = -1;
}

int isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

int isFull(struct Stack *stack)
{
    return stack->top == MAX - 1;
}

void push(struct Stack *stack, int value)
{
    if (isFull(stack))
    {
        printf("Stack overflow\n");
        return;
    }
    stack->arr[++(stack->top)] = value;
    printf("%d pushed to stack\n", value);
}
int pop(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack underflow\n");
        return -1;
    }
    return stack->arr[(stack->top)--];
}

void display(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack is empty\n");
        return;
    }
    printf("Stack elements are: ");
    for (int i = 0; i <= stack->top; i++)
    {
        printf("%d ", stack->arr[i]);
    }
    printf("\n");
}

int main()
{
    struct Stack stack;
    initializeStack(&stack);

    push(&stack, 10);
    push(&stack, 20);
    push(&stack, 30);

    display(&stack);

    printf("%d popped from stack\n", pop(&stack));
    display(&stack);

    return 0;
}
