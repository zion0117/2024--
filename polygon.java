package mission1;

public class polygon {
	String shape;
	int width;
	int height;
	double area;
	
	polygon(String shape, int width){
		this.shape = shape;
		this.width=width;
	}
	
	polygon(String shape, int width, int height){
		this.shape = shape;
		this.width=width;
		this.height=height;
	}
	
	void calculateArea(int width) {
		area=width*width;
	}
	
	void calculateArea(int width, int height, int option) {
		if(option==1)
			area = (width*height)/2.0;
		else if(option==2)
			area = (width*height);
		
	}
	void printArea() {
		System.out.println(shape);
		System.out.println("area : "+area);
			System.out.println("height : "+height);
		System.out.println("width : "+width);
	}


}
