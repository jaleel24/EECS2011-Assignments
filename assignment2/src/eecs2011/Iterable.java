package eecs2011;

public interface Iterable<E> {
	
	public Iterator<E> iterator(); 
	public Iterable<Position<E>> positions();

}
