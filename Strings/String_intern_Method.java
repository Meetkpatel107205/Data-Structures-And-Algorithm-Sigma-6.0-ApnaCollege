
public class String_intern_Method {
    public static void main(String[] args) {
        // Case 1: String literals
        // These are stored in String Constant Pool (SCP)
        String s1 = "Java";
        String s2 = "Java";

        // Both point to same SCP object
        System.out.println(s1 == s2);        // true
        System.out.println(s1.equals(s2));   // true

        // Case 2: Using new String() (Heap memory)
        String s3 = new String("Java");

        // s3 is in Heap, s1 is in SCP
        System.out.println(s1 == s3);        // false
        System.out.println(s1.equals(s3));   // true

        // Case 3: Using intern()
        // intern() returns reference from SCP
        String s4 = s3.intern();

        // s4 now points to SCP "Java"
        System.out.println(s1 == s4);        // true

        // Case 4: Two heap strings with same content
        String s5 = new String("Hello");
        String s6 = new String("Hello");

        // Different heap objects
        System.out.println(s5 == s6);        // false

        // After intern(), both point to same SCP object
        System.out.println(s5.intern() == s6.intern()); // true
    }
}

// What is SCP?
// SCP = String Constant Pool
// It is a special memory area inside the Heap where String literals are stored.

// Why does SCP exist?
// Java created SCP to:
// Save memory
// Avoid duplicate String objects
// Improve performance

// Same string value → only ONE object in SCP

// Where is SCP in memory?
// Heap Memory
//  ├── Objects (new String())
//  └── String Constant Pool (SCP)

// Since Java 7, SCP is part of Heap memory

// -------------------------------------------------------------------------------------------------

// What intern() actually does (REAL definition)
// intern() checks whether a string with the same content exists in the String Constant Pool (SCP).

// Two possible cases:

// If value exists in SCP
// → return that SCP reference

// If value does NOT exist in SCP
// → add the string to SCP
// → return its reference
