package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい英単語を配列にセット
        String[] words = {"apple", "banana", "grape", "orange"};

        // 辞書を調べるメソッドを呼び出す
        dictionary.searchWords(words);
    }
}