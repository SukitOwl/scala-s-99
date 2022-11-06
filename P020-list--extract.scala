val input = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


def f[T](n: Int, list: List[T]): (List[T], T) = (
    list.take(n)++list.drop(n+1),list.apply(n)
)

assert((List(0, 1, 2, 3, 5, 6, 7, 8, 9, 10), 4) == f(4, input))
