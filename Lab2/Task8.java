import java.util.Random;

public class Task8{

	public static void main(String args[]){

	String[] article={"the","a","one","some","many"};
	String[] noun={"boy","girl","dog","town","car"};
	String[] verb={"drove","jumped","ran","walked","skipped"};
	String[] prepo={"to","from","over","under","on"};

	Random rand=new Random();

	for(int i=1;i<=20;i++){
	
	String sentence=article[rand.nextInt(article.length)]+" "+noun[rand.nextInt(noun.length)]
	+" "+verb[rand.nextInt(verb.length)]+" "+prepo[rand.nextInt(prepo.length)]+" "+
	article[rand.nextInt(article.length)]+" "+noun[rand.nextInt(noun.length)];

	sentence=Character.toUpperCase(sentence.charAt(0))+sentence.substring(1)+".";

	System.out.println(i + ". " + sentence);

}

}

}