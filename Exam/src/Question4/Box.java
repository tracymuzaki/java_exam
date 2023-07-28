package Question4;
//(iii)
//created a class Box
public class Box {
    private float width;//declared the class attribute with a private modifier

    //used constructor to initialise the class attribute
    public Box(float width){
        this.width=width;
    }
//created getter method
    public float getWidth() {
        return width;
    }
//created setter method
    public void setWidth(float width) {
        this.width = width;
    }

    public static void main(String[] args) {
        //created a new instance of the Box class
        Box box = new Box(10);
        //getting its width
        System.out.println(box.getWidth());
        //updating its width to 20
        box.setWidth(20);
        //getting updated width
        System.out.println();
        System.out.println("New width: " + box.getWidth());
    }
}
