public class String_concatenate {

        public static void main(String[] args) {
            
            String str1 = "Hello";
            String str2 = "World";
            String result1 = str1 + " " + str2;
            System.out.println("Using + operator: " + result1);
    
            
            String result2 = str1.concat(" ").concat(str2);
            System.out.println("Using concat(): " + result2);
    
        
            StringBuilder sb = new StringBuilder(str1);
            sb.append(" ").append(str2);
            String result3 = sb.toString();
            System.out.println("Using StringBuilder: " + result3);
    
            
            StringBuffer sbf = new StringBuffer(str1);
            sbf.append(" ").append(str2);
            String result4 = sbf.toString();
            System.out.println("Using StringBuffer: " + result4);
    
    
            String result5 = String.format("%s %s", str1, str2);
            System.out.println("Using String.format(): " + result5);

            long startTime = System.currentTimeMillis();
            String longString = "";
            for (int i = 0; i < 10000; i++) {
                longString += "a";
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Using + operator for large concatenation took: " + (endTime - startTime) + " ms");
    
            startTime = System.currentTimeMillis();
            StringBuilder largeSB = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                largeSB.append("a");
            }
            endTime = System.currentTimeMillis();
            System.out.println("Using StringBuilder for large concatenation took: " + (endTime - startTime) + " ms");
        }
    }
}
