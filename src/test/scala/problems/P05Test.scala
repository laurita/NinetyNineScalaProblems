package problems

import org.scalatest.FunSuite

class P05Test extends FunSuite {

  test("reverse should return list in reverse order") {
    assert(P05.reverse(List(1,2,3)).equals(List(3,2,1)))
  }

  test("reverse of empty is empty") {
    assert(P05.reverse(Nil).equals(List()))
  }

  test("reverse and reverseFold should return the same") {
    assert{
      (1 to 1000).forall{x =>
        val lst = (1 to x).toList
        P05.reverse(lst).equals(P05.reverseFold(lst))
      }
    }
  }

}
