// int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
//     for (int i = 0; i < numsSize; i++) {
//         for (int j = i + 1; j < numsSize; j++) {
//             if (nums[j] == target - nums[i]) {
//                 int* result = malloc(sizeof(int) * 2);
//                 result[0] = i;
//                 result[1] = j;
//                 *returnSize = 2;
//                 return result;
//             }
//         }
//     }
//     *returnSize = 0;
//     return malloc(sizeof(int) * 0);
// }

// #include <stdio.h>
// int main()
// {
//     int n, i;
//     scanf("%d", &n);
//     int a[n];
//     for (int i = 0; i < n; i++)
//         scanf("%d", &a[i]);
//     sort(i, a[i], n);
// }
// int sortend(int i, int a[i], int n)
// {
//     if (i == n)
//         return 1;
//     printf("%d", a[i]);
//     sortend(i, a[i], n);
// }

// #include <stdio.h>
// int main()
// {
//     int a[] = {1, 2, 3, 4, 5};
//     int n = sizeof(a) / sizeof(a[0]);
//     for (int i = 0; i <= n - 1; i++)
//     {
//         int min = i;
//         for (int j = i + 1; i <= n; i++)
//         {
//             if (a[j]<a[min])
//             {
//                 min=j;
//             }
//         }
//         int temp=a[i];
//             a[i]=a[min];
//             a[min]=temp;
//     }
//     printf("\n");
//     for (int i = 0; i < n; i++)
//     {
//        printf("%d ",a[i]);
//     }

//     return 0;
// }

// #include <stdio.h>
// void insertionsort(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         int k = arr[i];
//         int j = i - 1;
//         while (j >= 0 && k < arr[j])
//         {
//             arr[j + 1] = arr[j];
//             j--;
//         }
//         arr[j + 1] = k;
//     }
// }
// int main()
// {
//     int arr[] = {2,5,8,9,0};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     insertionsort(arr, n);
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", arr[i]);
//     }

//     return 0;
// }

#include <stdio.h>
int main()
{
    printf("hello world");
}