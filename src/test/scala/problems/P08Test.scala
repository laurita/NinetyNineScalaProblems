package problems

import org.scalatest.FunSuite
import scala.util.Random

class P08Test extends FunSuite {

  test("compress should return a list without consequtive repetitions") {
    assert(
      P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)).
      equals(List('a, 'b, 'c, 'a, 'd, 'e))
    )
  }

  test("compress should return the same list with if no consequtive elements") {
    assert(
      P08.compress(List('a, 'b, 'c, 'a, 'd, 'e)).
        equals(List('a, 'b, 'c, 'a, 'd, 'e))
    )
  }

  test("compress should return empty list if empty list is given") {
    assert(
      P08.compress(List()).
        equals(List())
    )
  }

  test("compress should return same list if one element") {
    assert(
      P08.compress(List('a)).
        equals(List('a))
    )
  }

  test("compressFold should return the same as compress") {
    assert(
      (1 to 1000).forall{x =>
        val lst = (1 to 1000).map(y => Random.nextInt(20)).toList
        P08.compress(lst).equals(P08.compressFold(lst))
      }
    )
  }

}
