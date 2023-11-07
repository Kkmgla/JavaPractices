package MyPack;

public class ElQueueController {
    private final ElQueue model;
    private final ElQueueView view;
    public ElQueueController(ElQueue model, ElQueueView view){
        this.model = model;
        this.view = view;
    }
    public void setElQueueId(String id){
        model.setId(id);
    }
    public String getElQueueId(){
        return model.getId();
    }
    public void setElQueueName(String name) {
        model.setName(name);
    }
    public String getElQueueName(){
        return model.getName();
    }
    public void setElQueuePosition(int position) {
        model.setPosition(position);
    }
    public int getElQueuePosition(){
        return model.getPosition();
    }
    public void updateView(){
        view.printElQueueDetails(getElQueueName(),getElQueueId(),getElQueuePosition());
    }
}
