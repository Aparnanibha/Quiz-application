// QUIZ APPLICATION  
 
import java.util.*;
 class Question
{
 Scanner sc = new Scanner(System.in);
 String question,option1,option2,option3,option4;
 int correctAnswer , userAnswer;
 public boolean askQuestion()
 {
  System.out.println(question);
  System.out.println("1. "+option1);
  System.out.println("2. "+option2);
  System.out.println("3. "+option3);
  System.out.println("4. "+option4);
  System.out.println("Please choose the correct option");
  userAnswer = sc.nextInt();
  if(userAnswer == correctAnswer)
  {
    return true;
  }
  return false;
 }
}

 class Player
{
  Scanner sc = new Scanner(System.in);
  String name;
 int score=0;
 
 public void getDetails()
{
 System.out.println("Enter the player name");
 name = sc.next();
}
}

class Game
{
 Question []question = new Question[3];
 Player player = new Player();
  public void initGame()
  {
   for(int i=0;i<3;i++)
   {
    question[i] = new Question();
   }
  question[0].question = "Who is the strongest Avenger";
  question[0].option1 ="Ironman";
  question[0].option2 ="Thor";
  question[0].option3 = "Hulk";
  question[0].option4 = "Scarlet";
  question[0].correctAnswer = 2;
   
  question[1].question = "What is the closest plannet to the sun";
  question[1].option1 ="earth";
  question[1].option2 ="Mercury";
  question[1].option3 = "Venus";
  question[1].option4 = "Jupyter";
  question[1].correctAnswer = 2;

  question[2].question = "What is the capital of australia";
  question[2].option1 ="Sydney";
  question[2].option2 ="Canberra";
  question[2].option3 = "washington";
  question[2].option4 = "Bern";
  question[2].correctAnswer = 2;
}

public void play()
{
 player.getDetails();
 for(int i=0;i<3;i++)
 {
  boolean status= question[i].askQuestion();
  if(status == true)
   {
    System.out.println("Bohat in unda khele h aap");
    player.score++;
   }
  else 
  {
   System.out.println("Maaf karna mai aapki sahayata nhi kar sakta");
  }
  }
System.out.println(player.name+" your score is"+player.score);
}
}

class main
{
 public static void main(String args[])
 {
  Game game = new Game();
  game.initGame();
   game.play();
 }
}