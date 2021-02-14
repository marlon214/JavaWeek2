
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A while loop that prints all even numbers from 0 to 100
		int i=0;
		while(i<=100) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("");
//A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int k=100;
		int y=1;
		while (k>0) {
			
			if(y%3==0) {
				System.out.print(k+" ");
			}
			y++;
			k--;
		}
		System.out.println("");
//A for loop that prints every other number from 1 to 100
		for (int j=1; j<=100; j++) {
			if(j%2==0) {
				System.out.print(j+" ");
		
			}
		}
		System.out.println("");
//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints "Hello" instead of the number, and if the number is divisible by 5, it prints "World" instead of the number, and if it is divisible by both 3 and 5, it prints "HelloWorld" instead of the number.
		for(int r=0; r<=100; r++) {
			if (r%3==0 && r%5==0) {
				System.out.print("Hello World ");
			}
			else if(r%3==0) {
				System.out.print("Hello ");
			}
			else if(r%5==0) {
				System.out.print("World ");
			}
			else {
				System.out.print(r + " ");
			}
			
		}
		
	}

}
