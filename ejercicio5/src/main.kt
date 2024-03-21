fun main(){
    multiplos(3,5,7)
    println()
    multiplos(2,6,15)
}

fun multiplos(i: Int, j:Int, n:Int){
    var multi = i
    var multj = j
    for (num in 1..n){
        if (multj < multi){
            print("$multj ")
            multj += j
        }
        else if (multi < multj){
            print("$multi ")
            multi += i
        }
        else{
            print("$multi ")
            multj += j
            multi += i
        }
    }
}