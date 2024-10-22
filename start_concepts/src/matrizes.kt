
fun imprime_matriz(matriz: Array<Array<Int>>, linhas: Int, colunas: Int) {
    for (i in 0 until linhas){
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }
    println()
}
fun popula_matriz(matriz: Array<Array<Int>>, linhas: Int, colunas: Int){
    var digito = 0

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = digito++
        }
    }

}


fun main() {
    val linhas = 3
    val colunas = 3
    val matriz: Array<Array<Int>> = Array(linhas) { Array(colunas) { 0 } }


    popula_matriz(matriz,linhas,colunas)
    imprime_matriz(matriz,linhas,colunas)

    val alpha: Array<Array<Int>> = Array(4) { Array(4) { 0 } }
    popula_matriz(alpha, 4, 4)
    imprime_matriz(alpha, 4, 4)

    println("Quantidade de linhas:${matriz.size}")
    println("Quantidade de colunas:${matriz[0].size}")

    println("Quantidade de linhas:${alpha.size}")
    println("Quantidade de colunas:${alpha[0].size}")

}