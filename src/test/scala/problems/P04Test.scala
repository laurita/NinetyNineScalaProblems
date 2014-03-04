package problems

import org.scalatest.FunSuite

class P04Test extends FunSuite {

  test("length should return length of list") {
    assert(P04.length(List(1,2,3)).equals(3))
  }

  test("tailRecLength should return length of list") {
    assert(P04.tailRecLength(List('a', 'b')).equals(2))
  }

  test("length and tailRecLength should return the same") {
    assert(
      (1 to 100).forall(x => {
        val lst = (1 to x).toList
        P04.length(lst).equals(P04.tailRecLength(lst))
      })
    )
  }

}
