package Array;

public class MergeSort {

	void merge(int[] arr, int beg, int mid, int end) {
		int l = mid - beg + 1;
		int r = end - mid;
		int[] leftarr = new int[l];
		int[] rightarr = new int[r];

		for (int i = 0; i < l; ++i) {
			leftarr[i] = arr[beg + i];
//			System.out.println("left:" + leftarr[i]);
		}
		for (int j = 0; j < r; ++j) {
			rightarr[j] = arr[mid + 1 + j];
//			System.out.println("right:" + rightarr[j]);
		}

		int i = 0, j = 0, k = beg;
		while (i < l && j < r) {

			if (leftarr[i] > rightarr[j]) {
				arr[k] = rightarr[j];
				j++;

			} else {
				arr[k] = leftarr[i];
				i++;
			}
			k++;

		}

		while (i < l) {
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while (j < r) {
			arr[k] = rightarr[j];
			j++;
			k++;
		}

	}

	public void sort(int[] arr, int beg, int end) {

		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 10, 20, 8, 4, 9, 5, 1, 7, 12 };

		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

}
