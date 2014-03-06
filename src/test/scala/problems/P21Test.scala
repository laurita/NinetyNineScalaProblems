package problems

import org.scalatest.FunSuite
import P21._

class P21Test extends FunSuite {

  test("insertAt inserts el at index") {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)).equals(List('a, 'new, 'b, 'c, 'd)))
  }

  test("insertAtDrop inserts el at index") {
    assert(insertAtDrop('new, 1, List('a, 'b, 'c, 'd)).equals(List('a, 'new, 'b, 'c, 'd)))
  }

  test("insertAtTheir inserts el at index") {
    assert(insertAtTheir('new, 1, List('a, 'b, 'c, 'd)).equals(List('a, 'new, 'b, 'c, 'd)))
  }
}
