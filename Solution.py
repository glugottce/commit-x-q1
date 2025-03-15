n=int(input())
l = list(map(int, input().split()))
greatest = 0
result = []
for i in range(1, len(l)):
    test = []
    for j in range(i, len(l)):
        test.append(l[j])
        if sum(test) > greatest:
            greatest = sum(test)
            result = test

print(greatest)
