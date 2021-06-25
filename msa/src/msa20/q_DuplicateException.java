package msa20;

public class q_DuplicateException extends Exception{ //중복시 예외던지기
	
	public q_DuplicateException() {
		super("저장된 회원이 있습니다.");
	}

}
