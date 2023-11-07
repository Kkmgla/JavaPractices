class Hand {
    private boolean hasFingers;

    public Hand(boolean hasFingers) {
        this.hasFingers = hasFingers;
    }

    public boolean hasFingers() {
        return hasFingers;
    }

    public void wave() {
        System.out.println("Человек машет рукой.");
    }
}