
package finalproject;

import java.util.Scanner;


public class Menu {
    
    String[] menu = {"1- Ortalama"
            , "2- Medyan"
            , "3- Mod"
            , "4- Frekans"
            , "5- Ceyrekler arasi aralik degeri"
            , "6- Aykiri degerler"
            , "7- Bes sayi ozeti"
            , "8- Kutu grafigi"
            , "9- Varyans ve standart sapma "
    };

    public Menu() {
    }
    
    public void displayMenu(){
        for (int i=0;i<menu.length;i++){
            System.out.println(menu[i]);           
            
        }
        
    }
    public int makeaChoice(){
        Scanner scanner = new Scanner(System.in);
        
        int choice = scanner.nextInt();
        return choice;
        
    }
    
}
