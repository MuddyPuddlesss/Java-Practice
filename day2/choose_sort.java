package day2;

import java.util.Arrays;

public class choose_sort {

	/**
	 * ÿ�˱Ƚϼ�¼��СԪ�ص�����ֵ��Ȼ�����Ԫ�����һ��Ԫ�ػ���
	 * 4,6,3,54,2,7,9,5
	 * min_index=4; ��¼��������Ԫ�ص��±�
	 * arr[0]<>arr[min_index] 
	 * �ȶ��ԣ����ȶ���
	 * ����ʱ�临�Ӷȣ�n^2
	 * �ʱ�临�Ӷ�:n^2
	 *          
	 * ѡ�������˼�룺
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
