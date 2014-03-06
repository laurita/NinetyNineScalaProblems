package problems

import org.scalatest.FunSuite
import P24._

class P24Test extends FunSuite {

  test("lotto returns 6 random elements from range 1..49") {
    println(lotto(6, 49))
  }

  test("lottoRange returns 6 random elements from range 1..49") {
    println(lottoRange(6, 49))
  }
}
