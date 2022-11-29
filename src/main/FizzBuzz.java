package main;
public class FizzBuzz{
public static void main (String [] args){
//Print 1 to N numbers but print fizz if the number is diclsvisible by 3 and buzz if it's divisable by 5

//Declaring variables
    int N = 100; 
    String fizz = "fizz", buzz = "buzz", fizzbuzz = "fizzbuzz";

for(int x = 1; x <= N; x++)
{
    if(x % 3 == 0 && x % 5 == 0)
        System.out.println(fizzbuzz);
    else if(x % 3 == 0)
        System.out.println(fizz);
    else if(x % 5 == 0)
        System.out.println(buzz);
    else 
        System.out.println(x);
}

    }
}