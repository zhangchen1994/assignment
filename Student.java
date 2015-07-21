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
		System.out.println("����:"+name);
		switch(grade){
		case 0:System.out.println("��һ");break;
		case 1:System.out.println("���");break;
		case 2:System.out.println("����");break;
		case 3:System.out.println("����");break;
		case 4:System.out.println("��ҵ��");break;
		default:System.out.println("��������");
		}
		System.out.println("רҵ��"+major);
		if(passed_cet4()){
			System.out.println("�ļ���ͨ��");
		}else
			System.out.println("�ļ�δͨ��");
	}
}
