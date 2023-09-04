class Main {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 10;

        if (a>b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        
        if (a>c) {
            c = c + a;
            a = c - a;
            c = c - a;
        }
	if (b>c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
