
public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(4);
		Octagon octagon2 = octagon1.clone();

		double result = octagon1.compareTo(octagon2);
		System.out.println(result);
	}
}