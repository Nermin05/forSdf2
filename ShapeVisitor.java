package visitor;

public class ShapeVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("For circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("For rectangle");
    }
}
