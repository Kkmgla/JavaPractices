public class TextDocument implements IDocument{
    @Override
    public void Exit() {
        System.out.println("Text document closed.");
    }
    @Override
    public void New() {
        System.out.println("Text document made.");
    }
    @Override
    public void Open() {
        System.out.println("Text document opened.");
    }
    @Override
    public void Save() {
        System.out.println("Text document saved.");
    }
}