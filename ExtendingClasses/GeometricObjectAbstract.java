
public abstract class GeometricObjectAbstract {
	private String color = "white";
	private boolean filled = true;
	private java.util.Date dateCreated;
	
	public GeometricObjectAbstract() {
		dateCreated = new java.util.Date();
	}
	public GeometricObjectAbstract(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) { 
		this.color = color;
	}
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String createDate() { 
		return "created on " + dateCreated;
	}
}

