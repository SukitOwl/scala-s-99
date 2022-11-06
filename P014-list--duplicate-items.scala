def f[T](list: List[T]): List[T] = list.map((i) => List.fill(2)(i)).flatten


assert(List(1 ,1, 2, 2, 3, 3) == f(List(1, 2 ,3)))
