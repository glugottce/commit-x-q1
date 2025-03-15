def mxs(a):
    m = -1e9
    c = 0
    for x in a:
        c += x
        m = max(m, c)
        if c < 0:
            c = 0
    return m

n = int(input())
a = list(map(int, input().split()))
print(mxs(a))
