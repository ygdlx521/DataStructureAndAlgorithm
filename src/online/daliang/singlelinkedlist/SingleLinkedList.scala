package online.daliang.singlelinkedlist

/**
  * @author daliang on 2019/2/28
  */
class SingleLinkedList {

  var head:Node = null

  def add(node:Node): Unit ={
    var temp = head
    if(head == null){
      head = node
    } else {
      while(temp.next != null){
        temp = temp.next
      }
      temp.next = node
    }
  }

  def printList() = {
    var temp = head
    print("head->")
    if(head == null){
      println("Null")
    } else {
      while(temp != null) {
        print(s"${temp.value}->")
        temp = temp.next
      }
      println("Null")
    }
  }
}
