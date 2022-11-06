// list.splitAt(n)

// List(list.take(n), list.drop(n))

def f[T](n: Int, list: List[T]): List[List[T]] = List(list.take(n), list.takeRight(list.size-n))


assert(List(List(1 ,2), List(3, 4, 5, 6)) == f(2, List(1, 2 ,3, 4, 5, 6)))
