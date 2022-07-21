package fr.eni.ProjetEncheres.bll;

public class ArticleManager {
	
		//singleton
		private static ArticleManager instance;

		private ArticleManager() {}
		
		
		public static ArticleManager getInstance() {
			if(instance==null) {
				instance = new ArticleManager();
			}
			return instance;
		}

}
