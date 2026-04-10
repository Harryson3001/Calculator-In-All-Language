let first =  Number(prompt("Digite o primeiro número: "));
let second = Number(prompt("Digite o segundo número: "));
let operation = prompt("Digite a operação (+, -, *, /):");

switch (operation) {
    case "+":
        alert(`O resultado da soma é: ${first + second}`);
        break;
    case "-":
        alert(`O resultado da subtração é: ${first - second}`);
        break;
    case "*":
        alert(`O resultado da multiplicação é: ${first * second}`);
        break;
    case "/":
        if (second !== 0) {
            alert(`O resultado da divisão é: ${first / second}`);
        } else {
            alert("Erro: Divisão por zero não é permitida.");
        }
        break;
    default:
        alert("Operação inválida. Por favor, escolha entre +, -, *, /.");
}