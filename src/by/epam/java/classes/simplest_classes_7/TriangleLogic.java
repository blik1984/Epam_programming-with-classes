package by.epam.java.classes.simplest_classes_7;


public class TriangleLogic {

	public static double getAngle (double sideA, double sideB, double sideC) {
		
		double cos = (sideA*sideA + sideB*sideB - sideC*sideC) / (2*sideA*sideB);
		
		double angle = Math.toDegrees(Math.acos(cos));
		return angle;
	}
	
	public static double getSquare (double perimetr, double sideA, double sideB, double sideC) {
		
		double square = 0;
		double p = perimetr / 2;

		if (sideA > 0 | sideB > 0 | sideC > 0) {
			
			square = Math.sqrt(p * (p - sideA) * (p- sideB) * (p - sideC));
			return square;
		}
		
		return square;
	}
	
	public static double getSide (int[] point1, int[] point2) {
		
		double kat1 = point1[0]-point2[0];
		double kat2 = point1[1]-point2[1];
		double side = Math.sqrt(kat1*kat1 + kat2*kat2);
		
		return side;
	}
	
	public static double[] getCentroid (Triangle abc) {
		
		double[] centroid = new double[2];
		int[] pointA = abc.getPointA();
		int[] pointB = abc.getPointB();
		int[] pointC = abc.getPointC();
		centroid[0] = ((double)pointA[0] + pointB[0] + pointC[0])/3;
		centroid[1] = ((double)pointA[1] + pointB[1] + pointC[1])/3;

		return centroid;
	}
}
