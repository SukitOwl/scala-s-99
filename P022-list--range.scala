def f(n1: Int, n2: Int): List[Int] = List.range(n1, n2+1)


// def f(n1: Int, n2: Int): List[Int] = Range.inclusive(n1, n2)


assert(List(4, 5, 6, 7, 8, 9, 10) == f(4, 10))
