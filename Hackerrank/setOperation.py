N=int(input())
set1=set(map(int,input().split()))
M=int(input())
set2=set(map(int,input().split()))
set1=list(sorted(set1, reverse=False))
set2=list(sorted(set2, reverse=False))

dset=set({})



for i in range(len(set1)):
    if(set1[i]!=set2[i]):
        dset.add(set1[i])
        dset.add(set2[i])
lst=list(sorted(dset))

for i in lst:
    print(i)
    