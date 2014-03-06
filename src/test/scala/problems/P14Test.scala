package problems

import org.scalatest.FunSuite

class P14Test extends FunSuite {

  test("base case") {
    val initial = List('a, 'b, 'c, 'c, 'd)
    val duplicated = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    assert(P14.duplicate(initial).equals(duplicated))
  }

}
