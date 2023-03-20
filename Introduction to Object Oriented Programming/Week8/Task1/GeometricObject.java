package Lab08;

public abstract class GeometricObject implements Colorable {
	private boolean colourable;
	
	public GeometricObject() {
		this.colourable = true;
	}
	
    public abstract double getArea();
	
	@Override
	public void howToColor() {
        if (this.colourable == true) {
        	System.out.println("This shpae is colourable.");
        } else {
        	System.out.println("this shape is not colouralbe.");
        }
    }
}

class Square extends GeometricObject {
	private double side;
	private boolean colourable;
	
    public Square(double side, boolean colourable) {
        this.side = side;
        this.colourable = colourable;
    }

    @Override
	public void howToColor() {
        if (this.colourable == true) {
        	System.out.println("This shpae is colourable.");
        } else {
        	System.out.println("this shape is not colouralbe.");
        }
    }

	@Override
	public double getArea() {
		return this.side * this.side;
	}
}