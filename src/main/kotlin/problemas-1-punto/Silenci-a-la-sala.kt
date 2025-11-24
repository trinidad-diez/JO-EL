package `problemas-1-punto`

import java.util.Scanner

/*
    Entrada: linea.
    Sortida: Per cada missatge d'entrada es mostrarà a la sortida "Sssh, únicament acaba quan posis sortida". El programa finalitza quan el missatge d'entrada sigui "sortida".
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    var message = sc.nextLine()

    // Repeteix un bucle
    while (message != "sortida"){
        println("Sssh, únicament acaba quan posis sortida")
        message = sc.nextLine()
    }

    // Tanca l'escàner.
    sc.close()
}