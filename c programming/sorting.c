// #include <stdio.h>
// void bubble(int arr[], int n)
// {
//     for (int i = 0; i < n - 1; i++)
//     {
//         for (int j = 0; j < n - i - 1; j++)
//         {
//             if (arr[j + 1] < arr[j])
//             {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", arr[i]);
//     }
// }
// int main()
// {
//     int arr[] = {2, 5, 3, 6, 2, 1};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     bubble(arr, n);
// }

// #include <stdio.h>
// void selection(int arr[], int n)
// {
//     for (int i = 0; i < n - 1; i++)
//     {
//         int min = i;
//         for (int j = i + 1; j < n; j++)
//         {
//             if (arr[j] < arr[min])
//             {
//                 min = j;
//             }
//         }
//         int temp = arr[i];
//         arr[i] = arr[min];
//         arr[min] = temp;
//     }
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ",arr[i]);
//     }
    
// }
// int main()
// {
//     int arr[] = {2, 5, 3, 6, 2, 1};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     selection(arr, n);
// }

// #include <stdio.h>
// void insertion(int arr[], int n)
// {
//     for (int i = 1; i < n; i++)
//     {
//         int curr = arr[i];
//         int j = i-1;
//         while (j>=0 && curr<arr[j])
//         {
//             arr[j+1] = arr[j];
//             j--;
//         }
//         arr[j+1] = curr;
//     }
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ",arr[i]);
//     }
    
    
// }
// int main()
// {
//     int arr[] = {2, 5, 3, 6, 2, 1};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     insertion(arr,n);
// }
// #include<stdio.h>
// void mergesort(int arr[], int si, int ei){
//     if (si>=ei)
//     {
//         return;
//     }
//     int mid = si+(ei-si)/2;
//     mergesort(arr,si,mid);
//     mergesort(arr,mid+1,ei);

// }
// void merger(int arr[], int si, int mid, int ei, int n){
//     int temp[ei-si+1];
//     int i =si;
//     int j = mid +1;
//     int k = 0;
//     while (i <= mid && j <= ei){
//         if (arr[i]<arr[j])
//         {
//             temp[k]=arr[i];
//             i++;
//         }else{
//             temp[k]= arr[j];
//             j++;
//         }
//         k++;
//     }
//     while (i<=mid)
//     {
//         temp[k++]= arr[i++];
//     }
//     while (j<=ei)
//     {
//        temp[k++] = arr[j++];
//     }
//     for (k=0, i=si; i <n ; k++, i++)
//     {
//         arr[i] = temp[k];
//     }
// }


#include <stdio.h>

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap the elements
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    bubbleSort(arr, n);
    
    printf("Sorted array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}
