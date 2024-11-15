import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double total_grade = 0.0;
        double total_score=0.0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            Double grade = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            if(score.equals("A+")){
                total_grade+=grade;
                total_score+=4.5*grade;
            }else if(score.equals("A0")){
                total_grade+=grade;
                total_score+=4.0*grade;
            }else if(score.equals("B+")){
                total_grade+=grade;
                total_score+=3.5*grade;
            }else if(score.equals("B0")){
                total_grade+=grade;
                total_score+=3.0*grade;
            }else if(score.equals("C+")){
                total_grade+=grade;
                total_score+=2.5*grade;
            }else if(score.equals("C0")){
                total_grade+=grade;
                total_score+=2.0*grade;
            }else if(score.equals("D+")){
                total_grade+=grade;
                total_score+=1.5*grade;
            }else if(score.equals("D0")){
                total_grade+=grade;
                total_score+=1.0*grade;
            }else if(score.equals("P")){
                
            }else if(score.equals("F")){
                total_grade+=grade;
                total_score+=0.0*grade;
            }
        }
        double result = total_score/total_grade;

        //bw.write(Math.round((total_score/total_grade) * 1000000) / 1000000+"\n");
        bw.write(String.format("%.6f", result)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}