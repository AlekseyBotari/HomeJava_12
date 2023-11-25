public class MethodString {
    public static void MethodStringWorking (String str){
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "про"));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,str.length()));

    }
}
