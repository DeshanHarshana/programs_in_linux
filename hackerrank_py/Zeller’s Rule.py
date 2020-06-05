'''
F=k+ [(13*m-1)/5] +D+ [D/4] +[C/4]-2*C where

k is  the day of the month.
m is the month number.
D is the last two digits of the year.
C is the first two digits of the year.


Examples for day calculation using Zeller’s Rule:
Let us calculate the day for the following dates:
1st April 1983 and 27th February 2023.
A) 1st April 1983:
Here
k = 1
m=2
D=83
C=19.

Putting the values in the formula, we get,
F= 1+ [(13*2-1)/5] +83+83/4+19/4-2*19
= 1+ [(26-1)/5]+83+20.75+4.75-38
= 1+25+83+20+4-38                 (discarding the decimal values)
= 133-38
= 75

After calculating F divide it by 7 and get the remainder.

78/7=11 Quotient
5-Remainder

Therefore, the day on 1st April 1983 was Friday since the remainder is 5.

'''
year=(input("Enter Year"))
month=int(input('Input month'))
if(month>2):
    month=month-2
else:
    month=month+10

day=int(input('enter date'))

F=day+((13*month-1)/5) +int(year[2:4]) + (int(year[2:4])/4) +(int(year[2:4])/4)-2*int(year[0:2])
print(int(F)%7)