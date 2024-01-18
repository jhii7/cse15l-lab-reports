import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    int num = 0;
    ArrayList<String> something = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            String somethingList = String.join(", ", something);
            return somethingList;
        } else if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("pineapple")) {
                    something.add("pineapple");
                    return String.format("pineapple");
                }
                if (parameters[1].equals("apple")) {
                    something.add("apple");
                    return String.format("apple");
                }
                if (parameters[2].equals("greenapple")) {
                    something.add("green apple");
                    return String.format("green apple");
                }
                if (parameters[3].equals("banana")) {
                    something.add("banana");
                    return String.format("banana");
                }
        } else if (url.getPath().contains("/search")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("app")) {
                    return String.format("ADD SOMETHING HERE");
                }
        }
            return "404 Not Found!";
        }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
