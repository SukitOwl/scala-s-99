val input = List(12, 6, 3, 10, 5, 16, 8, 4, 2, 1)


def f[T](list: List[T]): Int = list.size


assert(10 == f(input))
