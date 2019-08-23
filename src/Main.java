import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String out = "";
		
		//Defines the end of the loop
		int limit;
		do {
			System.out.println("Give the Limit");
			limit = in.nextInt();
		}while(limit<=0);
		
		for(int i=1;i<limit;i++) {
			if(i%3 == 0)
				out+="Fizz";
			if(i%5 == 0)
				out+="Buzz";
			if(i%3 != 0 && i%5 != 0)
				out+= ""+i;
			
			System.out.println(out);
			out="";
		}

	}

}
