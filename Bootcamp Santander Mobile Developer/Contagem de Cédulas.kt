import java.util.Scanner

fun main() {

    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var valor = readLine()!!.toInt()

    println( valor  )
    
for (i in 0..(notas.size - 1)) {
        if (valor >= notas[i]) {
         var numNotas = (valor/notas[i]).toInt()   
         println("${ numNotas } nota(s) de R$ " + notas[i] + ",00")
        } else {
          println("0 nota(s) de R$ " + notas[i] + ",00")
        }
        valor = valor % notas[i]
    }
}