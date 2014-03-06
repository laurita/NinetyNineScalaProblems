package problems

import org.scalatest.FunSuite
import P23._

class P23Test extends FunSuite {

  test("should select random elements") {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  test("should select less random elements if not enough") {
    val res = randomSelect(4, List('a, 'b, 'c))
    assert(List('a, 'b, 'c).forall(x => res.contains(x)))
  }

  test("randomSelectRemove should select random elements") {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  test("randomSelectRemove should select less random elements if not enough") {
    val res = randomSelect(4, List('a, 'b, 'c))
    assert(List('a, 'b, 'c).forall(x => res.contains(x)))
  }

}
