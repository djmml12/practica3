package src.executable;
import src.players.ArrayPlayers;
import src.board.Panel;
import java.util.*;
import src.handlers.*;

public class Menu {
    private ArrayPlayers p = new ArrayPlayers();
    private HandlerGame g; 
    Scanner scanner = new Scanner(System.in);


    public Menu() {
        //clear
    }
    private int getOption(String text) {
        System.out.println(text);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    public void start() {
        int option;
        do{
            System.out.println(" menu ");
            System.out.println("1. agregar jugador ");
            System.out.println("2. ver jugadores ");
            System.out.println("3. iniciar nuevo juego ");
            System.out.println("4. puntajes ");
            System.out.println("0. salir ");
            option = getOption(" Ingresa un numero  ");
            selectMenu(option);
            
        }while(option!=0);
    }
    public void selectMenu(int option) {
        if(option == 1) {

            p.addPlayer();
        }
        if(option == 2){
            p.seePlayers();
        }
        if(option ==3){
            g =new HandlerGame(p.getPlayers());
            g.gameStart();
        }
        if(option ==4){
            p.scoresTable();
        }
        

    }
}
