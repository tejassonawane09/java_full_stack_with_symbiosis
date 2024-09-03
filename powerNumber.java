//Calculating power of number
public class powerNumber {
	
	//variables declaration
	int base=3,exponent=4,result=1;
	public void power() {
		
	//using for loop
		for(;exponent != 0;--exponent) {
			result*=base;
		}
		System.out.println("POWER OF NUMBER:"+result);
	}

	public static void main(String[] args) {
		//creating object from class
		powerNumber sc=new powerNumber();
		sc.power();
	}

}
