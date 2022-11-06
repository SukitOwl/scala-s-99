val input = List(12, 6, 3, 10, 5, 16, 8, 4, 2, 1)


def f[T](n: int, list: List[T]): T = list.apply(n)


assert(6 == f(2, input))
