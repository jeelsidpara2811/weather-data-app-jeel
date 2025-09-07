# Weather Cities Website Generator (Java)

Generates a small **static website** (HTML) from Java OOP models:
- `Small_Cities`, `Big_Cities` (inheritance from `Abstract_Cities`)
- `Website_Generator` builds `index.html` + per-city pages

---

## 1) Requirements

- **Java JDK 17+** (8+ will also work for this simple code)
- Windows PowerShell or any terminal

Check your Java:
```powershell
java -version
javac -version
```

## 2) Project Structure
```
weather_src/
├─ src/
│  ├─ main/
│  │  ├─ App.java
│  │  ├─ Abstract_Cities.java
│  │  ├─ Big_Cities.java
│  │  ├─ Small_Cities.java
│  │  └─ Website_Generator.java
│  └─ test/        # optional
└─ bin/            # compiled .class files (generated)
# All source files use:
package jeel.weather;

```

## 3) How to run
```
# Clean old builds
if (Test-Path bin) { Remove-Item -Recurse -Force bin }

# Compile all sources into bin/
javac -d bin (Get-ChildItem -Recurse -Filter *.java -Path src\main).FullName

# Run the program
java -cp bin jeel.weather.App

```
## 5) Output 

Creates an index.html with navigation links.
Generates one page per city:
    weather_small_city_rosenheim.html
    weather_big_city_munich.html
    weather_big_city_berlin.html
    etc.    

## 6) How to View the Website
```
start index.html \\ In terminal
```
