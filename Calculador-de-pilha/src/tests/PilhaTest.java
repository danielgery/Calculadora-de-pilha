package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Pilha;

class PilhaTest {

	private Pilha<Integer> p;

	@BeforeEach
	public void setUp() {
		p = new Pilha<Integer>();
	}

	@Test
	void topTest() {

		p.push(1);
		p.push(2);
		assertEquals((Integer) 2, p.top());
	}

	@Test
	void popTest() {

		p.push(1);
		p.push(2);
		assertEquals((Integer) 2, p.pop());
		assertEquals((Integer) 1, p.pop());
	}

	@Test
	void isEmptyTest() {

		p.push(1);
		p.push(2);
		p.pop();
		p.pop();
		assertEquals(true, p.isEmpty());
	}

	@Test
	void sizeTest() {

		p.push(1);
		p.push(2);
		assertEquals(2, p.size());
		p.pop();
		assertEquals(1, p.size());
		p.pop();
		assertEquals(0, p.size());
	}
}
