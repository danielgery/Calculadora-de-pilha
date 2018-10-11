package calculadora;

import java.util.Scanner;

public class Calculadora {

	Pilha<Integer> p;

	public Calculadora() {

		p = new Pilha<Integer>();
		Scanner ler = new Scanner(System.in);

		while (true) {
			String comando = ler.nextLine();
			if (verificaSeeInteiro(comando)) {

				p.push(Integer.parseInt(comando));

			} else {// + - x /
				if(p.size()<2) {
					System.out.println("ERRO, Mt pequeno!");
					break;
				}
				Integer res;
				switch (comando.charAt(0)) {
				case '+':
					res = p.pop() + p.pop();
					p.push(res);
					System.out.println(res);
					break;
				case '-':
					res = p.pop() - p.pop();
					p.push(res);
					System.out.println(res);
					break;
				case '*':
					res = p.pop() * p.pop();
					p.push(res);
					System.out.println(res);
					break;
				case '/':
					res = p.pop() / p.pop();
					p.push(res);
					System.out.println(res);
					break;
				case '^':
					res = (int) Math.pow(p.pop(), p.pop());
					p.push(res);
					System.out.println(res);
					break;
				default:
					System.out.println("ERRO");
				}
			}

		}
	}

	public static boolean verificaSeeInteiro(String s) {
		boolean resposta = true;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) { // Verifica caractere por caractere se � um d�gito
				resposta = false;
				break;
			}
		}
		return resposta;
	}
}
