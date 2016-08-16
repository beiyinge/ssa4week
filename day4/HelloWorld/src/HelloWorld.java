
public class HelloWorld {
	
	private String message;
	
	public HelloWorld() {
		this.message = "Hello";
		// or can do this
		// this("Hello");
	}
	
	public HelloWorld(String message) {
		this.message = message;
	}

	public static void main(String[] args) {

		int[] arr = new int[7];
		arr = new int[4];
		
		
		System.out.println("Hello World!");
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
