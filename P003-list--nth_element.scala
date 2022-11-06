val input = List(12, 6, 3, 10, 5, 16, 8, 4, 2, 1)


def f[T](n: Int, list: List[T]): T = list.apply(n)


assert(10 == f(3, input))
