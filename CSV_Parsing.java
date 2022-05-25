import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class CSV_Parsing {
    // public static void main(String[] args) throws IOException {
    //     BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    //     FileInputReader r = new
    //     String s;
    //     while ((s = r.readLine()) != null) {
    //         String[] fields = s.split(",");
    //         String[] cube = fields[1].split("_");
    //         String[] solved = fields[2].split("_");
    //         System.out.println("else if (");
    //
    //         for (int i = 0; i < cube.length; ++i)
    //             System.out.printf("\tcube[%d] == solved[%d]\n",
    //             Integer.parseInt(cube[i]),
    //             Integer.parseInt(solved[i]));
    //
    //             System.out.printf(") {\n\talgorithm(\"%s\");\n}\n", fields[3]);
    //     }
    // }

    public static List<String[]> readData() throws IOException {
        int count = 0;
        String file = "C:\\Users\\Public\\Dropbox\\Repos\\RubiksCubeSolver\\algorithmen version 1.csv";
        List<String[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        }
        return content;
    }

    // arrays start counting from zero
    // so, char[] cube: cube[0] is spot number 1,
    // cube[5] is spot number 6
    public static void main(String[] args) throws IOException{
        List<String[]> moves = readData();
        List<String> algorithm = new ArrayList<String>();

        // first 96; if-elseif
        for (String[] line : moves) {
          for (String thing : line) {
            if (thing.contains("case ")) {
              algorithm.add(thing);
            }
          }
        }

        for (String Xylometazolinhydrochlorid : algorithm) {
          // data
          String[] things2do = Xylometazolinhydrochlorid.split(";");


          // first set of numbers
          String[] firstNumbers = things2do[1].split("_");

          // second set of numbers
          String[] secondNumbers = things2do[2].split("_");

          // string moves
          String[] moreMoves = things2do[3].split("(?<=['])");

          System.out.println("else if (cube[" + (Integer.parseInt(firstNumbers[0]) - 1) + "] == cube[" + (Integer.parseInt(secondNumbers[0]) - 1) + "]" +
                             " && cube[" + (Integer.parseInt(firstNumbers[1]) - 1) + "] == cube[" + (Integer.parseInt(secondNumbers[1]) - 1) + "]" +
                             " && cube[" + (Integer.parseInt(firstNumbers[2]) - 1) + "] == cube[" + (Integer.parseInt(secondNumbers[2]) - 1) + "]) {\r\n" +
                             "}\r\n");
        }

        // for (String line : algorithm) {
        //   System.out.println(line);
        // }

        char[] cube = {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W',
            'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
            'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G',
            'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R',
            'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y',
            'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B',};
      }
}
