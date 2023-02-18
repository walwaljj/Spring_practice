package spring.di;

import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
/*		아래 주석을 스프링에게 지시하는 방법으로 변경하기 : xml 파일(지시서)에 표현하기
 * 		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);*/
		
		ExamConsole console = ?;
		console.print();

	}

}
