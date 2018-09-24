package class4;

import java.util.Scanner;

public class student {

	public static boolean validate(int score) {
		if (score>0 && score<=100) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void convert(int score) {
		if(score>=90 && score<=100) {
			System.out.println("该学生的成绩"+score+"分:A等级");
		}else if(score>=80 && score<90) {
			System.out.println("该学生的成绩"+score+"分:B等级");
		}else if(score>=70 && score<80) {
			System.out.println("该学生的成绩"+score+"分:C等级");
		}else if(score>=60 && score<70) {
			System.out.println("该学生的成绩"+score+"分:D等级");
		}else {
			System.out.println("该学生的成绩"+score+"分:X等级");
		}
	}
	
	public static void main(String[] args) {
		//判断学生成绩的有效性及成绩转换的功能
		System.out.println("请输入学生的成绩:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		boolean test = validate(score);
		if(test) {
			convert(score);
		}else {
			System.out.println("成绩无效");
		}
	}

}
