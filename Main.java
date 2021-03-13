package endterm_project;
import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        while(true) { //menu loop
            System.out.println("1. Play\n2. Get results\n3. Exit");
            int value = sc.nextInt();
            if(value == 1){ //play root
                int count = 0;
                Rules r = new Rules();
                r.boardPrint();
                while(true){ //game loop
                    System.out.println("Please enter player1(1-9):");
                    int input = sc.nextInt();
                    if(!r.setValuePlayer1(input)){ //checking is the position free
                        r.boardPrint();
                        continue;
                    }
                    if(r.check()){ //checking if there is winner
                        r.boardPrint();
                        break;
                    }
                    r.boardPrint();
                    count++;
                    if(count == 9){ //in case of no winner
                        System.out.println("Draw!");
                    }

                    System.out.println("Please enter player2(1-9):");
                    while(true){
                        input = sc.nextInt();
                        if(!r.setValuePlayer2(input)){ //checking is the position free
                            r.boardPrint();
                            continue;
                        }
                        r.boardPrint();
                        break;
                    }
                    if(r.check()){ //checking if there is winner
                        r.boardPrint();
                        break;
                    }
                    count++;
                    if(count == 9){ //in case of no winner
                        System.out.println("Draw!");
                    }
                }
            }
            else if(value == 2){ //Get result root
                Rules r = new Rules();
                r.Player1Stat();
                r.Player2Stat();
            }
            else if(value == 3){ //Exit root
                break;
            }
            else{
                System.out.println("Wrong number!");
            }
        }
    }
}
