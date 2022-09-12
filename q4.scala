object q4 {
  
    
class Accounts(var ac_no:String,var money:Int)
{
  var Account_no=ac_no;
  var Money: Double = money;
}
class Bank(ac_1:Accounts,ac_2:Accounts,ac_3:Accounts,ac_4:Accounts)
{
  val accounts:List[Accounts]=List(ac_1,ac_2,ac_3,ac_4);
  def negAccounts(): Unit =
  {
    print("Negative balance accounts :- ")
    for (ac <- accounts) {
      if(ac.money<0)
      {
        print(ac.ac_no+" ")
      }
    }
  }
  def sumOfAllAccs(): Unit =
  {
    var sum:Double=0;
    println()
    for (ac <- accounts) {
      sum+=ac.Money
    }
    println("Sum is "+sum.toString)
  }
  def interest(): Unit =
  {
    for (ac <- accounts) {
      if (ac.money < 0) {
        ac.Money-=ac.money*0.1
      }else
      {
        ac.Money+=ac.money*0.05
      }
    }
  }
}

def main(args: Array[String]): Unit = {
    var w = new Accounts("100001",5000)
    var x = new Accounts("100002",-800)
    var y = new Accounts("100003",2627)
    var z = new Accounts("100004",-1200)
    var bank= new Bank(w,x,y,z)
    bank.negAccounts()
    bank.sumOfAllAccs()
    bank.interest()
    bank.sumOfAllAccs()

}

}