package example
import scalaj.http._

object Hello extends Greeting with App {
  println(greeting)

  val response: HttpResponse[String] = Http("http://foo.com/search").param("q","monkeys").asString
  println(response.body)
  println(response.code)
  println(response.headers)
  println(response.cookies)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
