# Definimos las dimensiones de la cuadrícula
filas = 10
columnas = 20

# Creamos la cuadrícula vacía
cuadricula = [[' ' for _ in range(columnas)] for _ in range(filas)]

# Función para cargar el mapa desde un archivo
def cargar_mapa(archivo):
    with open(archivo, 'r') as f:
        for linea in f:
            linea = linea.strip()  # Eliminar espacios en blanco y saltos de línea
            if not linea:  # Si la línea está vacía, saltar
                continue
            try:
                coordenadas, caracter = linea.split(',')  # Cambiamos a ',' como separador
                fila, columna = map(int, coordenadas.split(','))  # Convertimos las coordenadas a enteros
                if 0 <= fila < filas and 0 <= columna < columnas:
                    cuadricula[fila][columna] = caracter
                else:
                    print(f"Coordenadas fuera de rango: {coordenadas}")  # Mensaje para coordenadas fuera de rango
            except ValueError as e:
                print(f"Error al procesar la línea: '{linea}'. Detalle del error: {e}")  # Mensaje de error para líneas no válidas

# Función para imprimir la cuadrícula
def imprimir_cuadricula(cuadricula):
    for fila in cuadricula:
        print(' '.join(fila))

# Cargar el mapa desde el archivo
cargar_mapa('mapa0.txt')

# Imprimir la cuadrícula
imprimir_cuadricula(cuadricula)
