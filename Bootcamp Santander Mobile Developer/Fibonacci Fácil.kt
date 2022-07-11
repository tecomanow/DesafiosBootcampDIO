fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    var v1 = 0
    var v2 = 1
    
    for (i in 1..(n-1)) {
        print("$v1 ")
        
        val sum = v1 + v2
        v1 = v2
        v2 = sum
    }
    
    print("$v1")
    println()
    
}