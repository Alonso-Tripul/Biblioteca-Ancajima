# BiblioMobil

Proyecto base desde cero para la aplicación multiplataforma de la Biblioteca Central.

## Ramas de trabajo

- `main`: proyecto base limpio.
- `feature/clean-mvvm`: rama destinada al desarrollo de la práctica.

## Configuración inicial

- Kotlin Multiplatform
- Compose Multiplatform
- Android e iOS
- Paquete raíz: `pe.edu.upeu.bibliomobil`
- Arquitectura prevista: Clean Architecture + MVVM
- Inyección de dependencias prevista: Koin

Esta base contiene únicamente la configuración y la estructura inicial. La lógica del dominio, casos de uso, repositorios, ViewModels, pantallas completas y pruebas deben implementarse durante el desarrollo.

## Abrir el proyecto

1. Clona el repositorio.
2. Abre la carpeta en Android Studio.
3. Sincroniza Gradle.
4. Cambia a `feature/clean-mvvm` antes de comenzar la implementación.

## Comandos de verificación

```bash
./gradlew :androidApp:assembleDebug
./gradlew :shared:testAndroidHostTest
```
