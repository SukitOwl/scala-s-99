// val input = List(0, 1, 2, 3, 4)


// def f[T](list: List[T]): List[List[T]] = {
//     def f2[T](src: List[T], dest: List[T]): List[T] = if (src.size > 0) {
//         (new util.Random).nextInt(src.size) match {
//             case i: Int => f2(
//                 src.take(i) ++ src.drop(i+1),
//                 dest :+ src.apply(i)
//             )
//         }
//     } else dest
//     f2(list, List())
// }


// assert(input.size == f(input).distinct.size)
