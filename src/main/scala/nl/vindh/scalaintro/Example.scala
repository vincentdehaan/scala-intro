package nl.vindh.scalaintro

object Example extends App {
  // Functional oneliners

  val lst = List(3, 4, 6, 3, 2, 5, 6)

  // Get the sum of all even numbers of a list
  val evenSum = lst.filter(_ % 2 == 0).sum
  val evenSum2 = lst.filter(x => x % 2 == 0).sum

  // Get the first even number
  val firstEven = lst.find(_ % 2 == 0)

  // Get the mean square
  val meanSquare = lst.map(x => x * x).sum / lst.size

  // Get the first number that's smaller than it's predecessor
  val smallerThanPr = lst.zip(lst.tail).find { case (a, b) => b < a }

  // Start at zero, add even, subtract odd
  val addAndSubtract = lst.fold(0)((acc, nw) => if(nw < 0) acc - nw else acc + nw)



  // Case classes
  case class Foo(bar: String, baz: Int)

  // Extract using patterns
  val f = Foo("bla", 7)
  f match {
    case Foo(r, z) => println(s"bar=$r, baz=$z")
  }






  // Domain modeling
  sealed trait Item
  case class Shoe(size: Int, color: String) extends Item
  case class Pants(width: Int, length: Int, color: String) extends Item
  case class Shirt(size: String, color: String) extends Item

  // A collection of items
  val storeStock = List(
    Shoe(9, "red"),
    Shoe(9, "red"),
    Shoe(9, "blue"),
    Pants(32, 30, "blue"),
    Pants(44, 32, "red"),
    Shirt("M", "red")
  )

  // How many red shoes?
  val redShoeCount = storeStock.count { case Shoe(_, "red") => true }

  // All shoes
  val shoes = storeStock.filter { case _: Shoe => true }



}
