package nl.vindh.scalaintro

import scala.concurrent.ExecutionContext
import akka.http.scaladsl.server.Directives._

class CounterRoutes(counterRepo: CounterRepository) (implicit ec: ExecutionContext) {
  val route =
    path("counter") {
      get {
        complete(counterRepo.getCounter.map(_.toString))
      }
    } ~
      path("add") {
        get {
          complete {
            (for {
              current <- counterRepo.getCounter
              nw = current + 1
              _ <- counterRepo.setCounter(nw)
            } yield nw).map(s => s"Counter updated: $s")
          }
        }
      }
}
