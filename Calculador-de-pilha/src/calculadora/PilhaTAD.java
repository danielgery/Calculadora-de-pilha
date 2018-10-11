package calculadora;

public interface PilhaTAD<T> {
	public void push(T d);
	public T pop();
	public T top();
	public boolean isEmpty();
	public int size();
}
