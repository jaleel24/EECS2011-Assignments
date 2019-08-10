package eecs2011;

public class SingleNode<E> {
	private E value;
	private SingleNode<E> next;
	
public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public SingleNode<E> getNext() {
		return next;
	}

	public void setNext(SingleNode<E> next) {
		this.next = next;
	}

@Override
public String toString() {
	return  value + "";
}

}
