package dz.HW1;

public class LengthWord {
    int length(String sentence) {
        String[] words = sentence.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        LengthWord lw = new LengthWord();
        int result = lw.length("luffy is still joyboy");
        System.out.println(result);
    }

}

