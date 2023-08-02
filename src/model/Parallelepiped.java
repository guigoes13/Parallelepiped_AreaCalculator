package model;

public class Parallelepiped {
	
	private double depth;
	private double width;
	private double height;
	

	public Parallelepiped(double depth, double width, double height) {
		this.depth = depth;
		this.width = width;
		this.height = height;
	}
	public Parallelepiped() {
		
	}

	public double getDepth() {
		return depth;
	}


	public void setDepth(double depth) {
		this.depth = depth;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double Area() {
	
		return  (2 * width * depth) + (2 * width * height ) + (2 * depth * height );
			
	}

	
	public String toString () {
		return "Depth:  " + depth + 
				 '\n'+ "Width:  " + width + '\n' +  "Height:  " + height + '\n' 
				 + "------------------------" +  '\n' + "Total area:  " + Area();
	}
	

}
