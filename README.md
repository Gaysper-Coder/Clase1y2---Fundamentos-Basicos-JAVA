# Clase1y2-ConceptosFundamentalesJava-Teaser

## Conceptos básicos repasados (App.java)

### Tipos primitivos

byte, short, int, long, float, double, char, boolean. Valores por defecto solo en campos y arrays; locales requieren inicialización.

### Clases utilitarias

String (length), Math (pow, random), Scanner (entrada por consola).

### Operadores aritméticos

+, -, _, /, %, incremento (++, --) y asignaciones compuestas (+=, -=, _=, /=, %=).

### Operadores de comparación y lógicos

==, !=, >, <, >=, <= y lógicos &&, ||, ! para formar condiciones.

### Control de flujo

- if / else if / else
- Operador ternario ? :
- switch clásico con break
- switch expression (Java 14+) usando flechas -> y retorno de valor

### Bucles

while, do-while, for, for-each. Uso de break para salir y continue para saltar iteraciones.

### Mini juego

- Uso de Scanner para entrada de nombre y acción.
- Variables de estado (salud, ataque, defensa).
- Probabilidad de crítico con Math.random() comparada contra playerCritical.
- Operador ternario para daño crítico: (condición) ? dañoCrítico : dañoNormal.
- Modificación dinámica de la probabilidad al defender.
- Ejemplo de lógica condicional acumulativa y actualización de variables.

### Buenas prácticas mostradas

Inicializar variables locales, cerrar Scanner, usar tipos apropiados (short para valores pequeños), evitar repetición con expresiones.

### Próximos pasos sugeridos

Encapsular lógica del juego en clases (Jugador, Jefe), extraer métodos (calcularDaño, turnoJugador), validar entrada y añadir manejo de errores.

### Author

[![GaysperVT](https://github.com/Gaysper-Coder/.github/blob/main/Gayspear_Logo.png?raw=true)](https://www.twitch.tv/gayspervt)
