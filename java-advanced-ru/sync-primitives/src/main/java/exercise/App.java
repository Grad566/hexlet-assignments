package exercise;

class App {

    public static void main(String[] args) throws InterruptedException {
        // BEGIN
        var safList = new SafetyList();
        var thread1 = new ListThread(safList);
        var thread2 = new ListThread(safList);
        thread2.start();
        thread1.start();

        thread2.join();
        thread1.join();

        System.out.println(safList.getSize());
        // END
    }
}

