package Array;

public class maxSumSubArr {

	public static void main(String[] args) {

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int meh = arr[0];
		int msf = arr[0];

		for (int i = 1; i < arr.length; i++) {
			meh = meh + arr[i];
			if (meh < arr[i]) {
				meh = arr[i];

			}
			if (msf < meh) {
				msf = meh;
			}
		}

		System.out.println(msf);

	}

}
