
public class Question3Class2 {

	public static void main(String[] args) {
		System.out.println(calculateTimeConsumedFunction());
	}
	
	public static long calculateTimeConsumedFunction(){
		long startTime = System.currentTimeMillis();

		long processing = 0;
		for (int count = 0; count < 200000000; count++) {
			processing += count;
		}

		long endTime = System.currentTimeMillis();
		long timeConsumed = endTime - startTime;

		return timeConsumed;
	}

}
