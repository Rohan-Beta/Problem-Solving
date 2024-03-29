# single tasking using thread

from threading import *
from time import *

class MyThread(Thread):
    
    def prep(self):
        self.task1()
        self.task2()
        self.task3()
        
    def task1(self):
        print("Boil milk and powder for 5 minutes: ")
        sleep(5)
        print("Done")
        
    def task2(self):
        print("add sugar and boil again for 3 minutes: ")
        sleep(3)
        print("Done")
        
    def task3(self):
        print("filter and serve it: ")
        print("Done")
        
    
obj = MyThread()

t1 = Thread(target= obj.prep)
t1.start()
