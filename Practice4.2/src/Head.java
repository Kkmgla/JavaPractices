class Head {
    private String hairColor;

    public Head(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void talk() {
        System.out.println("Человек говорит.");
    }
}