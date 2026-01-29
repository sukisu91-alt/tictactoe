#  Tic Tac Toe  (Java)

Proyecto desarrollado en **Java 21** como parte del **bootcamp de Factoria F5**, aplicando buenas prácticas de programación, testing con **JUnit** y metodologías ágiles.

El objetivo es implementar el clásico juego **Tic Tac Toe** para dos jugadores en consola.

---

## Descripción del proyecto

*Tic Tac Toe* es un juego de dos jugadores (X y O) que se juega en un tablero de **3x3**.  
El jugador **X** comienza la partida y los jugadores se turnan hasta que:

- Uno de ellos consigue **tres símbolos iguales en línea** (horizontal, vertical o diagonal).
- O el tablero se llena completamente, produciendo un **empate**.

Al finalizar la partida, el sistema muestra el resultado correspondiente.

---

##  Tecnologías y herramientas

###  Tecnologías
- Java 21
- Maven
- JUnit

###  Herramientas
- Visual Studio Code
- Git & GitHub
- Jira (Atlassian)

---

##  Arquitectura del proyecto

El proyecto sigue una estructura inspirada en el patrón **MVC (Modelo–Vista–Controlador)**.

###  Clases principales
- `App.java` → Punto de entrada de la aplicación
- `Game` → Lógica del juego
- `Board` → Gestión del tablero (`char[][]`)
- `Player` → Representación de los jugadores y turnos
- `Interface` → Vista por consola e interacción con el usuario

El tablero se gestiona mediante un arreglo bidimensional de tipo `char[][]`.

---

## ▶ Ejecución del proyecto

El proyecto se ejecuta directamente desde **Visual Studio Code** utilizando la opción **Run**.

No es necesario ejecutar comandos manuales desde terminal.

---

##  Cómo jugar

Al iniciar el juego se muestran las instrucciones en consola:

---

##  Cómo jugar

Al iniciar el juego se muestran las instrucciones en consola:


╔════════════════════════════════╗
│ TIC TAC TOE                    │
╚════════════════════════════════╝

                                        ¡Bienvenidas(os)!
ᯓ★ OBJETIVO DEL JUEGO:
Ser el primer jugador en colocar tres símbolos iguales en línea:

Horizontal

Vertical

Diagonal

ᯓ★ JUGADORES:

Jugador 1 → X

Jugador 2 → O

ᯓ★ CÓMO JUGAR:
En tu turno, elige una posición del tablero usando números del 0 al 2:

Selecciona la FILA:
0 → superior | 1 → central | 2 → inferior

Selecciona la COLUMNA:
0 → izquierda | 1 → centro | 2 → derecha

NOTAS:

Solo ingresa un número a la vez.

El tablero se muestra después de cada movimiento.

El juego indicará si hay un ganador o empate.

                                       ¡A jugar!
═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════


---

## Requisitos funcionales cumplidos

- Mostrar tablero vacío al inicio
- Mostrar el tablero tras cada movimiento
- Turnos alternos entre jugador X y O
- Entrada por fila y columna
- Validación de celdas ocupadas
- Comprobación de ganador tras cada turno
- Detección de empate
- Mensaje final de resultado

---

##  Testing

El proyecto utiliza **JUnit** como framework de testing, integrado mediante **Maven**.

Actualmente se incluye **testing parcial**, enfocado en validar la lógica principal del juego.

---

##  Metodología de trabajo

- Metodología ágil
- Proyecto desarrollado en **1 sprint**
- Planificación y seguimiento mediante **Jira**
- Flujo de trabajo con **GitFlow**

###  Product Backlog
https://jennyx1984.atlassian.net/jira/software/projects/TTT/boards/67

---

##  Equipo de desarrollo

Proyecto desarrollado en equipo por:

- **Sukaina** — @sukisu91-alt  
- **Geraldine Saco** — @GeraldineSaco  
- **Patricia Pérez Márquez** — @delitricia  
- **Jennifer Cros** — @Jennyx-1984  

---

## 📎 Repositorio

https://github.com/sukisu91-alt/tictactoe

---

## Estado del proyecto

Proyecto finalizado 

— **Factoria F5**

