package chizhenko;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[10];
		// String strArr;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		System.out.println(myArraysToString(arr));

	}

	public static String myArraysToString(int[] myArray) {

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (int i = 0; i < myArray.length; i++) {

			sb.append(myArray[i] + ", ");

		}

		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");

		return sb.toString();
	}

}
