
Builder Design Pattern is used to to create object

1)this pattern can be used to create immutable object.
2)when the object creation process is complex.
3)the constructor requires lot of other parameters which needs to be constructed before creating our final object.


The architecture is


builder designpattern.java will contain all the the steps needed before creating our object.
there will be one director which knows what all methods of builder has to be called to get the final object ready.


so we we would avoid creating complex constructors[ lots of complex objects as parameter]
