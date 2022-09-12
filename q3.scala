object q3 {
  
    
    var bank:List[Account]=List()

    class Account(id:String,n: Int, b: Double) {
    
        val nic:String=id
        val acnumber: Int = n
        var balance: Double = b
        override def toString ="["+nic+":"+acnumber +":"+ balance+"]"


        def withdraw(a:Double) =this.balance=this.balance-a
        def deposit(a:Double) =this.balance=this.balance+a
        def transfer(a:Account,b:Double)={
            a.deposit(b)
            this.withdraw(b)
        }

   
    }

    def main(args: Array[String]): Unit ={

        
        val x = new Account("992811536v",10000001,30000.50)
        
        val y = new Account("982811536v",10000002,20000.50)
        x.transfer(y,550.0)

        println(x)
        println(y)
    }

}