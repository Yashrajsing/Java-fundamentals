package precourse;

public class ifelse {
	public static void main(String args[]) {
		int num1 = 100;
		
		if(num1 == 100) {
			System.out.println("Hundred");
		}
		else {
			System.out.println("Not Hundred");
		}
		
		
		
       int num2 = 10;
		
		if(num2 == 100) {
			System.out.println("Hundred");
		}
		else {
			System.out.println("Not Hundred");
		}
		
		
         int num3 = 100;
         int num4 = 70;
		if(num3 == num4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		System.out.println(100==20);
		System.out.println(512==512);
		System.out.println(100>=512);
		System.out.println(100<=512);
		
		System.out.println(100==200);
		System.out.println(100!=200);
		System.out.println(100!=100);
		
		int a = 20;
		int b = 100;
		if(a>b) {
			System.out.println(a);		
			}
		else {
			System.out.println(b);
		}
	  //HOMEWORK
		// Print BIggest Number Of 3 Numbers
		int x = 20;
		int y = 90;
		int z = 70;
		if(x>y&&x>z) {
			System.out.println(x);		
			}
		else if (y>x&&y>z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
		

	}

}
