package problems

import org.scalatest.FunSuite
import P20._

class P20Test extends FunSuite {

  test("should return a tuple of list without el and el") {
    assert(removeAt(1, List('a, 'b, 'c, 'd)).equals((List('a, 'c, 'd), Some('b))))
  }

  test("should return a tuple of list and None") {
    assert(removeAt(4, List('a, 'b, 'c, 'd)).equals((List('a, 'b, 'c, 'd), None)))
  }
}
