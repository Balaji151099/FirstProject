package hashSet;

import java.util.HashSet;

public class UseAnime {
	public static void main(String[]args) {
		 HashSet<Anime> an = new HashSet<>();
		 Anime a1=new Anime("One Piece", "Adventure", 8.7, "Eiichiro Oda");
		 Anime a2=new Anime("Naruto", "Action", 8.3, "Masashi Kishimoto");
		 Anime a3=new Anime("Attack on Titan", "Action", 9.0, "Hajime Isayama");
		 Anime a4=new Anime("Death Note", "Mystery", 9.2, "Tsugumi Ohba");

		 
		 an.add(a1);
		 an.add(a2);
		 an.add(a3);
		 an.add(a4);
		 
		 
		 an.forEach(anime -> {
	            if (anime.getGenre().equals("Action")) {
	                System.out.println("NAME: "+anime.getName());
	            }
	        });
		 
		 for (Anime a : an) {
	            if (a.getRating()<9.5) {
	                System.out.println(a);
	            }
	        }
		 for(int i=0;i<an.size();i++) {
			//if(an.getAuthor().startsWith("E")) {
				 System.out.println(an);
			 }
		 }
	}
}

\\}
