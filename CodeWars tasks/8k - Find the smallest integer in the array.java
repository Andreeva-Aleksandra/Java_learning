public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {

	
		int smallest = Integer.MAX_VALUE;
		for (int i : args)
			smallest = (smallest > i) ? i : smallest;
		return smallest;
	}
}
