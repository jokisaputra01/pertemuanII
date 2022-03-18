fun main() {
    //Array methods
    //sort()
    val simpsonsA = arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    //revise() and reverseredArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexof()
    val simpsonsD = arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        print("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        print("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("Homer", "Marge","Bart", "Lisa", "Meggie")
    print("Simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        print("Array tidsk kosong!")
    println("Min = "+ simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("Firs = "+ simpsonsE.first())
    println("Last = "+ simpsonsE.last())
    println(simpsonsE.contains("Marge"))
    }


