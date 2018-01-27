
public class ArraySearch {

	public static void main(String[] args) {
		int[] testArray = ArraySearch.getArray();
		if(testArray !=null) {
			System.out.println("Array is ");
			for(int num:testArray){
				System.out.println(num);
			}
			System.out.println("Please enter number to search");
			int key = MyInput.readInt();
			System.out.println("Linear Search Key found at position: "+ArraySearch.linearSearch(testArray,key));
			System.out.println("Binary search Key found at position: "+ArraySearch.binarySearch(testArray, key, 0, testArray.length-1) );
		}
	    
	}
	
	public static int binarySearch(int[] arr,int key,int low ,int high) {
		if(low > high) return -1;
		int mid = (low + high)/2;
		if(key < arr[mid]) {
			return ArraySearch.binarySearch(arr, key, low, mid-1);
		}else if(key > arr[mid]){
			return ArraySearch.binarySearch(arr, key, mid+1, high);
		}else if(key == arr[mid]){
			return mid;
		}
		return -1;
	}
	public static int linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length-1;i++) {
			if(key==arr[i]) return i;
		}
		return -1;
		
	}
	
	public static int[] getArray() {
		int[] testArray = null;
		System.out.println("Please enter Array Length");
		int arrLength = MyInput.readInt();
		if(arrLength > 0) {
			testArray = new int[arrLength];
			System.out.println("Please enter "+arrLength+" integers");
			for(int i=0; i<=testArray.length-1; i++) {
				try {
					int t = SpecialInput.readInt();
					testArray[i] = t;
				}catch(Exception e) {
					System.out.print(e.getMessage());
					System.out.println(" So Please re-enter! ");
					i = i-1;
				}
				
			}			
				
		}else {
		   System.out.println("Invalid length");
	   }
		return testArray;
	}
	
}
