val input = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


def f[T](n: Int, list: List[T]): List[T] = if (n >= 0) list.drop(n) ++ list.take(n) else list.drop(list.size + n) ++ list.take(list.size + n)


// positive = rotate counter clockwise
assert(List(3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2) == f(3, input))

// negative = rotate clockwise
assert(List(9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8) == f(-2, input))
