package MVC;
import java.util.*;

public class Player {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		      View view = new View();
		      Model model  = retrivePlayerInfo();

		      Controller controller = new Controller(model, view);

		      controller.updateView();
		      
		     System.out.println("Enter Player 1 Name: ");
		     String P = input.next();
		      controller.setPlayerName(P);
		      
		      controller.setPlayerNumber("1");

		      controller.updateView();
		   }

		   private static Model retrivePlayerInfo(){
		      Model player = new Model();
		      player.setName("Computer");
		      player.setNumber("2");
		      return player;
		   }
		}