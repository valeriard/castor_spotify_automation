# AUTOMATIZACION SPOTIFY WEB
Automatización end-to-end de Spotify Web en Java utilizando el patrón Page Object Model (POM), Serenity BDD, Cucumber y Selenium WebDriver.

Este proyecto automatiza funcionalidades clave:

Login en Spotify

Búsqueda de canciones y artistas

Navegación de playlists populares

Reproducción de canciones

# 1. Tecnologías y dependencias principales

| Tecnología         | Versión                                    |
| ------------------ | ------------------------------------------ |
| Java               | 17                                         |
| Gradle Wrapper     | 7.6.4                                      |
| Serenity BDD       | 4.3.2                                      |
| Cucumber JVM       | 7.18.1                                     |
| Selenium WebDriver | Incluido en Serenity                       |
| WebDriverManager   | 6.3.3 (manejo automático del ChromeDriver) |

# 2. Requisitos de instalación
Antes de ejecutar las pruebas, asegúrate de tener:

🔧 Java 17

Verifica la versión instalada:

java -version

🔧 Gradle Wrapper

No es necesario instalar Gradle manualmente. Usa el wrapper incluido:

./gradlew --version   # Linux/Mac
gradlew --version     # Windows

🔧 Google Chrome

Debes tener Chrome instalado. El proyecto usa WebDriverManager para descargar automáticamente el driver compatible.

# 3. Configuración de Variables de Entorno
El proyecto requiere credenciales reales de Spotify:

Windows (CMD)
setx VALID_EMAIL "tu_correo"
setx VALID_PASSWORD "tu_password"

Linux / Mac
export VALID_EMAIL="tu_correo"
export VALID_PASSWORD="tu_password"


Verificación:

echo %VALID_EMAIL%   # Windows
echo $VALID_EMAIL    # Mac/Linux

# 4. Estructura del proyecto (Page Object Model)

<img width="507" height="412" alt="image" src="https://github.com/user-attachments/assets/8ee8c318-d5d3-4f5c-84eb-58a2e2e3fbb9" />

# 5. Instrucciones de ejecución
▶ Ejecutar todas las pruebas
./gradlew clean test -VALID_EMAIL="$VALID_EMAIL" -VALID_PASSWORD="$VALID_PASSWORD"

# 6. Generación del reporte de Serenity

Después de ejecutar las pruebas, Serenity genera un reporte HTML en:
target/site/serenity/index.html

Abrir el reporte
start target/site/serenity/index.html

# 7. Cómo interpretar el reporte de Serenity

El dashboard de Serenity incluye:

Resumen general:
Total de pruebas, pasadas/falladas/ignoradas, tiempo total de ejecución.

Gráficas de rendimiento:
Tendencia de éxito, duración por prueba.

Ejecución paso a paso:
Each step (Given/When/Then) ejecutado, capturas automáticas, explicación de errores, elementos encontrados, valores ingresados.

Reporte de pruebas por funcionalidad:
Agrupadas por Feature, Escenario o Requerimiento.
Ejemplo de escenario:
<img width="430" height="116" alt="image" src="https://github.com/user-attachments/assets/23092312-e312-42ab-8d9c-8ada1d1ef885" />

Incluye evidencia visual:

Capturas de cada interacción

Highlight de elementos

Tiempos exactos de ejecución

# 8. Ejecución en CI/CD (GitHub Actions)

name: Run Tests

on:
  push:
    branches: [ "main" ]

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - name: Set up JDK
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'
      - name: Run tests
        env:
          SPOTIFY_EMAIL: ${{ secrets.VALID_EMAIL }}
          SPOTIFY_PASSWORD: ${{ secrets.VALID_PASSWORD }}
        run: ./gradlew clean test
# 9. Autor
Valeria Rivera – QA Automation | Especialista en Serenity BDD, Cucumber y Selenium WebDriver
