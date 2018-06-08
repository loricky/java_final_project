public class Male_Member extends Member{
	private int salary; //薪水
	//private boolean car; //有車?
	
	public Male_Member(){
		setFull_Name("");
                setHeight(0.0);
	        setWeight(0.0);
	        setAge(0);
		setSalary(0);
		//setCar();		
	}
	public Male_Member(String f, float h, float w, int a, int s){
		setFull_Name(f);
		setHeight(h);
		setWeight(w);
		setAge(a);
		setSalary(s);
	}
	public void setSalary(int s){
		if(s < 0){
			System.out.println("salary can't be under 0");
		}else{
			salary = s;
		}
	}
	public int getSalary(){
		return salary;
	}
}
