package problems

import org.scalatest.FunSuite
import P26._

class P26Test extends FunSuite {

  test("combinations must return a list of combinations") {
    val ls = List('a, 'b, 'c, 'd)
    val cs = combinations(3, ls)
    println(cs)
    val expected = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'c, 'd), List('b, 'c, 'd))
    assert(
      cs.forall(ls => expected.exists(l => containsSameEls(l, ls))) &&
      expected.forall(ls => cs.exists(l => containsSameEls(l, ls)))
    )
  }

  private def containsSameEls[T](ls1: List[T], ls2: List[T]): Boolean = {
    ls1.forall(ls2.contains(_)) && ls2.forall(ls1.contains(_))
  }

}
