import java.util.ArrayList;

public class SortTwoDimensionalArray {
	public static void main (String[] args){
		//Create a array
		int[][] array = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		//Invoke a method
		sort(array);
	
	}

	public static void sort(int m[][]){
		for (int k = 0; k < m.length; k++){
			//Assume the minimum of first number 
			int min = m[k][0];
			//Record the number at this time  
			int n = k;
			
			/*If find this first number > the another first number , then change the minimum for the another first number;
			Or if find this first number = the another first number and this second number > the another second number,
			then change the minimum for the another first number*/
			for(int j = k; j < m.length; j++){
				if( min > m [j][0] || ( min == m[j][0] && m[n][1] > m[j][1]) ){
					min = m[j][0];
					//Record the number at this time
					n = j;
				}
			}
			
			//Judge the n ,if n is change, swap the order of array
			if(n != k){
				int temp1 = m[n][0];
				int temp2 = m[n][1];
				m[n][0] = m[k][0];
				m[n][1] = m[k][1];
				m[k][0] = temp1;
				m[k][1] = temp2;
			}
		}
	}
}
