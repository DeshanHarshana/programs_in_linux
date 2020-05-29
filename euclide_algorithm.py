def gcd(x,y):
    

    if(y>x):
        temp=x
        x=y
        y=temp
    lst=[x,y,(x//y),(x%y)]
    gcd_num=y
    while(lst[3]!=0):
        lst[2]=lst[0]//lst[1]
        lst[3]=lst[0]%lst[1]
        gcd_num=lst[1]
        lst[0]=lst[1]
        lst[1]=lst[3]
    return gcd_num

print(gcd(267865461,236749299182338))

def extended(lst):
    res = lst[0]
    for c in lst:
        res = gcd(res , c)
    return (res)

print(extended([12, 24, 27, 30, 36]))
