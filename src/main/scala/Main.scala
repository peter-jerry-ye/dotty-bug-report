import cats.Monad
import cats.implicits._
import cats.effect.IO
import cats.effect.implicits._

@main def hello: Unit = 
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

val monad = summon[Monad[IO]]
