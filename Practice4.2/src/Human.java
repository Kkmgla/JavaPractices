import java.awt.*;

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void performActions() {
        head.talk();
        leftLeg.walk();
        rightLeg.walk();
        leftHand.wave();
        rightHand.wave();
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }
    public static void main(String[] args) {
        Head humanHead = new Head("Brown");
        Leg leftLeg = new Leg(32);
        Leg rightLeg = new Leg(32);
        Hand leftHand = new Hand(true);
        Hand rightHand = new Hand(true);

        Human person = new Human(humanHead, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Цвет волос: " + person.getHead().getHairColor());
        System.out.println("Размер ноги (левой): " + person.getLeftLeg().getSize());
        System.out.println("Размер ноги (правой): " + person.getRightLeg().getSize());
        System.out.println("Наличие пальцев (левая рука): " + person.getLeftHand().hasFingers());
        System.out.println("Наличие пальцев (правая рука): " + person.getRightHand().hasFingers());

        person.performActions();
    }
}

