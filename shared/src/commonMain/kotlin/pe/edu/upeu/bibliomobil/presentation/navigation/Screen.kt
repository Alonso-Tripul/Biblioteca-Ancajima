package pe.edu.upeu.bibliomobil.presentation.navigation

/**
 * Destinos iniciales de BiblioMobil.
 *
 * La navegación completa y la persistencia del destino se implementarán
 * durante la práctica en la rama feature/clean-mvvm.
 */
sealed interface Screen {
    data object Inicio : Screen
    data object Libros : Screen
    data object Lectores : Screen
    data object Prestamos : Screen
}
