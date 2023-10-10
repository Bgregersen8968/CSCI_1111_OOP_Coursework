
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	private double side;

	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}

	
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public int compareTo(Octagon Octagon1) {
		return Double.compare(getArea(), Octagon1.getArea());
	}

	 @Override
	public Octagon clone() throws CloneNotSupportedException {
		return (Octagon) super.clone();
	}

	public double getSide() {
		return side;
	}
public void setSide(double side) { 
	this.side = side;

}
}
