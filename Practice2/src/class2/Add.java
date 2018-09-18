package class2;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		// 使用循环，输出该序列的前20位数字
		int arr[] = new int[20];
		int length = arr.length;
		arr[0] = 1;
		arr[1] = 1;
		System.out.println(arr[0]+"  "+arr[1]+"  ");
		for(int n=2;n<=length;n++){
			arr[n]=arr[n-1]+arr[n-2];
			System.out.println(arr[n]+"  ");
		}
	}

}
