<?php

$firstNumber = (float) readline("Digite o primeiro número: ");
$secondNumber = (float) readline("Digite o segundo número: ");
$operation = readline("Digite a operação (+, -, *, /): ");

switch ($operation) {
    case '+':
        $result = $firstNumber + $secondNumber;
        break;
    case '-':
        $result = $firstNumber - $secondNumber;
        break;
    case '*':
        $result = $firstNumber * $secondNumber;
        break;
    case '/':
        if ($secondNumber != 0) {
            $result = $firstNumber / $secondNumber;
        } else {
            $result = 'Erro: divisão por zero';
        }
        break;
    default:
        $result = 'Erro: operação inválida';
}

echo "Resultado: " . $result . PHP_EOL;
?>