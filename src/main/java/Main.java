
public class Main {
  public static void main(String[] args) {
    System.out.println("Programa que calcula o consumo elétrico");
    System.out.println();
    System.out.println("Uma TV de 200 Watts fica ligada aproximadamente 5h diariamente. Determine o consumo elétrico mensal da TV");
    System.out.println();
    int potencia = 200;
    System.out.println("A potência é:");
    System.out.println(potencia);
    System.out.println();
    System.out.println("O tempo gasto é:");
    int tempo = 5;
    System.out.println(tempo);
    System.out.println();
    int consumo = potencia * tempo;
    System.out.println("Potencia vezes tempo:");
    System.out.println(consumo);
    System.out.println();
    int divisão = consumo / 1000;
    System.out.println("Consumo diário:");
    System.out.println(divisão);
    int mensal = divisão * 30;
    System.out.println();
    System.out.println("Consumo mensal:");
    System.out.println(mensal);
      

    
  }


}