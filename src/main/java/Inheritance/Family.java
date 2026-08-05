package Inheritance;

public class Family {

    public static void main(String[] args){


        /*Parent parent = new Parent();

        parent.printParentAsset();*/


        Children children = new Children();
        children.printChildrenAsset();
        children.printMyName();
        //children.printParentAsset();

        Parent parent = new Parent();
        parent.printMyName();

    }

}
