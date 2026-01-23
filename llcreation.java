import java.util.LinkedList;

public class llcreation {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to the list using built-in methods
        animals.add("Dog"); // Appends to the end
        animals.add("Cat");
        animals.addFirst("Horse"); // Adds to the beginning
        animals.add(2, "Cow"); // Adds at a specific index

        // Print the linked list
        System.out.println("LinkedList: " + animals);
        
        // Access elements
        String firstAnimal = animals.getFirst(); // Access the first element
        String animalAtIndex2 = animals.get(2); // Access element by index
        System.out.println("First animal: " + firstAnimal);
        System.out.println("Animal at index 2: " + animalAtIndex2);

        // Remove elements
        animals.removeLast(); // Removes the last element
        System.out.println("LinkedList after removing last: " + animals);
    }
}
