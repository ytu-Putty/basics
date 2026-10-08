fun main() {
    val string1 = readln()
    var result =""
    var count = 1;
    val lastsymbol = string1 + " "
    for (i in 1 .. lastsymbol.length-1)
    {
        if(lastsymbol[i] == lastsymbol[i - 1])
        {
            count ++
        }
        else
        {
            result += lastsymbol[i - 1]
            if(count > 1)
            {
                result += count
            }
            count = 1
        }
    }
    println(result)
}