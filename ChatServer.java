import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> something = new ArrayList<String>();

    public String handleRequest(URI url) {
        String query = url.getQuery();

        if (url.getPath().contains("/add-message")) {
                if(query.startsWith("s=")) {
                    System.out.println(query);
                    String msgSplit1 = query.split("=")[1];
                    String msg = msgSplit1.split("&")[0];
                    String user = query.split("=")[2];
                    this.something.add(user + ": " + msg);
                    String somethingList = String.join("\n", something);
                    return somethingList;
                }
        } else if (url.getPath().contains("/")) {
            return "Type in message (/add-message?s=[MESSAGE HERE]&user=[USER HERE])";
        }
            return "404 Not Found!";
        }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
