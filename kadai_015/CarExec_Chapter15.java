package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
        System.out.println("start");

        // Car_Chapter15クラスのインスタンスを作成
        Car_Chapter15 myCar = new Car_Chapter15();

        // ギアを3に変更
        myCar.changeGear(7);

        // 車を走らせる
        myCar.run();

        System.out.println("end");

	}

}
