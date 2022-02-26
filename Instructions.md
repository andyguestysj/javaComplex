## Complex Numbers Formative Assessment

## 1 Skills
This exercise should help you with:
1. Member variables and member methods.
2. Unit testing.
3. Creation of a class to a specification without necessarily understanding the details.

## 2 Background
A complex number is one that has two parts: **real** and **imaginary**. They are written (by engineers  at least) like this  

* 4.1 + j9.9
* 0.5 + j3.2
 
Or in general

* a + *j*b

There are a few operations defined for complex numbers. If a complex number has a real part called **a** and an imaginary part called **b** we have    
* **magnitude** = square root of (**a** squared + **b** squared) (using `Math.sqrt()` in java)
*	**argument** = tan−1(b) (using `Math.atan2(b)` in Java)
To add two complex numbers we add the real parts to give the new real part and the imaginary parts to give the new imaginary part.  

CN1 = a +*j*b  
CN2 = c +*j*d   
CN1 + CN2 = (a+c) + *j*(b+d)

## 3 Task

The repl is set up so that when you run it it will run the unit tests in `ComplexTest.java`. Currently if you try to run it repl.it will tell you it won't compile because it has errors. This is because some of the methods `ComplexTest` is trying to test don't exist. You'll need to add the missing methods to `Complex`.  

You'll need to then go through the tests and make them all pass.  

Try running the repl and examining the output to see what to do.  

You will encounter  
**errors** where methods are missing and  
**failed tests** where methods are present but incorrect.