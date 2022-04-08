package by.epam.java.classes.simplest_classes_7;

import java.util.Arrays;

public class Triangle {

	private  int[] pointA = new int[2];
	private  int[] pointB = new int[2];
	private  int[] pointC = new int[2];
	
	private double sideA;
	private double sideB;
	private double sideC;
	private double angleA;
	private double angleB;
	private double angleC;
	private double perimetr;
	private double square;
	
	
	public Triangle () {
		
		this.pointA[0] = 0;
		this.pointA[1] = 0;
		this.pointB[0] = 0;
		this.pointB[1] = 0;
		this.pointC[0] = 0;
		this.pointC[1] = 0;
		sideA = TriangleLogic.getSide(pointB, pointC);
		sideB = TriangleLogic.getSide(pointA, pointC);
		sideC = TriangleLogic.getSide(pointA, pointB);
		angleA = TriangleLogic.getAngle( sideB, sideC, sideA);
		angleB = TriangleLogic.getAngle( sideC, sideA, sideB);
		angleC = 180-(angleA + angleB);
		perimetr = (sideA + sideB + sideC);
		square = TriangleLogic.getSquare(perimetr, sideA, sideB, sideC);
	}
	
	public Triangle(int a, int b, int c, int d, int e, int f) {
		
		this.pointA[0] = a;
		this.pointA[1] = b;
		this.pointB[0] = c;
		this.pointB[1] = d;
		this.pointC[0] = e;
		this.pointC[1] = f;
		sideA = TriangleLogic.getSide(pointB, pointC);
		sideB = TriangleLogic.getSide(pointA, pointC);
		sideC = TriangleLogic.getSide(pointB, pointA);
		angleA = TriangleLogic.getAngle( sideB, sideC, sideA);
		angleB = TriangleLogic.getAngle( sideC, sideA, sideB);
		angleC = 180-(angleA + angleB);
		perimetr = (sideA + sideB + sideC);
		square = TriangleLogic.getSquare(perimetr, sideA, sideB, sideC);
		
	}

	public int[] getPointA() {
		return pointA;
	}

	public void setPointA(int x, int y) {
		this.pointA[0] = x;
		this.pointA[1] = y;
		sideA = TriangleLogic.getSide(pointB, pointC);
		sideB = TriangleLogic.getSide(pointA, pointC);
		sideC = TriangleLogic.getSide(pointB, pointA);
		angleA = TriangleLogic.getAngle( sideB, sideC, sideA);
		angleB = TriangleLogic.getAngle( sideC, sideA, sideB);
		angleC = 180-(angleA + angleB);
		perimetr = (sideA + sideB + sideC);
		square = TriangleLogic.getSquare(perimetr, sideA, sideB, sideC);
	}

	public int[] getPointB() {
		return pointB;
	}

	public void setPointB(int x, int y) {
		this.pointB[0] = x;
		this.pointB[1] = y;
		sideA = TriangleLogic.getSide(pointB, pointC);
		sideB = TriangleLogic.getSide(pointA, pointC);
		sideC = TriangleLogic.getSide(pointB, pointA);
		angleA = TriangleLogic.getAngle( sideB, sideC, sideA);
		angleB = TriangleLogic.getAngle( sideC, sideA, sideB);
		angleC = 180-(angleA + angleB);
		perimetr = (sideA + sideB + sideC);
		square = TriangleLogic.getSquare(perimetr, sideA, sideB, sideC);
	}

	public int[] getPointC() {
		return pointC;
	}

	public void setPointC(int x, int y) {
		this.pointC[0] = x;
		this.pointC[1] = y;
		sideA = TriangleLogic.getSide(pointB, pointC);
		sideB = TriangleLogic.getSide(pointA, pointC);
		sideC = TriangleLogic.getSide(pointB, pointA);
		angleA = TriangleLogic.getAngle( sideB, sideC, sideA);
		angleB = TriangleLogic.getAngle( sideC, sideA, sideB);
		angleC = 180-(angleA + angleB);
		perimetr = (sideA + sideB + sideC);
		square = TriangleLogic.getSquare(perimetr, sideA, sideB, sideC);
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

		public double getAngleA() {
		return angleA;
	}

	public double getAngleB() {
		return angleB;
	}

	public double getAngleC() {
		return angleC;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getSquare() {
		return square;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int)sideA;
		result = prime * result + (int)sideB;
		result = prime * result + (int)sideC;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (sideA != other.sideA)
			return false;
		if (sideB != other.sideB)
			return false;
		if (sideC != other.sideC)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + Arrays.toString(pointA) + ", pointB=" + Arrays.toString(pointB) + ", pointC="
				+ Arrays.toString(pointC) + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", angleA="
				+ angleA + ", angleB=" + angleB + ", angleC=" + angleC + ", perimetr=" + perimetr + ", square=" + square
				+ "]";
	}
	
}
