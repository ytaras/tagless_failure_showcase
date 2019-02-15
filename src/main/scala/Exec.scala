import cats.tagless.implicits._
import cats.implicits._
import cats._
import cats.tagless.FunctorK


object Exec {
  val nat: (Option ~> List) = new (Option ~> List) {
    def apply[A](fa: Option[A]): List[A] = fa.toList
  }

  def listify(x: Algebra[Option]): Algebra[List] =
    x.mapK(nat)

  val i = implicitly[FunctorK[Algebra]]
}