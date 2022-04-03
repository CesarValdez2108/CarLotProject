package DataManager;
import DataManager.Pool.*;

public class Vehicle extends Component{
    //TODO: Add fields and get/set methods
    
    public void bindToModel(Model modelObj) throws ComponentNotBoundToPool{
        if(!ModelPool.get().componentIsRegisteredAtPool(modelObj)){
            throw new ComponentNotBoundToPool("The 'model' object passed to bindToModel does not exist inside ModelPool");
        }
        modelObj.addChild(this);
    }
    
    public Model getModel(){
        return (Model)getParent();
    }
    
    
}