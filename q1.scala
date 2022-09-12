object q1 {

  class Rational(x: Int, y: Int){
      def numer: Int = x
      def denom: Int = y

      def neg() = new Rational(numer*(-1) , denom)
      override def toString = numer + "/" + denom
      
  }
  def main(args: Array[String]): Unit ={

    val a = new Rational(1,3)
    println(a.neg())

    
  }
}