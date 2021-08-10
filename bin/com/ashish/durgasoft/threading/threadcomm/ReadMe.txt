1.Need of Thread Communication
    : If smone is doing an important work, which keeps on going...
            how ever to complete his work, he/she needs an update from smone but that person is not informing
            so the main executor needs to go and check every now &then whether or not the dependent work is done...

            in that case this affects the performance. Unnecessary wait time increases.

    * Two thread can communicate with each other using wait(), notufy(), notifyAll()..
    * the thread which is expecting updation is responsible to call wait(), then immediately the thread will enter into
    waiting state.
    * The thread which responsible to perform updation, after performing updation it is responsible to
                call notify() , so that the waiting thread on that object will get notified.



    wait() , notify(), ntifyAll() --> why in object class ?????