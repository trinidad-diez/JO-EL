package `problemas-2-puntos`
import java.util.Scanner

/*
    Entrada:
        1) Puntació alabaricoque
        2) Puntació alabaricoque
        3) Puntació alabaricoque
        4) Puntació banana
        5) Puntació banana
        6) Puntació banana

     Sortida:  A si ganan los Albaricoques, B si ganan las Bananas y T si el partido se va a Tiempo Extra por ser empate.
 */

fun main(){
    // Crea une escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    var sumaA : Int = 0
    repeat(3){
        sumaA += sc.nextInt()
    }

    var sumaB : Int = 0
    repeat(3){
        sumaB += sc.nextInt()
    }

    var resposta = "T"

    if (sumaA > sumaB){
        resposta = "A"
    } else if (sumaB > sumaA){
        resposta = "B"
    }

    println(resposta)

    // Tanca l'escàner.
    sc.close()
}