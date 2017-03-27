/**
  * Created by relihazard on 18/02/17.
  */
object Timer {
  //def nomFonction(arg1: type): typeRetour =
  //def nomFonction(arg1: arg => arg => retour, arg2: type)
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) { callback; Thread sleep 1000 }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}
