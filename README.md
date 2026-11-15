# Kata 1 — Familiarización con IntelliJ IDEA

Ingeniería del Software 2 · Escuela de Ingeniería Informática · ULPGC

## Objetivo

Practicar el flujo básico de trabajo con IntelliJ IDEA y Git/GitHub a partir de un microproyecto Java: una clase de dominio con un valor derivado, un `Main` que la usa, ejecución, depuración con breakpoints y refactorización desde el IDE. La kata se ha repetido tres veces con el mismo alcance.

## Requisitos

- JDK 27 (configurado en IntelliJ como `openjdk-27`)
- Maven (el que trae IntelliJ basta)
- Sin dependencias externas

## Compilar y ejecutar

Desde IntelliJ: abrir la carpeta del proyecto, esperar a que importe el `pom.xml` y ejecutar `Main` con el botón ▶ junto al método `main`.

Desde terminal:

```bash
mvn compile
java -cp target/classes software.ulpgc.Main
```

## Estructura

```
kata1/
├── pom.xml
└── src/main/java/software/ulpgc/
    ├── Student.java   # Clase de dominio
    └── Main.java      # Punto de entrada: crea estudiantes y muestra su edad
```

- **`Student`**: `record` con `name`, `id` y `birthDate` (atributos privados e inmutables, con sus métodos de consulta). Su valor derivado es `age()`, que calcula los años transcurridos desde `birthDate` hasta hoy.
- **`Main`**: solo orquesta el ejemplo. Crea dos estudiantes y muestra su edad por consola.

Paquete base: `software.ulpgc`.

## Repeticiones de la kata

Cada repetición está en su propia rama, hecha en una sesión distinta, y en cada una cambia la entidad y el cálculo derivado:

| Rama | Fecha | Entidad | Valor derivado |
|---|---|---|---|
| `first-iteration` | 04/11/2026 | `Student` | `age()`: edad en años |
| `second-iteration` | 11/11/2026 | `Car` | `yearsFromPurchase()`: años desde la compra |
| `third-iteration` | 14/11/2026 | `Task` | `isFinished()`: si la fecha límite ya pasó |

En cada repetición se siguió el mismo proceso: crear la clase de dominio, convertirla en `record`, implementar el cálculo, refactorizar desde el IDE, crear `Main`, ejecutar y depurar.

## Flujo Git

1. `Project created`: proyecto Maven creado en IntelliJ, `.gitignore` y primer push a GitHub (`master`).
2. Una rama por repetición (`first-iteration`, `second-iteration`, `third-iteration`), con commits pequeños: creación de la clase, implementación, refactorización y `Main`.
3. Push de las ramas al remoto:

```bash
git push -u origin master first-iteration second-iteration third-iteration
```

## Comprobación en una carpeta limpia

```bash
git clone https://github.com/nestega16-gif/kata1.git kata1-clone
cd kata1-clone
git switch first-iteration
mvn compile
java -cp target/classes software.ulpgc.Main
```

## Shortcuts de IntelliJ usados (Windows)

| Shortcut | Para qué |
|---|---|
| `Ctrl + F8` | Poner o quitar un breakpoint |
| `F8` / `F7` | Step over / step into |
| `Ctrl + Alt + C` | Extraer una constante estática (refactorización) |
| `Alt + Enter` | Acciones rápidas (p. ej., convertir la clase en `record`) |
| `Ctrl + Espacio` | Autocompletar |
| `Ctrl + B` | Ir a la declaración |
| `Alt + 1` | Mostrar u ocultar la vista del proyecto |
| `Alt + 0` | Abrir la ventana de commit |
| `Alt + 9` | Abrir la ventana de Git |

## Verificación

Manual, desde IntelliJ:

- Ejecución de `Main` desde el IDE y desde la configuración generada. Salida obtenida el 15/11/2026:
  ```
  56
  20
  ```
  `Pepe` (nacido el 01/01/1970) tiene 56 años. `Jose` (nacido el día de hoy de 2006) tiene 20, lo que comprueba el caso del cumpleaños el mismo día.
- Breakpoint en el constructor de `Student` para inspeccionar los atributos y otro en `age()` para comprobar los días calculados y el resultado.
- Refactorización: extracción de la constante `DAYS_TO_YEAR` con `Ctrl + Alt + C` y conversión de la clase a `record` con `Alt + Enter`.
- Comprobación en GitHub de que existen las ramas y de que el repositorio clonado compila.

## Vídeo explicativo

[Enlace al vídeo](PENDIENTE)
