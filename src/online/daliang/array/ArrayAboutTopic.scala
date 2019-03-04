package online.daliang.array

object ArrayAboutTopic {
  def main(args: Array[String]): Unit = {
    val arr = Array(3,5,4,7,9,8,6)
    val arr0:Array[Int] = null
    val arr1 = Array(0)
    val arr2 = Array(0,1)
    val arr3 = Array(0,2,1)
    println(isArrayOfBinarySearchTree(arr,0,arr.length-1))
    println(isArrayOfBinarySearchTree(arr0,0,4))
    println(isArrayOfBinarySearchTree(arr1,0,arr1.length-1))
    println(isArrayOfBinarySearchTree(arr2,0,arr2.length-1))
    println(isArrayOfBinarySearchTree(arr3,0,arr3.length-1))

  }

  def isArrayOfBinarySearchTree(array:Array[Int], begin:Int, end:Int):Boolean={
    if(array == null || begin > end){
      return false
    }
    println(s"begin=${array(begin)}")
    println(s"end = ${array(end)}")
    if(end - begin <= 1 && begin <= end){
      return true
    }
    if(end - begin == 2){
      if(array(end) > array(begin) && array(end) < array(begin+1))
        return true
      else
        return false
    }
    var i = begin
    while(array(i) < array(end)){
      i += 1
    }
    return isArrayOfBinarySearchTree(array,begin,i-1) && isArrayOfBinarySearchTree(array,i,end-1)
  }
}
