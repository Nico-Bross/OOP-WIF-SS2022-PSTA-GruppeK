package CreazyStation;

public class Element<T> {

	T value;
	Element<T> next;

	Element(T v, Element<T> n) {
		value = v;
		next = n;
	}
}
