package `problemas-1-punto`
import java.util.Scanner

/*
    Entrada:
        1) Nom + edat.
        2) Nom + edat.

    Sortida: Nom de l'avi més vell.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema les entrades en variables.
    var nom1 = sc.next()
    var edat1 : Int = sc.nextInt()
    var nom2 = sc.next()
    var edat2 : Int = sc.nextInt()

    // Imprimeix l'edat més gran a la consola.
    if (edat1 > edat2){
        println(nom1)
    } else if (edat2 > edat1){
        println(nom2)
    } else {
        println("Cap es mes vell")
    }

    // Tanca l'escàner.
    sc.close()
}
