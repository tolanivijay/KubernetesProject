package print;

public class SimplePrinter {

	public static void main(String[] args) throws Exception{
		for (int i = 1;i<=100;i++) {
			System.out.println("Printing number--> "+i);
			Thread.sleep(200);
		}

	}

}
