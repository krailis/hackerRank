import sys

if __name__ == "__main__":
    n, m = input().strip().split(' ')
    n, m = [int(n), int(m)]
    arr = []
    for arr_i in range(n):
        arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
        arr.append(arr_t)
    k = int(input().strip())
    arr = sorted(arr, key = lambda el: el[k])
    for i in range(n):
        for j in range(m):
            print(arr[i][j], end=" ")
        print()
