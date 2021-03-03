In this package....

in DDLJ & URI class... we are over riding the plot method.. and at run time ..
            movie object is executing plot() from respective clas...

while in KKKG,  since we are not over riding the plt() ,

    the control is looking for plot() , when it doesn't find one,
            it goes to the parent class and executes a method from there.