package Inheritance.hierarchical;

public class ParentChild {

    public static  void main(String[] args)
    {
        FirstChild firstChild = new FirstChild();
        firstChild.printFirstChild();
        firstChild.printTopParent();

        SecondChild secondChild = new SecondChild();
        secondChild.printSecondChild();
        secondChild.printTopParent();
    }

}
