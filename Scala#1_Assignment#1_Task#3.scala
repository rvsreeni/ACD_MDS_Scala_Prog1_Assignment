// Scala function for finding GCD of 2 numbers
def gcd(a:Int, b:Int):Int = {
     //Everything divides 0
        if (a == 0 || b == 0)
           return 0;
     //base case
        if (a == b)
           return a;
     //a is greater
        if (a > b)
           return gcd(a-b, b);
        return gcd(a, b-a);
}
