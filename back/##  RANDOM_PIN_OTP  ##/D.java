class D {
    public static void main(String[] args) {
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<6;i++) {
            int k = (int)(Math.random() * 36);
            System.out.print(str.charAt(k));
        }
    }
}