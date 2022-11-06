def f[T](n: Int, list: List[T]): List[T] = list.map((i) => List.fill(n)(i)).flatten


assert(List(1 ,1, 1, 2, 2, 2, 3, 3, 3) == f(3, List(1, 2 ,3)))
