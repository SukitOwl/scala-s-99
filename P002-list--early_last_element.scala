val input = List(12, 6, 3, 10, 5, 16, 8, 4, 2, 1)


def f[T](list: List[T]): T = list.takeRight(2).head


// head/tail drop/take init/tail


assert(2 == f(input))


println("\n----- Stat for get list[n-1] from List -----\n")
printf("%-15s|%-15s|%-15s|%-15s|%-15s\n", "Size", "TakeRight(us)", "Apply(us)", "winner", "faster (times)")
for (size <- List(100, 10000, 1000000, 10000000, 100000000)) {
    val expected = size - 1

    val startTakeRight = System.nanoTime
    val resultTakeRight = Range.inclusive(1,size).takeRight(2).head
    val execTakeRight = (System.nanoTime - startTakeRight) / 1e6d
    assert(expected == resultTakeRight)

    val index = size - 2
    val startApply = System.nanoTime
    val resultApply = Range.inclusive(1,size).apply(index)
    val execApply = (System.nanoTime - startApply) / 1e6d
    assert(expected == resultApply)

    val winner = if (execTakeRight <= execApply) "TakeRight" else "Apply"
    val faster = if (execTakeRight <= execApply) execApply / execTakeRight else execTakeRight / execApply
    val fasterFormated = faster - faster % 0.01
    printf("%-15s|%-15s|%-15s|%-15s|%-15s\n",size, execTakeRight, execApply, winner, fasterFormated)
}


println("\n----- Stat for get list[n/2] from List -----\n")
printf("%-15s|%-15s|%-15s|%-15s|%-15s\n", "Size", "TakeRight(us)", "Apply(us)", "winner", "faster (times)")
for (size <- List(100, 10000, 1000000, 10000000, 100000000)) {
    val expected = size/2 + 1

    val startTakeRight = System.nanoTime
    val resultTakeRight = Range.inclusive(1,size).takeRight(size/2).head
    val execTakeRight = (System.nanoTime - startTakeRight) / 1e6d
    assert(expected == resultTakeRight)

    val index = (size / 2)
    val startApply = System.nanoTime
    val resultApply = Range.inclusive(1,size).apply(index)
    val execApply = (System.nanoTime - startApply) / 1e6d
    assert(expected == resultApply)

    val winner = if (execTakeRight <= execApply) "TakeRight" else "Apply"
    val faster = if (execTakeRight <= execApply) execApply / execTakeRight else execTakeRight / execApply
    val fasterFormated = faster - faster % 0.01
    printf("%-15s|%-15s|%-15s|%-15s|%-15s\n",size, execTakeRight, execApply, winner, fasterFormated)
}


println("\n----- Stat for get list[n-1] from Array -----\n")
printf("%-15s|%-15s|%-15s|%-15s|%-15s\n", "Size", "TakeRight(us)", "Apply(us)", "winner", "faster (times)")
for (size <- Array(100, 10000, 1000000, 10000000, 100000000)) {
    val expected = size - 1

    val startTakeRight = System.nanoTime
    val resultTakeRight = Range.inclusive(1,size).takeRight(2).head
    val execTakeRight = (System.nanoTime - startTakeRight) / 1e6d
    assert(expected == resultTakeRight)

    val index = size - 2
    val startApply = System.nanoTime
    val resultApply = Range.inclusive(1,size).apply(index)
    val execApply = (System.nanoTime - startApply) / 1e6d
    assert(expected == resultApply)

    val winner = if (execTakeRight <= execApply) "TakeRight" else "Apply"
    val faster = if (execTakeRight <= execApply) execApply / execTakeRight else execTakeRight / execApply
    val fasterFormated = faster - faster % 0.01
    printf("%-15s|%-15s|%-15s|%-15s|%-15s\n",size, execTakeRight, execApply, winner, fasterFormated)
}


println("\n----- Stat for get list[n/2] from list -----\n")
printf("%-15s|%-15s|%-15s|%-15s|%-15s\n", "Size", "TakeRight(us)", "Apply(us)", "winner", "faster (times)")
for (size <- Array(100, 10000, 1000000, 10000000, 100000000)) {
    val expected = size/2 + 1

    val startTakeRight = System.nanoTime
    val resultTakeRight = Range.inclusive(1,size).takeRight(size/2).head
    val execTakeRight = (System.nanoTime - startTakeRight) / 1e6d
    assert(expected == resultTakeRight)

    val index = (size / 2)
    val startApply = System.nanoTime
    val resultApply = Range.inclusive(1,size).apply(index)
    val execApply = (System.nanoTime - startApply) / 1e6d
    assert(expected == resultApply)

    val winner = if (execTakeRight <= execApply) "TakeRight" else "Apply"
    val faster = if (execTakeRight <= execApply) execApply / execTakeRight else execTakeRight / execApply
    val fasterFormated = faster - faster % 0.01
    printf("%-15s|%-15s|%-15s|%-15s|%-15s\n",size, execTakeRight, execApply, winner, fasterFormated)
}