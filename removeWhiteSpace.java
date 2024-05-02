/*For input with white spaces (ex. “     Hello     World    “), 
write a Java program to print only non-white space characters(ex. “Hello World”)*/

class removeWhiteSpace {
    public static void main(String[] args) {
        String input = " hello  there  ";
        //split the string into substring with space as the regex
        //This returns the words and spaces in substrings
        String[] arr = input.split(" ");
        
        String output = "";
        //Traverse the array with substrings
        for(int i=0;i<arr.length;i++){
            
            //trim the whitespaces if substring is space and concat the string with original
            if(arr[i]==" ")
            {
                output = output.trim() + arr[i].trim();
            }
            //add single space between words and concat
            else{
                output = output.trim() +" " + arr[i].trim() +" ";
            }
        }
        System.out.println("output is:"+output.trim());
        //System.out.println("Sqrt is:"+Math.sqrt(15));
    }
}