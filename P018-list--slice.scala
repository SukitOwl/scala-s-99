// list.slice(n1, n2)
def f[T](n1: Int, n2: Int, list: List[T]): List[T] = list.take(n2).drop(n1)


assert(List(3, 4, 5, 6) == f(3, 7, List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
