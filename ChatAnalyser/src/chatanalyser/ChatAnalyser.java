/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatanalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author moolm
 */
public class ChatAnalyser {

    public static File choose() {
        JFileChooser chooser = new JFileChooser();
        int choice = chooser.showOpenDialog(chooser);
        if (choice != JFileChooser.APPROVE_OPTION) {
            System.exit(0);
        }
        File chosenFile = chooser.getSelectedFile();
        return chosenFile;
    }

    public static void Analyser() throws FileNotFoundException {
        File chat = choose();
        int messagesTo = 0;
        int messagesFrom = 0;
        int messages = 0;
        int words = 0;
        String sender = sendf(chat) + " " + sendl(chat);
        String recipient = recf(chat) + " " + recl(chat);
        String ssur = sendl(chat) + ":";
        String rsur = recl(chat) + ":";
        Scanner sc = new Scanner(chat);
        sc.nextLine();
        String t = "";
        while (sc.hasNext()) {
            t = sc.next();
            if (t.equals(ssur)) {
                messagesFrom++;
            }
            if (t.equals(rsur)) {
                messagesTo++;
            }
        }
        
        System.out.println("Sender:\t\t" + sender);
        System.out.println("Recipient:\t" + recipient);
        System.out.println("Messages To:\t" + messagesTo + "\t" + pc(messagesTo, messagesFrom));
        System.out.println("Messages From:\t" + messagesFrom + "\t" + pc(messagesFrom, messagesTo));
        int sum = messagesFrom+messagesTo;
        System.out.println("Total Messages:\t"+sum);
    }

    public static void main(String[] args) throws FileNotFoundException {
        ChatAnalyser lmao = new ChatAnalyser();
        Analyser();

    }

    public static String pc(int i, int j) {
        double pc = i + j;
        pc = (int) ((i * 100) / pc);
        if (j < i) {
            pc++;
        }
        return Integer.toString((int) pc) + "%";
    }

    public static String sendf(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        sc.nextLine();
        sc.next();
        sc.next();
        sc.next();
        return sc.next();
    }

    public static String sendl(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        sc.nextLine();
        sc.next();
        sc.next();
        sc.next();
        sc.next();
        String s = sc.next();
        return s.substring(0, s.length() - 1);
    }

    public static String recf(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        String sender = sendf(f);
        sc.nextLine();
        while (true) {
            sc.next();
            sc.next();
            sc.next();
            String k = sc.next();
            if (!k.equals(sender)) {
                return k;
            }
            sc.nextLine();
        }

    }

    public static String recl(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        String sender = sendf(f);
        sc.nextLine();
        while (true) {
            sc.next();
            sc.next();
            sc.next();
            String k = sc.next();
            if (!k.equals(sender)) {
                k = sc.next();
                return k.substring(0, k.length() - 1);
            }
            sc.nextLine();
        }
    }

}
