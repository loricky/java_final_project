public class Female_Member extends Member{
	private int chest;
	private int waist;
	private int hip;
	
	public Female_Member(){
		setFull_Name("");
		setHeight(0.0);
		setWeight(0.0);
		setAge(0);
		setChest(0);
		setWaist(0);
		setHip(0);
	}
	public Female_Member(String f, float h, float w, int a, int c, int w, int h){
		setFull_Name(f);
		setHeight(h);
		setWeight(w);
		setAge(a);
		setChest(c);
		setWaist(w);
		setHip(h);
	}
	public void setChest(int c){
		if(c < 0){
			System.out.println("chest can't be under 0");
		}else
			chest = c;
	}
	public int getChest(){
		return chest;
	}
	public void setWaist(int w){
		if(w < 0){
			System.out.println("waist can't be under 0");
		}else
			waist = w;
	}
	public int getWaist(){
		return waist;
	}
	public void setHip(int h){
		if(h < 0){
			System.out.println("hip can't be under 0");
		}else
			hip = h;
	}
	public int getHip(){
		return hip;
	}
}
