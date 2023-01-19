package views;

import java.util.Scanner;

public class UserView {
    
    public String showSubmitMenu(){
        System.out.println("Введите название фильма для аренды:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }

    public String showReturnMenu(){
        System.out.println("Введите название фильма для возврата:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }
}
