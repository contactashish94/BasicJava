Race Condition :
    if multiple threads operating simultaneously on the same java object,
    then there may be a chance of data in-consistency problem is nothing but Race condition.
    Data inconsistency means : irregularity in the output.
    We can resolve the same by using "synchronized" key word.


Object Lock : whenever a thread wants to execute a synchronized instance method,
    then object level lock is required for the thread to execute the method.

Class level Lock : Every class in java has a unique lock, which is called Class level lock.
                    If a thread wants to execute static synchronized method then that thread needs Class level lock.

Diff between Class Level lock/Object Lock...
       1. Instance synchronized method : Object Level lock
       1. static synchronized method : Class Level lock

Q. Can a thread acquire multiple locks simultaneously ? --> YES, ofcourse: but from different objects.

Q. What is a synchronized statement ?
Ans : as per java specification , there is no terminology...
        The statements present in synchronized method/block.
        The statements , that can be executed by only 1 thread at a time are called synchronized statements.