

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ejemplos {
    public static void main(String[] args) throws Exception {
        int n=0;
        System.out.println("Enter a number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            n = Integer.parseInt(br.readLine());  // 45
        }

        finally
		{

            br.close();
			System.out.println("closed");
		}

            System.out.println(n);
        }
}

