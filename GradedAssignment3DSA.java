package dataStructure;

import java.util.*;

public class GradedAssignment3DSA {
	public static void main(String[] args) {
		//input

		Scanner sc = new Scanner(System.in);
		//floors in building
		System.out.println("Enter the total no of floors in the building"+":");

		int floors = sc.nextInt();
		
		int[] arr = new int[floors];

		for (int i = 0; i < floors; i++) {
			System.out.println("Enter the floor size given on day :"+ (i+1));
			
			arr[i] = sc.nextInt();
			
		}
		List<Integer> pendingFloors = new ArrayList<>();

		int currentMaxSize = floors;

		for (int i = 0; i < floors; i++) {

			System.out.println();

			System.out.println("Day " + (i + 1) + " : ");

			if (currentMaxSize == arr[i]) {

				System.out.print(arr[i] + " ");

				currentMaxSize = currentMaxSize - 1;

				currentMaxSize = checkPendingFloors(currentMaxSize, pendingFloors);

			} else {

				pendingFloors.add(arr[i]);

			}
		}

	}

	public static int checkPendingFloors(int currentMaxSize, List<Integer> pendingFloors) {

		Collections.sort(pendingFloors, Collections.reverseOrder());

		for (int i = 0; i < pendingFloors.size(); i++) {

			// System.out.println(currentMaxSize + "start");

			if (pendingFloors.get(i) == currentMaxSize) {

				System.out.print(currentMaxSize + " ");

				currentMaxSize = currentMaxSize - 1;

			}

		}

		return currentMaxSize;

	}

}
