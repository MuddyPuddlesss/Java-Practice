package class2;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		//制作一个游戏菜单下图所示
		Scanner Game =new Scanner(System.in);
		System.out.println("现有游戏如下");
		System.out.println("--------");
		System.out.println("1、	wow");
		System.out.println("2、	传奇");
		System.out.println("3、	梦幻西游");
		System.out.println("4、	永恒之塔");
		System.out.println("5、	七龙珠ol");
		System.out.println("--------");
		System.out.println("请输入您选择的游戏：");
		while(true){
			int chose = Game.nextInt();
			if(chose==1){
				System.out.println("您选择了*WOW*");
				break;
			}else if(chose==2){
				System.out.println("您选择了*传奇*");
				break;
			}else if(chose==3){
				System.out.println("您选择了*梦幻西游*");
				break;
			}else if(chose==4){
				System.out.println("您选择了*永恒之塔*");
				break;
			}else if(chose==5){
				System.out.println("您选择了*七龙珠ol*");
				break;
			}else{
				System.out.println(">>>>>您输入的游戏编号无效，请继续输入！！");
				System.out.println("请输入您选择的游戏：");
			}
		}
		while(true){
			System.out.println("请输入您现在已经玩到的级别：：");
			int level = Game.nextInt();
			if(level<20 && level>0){
				System.out.println("您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
				break;
			}else if(level>20 && level<=40){
				System.out.println("您已经开始行走江湖，算是小有成就了，加油！！");
				break;
			}else if(level>41 && level<=60){
				System.out.println("您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
				break;
			}else if(level>60){
				System.out.println("您已经天下无敌了，太牛了！！");
				break;
			}else{
				System.out.println(">>>>>您输入的等级无效，请继续输入！！");
				System.out.println("请输入您现在已经玩到的级别：：");
			}
		}
	}
}
