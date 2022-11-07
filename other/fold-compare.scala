// Testing unordering of fold
for (size <- List(
        10,
        1000,
        10000,
        100000,
    )) {
    val input = Range.inclusive(1, size).toList;
    val expectedOutput = input.reverse;

    val start = System.nanoTime
    val actualOutput = input.foldLeft[List[Int]](Nil)((a, b) => b +: a )
    val execTime = (System.nanoTime - start) / 1e6d

    assert(actualOutput.size == size)
    if (expectedOutput == actualOutput) {
        println("Fold matched in us", execTime)
    } else {
        println("Not matched")
    }
}

//   def foldRight[B](z: B)(op: (A, B) => B): B = reversed.foldLeft(z)((b, a) => op(a, b))

println("\n----- Stat for get list[n-1] from List -----\n")
printf("%-15s|%-15s|%-15s|%-15s|%-15s\n", "Size", "FoldLeft(us)", "FoldRight(us)", "winner", "faster (times)")
for (size <- List(10, 10, 10, 10, 100, 100, 100, 100, 10000, 10000, 10000, 10000)) {
    val input = Range.inclusive(1, size).toList;
    val expected = input.reverse;

    val startFoldLeft = System.nanoTime
    val resultFoldLeft = input.foldLeft[List[Int]](Nil)((a, b) => b +: a )
    val execFoldLeft = (System.nanoTime - startFoldLeft) / 1e6d
    assert(expected == resultFoldLeft)

    val startFoldRight = System.nanoTime
    val resultFoldRight = input.foldRight[List[Int]](Nil)((a, b) => b :+ a )
    val execFoldRight = (System.nanoTime - startFoldRight) / 1e6d
    assert(expected == resultFoldRight)

    val winner = if (execFoldRight <= execFoldLeft) "FoldRight" else "FoldLeft"
    val faster = if (execFoldRight <= execFoldLeft) execFoldLeft / execFoldRight else execFoldRight / execFoldLeft
    val fasterFormated = (faster - faster % 0.01).toString
    printf("%-15s|%-15s|%-15s|%-15s|%-15s\n",size, execFoldLeft, execFoldRight, winner, fasterFormated)
}
