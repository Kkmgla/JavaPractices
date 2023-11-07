public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair() {
        return new VictorianChair("Wood", "Red", 210);
    }

    public MagicChair createMagicChair() {
        return new MagicChair("Water", "N/A");
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair("Titanium", "Black");
    }
}
