# Guía Didáctica No. 2  
## Sentencias de Bifurcación

**Estudiantes:** Rolando Mayorga y Mauro Delgado
**Asignatura:** Programación Orientada a Objetos  
**Semana:** 16 – 20 de marzo de 2026  
**Facultad:** Ingeniería y Arquitectura  

---

# Descripción

Esta guía tiene como objetivo practicar el uso de **sentencias de bifurcación** en programación, las cuales permiten que un programa tome decisiones dependiendo de ciertas condiciones.  

Se utilizan principalmente estructuras como:

- `if`
- `if - else`
- `switch`
- `switch expression`

Los ejercicios plantean situaciones prácticas donde el sistema debe **evaluar datos y ejecutar diferentes acciones según las condiciones definidas**.

---

# Ejercicios

## 1. El dilema del inventario

Este ejercicio consiste en crear un sistema que determine el **método de envío de un producto** según su **peso, distancia y características**.

El programa debe evaluar diferentes reglas para decidir entre:

- Transporte pesado
- Envío premium
- Envío por dron

El objetivo principal es practicar el uso de **condiciones múltiples con `if` y operadores lógicos**.

---

## 2. Validador de fechas

En este ejercicio se debe desarrollar un programa que determine si **una fecha ingresada por el usuario es válida**, **sin utilizar la clase `LocalDate`**.

Para ello el programa debe considerar:

- Meses con **30 días**
- Meses con **31 días**
- El caso especial de **febrero**
- **Años bisiestos**

El objetivo es aplicar **condiciones lógicas complejas** para validar correctamente una fecha.

---

## 3. Mejora a la sentencia Switch

Este ejercicio busca modernizar el uso del `switch` tradicional en Java.

El objetivo es **convertir un `switch` clásico en una Switch Expression**, la cual permite **retornar valores directamente**, reduciendo la cantidad de código y mejorando la legibilidad.

Se busca comprender cómo las versiones modernas de Java permiten escribir **código más limpio y eficiente**.

---

# 4. Investigación: El patrón de estrategia y el problema de muchos `if`

En este ejercicio se analiza un caso donde un sistema utiliza **muchos `if-else` consecutivos para calcular descuentos según el tipo de cliente**.

## ¿Por qué muchos `if` seguidos son un "Code Smell"?

En ingeniería de software, un **Code Smell (olor de código)** es una señal de que el código **puede tener problemas de diseño o mantenimiento**, aunque funcione correctamente.

Cuando existen muchos `if-else` encadenados, pueden surgir varios problemas:

### Problemas principales

**1. Baja legibilidad**

Cuando hay demasiadas condiciones, el código se vuelve difícil de entender, especialmente para otros desarrolladores.

**2. Difícil mantenimiento**

Si se agrega un nuevo tipo de cliente o una nueva regla de descuento, es necesario modificar el bloque de condiciones, lo que puede introducir errores.

**3. Alto acoplamiento**

La lógica de decisión queda concentrada en un solo lugar, haciendo que el sistema sea menos flexible.

**4. Violación del principio Open/Closed**

Este principio establece que el código debe estar **abierto a extensión pero cerrado a modificación**.  
Con muchos `if`, cada nueva regla obliga a modificar el código existente.

---

## Alternativa inicial: usar Switch mejorado

Una primera mejora es reemplazar múltiples `if` por un `switch` moderno.

Esto hace que el código sea:

- Más ordenado
- Más fácil de leer
- Más sencillo de mantener

El `switch` moderno permite asignar valores directamente según el caso evaluado.

---

## Alternativa futura: uso de objetos (Patrón Strategy)

Una solución más avanzada es aplicar el **Patrón de Diseño Strategy**.

Este patrón consiste en **encapsular diferentes comportamientos dentro de clases separadas**, en lugar de utilizar muchas condiciones.

En lugar de evaluar múltiples `if`, el sistema selecciona un **objeto que contiene la lógica de cálculo del descuento**.

### Ventajas del patrón Strategy

- El código es **más organizado**
- Permite **agregar nuevas estrategias sin modificar el código existente**
- Reduce el uso de **condiciones complejas**
- Mejora el diseño orientado a objetos

Este enfoque es común en sistemas grandes donde existen **muchas reglas de negocio diferentes**.

---

## 5. Validador de complejidad de contraseñas

En este ejercicio se debe crear un sistema que **clasifique contraseñas según su nivel de seguridad**.

Las reglas son:

- **Menos de 8 caracteres** → Insegura
- **8 o más caracteres y al menos un número** → Moderada
- **8 o más caracteres, un número y una mayúscula** → Fuerte

El objetivo es practicar el uso de **condiciones combinadas para validar cadenas de texto**.

---

# Conclusión

Esta guía permite fortalecer el uso de **estructuras condicionales en programación**, además de introducir conceptos importantes de **diseño de software**.

Los ejercicios no solo buscan resolver problemas con `if` y `switch`, sino también reflexionar sobre **cómo mejorar la estructura del código**, especialmente evitando problemas como los **code smells** y aplicando principios de **programación orientada a objetos**.