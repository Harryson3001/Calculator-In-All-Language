first = float(input("Digite o primeiro número: "))
second = float(input("Digite o segundo número: "))  
operation = input("Digite a operação (+, -, *, /): ")
if operation == "+":
    result = first + second
    print("O resultado é: ", result)
elif operation == "-":
    result = first - second
    print("O resultado é: ", result)
elif operation == "*":
    result = first * second
    print("O resultado é: ", result)
elif operation == "/":
    result = first / second
    print("O resultado é: ", result)
else:    print("Operação inválida")