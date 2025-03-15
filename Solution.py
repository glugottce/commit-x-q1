n=int(input())
a=list(map(int,input().split()))
max_sum=a[0]
current=0
for i in a:
    current+=i
    if current>max_sum:
        max_sum=current
    elif current<0:
        current=0
print(max_sum)