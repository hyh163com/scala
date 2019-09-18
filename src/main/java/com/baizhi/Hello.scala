package com.baizhi

object Hello {
  def main(args: Array[String]): Unit = {
    //  println("hello world")
    //  var a =10;
    /*while (a<10){
      println(a)
      a+=1;
    }*/
    /*  do{
        println (a)
      }while(a<10)*/
    //  var a =new  Random().nextInt(5);
    //  var b= new Breaks;
    // var v =10;
    // println(a)
    /*b.breakable(
      {
        do{

          v+=1;
          if(v==12)b.break()
        }while(v<15)
      }
    )*/
    /*for (i<-1 to 9;j<-1 to i){
      print(i+"*"+j+"="+i*j+" ")
      if (i==j){
        println()
      }
    }*/
    /* var m= a match{
       case 1 => "sss"
       case 2 => "aaa"
       case 3 => "qqq"
       case _ => "啥都不是"
     }
   println(m)*/

    /*var a =Array(1,2,3,4,5,6,7,8,9)
    for (i<-0 until  a.length;if(i%2!=0)){
      println(a(i))
    }*/
    println(h1("ss", "aa", "ccc"))

  }

  def h1(ss: String*): Any = {
    print("sss")
    /*var a =Array(100,"张三",true,new Date())
    var i= a(new Random().nextInt(4))
    var res=i match {
      case x: Int =>s"${x}"
      case x: String => "张三"
      case x: Boolean => true
      case _ => "啥都不是"
    }*/
    return ss

  }
}
