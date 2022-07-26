import java.util.Scanner;

class Main {

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int menu;

    System.out.println("\nIngrese numero 1 :");  
    num1 = sc.nextInt();
    sc.nextLine();
    System.out.println("\nIngrese numero 2 :");
    num2 = sc.nextInt();
    sc.nextLine();

    System.out.println("\n\t\t*****menu*****");
    System.out.println("\t\t1. Suma");
    System.out.println("\t\t2. Resta");
    System.out.println("\t\t3. Multiplicar");
    System.out.println("\t\t4. Dividir");
    System.out.println("\t\t5. Salir");
    System.out.println("\t\t***--------***");
    
    
            
    System.out.println("\nEscribe una de las opciones");
    menu = sc.nextInt();    
    

    procesarComandos(num1,num2, menu);
    

  }  

  public static void procesarComandos(int num1,int num2, int menu){   
    
    Calculadora objCalcular = new Calculadora();

      do{
        if(menu == 1){
          int resp = objCalcular.Sumar(num1, num2); 
          System.out.println("\nresultado : " + resp);}
        
          else if(menu == 2){
          int resp = objCalcular.Restar(num1, num2);
          System.out.println("\nresultado : " + resp);}
  
          else if(menu == 3){
          int resp = objCalcular.Multiplicar(num1, num2);
          System.out.println("\nresultado : " + resp);}
  
          else if(menu == 4){
          int resp = objCalcular.Dividir(num1, num2);
          System.out.println("\nresultado : " + resp);}
  
          else if(menu == 5){
            System.out.println("\nMuchas gracias");
            System.out.println(" vuelva pronto");}
      }while(menu >=6);  
  }
}