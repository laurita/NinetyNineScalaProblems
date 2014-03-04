package problems

import org.scalatest.FunSuite

class P10Test extends FunSuite {

  test("encode base case") {
    val initial = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

    assert(P10.encode(initial).equals(encoded))
  }

  test("empty list case") {
    assert(P10.encode(List()).equals(List()))
  }

}
