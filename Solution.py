def max_subarray_sum(arr):
    max_sum = float('-inf')
    cur_sum = 0
    for num in arr:
        cur_sum += num
        max_sum = max(max_sum, cur_sum)
        if cur_sum < 0:
            cur_sum = 0
    return max_sum

n = int(input())
arr = list(map(int, input().split()))
print(max_subarray_sum(arr))

