object Solution {
    
    def gcd(x: Int, y: Int): Int = (x, y) match {
        case (x, 0) => x
        case (x, y) => gcd(y, x % y)
    }
  

/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
		println(gcd(pair.head,pair.reverse.head))
  } 

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}
