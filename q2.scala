object q2 {

   class Rational(x: Int, y: Int){
      def numer: Int = x
      def denom: Int = y

      def add(r: Rational) = new Rational(numer * r.denom + r.numer*denom, denom*r.denom)
      def sub(r: Rational) = new Rational(numer * r.denom - r.numer*denom, denom*r.denom)

      override def toString = numer + "/" + denom
    }
  
    def main(args: Array[String]): Unit ={

      val a = new Rational(3,4)
      val b = new Rational(5,8)
      val c = new Rational(2,7)

      println(a.add(b))
      println((a.sub(b)).sub(c))

    

  }
}