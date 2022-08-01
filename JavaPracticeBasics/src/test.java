public class test {

    public int index = 1;

     static class App extends test {
        public App(int index) {
            index = index;
        }
    }
        public static void main(String args[]) {
            App myApp = new App(10);
            System.out.println(myApp.index);
        }
}

