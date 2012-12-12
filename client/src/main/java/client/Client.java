
package client;

import mainapi.MainApi;

public class Client {
  public static void main(String [] args) {
    System.out.println("Running the client.");
    System.out.println("Going to print a message from one of depa or depb.");
    System.out.println(new MainApi().getMessageString());
  }
}
