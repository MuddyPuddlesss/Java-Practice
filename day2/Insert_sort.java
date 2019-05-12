package day2;

import java.util.Arrays;

public class Insert_sort {
	/**
	 * 
	 * 4,6,3,54,2,7,9,5
	 * 
	 * 稳定性：稳定的
	 * 最优时间复杂度：
	 * 最坏时间复杂度:
	 *          
	 * 插入排序的思想：
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {4,6,3,54,2,7,9,5};
		for (int j = 1; j < arr.length; j++) {
			int i = j;
			int temp;
			while(i>0){
				if(arr[i]<arr[i-1]){
					temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					i--;
				}else{
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));//
		

	}

}
