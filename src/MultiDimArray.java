
public class MultiDimArray {
	public static void main(String[] args) {
		int[][] multiDimArr =new int[5][5];
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				multiDimArr[i][j] = (int)(Math.random() * 1000);
		System.out.println("Array is ..");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%4d ",multiDimArr[i][j]);
			}
			System.out.println();
		}	
				
	}
}
