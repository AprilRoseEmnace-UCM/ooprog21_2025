/**
 * Comments.java
 *
 * This program demonstrates the three types of comments in Java:
 * 1. Single-line comment
 * 2. Multi-line comment
 * 3. Documentation comment
 */

public class Comments {

    public static void main(String[] args) {
        
        // This is a single-line comment
        System.out.println("This is a single-line comment.");
        
        /*
         This is a multi-line comment.
         I can create multiple lines.
         It's often used to explain complex code blocks.
        */
        System.out.println("This line follows a multi-line comment.");
    }

    /**
     * This is a documentation comment.
     * It describes the purpose of the method below.
     * Javadoc tools use this type of comment to generate documentation.
     */
    public static void exampleMethod() {
        System.out.println("This method shows a documentation comment.");
    }
}
