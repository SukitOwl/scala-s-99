def f[T](list: List[(Int, T)]): List[T] = list.map(i => List.fill(i._1)(i._2)).flatten


assert(List(1 ,1, 1, 2, 2, 3) == f(List((3, 1),(2, 2),(1, 3))))
