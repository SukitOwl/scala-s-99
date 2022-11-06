def f[T](n: Int, list: List[T]): List[T] = list.zipWithIndex.filter((i) => (i._2 + 1) % 3 != 0).map(_._1)

assert(List(1 ,2, 4, 5) == f(3, List(1, 2 ,3, 4, 5, 6)))
