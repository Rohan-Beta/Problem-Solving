# multi tasking using two thread

from threading import *
from time import *

class MyThread(Thread):
    
    def __init__(self , str):
        self.__str__ = str
        
    def movie(self):
        
        for i in range(0 , 5):
            print(self.__str__ , " : " , i)
            sleep(1)
            
obj1 = MyThread("Cut Ticket")
obj2 = MyThread("Show Chair")

t1 = Thread(target= obj1.movie)
t2 = Thread(target= obj2.movie)

t1.start()
t2.start()
