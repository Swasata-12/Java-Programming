public class String1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Swasata");
        System.out.println(sb.append(" Nandy"));
        sb.insert(7, "is a good boy");
        System.out.println(sb.toString());
        System.out.println(sb.append('n'));
        // System.out.println(sb.setLength(4));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        sb.delete(0,3);
        System.out.println(sb.toString());
    }
}
