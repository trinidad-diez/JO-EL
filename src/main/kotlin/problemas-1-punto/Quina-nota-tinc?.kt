package `problemas-1-punto`
import java.util.Scanner

/*
    Entrada: 3 nombres (Double) separats per coma.
    Sortida: Suspès, Aprovat, Notable o Excel·lent.
    L'Aprovat correspon a una nota final d'entre 5 i 7 inclosos,
    el Notable a una nota final superior a 7 i fins a 9 (inclòs),
    i l'Excel·lent a una nota superior a 9.
*/

fun main() {
    val sc = Scanner(System.`in`)

    // Llegeix tota la línia d'entrada (ex: 6.5,7.0,8.25)
    val entrada = sc.nextLine()

    // Separa els valors per comes i converteix a Double
    val notes = entrada.split(",").map { it.trim().toDouble() }

    // Calcula la mitjana
    val mitjana = notes.average()

    // Crea una variable pel resultat
    var resultat = ""

    // Determina la qualificació
    if (mitjana< 5 ) {
        resultat = "Suspès"
    } else if (mitjana <= 7) {
        resultat = "Aprovat"
    } else if (mitjana <= 9) {
        resultat = "Notable"
    } else {
        resultat= "Excel·lent"
    }

    // Imprimeix el resultat
    println(resultat)

    // Tanca l'escàner
    sc.close()
}
