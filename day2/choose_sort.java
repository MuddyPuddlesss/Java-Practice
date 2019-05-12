package day2;

import java.util.Arrays;

public class choose_sort {

	/**
	 * 每趟比较记录最小元素的索引值，然后将这个元素与第一个元素互换
	 * 4,6,3,54,2,7,9,5
	 * min_index=4; 记录的是数组元素的下表
	 * arr[0]<>arr[min_index] 
	 * 稳定性：不稳定的
	 * 最优时间复杂度：n^2
	 * 最坏时间复杂度:n^2
	 *          
	 * 选择排序的思想：
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {0,3,54,4,2,7,9,5};
		int temp;
		for (int j = 0; j < arr.length-1; j++) {
			int min_index = j;
			for (int i = j+1; i < arr.length; i++) {
				if(arr[min_index]>arr[i]){
					min_index = i;
				}
			}
			if(min_index!=j){
				temp = arr[min_index];
				arr[min_index] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));// 2 3 54 4 6 7 9 5
		

	}

}
