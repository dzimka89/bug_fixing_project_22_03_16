package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        File file = new File(path.toAbsolutePath() + "/test.txt");

        Scanner scan = new Scanner(file);
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }

}
