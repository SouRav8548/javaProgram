public class MethodStringsDemo {
public static String myMethod(String fname) {
return fname.concat(" Maity");
}
public static void main(String args[]) {
//myMethod("Soumya");
//myMethod("Sipra");
String s=myMethod("Sourin");
System.out.println("The value passed to the method is: "+s);
}
}