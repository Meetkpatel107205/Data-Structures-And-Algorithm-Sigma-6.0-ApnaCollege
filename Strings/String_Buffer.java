public class String_Buffer {
    public static void main(String[] args) {
        // Creating StringBuffer object
        // Mutable and thread-safe
        StringBuffer sb = new StringBuffer("Hello");

        // append(): adds text at the end
        sb.append(" World");
        // Now sb = "Hello World"

        // insert(): insert text at specific index
        sb.insert(5, " Java");
        // Now sb = "Hello Java World"

        // replace(): replaces characters from start index to end index (end exclusive)
        sb.replace(6, 10, "C++");
        // Now sb = "Hello C++ World"

        // delete(): deletes characters from start index to end index (end exclusive)
        sb.delete(6, 10);
        // Now sb = "Hello World"

        // setCharAt(): replaces a single character at given index
        sb.setCharAt(0, 'h');
        // Now sb = "hello World"

        // reverse(): reverses the entire string
        sb.reverse();
        // Now sb = "dlroW olleh"

        // length(): returns number of characters
        int len = sb.length();

        // capacity(): total allocated capacity
        int cap = sb.capacity();
        // Default capacity = 16 + initial string length

        // Print final results
        System.out.println("StringBuffer value: " + sb);
        System.out.println("Length: " + len);
        System.out.println("Capacity: " + cap);

        /*
         Thread Safety Note:
         All StringBuffer methods are synchronized.
         This means only one thread can modify sb at a time.
         Hence, data corruption is avoided in multi-threading.
        */
    }
}
