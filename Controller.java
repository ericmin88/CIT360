package MVC;

public class Controller {
	private Model model;
	private View view;

	   public Controller(Model model, View view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setPlayerName(String Name){
	      model.setName(Name);		
	   }

	   public String getPlayerName(){
	      return model.getName();		
	   }

	   public void setPlayerNumber(String Number){
	      model.setNumber(Number);		
	   }

	   public String getPlayerNumber(){
	      return model.getNumber();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(model.getName(), model.getNumber());
	    }	
}