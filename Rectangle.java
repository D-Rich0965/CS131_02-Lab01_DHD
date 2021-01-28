public class Rectangle
{
	private int length;
	private int width;
	
	public Rectangle(){
		length=1;
		width=1;
	}
	public Rectangle(int len,int wid){
		length=len;
		width=wid;
	}
	int calculateArea(){
		int area=length*width;
		return area;
	}
	int calculatePerimeter(){
		int perimeter=2*length+2*width;
		return perimeter;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
}