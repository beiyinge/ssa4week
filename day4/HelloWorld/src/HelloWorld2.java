
public class HelloWorld2 {
	
	private String message;
	
	public static void main(String[] args) {

		//array of 7 arrys of 9 ints
		//int[][] arr = new int[7][9];  
		
		//array of 7 arrys of 9 arrays of 20 ints
		//int[][][] arr3 = new int[7][9][20];  

		int[][] arr = new int[2][];  
		arr[0] = new int[3];
		arr[1] = new int[5];
		
		Object o = arr;
		
		Object[] oArr = arr;
		oArr[0] = new int[8];
		
		
		
	}

}
