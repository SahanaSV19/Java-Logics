package Tester;

import java.util.Objects;

public class Hashnumber {
	int id;
	String name;
@Override
	public int hashCode() {
		return 123;
	}
	@Override
public String toString() {
	return "Hashnumber [id=" + id + ", name=" + name + "]";
}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashnumber other = (Hashnumber) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
public static void main(String[] args) {
	Hashnumber hashnumber= new Hashnumber(1,"priya");
	System.out.println(hashnumber.hashCode());
}
public Hashnumber(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
}
