fun main() {
    var str: String? = null
    str = "qual é"
    if(str != null) {
        println("caiu no if")
    }
   str?.let {
       println("caiu na let")
   }
}