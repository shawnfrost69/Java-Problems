class Pen{
    String color;
    String type;   //ball point Pen /Gel Pen

    public void write(){
        System.out.println("Writting Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "black";
        pen1.type= "ball";

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type= "gel";

        pen1.printColor();
        pen2.printColor();

    }
}
