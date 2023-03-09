package week1.day1;

public class IsPrimeAssign {

	public static void main(String[] args) {
		int input=6;
		boolean bPrime = true;
		for (int i = 2; i <input;i++) {
		if(input%i==0)
			{
		System.out.println("Non Prime");
				bPrime=false;
				break;
			}
		}
		if(bPrime) {
			System.out.println("Prime Number");
		}
			
			
		}

	}


