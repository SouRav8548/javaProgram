import java.util.*;

public class OTP2 {
  static char[] OTP(int len) {
    System.out.println("Generating OTP using random ()");
    System.out.print("Your OTP is:");

    // Using numeric values
    String numbers = "0123abcdefgh!@#$%^&*()_+ijklmnopqrstuvwxyz456789";

    // Using random method 
    Random rndm_method = new Random();
    char[] otp = new char[len];
    for(int i=0; i<len;i++) {
      // use of charAt() method : to get character value
      // use of nextInt() as it is scanning the value as int 
      otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
    }
    return otp;
  }

  public static void main(String args[]) {
    int length = 9;
    System.out.println(OTP(length));
  }
}