package online.daliang.singlelinkedlist

/**
  * @author daliang on 2019/2/28
  */
object Test {
  def main(args: Array[String]): Unit = {
    val linkedListObj = new SingleLinkedList()
    val dataArr = Array(1,2,3,4,5,6,7,8,9)
    for(data <- dataArr){
      val obj = new Node(data)
      linkedListObj.add(obj)
    }
    linkedListObj.printList()

  }
}
