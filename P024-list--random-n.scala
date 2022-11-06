def f(n1: Int, n2: Int): List[Int] = List.fill(n1)(0).map((_) => {
    // var limit: Int = n2 - 1
    (new util.Random).nextInt(n2) + 1
})


assert(4 == f(4, 10).size)
f(4, 10).foreach{
    (i) => assert(i<=10 & i >=1)
}

