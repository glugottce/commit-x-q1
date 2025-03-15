n = int(input())
arr = list(map(int, input().split()))
max_sum = cur = arr[0]
for i in arr[1:]:
    cur = max(i, cur+i)
    max_sum = max(max_sum, cur)
print(max_sum)