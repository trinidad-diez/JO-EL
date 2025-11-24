package `problemas-1-punto`
import java.util.Scanner

/*
    Entrada: N (Integer)
    Sortida: “L’any vinent tindràs N+1 anys".
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema la entrada (el nombres) en una variable.
    var edat : Int = sc.nextInt()

    // Incrementa l'edat.
    edat++

    // Imprimeix l'edat incrementada la consola.
    println("Tindras $edat anys")

    // Tanca l'escàner.
    sc.close()
}
