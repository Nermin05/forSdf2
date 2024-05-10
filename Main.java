package visitor;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        Visitor visitor=new ShapeVisitor();
        circle.accept(visitor);
        rectangle.accept(visitor);
        //Burada da Visitor interfaceindeki eyni adli methodlar(overload) vasiitesile hara visit edeceyini
        //yeni bas cekeceyini mueyyen edir,yeni hansi fiquru isdeyirikse onu ekrana vermesini isdeyirik
    }
}
