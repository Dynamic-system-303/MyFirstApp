package timus.sem_1.task_1880;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/task_1880/imput.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

        int size1 = Integer.parseInt(bufferedReader.readLine());
        String[] strings1 = bufferedReader.readLine().split(" ");
        int size2 = Integer.parseInt(bufferedReader.readLine());
        String[] strings2 = bufferedReader.readLine().split(" ");
        int size3 = Integer.parseInt(bufferedReader.readLine());
        String[] strings3 = bufferedReader.readLine().split(" ");

        int allSize = size1+size2+size3;
        String[] strings = new String[allSize];

        for(int i = 0; i < allSize; i++){
            if(i < size1){

            }
        }
    }
}
