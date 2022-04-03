package DataManager;
import DataManager.Pool.*;

public class Vehicle extends Component{
    //TODO: Add fields and get/set methods
    
    public Vehicle(Model model) throws ComponentNotBoundToPool{
        if(model == null);
        if(!ModelPool.get().componentIsRegisteredAtPool(model)){
            throw new ComponentNotBoundToPool("The 'model' object passed to bindToModel does not exist inside ModelPool");
        }
        model.addChild(this);
    }
    
    public Model getModel(){
        return (Model)getParent();
    }
    
    
}