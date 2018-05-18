  public class ArrayDemo {
	  
	  private int[] numbers = {23, 5, 7, 9, 1};
	  
	  public ArrayDemo() {
		  int sum = 0;
		  for(int x = 0; x < numbers.length; x++) {
			  sum+= numbers[x];
		 }
		  System.out.print("The sum of ");
		  for(int a : numbers) {
			  System.out.print(a+", ");
		  }
		  System.out.print("is = "+sum);
		}
	  
	  public static void main(String[] args) {
		  new ArrayDemo();
	  }
  }