package stu;

public class Student {
	private String name;
	private int grade;
	private String major;
	private int[] cet_scores;

	public Student(String name,String major,int grade,int[] cet4_scores){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.cet_scores=cet4_scores;
	}
	public void level_up(){
		this.grade++;
	}
	public boolean passed_cet4(){
		for(int i=0;i<this.cet_scores.length;i++){
			if(this.cet_scores[i]>=425)
				return true;
		}
		return false;
	}
	public void printInfo(){
		System.out.println("姓名:"+name);
		switch(grade){
		case 0:System.out.println("大一");break;
		case 1:System.out.println("大二");break;
		case 2:System.out.println("大三");break;
		case 3:System.out.println("大四");break;
		case 4:System.out.println("毕业了");break;
		default:System.out.println("输入有误");
		}
		System.out.println("专业："+major);
		if(passed_cet4()){
			System.out.println("四级已通过");
		}else
			System.out.println("四级未通过");
	}
}
