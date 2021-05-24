
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V Hariharan
 */
import java.util.Random;
public class GenerateOTP{
static char[] sendOTP(int length){
String numbers = "0123456789";
Random r = new Random();
char[] otp = new char[length];
for(int i=0;i<length;i++)
{
otp[i]=numbers.charAt(r.nextInt(numbers.length()));
}
return otp;
}
public static void main(String ar[])
{
    char[] x = sendOTP(4);
System.out.println(x);
}
}
