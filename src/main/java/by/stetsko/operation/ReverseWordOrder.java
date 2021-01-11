package by.stetsko.operation;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ReverseWordOrder extends AbstractOperation {

    public void reverseWords() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/christina/tmp/tmp.txt")); // Windows: D:\\Tmp\\tmp2.txt"
            String inputString = bufferedReader.readLine();
            String[] array = inputString.split(" ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// TODO: 1/11/21 вынести BufferedReader в AbstractOperation