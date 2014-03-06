package problems

import org.scalatest.FunSuite
import P22._

class P22Test extends FunSuite {

  test("range creates list from to") {
    assert(range(4, 9).equals(List(4, 5, 6, 7, 8, 9)))
  }

}
