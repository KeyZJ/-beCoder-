import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class BeCoderQuest {
  public static void main(String[] args) {
    try {
      String s;
      String[] words;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      HashSet<String> friends = new HashSet<>();
      int n = Integer.parseInt(br.readLine());
      ArrayList<String> friendsOne = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        s = br.readLine();
        words = s.split(" ");
        friendsOne.add(words[0]);
        for (int j = 2; j < words.length; j++) {
          friends.add(words[j]);
        }
      }

      Iterator iterator = friends.iterator();
      while (iterator.hasNext()) {
        String elem = (String) iterator.next();
        for (String oneElem : friendsOne) {
          if (elem.equals(oneElem)) {
            iterator.remove();
          }
        }
      }
      System.out.println(friends.size());
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
