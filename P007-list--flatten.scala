import scala.util.{Try, Success, Failure}


val input = List(List(1, 1), 2, List(3, List(5, 8)))


def f(list: List[Any]): List[Any] = list.map((item) => item match {
    case e: Int => List(e)
    case e: List[_] => f(e)
}).flatten

assert(List(1, 1, 2, 3, 5, 8) == f(input))

def f2(list: List[Any]): List[Any] = list.flatMap((item) => item match {
    case e: Int => List(e)
    case e: List[_] => f(e)
})

assert(List(1, 1, 2, 3, 5, 8) == f2(input))