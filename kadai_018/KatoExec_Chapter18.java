package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
        katoTaro.setGivenName();
        katoTaro.execIntroduce();
        System.out.println(""); // ここで1行スペース

        KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
        katoIchiro.setGivenName();
        katoIchiro.execIntroduce();
        System.out.println(""); // ここで1行スペース

        KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();
        katoHanako.setGivenName();
        katoHanako.execIntroduce();

    }
}
