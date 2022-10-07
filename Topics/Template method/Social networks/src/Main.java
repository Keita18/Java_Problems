import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        // write your code here ...
        logIn();
        post();
        logOut();
    }

      // write your code here ...
    abstract void logIn();

    abstract void post();

    abstract void logOut();
}

class Instagram extends SocialNetwork {
    String name = "Instagram";
    @Override
    void logIn() {
        System.out.println("Log into " + name);
    }

    @Override
    void post() {
        System.out.printf("Post: Hello, %s!\n", name);
    }

    @Override
    void logOut() {
        System.out.println("Log out of " + name);
    }
}


class Facebook extends SocialNetwork {
    String name = "Facebook";
    @Override
    void logIn() {
        System.out.println("Log into " + name);
    }

    @Override
    void post() {
        System.out.printf("Post: Hello, %s!\n", name);
    }

    @Override
    void logOut() {
        System.out.println("Log out of " + name);
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}