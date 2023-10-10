
import java.util.ArrayList;
public class GeometricObjectTest{
	public static void main(String[] args) {
		GeometricObject[] geometricObjectArray = new GeometricObject[5];
		
		geometricObjectArray[0] = new Triangle(1, 1, 1, "Blue", false);
		geometricObjectArray[1] = new Triangle (2, 2, 2, "Yellow", true);
		geometricObjectArray[2] = new Triangle(3, 3, 3, "Green", false);
		geometricObjectArray[3] = new Triangle(4, 4, 4, "Orange", true);
		geometricObjectArray[4] = new Triangle(2, 2, 2, "Purple", false);
		
		for (int i = 0; i < geometricObjectArray.length; i++) {
			//System.out.println(i+1);
			//System.out.println("Shape #" + (i+1) +(" ") + ((Triangle) geometricObjectArray[i]).getArea());
		
		if (geometricObjectArray[i]  instanceof Colorable) {
			System.out.print("Shape #" + (i+1) +(" ") + ((Triangle) geometricObjectArray[i]).getArea() + (" "));
			geometricObjectArray[i].howToColor();
		}
		}}}
