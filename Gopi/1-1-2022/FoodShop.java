class   FoodShop
{
	String webSiteName;
	String searchName;
	String orderName;
	int cost;
	Address add;

	public FoodShop(String webSiteName,String searchName,String orderName,int cost,Address add){
		this.webSiteName = webSiteName;
		this.searchName = searchName;
		this.orderName = orderName;
		this.cost = cost;
		this.add = add;
		}

		public String toString(){
			return "FoodShop[webSiteName="+webSiteName+",searchName="+searchName+",orderName="+orderName+",cost="+cost+"add="+add+"]";
		}
}
