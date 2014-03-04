package problems

import org.scalatest.FunSuite

class P09Test extends FunSuite {

  test("pack should pack correctly") {
    val initial = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val packed = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    assert(P09.pack(initial).equals(packed))
  }

  test("pack should return list of empty list if given empty list") {
    val initial = List()
    val packed = List(List())
    assert(P09.pack(initial).equals(packed))
  }

}
