val input = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


def f[T](n: Int, list: List[T]): List[T] = if (list.size > n) {
    f(n, list.splitAt((new util.Random).nextInt(list.size)) match {
        case (pre, e::post) => (pre ++ post)
        case _ => throw new Exception
    })
} else list



assert(4 == f(4, input).size)
