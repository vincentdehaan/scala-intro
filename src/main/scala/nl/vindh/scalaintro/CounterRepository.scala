package nl.vindh.scalaintro

import scala.concurrent.{ExecutionContext, Future}

trait CounterRepository {
  def getCounter: Future[Int]
  def setCounter(i: Int): Future[Unit]
}

class InMemoryCounterRepository(implicit ec: ExecutionContext) extends CounterRepository {
  private var counter = 0

  override def getCounter: Future[Int] = Future(counter)

  override def setCounter(i: Int): Future[Unit] = Future {
    counter = i
    ()
  }
}
