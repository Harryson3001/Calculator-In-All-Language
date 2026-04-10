#include <iostream>

int main() {
	float number1, number2;
	char operacao;

	std::cout << "[+] Digite o primeiro numero: ";
	std::cin >> number1;

	std::cout << "[+] Digite o simbolo da operacao: ";
	std::cin >> operacao;

	std::cout << "[+] Digite o segundo numero: ";
	std::cin >> number2;

	switch (operacao) {
	case '+':
		std::cout << "A Soma Dos Dois Numeros: " << number1 + number2;
		break;
	case '-':
		std::cout << "A Subtracao Dos Dois Numeros: " << number1 - number2;
		break;
	case '*':
		std::cout << "A Multiplicacao Dos Dois Numeros: " << number1 * number2;
		break;
	case '/':
		if (number2 == 0) {
			std::cout << "Erro: Divisao por zero!";
		}
		else {
			std::cout << "A Divisao Dos Dois Numeros: " << number1 / number2;
			break;
	default:
		std::cout << "Operacao Invalida!";
		break;
		}
	}

	return 0;
}