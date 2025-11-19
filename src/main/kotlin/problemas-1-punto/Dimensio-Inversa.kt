import java.util.Scanner

/*
    Entrada: un número (Integer).
    Sortida: número com a fracció.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nombre) en una variable.
    val n : Double = sc.nextInt().toDouble()

    // Calcula el nombre invers.
    val nombreInvers : Double = 1 / n
    println(1 / nombreInvers)
}