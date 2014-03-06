package problems

import P22._
import P23._

object P24 {

  def lotto(n: Int, m: Int): List[Int] = {
    randomSelect(n, (1 to m).toList)
  }

  def lottoRange(n: Int, m: Int): List[Int] = {
    randomSelect(n, range(1, m))
  }

}
