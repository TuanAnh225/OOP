package hust.soict.dsai.aims.screen.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    public List<String> authors = new ArrayList<String>();

    public Book() {

    }

    public void addAuthor(String authorName) {
        boolean check = true;
        for(int i = 1 ; i < authors.size(); i++) {
            if(!authors.get(i).equals(authorName)) {
                check = false;
            }
        }
        if(check == true) {
            System.out.println("This author exsists");
        }else {
            authors.add(authorName);
            System.out.println("add successfull");
        }

    }

    public void removeAuthor(String authorName) {
        boolean check = true;
        for(int i = 1 ; i < authors.size(); i++) {
            if(!authors.get(i).equals(authorName)) {
                check = false;
            }
        }
        if(check == false) {
            System.out.println("This author does not exsist");
        }else {
            authors.add(authorName);
            System.out.println("remove successfull");
        }
    }
}
