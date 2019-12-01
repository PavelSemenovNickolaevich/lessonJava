public class example {

    public static  void  main(String[] args) {
        String Str = new String("18-10");

        for (String retval : Str.split("|-")) {
            System.out.println(retval);
        }
    }
}
