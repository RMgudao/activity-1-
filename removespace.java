package activity1;

public class removespace {
    public static void main(String[] args)
    {
        String str = "      Geeks     for    Geeks        ";
        System.out.println("original string: " + str);
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println("after: " + str);
    }
}
