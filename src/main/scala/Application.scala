import cats.effect.{IO, IOApp}
import tofu.logging.Logging

object Application extends IOApp.Simple {

  private implicit val logger = Logging.Make.plain[IO].byName("APP")

  override def run: IO[Unit] = program

  private val v = ToLog("hi", 123)

  def program: IO[Unit] = for {
    _ <- logger.info("Simple log")
    _ <- logger.info(s"now with added value ", v)
  } yield ()
}
