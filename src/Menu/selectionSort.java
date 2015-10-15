package Menu;

public class selectionSort {
	
		public static void main(String args[]){
		int[] a = {9,7,5,3,1};
		int min=0;
		int temp;
			for (int i = 0;i < a.length;i++){
				min = i;
					for (int j = i+1; j<a.length;j++){
			
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					
				}
					for(int k =0; k < a.length; k++){
			System.out.print(a[k] + "\t");
		}
		System.out.println();
			}	
		}	
	}


