package JavaLess1;

public class HomeWorkSem2 {
    static int i = 0;
    static String str1 = "Надо любить жизнь больше, чем смысл жизни.Федор Достоевский";
    static String str2 = "Мы становимся тем, о чем мы думаем.Эрл Найтингейл";
    static int a = 3;
    static int b = 56;
    public static void main(String[] args) {

        String sum = String.valueOf(a + b);
        String sub = String.valueOf(a - b);
        String multi = String.valueOf(a * b);
        String res = new StringBuilder().append(a).append(" + ").append(b).append(" = ").append(sum).append("  ").append(a).append(" - ").append(b).append(" = ").append(sub).append("  ").append(a).append(" * ").append(b).append(" = ").append(multi).toString();



        similarity(str1,str2);
        similarity(str1,new StringBuilder(str2).reverse().toString());
        print("Реверс Достоевского -> " + reverse(str1));
        print(res);
        print(res.replace("="," равно "));






    }
    private static void print(String str){
        System.out.println(str);
    }
    private static void similarity(String str1,String str2){
        System.out.println(str1.contains(str2));
    }

    private static void reverse(char[] str, int k) {

        if (k == str.length) {
            return;
        }
        reverse(str, k + 1);
        if (i <= k) {
            char temp = str[k];
            str[k] = str[i];
            str[i++] = temp;
        }
    }

    public static String reverse(String str) {
        char[] a = str.toCharArray();
        reverse(a, 0);
        return String.copyValueOf(a);
    }
}