from time import sleep
from threading import *
class Hello(Thread):
    def run(self):
      for i in range(5):
         print('hello')
         sleep(2)

class Hi(Thread):
   def run(self):
      for i in range(10):
         print('hi')
         sleep(1)
         
t1=Hello()
t2=Hi()

t1.start()
t2.start()

