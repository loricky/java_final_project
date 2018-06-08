public class Member{
	protected String Full_Name;
	protected float height;
	protected float weight;
	protected int age;
	//protected String zodiac_sign;
	
	
	public Member(){
		setFull_Name("");
		setHeight(0.0);
		setWeight(0.0);
		setAge(0);
	}
	
	public Member(String f, float h, float w, int a){
		setFull_Name(f);
		setHeight(h);
		setWeight(w);
		setAge(a);
	}
	
	
	
	
	//名字的資料傳遞
	public void setFull_Name(String f){
		Full_Name = f;
	}
	public String getFull_Name(){
		return Full_Name;
	}
	
	
	//身高的資料傳遞
	public void setHeight(float h){
		height = h;
	}
	public float getHeight(){
		return height;
	}
	
	
	//體重的資料傳遞
	public void setWeight(float w){
		weight = w;
	}
	public float getWeight(){
		return weight;
	}
	
	
	//年齡的資料傳遞
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	
}