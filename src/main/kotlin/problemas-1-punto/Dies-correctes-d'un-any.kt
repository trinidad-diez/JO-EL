package `problemas-1-punto`
import java.util.Scanner

/*
    Entrada: un número enter que representa el dia de l'any
    Sortida:
        - "Incorrecte!" si el número no és vàlid
        - "Correcte per un any no bixest!" si el dia està entre 1 i 365
        - "Correcte per un any bixest!" si el dia és 366
*/

fun main() {
    val sc = Scanner(System.`in`)

    print("Introdueix un número de dia de l'any: ")
    val input = sc.nextLine().trim()
    val dia = input.toIntOrNull()

    if (dia == null || dia < 1 || dia > 366) {
        println("Incorrecte!")
    } else if (dia in 1..365) {
        println("Correcte per un any no bixest!")
    } else { // dia == 366
        println("Correcte per un any bixest!")
    }

    sc.close()
}

