package day2;

public class Triangle_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4,5);
		try {
			System.out.println("面积是:"+t.getArea());
			t.showinfo();
		} catch (NotSanjiaoException e) {
			e.printStackTrace();
		}

	}

}
class Triangle{
	private int x;
	private int y;
	private int z;
	public Triangle(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	} 
	//p = (x+y+z)/2 
	public double getArea()throws NotSanjiaoException{
		if(x>0&&y>0&&z>0&&(x+y)>z&&(x+z)>y&&(y+z)>x){
			double p = (x+y+z)/2;
			return Math.sqrt(p*(p-x)*(p-y)*(p-z));
		}else{
			throw new NotSanjiaoException("不是三角形");
		}
		
		
		
	}
	public void showinfo() throws NotSanjiaoException {
		if(x>0&&y>0&&z>0&&(x+y)>z&&(x+z)>y&&(y+z)>x){
			System.out.println("x="+x+":y="+y+":z="+z);
		}else{
			throw new NotSanjiaoException("不是三角形");
		}
		
	}
}

class NotSanjiaoException extends Exception{
	public NotSanjiaoException(){}
	public NotSanjiaoException(String msg){
		super(msg);
	}
}

