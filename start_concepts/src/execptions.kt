fun main() {
    var str: String? = null
    println(str?.length)
    str = "aoba"
    println(str!!.length)
    println("teste")

    var str2: String? = null
    println(str ?: "nula") //operador elvis
    println(str2 ?: "nula")

}