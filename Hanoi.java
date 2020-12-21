import java.util.Scanner;
public class Hanoi {
    static int cnt = 0;
    public static void move (int topDisk, char src, char tmp, char dst){
        if(topDisk == 1){
            cnt++;
            System.out.println("第" + cnt + "步: " +"Disk "+ topDisk + " from " + src + " to " + dst);
        }
        else{
            move(topDisk -1, src, dst, tmp);
            cnt++;
            System.out.println("第" + cnt + "步: " + "Disk "+ topDisk + " from " + src + " to " + dst);
            move(topDisk - 1, tmp, src, dst);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要移动的总盘数:");
        int disks = sc.nextInt();
        move(disks,'A','B','C');
    }
}
