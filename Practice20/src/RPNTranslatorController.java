public class RPNTranslatorController {
    private final RPNTranslatorModel model;
    private final RPNTranslatorView view;
    public RPNTranslatorController(RPNTranslatorModel model, RPNTranslatorView view){
        this.model = model;
        this.view = view;
    }
    public double RunCalc(String input){
        return model.evaluateRPN(input);
    }
}
