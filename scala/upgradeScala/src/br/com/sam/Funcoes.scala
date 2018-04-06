package br.com.sam

class funcoes {
  
  def main(args: Array[String]): Unit = {
    
    // funcao que o codigo esta bem escrito, entao basta ler o codigo rs
    def sum(inicio: Int, fim: Int) = {
      var total = 0
      for(abacaxi <- inicio to fim){
        total += abacaxi
      }
      print(total)
    }
    
    // funcao que o codigo esta bem escrito, entao basta ler o codigo rs
    def sumOfSquares(inicio: Int, fim:Int) = {
      var total = 0
      for(abacaxi <- inicio to fim){
        total += abacaxi * abacaxi
      }
    }
    
        // funcao que o codigo esta bem escrito, entao basta ler o codigo rs
    def sumFunc(func: Int, inicio: Int, fim: Int) = {
      var total = 0
      for(abacaxi <- inicio to fim){
        //total += func(abacaxi)
      }
      print(total)
    }
    
    def sqr(i: Int) = i*i
    def cube(i: Int) = i*i*i
    def double (i: Int) = i *2
    
    
  }
}