public class ArraysExercises {


    public static String[] add(String[] originalArray, String newItem)
    {
        int currentSize = originalArray.length;
        int newSize = currentSize + 1;
        String[] tempArray = new String[ newSize ];
        for (int i=0; i < currentSize; i++)
        {
            tempArray[i] = originalArray [i];
        }
        tempArray[newSize- 1] = newItem;
        return tempArray;
    }


    public static void main(String[] args) {

        String[] Person = {"John", "Paul", "George"};
        String newObject = "Ringo";

        for (int i = 0;i < Person.length; i++) {
            System.out.println(Person[i]);
        }

        Person = add(Person, newObject);

        for (int i = 0;i < Person.length; i++) {
            System.out.println(Person[i]);
        }

    }



}
