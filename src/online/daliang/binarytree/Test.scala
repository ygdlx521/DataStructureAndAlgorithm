package online.daliang.binarytree

object Test {
  def main(args: Array[String]): Unit = {
    val array = Array(0,1,2,3,4,5,6)
    val binaryTree = new BinaryTree()
    binaryTree.root = binaryTree.createFromArray(array,0)
    val root = binaryTree.root
    println("\n")
    println("preOrderPrint")
    binaryTree.preOrderPrint(binaryTree.root)
    println("\n")
    println("inOrderPrint")
    binaryTree.inOrderPrint(binaryTree.root)
    println("\n")
    println("posOrderPrint")
    binaryTree.posOrderPrint(binaryTree.root)
    println("\n")
    println("levelOrderPrint")
    binaryTree.levelOrderPrint(binaryTree.root)
    println("\n")
    println("getDepth")
    println(binaryTree.getDepth(binaryTree.root))
  }
}
