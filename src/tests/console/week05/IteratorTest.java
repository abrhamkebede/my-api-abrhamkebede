package tests.console.week05;

import utils.ArrayList;
import utils.Iterator;
import utils.LinkedList;

public class IteratorTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t I T E R A T O R ");
        System.out.println(" \t \t T E S T   P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }
    private static void checkArrayListIterator() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Yellow");
        arrayList.add("Pink");
        arrayList.add("Orange");
        arrayList.add("Purple");
        arrayList.add("Black");
        System.out.println("ArrayList: " + arrayList);
        // check the iterator
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("1st  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("2nd  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("3rd  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("4th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("5th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("6th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("7th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("8th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("9th  element");
        System.out.println("List :- " + arrayList);
        System.out.println("next :- " + iterator.hasNext());
        try {
            System.out.println("next Element:- " + iterator.next());
        } catch (Exception e) {
            System.out.println("No Such Element Exception");
        }
        try {
            iterator.remove();
        } catch (Exception e) {
            System.out.println("No Such Element Exception");
        }
    }

    private static void checkLinkedListIterator() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Voilet");
        linkedList.add("Blue");
        linkedList.add("Yellow");
        linkedList.add("Orange");
        linkedList.add("Pink");
        System.out.print("Linked List: ");
        System.out.println(linkedList);
        // check the iterator
        Iterator<String> iterator = linkedList.iterator();
        System.out.println("1st  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("2nd  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("3rd  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("4th  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("5th  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("6th  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("7th  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        System.out.println("next Element:- " + iterator.next());
        iterator.remove();
        System.out.println("List after remove:- " + linkedList);
        System.out.println();
        System.out.println("8th  element");
        System.out.println("List :- " + linkedList);
        System.out.println("next :- " + iterator.hasNext());
        try {
            iterator.next();
        } catch (Exception e) {
            System.out.println("No Such Element found");
        }
        try {
            iterator.remove();
        } catch (Exception e) {
            System.out.println("No Such Element found");
        }
    }



    public static void main(String[] args) {
        intro();
        checkArrayListIterator();
        checkLinkedListIterator();
    }

}
