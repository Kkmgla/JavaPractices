public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew(){
        return new TextDocument();
    };
    @Override
    public IDocument CreateOpen(){
        return new TextDocument();
    };
}
