package problems

import org.scalatest.FunSuite
import P16._

class P16Test extends FunSuite {

  test("base case") {
    assert(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)).equals(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)))
  }

  test("drop returns same as dropZip") {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    assert(drop(3, ls).equals(dropZip(3, ls)))
  }

}
