val input = List(12, 6, 3, 10, 5, 16, 8, 4, 2, 1)


def f[T](list: List[T]): List[T] = list.reverse


assert(List(1, 2, 4, 8, 16, 5, 10, 3, 6, 12) == f(input))
