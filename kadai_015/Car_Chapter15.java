package kadai_015;

public class Car_Chapter15 {
    private int gear = 1;
    private int speed = 10;

    public void changeGear(int afterGear) {
    	int before = this.gear; // 切り替え前を保持
        this.gear = afterGear;
        switch (gear) {
        case 1:
          speed = 10;
          break;
        case 2:
          speed = 20;
          break;
        case 3:
          speed = 30;
          break;
        case 4:
          speed = 40;
          break;
        case 5:
          speed = 50;
          break;
        default:
          speed = 10;
          break;
        }
        
        System.out.println("ギア" + before + "から" + gear + "に切り替えました");
        
    }

    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}
