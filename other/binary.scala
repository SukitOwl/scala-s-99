def f(in: Int): String = {
    def f2(in: Int, bits: List[Int]): List[Int] = in match {
        case 0 => bits
        case _ => {
            val index = (Math.log10(in)/Math.log10(2)).toInt + 1
            f2(
                in - Math.pow(2, index-1).toInt,
                bits.take(index - 1) ++ List(1) ++ bits.drop(index)
            )
        }
    }

    f2(in, List.fill((Math.log10(in)/Math.log10(2)).toInt + 1)(0)).reverse.mkString
}

println(f(15)) // 1111
println(f(16)) // 10000
println(f(17)) // 10001
println(f(18)) // 10010
println(f(102)) // 1100110

// assert("1100110" = f(102))