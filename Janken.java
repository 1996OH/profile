
import java.util.Random;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
	  int Ren = 0;
	  System.out.println("じゃんけんで15連勝できたら1000万円プレゼント!");

	  for(int i = 0 ; i < 15 ; i++){
	        System.out.println("じゃんけん");
	        System.out.println("「グー」「チョキ」「パー」");
	        String Hoi = scanner.next();
	        
	        String resolt = janken(Hoi);

	        System.out.println(resolt);
	        if(resolt.equals("負け")){
	           System.out.println("あなたの負けです。ゲームオーバー。");
	           break;
	        }else if(resolt.equals("勝ち")){
	           System.out.println("あなたの勝ち!おめでとう!");
	           Ren += 1;
	           if(Ren < 15){
	              System.out.println("現在"+Ren+"連続勝利!1000万円まであと"+(15-Ren)+"勝です!");
	              System.out.println();
	           }else{
	           System.out.println("おめでとう！1000万円獲得だ!!");
	           }
           }else if(resolt.equals("あいこ")){
	           System.out.println("あいこです。もう一度選択してください。");
	           System.out.println();
	           i -= 1;
	           continue;
	        }else{
	           System.out.println("選択が無効です。");
	           System.out.println("「グー」「チョキ」「パー」から選択してください");
	           System.out.println();
	           i -= 1;
	           continue;
	        }
	       
	  }
	  scanner.close();
	 }
	 
	 public static String janken (String Hoi){
	   String Hoi2 = Hoi;
	   String enemyHoi = enemyHoi();
	   String resolt= "";

	   if(Hoi2.equals("グー")){
	     switch(enemyHoi){
	      case "グー":
	        resolt = "あいこ";
	        break;
	      case "チョキ":
	        resolt = "勝ち";
	        break;
	      case "パー":
	        resolt = "負け";
	        break;
	     }
	   }else if(Hoi2.equals("チョキ")){
	     switch(enemyHoi){
	      case "グー":
	        resolt = "負け";
	        break;
	      case "チョキ":
	        resolt = "あいこ";
	        break;
	      case "パー":
	        resolt = "勝ち";
	        break;
	     }
	   }else if(Hoi2.equals("パー")){
	     switch(enemyHoi){
	      case "グー":
	        resolt = "勝ち";
	        break;
	      case "チョキ":
	        resolt = "負け";
	        break;
	      case "パー":
	        resolt = "あいこ";
	        break;
	     }
	   }else {
		   resolt = "";
	   }
	     return resolt;
	 }
	 
	 public static String enemyHoi(){
	   Random rand = new Random();
	   int num = rand.nextInt(3);
	   String enemyHoi= "";
	   switch(num){
	     case 0:
	       enemyHoi = "グー";
	       break;
	     case 1:
	       enemyHoi = "チョキ";
	       break;
	     case 2:
	       enemyHoi = "パー";
	       break;
	    }
	   return enemyHoi;
	 }
	}


