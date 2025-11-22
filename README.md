
# 🔑 Dia 2 - Generador de Contraseñas en Java

Aplicación de consola en Java que genera contraseñas seguras con letras, números y símbolos, según las preferencias del usuario.

## 🚀 Tecnologías utilizadas
- Java 17
- Librerías estándar (`Scanner`, `Random`)

## 🎯 Funcionalidades

- El usuario elige la longitud de la contraseña.
- Opción de incluir números y símbolos además de letras.
- Contraseña generada aleatoriamente en cada ejecución.
- Validación de entradas para evitar errores.

## 📦 Ejecución
1º Clona el repositorio:
  git clone https://github.com/AnsuxDEV/GeneradorContrasenas.git

2º Compila el archivo
  javac GeneradorPasswords.java

3º Ejecuta el programa
   java GeneradorPasswords

## 🖼️ Ejemplo de uso:

  - ¿Qué longitud necesitas en tu password? 16
  
  - ¿Quieres que incluya números? (s/n): s
  
  - ¿Quieres que incluya símbolos? (s/n): n
  
  🔑 Tu contraseña generada es: vBiBqiPSKasnh3ya

## 🧠 Aprendizajes
Este proyecto me ayudó a reforzar:

    - Uso de la clase Random para generar valores aleatorios.
    - Construcción dinámica de cadenas con StringBuilder.
    - Validación de entradas con Scanner (hasNextInt, nextLine, trim).
    - Cómo personalizar la lógica según las elecciones del usuario.
      
## ⚠️ Errores comunes que resolví

    - Variable no inicializada: aprendí que si declaro int longitud; debo asignarle un valor antes de usarla.
    - Conflicto entre nextInt() y nextLine(): descubrí que nextInt() deja un salto de línea en el buffer, y hay que limpiarlo con nextLine().
    - Bucle infinito en preguntas “s/n”: solucionado añadiendo break cuando la respuesta es válida.
    - Entrada inválida: añadí validación para que el programa no se rompa si el usuario escribe texto en lugar de números.
  
## 📈 Mejoras futuras

    - Usar SecureRandom para mayor seguridad criptográfica.
    - Guardar contraseñas en un archivo.
    - Añadir opción de excluir caracteres similares (ej. O y 0).
    - Generar contraseñas con requisitos específicos (mínimo un número, mínimo un símbolo, etc.).

## 📄 Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
