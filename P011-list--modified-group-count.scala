def f[T](list: List[T]): List[Any] = list.groupBy((i) => i).values.toList.map((i) => i.size match {
    case 1 => i.apply(0)
    case _ => (i.size, i.apply(0))
})


assert(List((3, 1),(2, 2), 3) == f(List(1 ,1, 1, 2, 2, 3)))
