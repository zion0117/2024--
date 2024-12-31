package mission1;
import java.util.*;

public class polygontest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		polygon p = null;
		
		System.out.print("menu select menu select 1)삼각형 2)직사각형 3) 정사각형:");
		int option = s.nextInt();
		switch(option) {
		case 1:
			p = new polygon("triangle", 10,20 );
			p.calculateArea(p.width, p.height, option);
			break;
		
		case 2:
			p = new polygon("rectangle", 10,20 );
			p.calculateArea(p.width, p.height, option);
			break;
		
		case 3:
			p = new polygon("square", 10 );
			p.calculateArea(p.width);
			break;
	}
		p.printArea();
	}

}
