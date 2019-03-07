package online.daliang.recursion

/**
  * @author daliang on 2019/3/7
  */
object MonkeyEatPeach {

  def main(args: Array[String]): Unit = {
    println(peach(10))
    println(peach(9))
    println(peach(8))
    println(peach(7))
  }
  /**
    * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
    * 以后每天猴子都吃其中的一半，然后再多吃一个。
    * 当到第十天时，想再吃时（还没吃），发现只有1个桃子了。
    * 问题：最初共多少个桃子？
    */

  def peach(n:Int):Int = {
    if(n == 10)
      1
    else
      (peach(n+1) + 1) * 2
  }
}
