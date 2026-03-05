# def bubble_sort(arr):
#     n = len(arr)

#     for i in range(n):
#         for j in range(0, n - i - 1):
#             if arr[j] > arr[j + 1]:
#                 arr[j], arr[j + 1] = arr[j + 1], arr[j]
#     return arr
# arr = [5, 3, 8, 4, 2]
# print(bubble_sort(arr))


def merge(arr, left, mid , right):
    l = arr[left:mid + 1]
    r = arr[mid+1:right+1]

    i = 0
    j = 0
    k = left

    while i < len(l) and j < len(r):
        if l[i] <= r[j]:
            arr[k] = l[i]
            i += 1
        else:
            arr[k] = arr[j]
            j += 1
        k += 1
    while i < len(l):
        arr[k] = l[i]
        i += 1
        k += 1
    while j < len(r):
        arr[k] = r[j]
        j += 1
        k += 1
    
def merge_sort(arr, left, right):
    if left < right:
        mid = (left + right) // 2

        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)

        merge(arr, left, mid, right)

def main():
    arr = [38, 27, 43, 3, 9, 82, 10]

    merge_sort(arr, 0, len(arr) - 1)

    print("Sorted array:", arr)


if __name__ == "__main__":
    main()