import java.util.Scanner

fun ler_int(){
    var scanner = Scanner(System. `in`)
    println("Digita um número ai fi:")
    var num = scanner.nextInt()
    println("vc digitou: ${num}")

}
fun ler_double(){
    var scanner = Scanner(System. `in`)
    println("Digita um número ai fi")
    var num = scanner.nextDouble()
    println("vc digitou ${num}")

}
fun main() {
    ler_int()

}