package Inheritance;

public class Children extends Parent {

    int myAsset = 10000;

    void printChildrenAsset(){
        System.out.println("Children Asset is "+myAsset);
        System.out.println("Parent Asset is "+super.myAsset);
        super.printParentAsset();
    }

    @Override
    void printMyName(){
        System.out.println("I am Mathew");
        super.printMyName();
    }

}
