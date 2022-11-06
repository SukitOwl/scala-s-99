def f[T](list: List[T]): List[(Int, T)] = list.groupBy((i) => i).values.toList.map((i) => {(i.size, i.apply(0))})


assert(List((3, 1),(2, 2),(1, 3)) == f(List(1 ,1, 1, 2, 2, 3)))
