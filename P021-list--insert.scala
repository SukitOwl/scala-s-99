val input = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


def f[T](n: Int, i: T, list: List[T]): List[T] = list.take(n) ++ (i +: list.drop(n))


assert(List(0, 1, 2, 3, 99, 4, 5, 6, 7, 8, 9, 10) == f(4, 99, input))
