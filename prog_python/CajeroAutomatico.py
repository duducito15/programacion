#entrada
print("Ingresa el monto: ")
monto = int(input())

#proceso
billetes50 = monto // 50
monto = monto % 50
billetes20 = monto // 20
monto = monto % 20
billetes10 = monto // 10
monto = monto % 10

#salida
print(f"Cantidad de billetes de 50: {billetes50} ")
print(f"Cantidad de billetes de 20: {billetes20} ")
print(f"Cantidad de billetes de 10: {billetes10} ")