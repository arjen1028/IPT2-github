public class calculator{
public static int divide(int a, int b){
if(b == 0){
throw new
ArithmeticException("Cannot divided by
zero.");
}
return a/b;
}
