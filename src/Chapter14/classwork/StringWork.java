package Chapter14.classwork;

public class StringWork {
    public static void main(String[] args) {
        String string = "   cha   ir   ".trim();
        String work = string.replaceAll("   ", "");
       System.out.println(work);

//        List<Integer> listIndex = new ArrayList<>();
//        String word = "MiSSissIppI".toLowerCase();
//
//        for (int i =0; i <= word.length(); i++) {
//            if ((word.charAt(i)).equals(word.indexOf('s'))){
//                listIndex.add(i);
//            }
//        }
//        System.out.println(listIndex);
    }
}
