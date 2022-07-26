package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation auto=new Automation();
		auto.Java();
		auto.ruby();
		auto.python();
		auto.selenium();


	}

	public void Java() {
		// TODO Auto-generated method stub

		System.out.println("Implemented Langauge Interface Method Java!!");

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Implemented TestTool Interface Method Selenium!!");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub

		System.out.println("Overridden abstract unimplemented method Ruby");

	}



}
