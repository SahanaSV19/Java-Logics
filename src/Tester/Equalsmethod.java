package Tester;

import java.util.Objects;

public class Equalsmethod {
	String carname;
	double carpprice;
	String carcolour;
public static void main(String[] args) {
Equalsmethod e1 = new Equalsmethod("Ferrari", 1000000, "black");
Equalsmethod e2 = new Equalsmethod("audi", 200000, "white");
System.out.println(e1.equals(e2));

}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Equalsmethod other = (Equalsmethod) obj;
	return Objects.equals(carcolour, other.carcolour) && Objects.equals(carname, other.carname)
			&& Double.doubleToLongBits(carpprice) == Double.doubleToLongBits(other.carpprice);
}
public Equalsmethod(String carname, double carpprice, String carcolour) {
	super();
	this.carname = carname;
	this.carpprice = carpprice;
	this.carcolour = carcolour;
}
}
