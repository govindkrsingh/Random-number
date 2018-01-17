import java.util.Random;

public class OTP {
	public static void main(String[] args) {

		//create object of random class
		Random r= new Random();
		
		
		// get a no. and store it
		
		int var1 =r.nextInt(9);
		int var2 =r.nextInt(9);
		int var3 =r.nextInt(9);
		int var4 =r.nextInt(9);
	
		
		// show the no
    
		///    System.out.print(var1+var2+var3+var4); ye add krk de ga 
		
		System.out.print(var1);
		System.out.print(var2);
        System.out.print(var3);
        System.out.print(var4);
	}

}
