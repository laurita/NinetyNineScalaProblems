package problems

import org.scalatest.FunSuite
import P15._

class P15Test extends FunSuite {

  test("base case") {
    assert(duplicateN(3, List('a, 'b, 'c, 'c, 'd)).
      equals(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)))
  }

}
