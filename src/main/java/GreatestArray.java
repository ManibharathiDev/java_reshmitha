public class GreatestArray {

    public static void main(String[] args) {
        //Find the greatest number from the given array
        int[] myNumbers = {25, 10, 200, 30, 5};
        int myGreatest = Integer.MIN_VALUE;
        for(int i = 0; i<myNumbers.length;i++){
            //System.out.println(myNumbers[i]);
            if(myNumbers[i] > myGreatest){
                myGreatest = myNumbers[i];
            }
        }
        System.out.println("The Greatest Number is "+myGreatest);

        int myLowest = Integer.MAX_VALUE;
        for(int i = 0; i< myNumbers.length; i++){
            if(myNumbers[i] < myLowest){
                myLowest = myNumbers[i];
            }
        }
        System.out.println("The Lowest Number is "+myLowest);

    }

}
