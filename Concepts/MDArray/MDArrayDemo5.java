

class MultiArrayDemo {

	public static void main(String[] args) {
	
		int arr[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};

		System.out.println("Array elements: ");
		for(int i = 0; i < 2; i++) {
		
			System.out.println("For Plane "+(i+1)+" :");
			for(int j = 0; j < 3; j++) {
			
				for(int k = 0; k < 3; k++) {
				
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
