public class Compare_Object {
	int n;
	Compare_Object(int x){
		n=x;
	}
	public static void main(String args[]) {
		Compare_Object obj=new Compare_Object(7);
		Compare_Object obj1 =new Compare_Object(9);
		System.out.println(obj.equals(obj1));
	}

}
