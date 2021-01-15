import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入小组人数:");
        int num = scan.nextInt();
        String[] names = new String[num];
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第"+ (i+1) +"位组员姓名:");
            names[i] = scan.next();
        }
        System.out.print("再输入一个名字:");
        String name = scan.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
            }
        }
        System.out.println("存在,下标为" + index);
    }
}
