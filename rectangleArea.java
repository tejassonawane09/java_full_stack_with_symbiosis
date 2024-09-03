//calculate area of rectangle
import java.util.*;
public class rectangleArea {
	//variable declaration
	int height,base,result=0;
	public void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF HEIGHT & BASE:");
		height=sc.nextInt();
		base=sc.nextInt();
		
		//calculating area
		result=height*base;
		System.out.println("AREA OF RECTANGLE:"+result);
	}

	public static void main(String[] args) {
		rectangleArea sc=new rectangleArea();
		sc.area();

	}

}
