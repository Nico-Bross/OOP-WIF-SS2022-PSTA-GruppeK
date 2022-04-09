package CreazyStation;

public class Element<T> {

	T value;
	Element<T> next;
	Element<T> next2;

	Element(T v, Element<T> n) {
		value = v;
		next = n;
	}
	Element(T v, Element<T> n, Element<T> n2) {
		value = v;
		next = n;
		next2 = n2;
	}
}
