package online.daliang.binarytree

import scala.collection.immutable.Stream.Empty
import scala.collection.mutable

/**
  * @author daliang on 2019/2/28
  */
class BinaryTree {

  var root:Node = _

  def createFromArray(array:Array[Int], index:Int): Node = {
    var temp:Node = null
    if (array.length == 0 || index < 0) {
      println("Empty Array or invalid index!")
    } else if(index < array.length){
      temp = new Node(array(index))
      temp.left = createFromArray(array,2*index+1)
      temp.right = createFromArray(array,2*index+2)
    }
    if(temp != null){
      print(temp.value)
    }
    temp
  }

  def preOrderPrint(head:Node):Unit = {
    if(head != null){
      print(s"${head.value}")
      preOrderPrint(head.left)
      preOrderPrint(head.right)
    }
  }

  def inOrderPrint(head:Node):Unit = {
    if(head != null){
      inOrderPrint(head.left)
      print(s"${head.value}")
      inOrderPrint(head.right)
    }
  }

  def posOrderPrint(head:Node):Unit = {
    if(head != null){
      posOrderPrint(head.left)
      posOrderPrint(head.right)
      print(s"${head.value}")
    }
  }

  def levelOrderPrint(head:Node): Unit = {
    val queue = new mutable.Queue[Node]()
    if(head == null){
      println("Empty Tree!")
    } else {
      queue.enqueue(head)
      while (queue.nonEmpty){
        val out = queue.dequeue()
        print(out.value)
        if(out.left != null)
          queue.enqueue(out.left)
        if(out.right != null){
          queue.enqueue(out.right)
        }
      }
    }
  }

  def getDepth(head:Node):Int = {
    if(head == null){
      0
    } else {
      Math.max(getDepth(head.left),getDepth(head.right)) + 1
    }
  }

  def getTotalNum(head:Node):Int = {
    if(head == null){
      0
    } else {
      getTotalNum(head.left) + getTotalNum(head.right) + 1
    }
  }

  def leftViewPrint(head:Node)={
    if(head == null) {
      println("Empty Tree!")
    } else {
      val queue = new mutable.Queue[Node]()
      queue.enqueue(head)
      var count = 0
      var cur_level_cnt = 1
      var next_level_cnt = 0
      while(queue.nonEmpty){
        val out = queue.dequeue()
        if(count == 0)
          print(out.value)
        count += 1
        if(out.left != null) {
          queue.enqueue(out.left)
          next_level_cnt += 1
        }
        if(out.right != null) {
          queue.enqueue(out.right)
          next_level_cnt += 1
        }
        if(count == cur_level_cnt){
          cur_level_cnt = next_level_cnt
          count = 0
          next_level_cnt = 0
        }
      }
    }
  }


}
