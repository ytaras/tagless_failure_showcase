import cats.tagless._

@autoFunctorK(false )
trait Algebra[F[_]] {
  def execute(i: Int): F[Unit]
}