# assignment_singtel

Q A, 1) Can you implement the sing() method for the bird?
a. How did you unit test it?

ans: 
for the moment we cannot call sing method. bird.sing(); in the class Solution.java. 
Because There is no sing() method is implemented either in Animal or Bird class.so the compiler will throw method sing() undefined error.

To implement the sing behavior the simplest way would be to add the
sing method to the Bird class as given below.
    public void sing(){
        System.out.println("I am Singing");
    }
	
Q. 1)
b. How did you optimize the code for maintainability?

ans:
By creating two separate interfaces for the behaviors fly () and sing(). So the developer can give only the required behahior by implementing that interface.

