def f[T](list: List[T]): Boolean = {
    val half: Int = ((list.length - 1) / 2).toInt
    for (i <- Range.inclusive(0, half)) {
        if (list.apply(i) != list.apply(list.length - 1 -i)) return false
    }
    return true
}

// ls == ls.reverse


assert(true == f("123321".toList))
assert(true == f("1234321".toList))
assert(false == f("123421".toList))
assert(false == f("123324".toList))
