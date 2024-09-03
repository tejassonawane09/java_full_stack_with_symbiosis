//calculate area circumference of circle 
import java.util.*;
public class circumferenceCircle {
	int radius;
	double area,circumference;
	public void areaMethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF RADIUS:");
		radius=sc.nextInt();
		//formula of calculating area circle
		area=(Math.PI*(radius*radius));
		System.out.println("AREA OF CIRCLE:"+area);
		
		//formula calculating area of circumference
		circumference=Math.PI*2*radius;
		System.out.println("AREA OF CIRCLE:"+circumference);
		
	}
	public static void main(String[] args) {
		circumferenceCircle sc=new circumferenceCircle();
		sc.areaMethod();

	}

}
