package search;


public class Search {

	int[] data = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
			59, 61, 67, 71, 73, 79, 83, 89, 97 };
	int count = 0;


	// binary search using a loop
	int binarySearch(int input) {
		int min = 0;
		int max = data.length - 1;
		int index = -1;

		while (min <= max) {
			count++;
			index = (min + max) / 2;
			// System.out.println("max:" + max + " min: " + min + " index:"
			// + index);
			if (data[index] == input) {
				// System.out.println("found at: "+ index);
				return index;
			} else if (data[index] > input) {
				max = index - 1;
			} else if (data[index] < input) {
				min = index + 1;
			}
		}

		return -1;
	}

	void setCounter(int c) {
		count = c;
	}

	int getCounter() {
		return count;
	}

	// another variant that takes min, max as input
	int sbinarySearch(int low, int high, int key) {

		while (low <= high) {
			count++;
			int mid = (low + high) / 2;
			if (data[mid] < key) {
				low = mid + 1;
			} else if (data[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1; // key not found
	}

	int ternarySearch(int low, int high, int key) {

		int part1 = 0, part2 = 0, part3 = 0;
		int tpart = 0;

		while (low <= high) {

			count++;

			if (high - low <= 3) {
				for (int i = 0; i <= 3; i++) {
					if (data[i] == key) {
						// System.out.println("found the item-----");
						return i;
					}

				}
				// System.out.println("item not found=====");
				return -1;
			} else {
				tpart = (high - low) / 3;
				part1 = low + tpart;
				part2 = part1 + tpart;
				part3 = part2 + tpart + (low + high) % 3;

				// System.out.println("ternary== "+ "part1:" + part1 + " part2:"
				// + part2 + " part3:" + part3);

				if (data[part1] >= key) {
					if (data[part1] == key) {
						return part1;
					}
					high = part1;
					// low = low;
					// System.out.println("part1 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part2] >= key) {
					if (data[part2] == key) {
						return part2;
					}
					high = part2;
					low = part1;
					// System.out.println("part2 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part3] >= key) {
					if (data[part3] == key) {
						return part3;
					}
					high = part3;
					low = part2;
					// System.out.println("part3 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part3] < key) {
					// System.out.println("item value is beyond the array");
					return -1;
				}

			}

		}

		return -1;
	}

	int quartarySearch(int low, int high, int key) {

		int part1 = 0, part2 = 0, part3 = 0, part4 = 0;
		int tpart = 0;

		while (low <= high) {

			count++;

			if (high - low <= 4) {
				for (int i = 0; i <= 4; i++) {
					if (data[i] == key) {
						// System.out.println("found the item-----");
						return i;
					}

				}
				// System.out.println("item not found=====");
				return -1;
			} else {
				tpart = (high - low) / 4;
				part1 = low + tpart;
				part2 = part1 + tpart;
				part3 = part2 + tpart;
				part4 = part3 + tpart + (low + high) % 4;

				// System.out.println("ternary== "+ "part1:" + part1 + " part2:"
				// + part2 + " part3:" + part3);

				if (data[part1] >= key) {
					if (data[part1] == key) {
						return part1;
					}
					high = part1;
					// low = low;
					// System.out.println("part1 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part2] >= key) {
					if (data[part2] == key) {
						return part2;
					}
					high = part2;
					low = part1;
					// System.out.println("part2 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part3] >= key) {
					if (data[part3] == key) {
						return part3;
					}
					high = part3;
					low = part2;
					// System.out.println("part3 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part4] >= key) {
					if (data[part4] == key) {
						return part4;
					}
					high = part4;
					low = part3;
					// System.out.println("part3 block: "+ "high : "+ high +
					// " low: " + low);
				} else if (data[part4] < key) {
					// System.out.println("item value is beyond the array");
					return -1;
				}

			}

		}

		return -1;
	}

	int recursiveBinarySearch(int low, int high, int key) {
		count++;
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (data[mid] == key) {
			return mid;
		}
		if (data[mid] > key) {
			return recursiveBinarySearch(low, mid - 1, key);
		} else {
			return recursiveBinarySearch(mid + 1, high, key);
		}

	}

	public static void main(String[] args) {

		Search bSearch = new Search();

		System.out.println("binary search========");

		// 1.test case postive test case for a random search,logarithm with base
		// 2

		bSearch.setCounter(0);
		int result = bSearch.binarySearch(73);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 2.postive test case for last item
		bSearch.setCounter(0);
		result = bSearch.binarySearch(97);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 3. postive test case for second item
		bSearch.setCounter(0);
		result = bSearch.binarySearch(3);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 4.postive test case for first item
		bSearch.setCounter(0);
		result = bSearch.binarySearch(2);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for searching a item doesn't exist
		// between two existing items
		// watch out for this one - if you dont use
		// while ( max > (min +1) ) it will not work
		result = bSearch.binarySearch(74);
		bSearch.setCounter(0);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item beyond the index
		bSearch.setCounter(0);
		result = bSearch.binarySearch(100);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item below the index
		result = bSearch.binarySearch(1);
		bSearch.setCounter(0);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		System.out.println("sbinary search============\n\n");

		// 1.test case postive test case for a random search
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 73);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 2.postive test case for last item
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 97);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 3. postive test case for second item
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 3);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 4.postive test case for first item
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 2);
		System.out.println("result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for searching a item doesn't exist
		// between two existing items
		// watch out for this one - if you dont use
		// while ( max > (min +1) ) it will not work
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 74);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item beyond the index
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 100);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item below the index
		bSearch.setCounter(0);
		result = bSearch.sbinarySearch(0, 24, 1);
		System.out.println("result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 1.test case postive test case for a random search, logarithm with
		// base 3
		System.out.println("ternary search=====\n\n");
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 73);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 2.postive test case for last item
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 97);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 3. postive test case for second item,
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 3);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 4.postive test case for first item
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 2);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for searching a item doesn't exist
		// between two existing items
		// watch out for this one - if you dont use
		// while ( max > (min +1) ) it will not work
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 74);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item beyond the index
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 100);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item below the index
		bSearch.setCounter(0);
		result = bSearch.ternarySearch(0, 24, 1);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 1.test case postive test case for a random search, logarithm with
		// base 4
		System.out.println("quartary search=====\n\n");
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 73);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 2.postive test case for last item
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 97);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 3. postive test case for second item
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 3);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 4.postive test case for first item
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 2);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for searching a item doesn't exist
		// between two existing items
		// watch out for this one - if you dont use
		// while ( max > (min +1) ) it will not work
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 74);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item beyond the index
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 100);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// negative test case for item below the index
		bSearch.setCounter(0);
		result = bSearch.quartarySearch(0, 24, 1);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// recursive binary search

		// 1.test case postive test case for a random search, recursive search
		System.out.println("\n\nrecursiveBinarySearch search=====");
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 73);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 2.postive test case for last item
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 97);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 3. postive test case for second item
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 3);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 4.postive test case for first item
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 2);
		System.out.println("***result is: " + result
				+ ((result >= 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 5.negative test case for searching a item doesn't exist
		// between two existing items
		// watch out for this one - if you dont use
		// while ( max > (min +1) ) it will not work
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 74);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 6.negative test case for item beyond the index
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 100);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

		// 7.negative test case for item below the index
		bSearch.setCounter(0);
		result = bSearch.recursiveBinarySearch(0, 24, 1);
		System.out.println("***result is: " + result
				+ ((result < 0) ? " passed" : "failed"));
		System.out.println("loop counter: " + bSearch.getCounter());

	}

}
