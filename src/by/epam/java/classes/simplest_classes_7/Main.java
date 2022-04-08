
/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

package by.epam.java.classes.simplest_classes_7;

public class Main {

	public static void main(String[] args) {

		Triangle ABC = new Triangle (0,0,2,2,-4,0);
		
		System.out.println (ABC);
		
		double[] centroid = TriangleLogic.getCentroid(ABC);
		
		System.out.println ("centroid " + centroid[0] + ", " + centroid[1]);
		
		ABC.setPointA(5,0);
		
		System.out.println (ABC);
		
		centroid = TriangleLogic.getCentroid(ABC);
		
		System.out.println ("centroid " + centroid[0] + ", " + centroid[1]);
		
	}
}
