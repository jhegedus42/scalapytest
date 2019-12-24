package example

object Hello extends Greeting with App {
  println(greeting)
  import me.shadaj.scalapy.py
  val listLengthPython = py.global.len(List(1, 2, 3))
  val listLength = listLengthPython.as[Int]
  println(listLength)
}

trait Greeting {
  lazy val greeting: String = "code runs"
}
