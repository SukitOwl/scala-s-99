def f[T](list: List[T]): List[List[T]] = list.groupBy((i) => i).values.toList


assert(List(List(1), List(2, 2), List(3, 3, 3)) == f(List(1 ,2, 2, 3, 3, 3)))
