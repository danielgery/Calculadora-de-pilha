package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T extends Comparable<T>> implements PilhaTAD<T>  {

	List<T> pilha = new ArrayList<T>();
	
	@Override
	public void push(T d) {
		pilha.add(d);
		
	}

	@Override
	public T pop() {
		return pilha.remove(pilha.size()-1);
	}

	@Override
	public T top() {
		return pilha.get(pilha.size()-1);
	}

	@Override
	public boolean isEmpty() {
		return pilha.isEmpty();
	}

	@Override
	public int size() {
		return pilha.size();
	}

}
