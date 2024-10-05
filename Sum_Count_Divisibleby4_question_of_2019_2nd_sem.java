public class Sum_Count_Divisibleby4_question_of_2019_2nd_sem {
	public static void main(String args[]) {
		int sum=0,count=0;
		for(int i=101;i<200;i++) {
			if(i%4==0) {
				sum=sum+i;
				count++;
			}
		}
		System.out.println("THE SUM OF THE NUMBER BETWEEN 100 to 200 WHICH ARE DIVISEL BY 4 IS : "+sum);
		System.out.println("");
		System.out.println("TOTAL NUMBER BETWEEN 100 to 200 WHICH ARE DIVISIBLE BY 4 is : "+count);
	}
}
