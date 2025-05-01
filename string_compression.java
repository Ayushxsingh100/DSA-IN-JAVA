public class StringCompression {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        
        compressed.append(str.charAt(str.length() - 1)).append(count); // Append last character
        
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input = "aaabbccccd";
        String compressedOutput = compress(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressedOutput);
    }
}