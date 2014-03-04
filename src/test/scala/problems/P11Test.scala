package problems

import org.scalatest.FunSuite

class P11Test extends FunSuite {

  test("encodeModified base case") {
    val initial = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val encoded = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

    assert(P11.encodeModified(initial).equals(encoded))
  }

  test("empty list case") {
    assert(P11.encodeModified(List()).equals(List()))
  }

}
