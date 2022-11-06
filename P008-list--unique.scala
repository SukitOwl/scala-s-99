def f[T](list: List[T]): List[T] = list.distinct


assert(List(1, 2, 3) == f(List(1 ,1, 2, 2, 3)))
