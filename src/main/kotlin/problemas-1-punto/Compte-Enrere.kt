package `problemas-1-punto`
import java.util.Scanner

/*
    Entrada: 1 nombre positiu (Integer).
    Sortida: Compte enrere fins al 0.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()

    // Repteix el bucle fins que el nombre sigui 0.
    while (nombre != 0){
        println(nombre)
        nombre--
    }

    // Tanca l'escàner.
    sc.close()
}