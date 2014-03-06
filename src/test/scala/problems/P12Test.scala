package problems

import P12._
import org.scalatest.FunSuite

class P12Test extends FunSuite {

  test("base case") {
    val initial = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    val decoded = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    assert(decode(initial).equals(decoded))
  }

  test("empty list should return empty list") {
    val initial = List()
    val decoded = List()
    assert(decode(initial).equals(decoded))
  }

  test("decode should return same as decodeFill") {
    val initial = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    assert(decode(initial).equals(decodeFill(initial)))
  }

}
