import sys
import threading
import time
class Semaphore():
    def __init__(self, initial):
        self.lock = threading.Condition(threading.Lock())
        self.value = initial
    def up(self):
        with self.lock:
             self.value += 1
             self.lock.notify()
    def down(self):
        with self.lock:
            while self.value == 0:
                self.lock.wait()
            self.value -= 1
class ChopStick():
    def __init__(self, number):
        self.number = number           
        self.user = -1                
        self.lock = threading.Condition(threading.Lock())
        self.taken = False
    def take(self, user):         
        with self.lock:
            while self.taken == True:
                self.lock.wait()
            self.user = user
            self.taken = True
            sys.stdout.write("Philosopher[%s] took ChopStick[%s]\n" % (user, self.number))
            self.lock.notify_all()
    def drop(self, user):        
        with self.lock:
            while self.taken == False:
                self.lock.wait()
            self.user = -1
            self.taken = False
            sys.stdout.write("Philosopher[%s] dropped ChopStick[%s]\n" % (user, self.number))
            sys.stdout.write("Philosopher[%s] THINKING\n" % (user))
            self.lock.notify_all()
class Philosopher (threading.Thread):
    def __init__(self, number, left, right, butler):
        threading.Thread.__init__(self)
        self.number = number            
        self.left = left
        self.right = right
        self.butler = butler           
    def run(self):
        for i in range(1):
            time.sleep(1)
            self.butler.down()           
            time.sleep(1)                
            self.left.take(self.number)    
            time.sleep(1)     
            self.right.take(self.number)   
            time.sleep(1)              
            sys.stdout.write("Philosopher[%s] EATING\n" % (self.number))
            self.right.drop(self.number)   
            time.sleep(1)
            self.left.drop(self.number)   
            time.sleep(1)
            self.butler.up()             
            time.sleep(1)
        sys.stdout.write("Philosopher[%s] finished THINKING & EATING\n" % self.number)
def dinner():
 
    n = int(input('Enter Total Philosophers : '))
    sys.stdout.write("\n")
 
    butler = Semaphore(n-1)
   
    c = [ChopStick(i) for i in range(n)]
   
    p = [Philosopher(i, c[i], c[(i+1)%n], butler) for i in range(n)]

    for i in range(n):
        p[i].start()
    
dinner()
