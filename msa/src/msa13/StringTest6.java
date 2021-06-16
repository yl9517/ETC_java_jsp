package msa13;

public class StringTest6 {

	public static void main(String[] args) {

		// compareToIgnoreCase : 대소문자 구분하지않고 비교
		String name = "abc";
		System.out.println(name.compareToIgnoreCase("ABC"));
		
		//concat : 이어붙이기
		name=name.concat("1111");
		System.out.println(name);
		
		//contains : 포함되어있는지 확인   ▶ return boolean
		boolean result = name.contains("11");
		System.out.println(result);
		
					System.out.println("-----------");
		
		//startsWith : 해당문자열로 시작하는지 확인     ▶ return boolean
		// endsWith : 해당 문자열로 끝나는지 확인     ▶ return boolean
		String data = "hong gil dong";
		System.out.println(data.endsWith("ng"));
		System.out.println(data.endsWith("on"));
		System.out.println(data.startsWith("ho"));
		System.out.println(data.startsWith("g"));
		
		//indexOf : 이 문자열 내에서 찾는 문자열이 처음 나타나는 인덱스를 반환  // -1 : 찾지못함
		System.out.println(data.indexOf("g")); //3번째 인덱스에 있음
		System.out.println(data.indexOf("g",7)); //7번째 인덱스부터 시작해서 (오른쪽으로) g 찾기
		
					System.out.println("-----------");		
		
		//lastIndexOf : 이 문자열 내에서 찾는 문자열이 끝에서부터 검사하여 인덱스를 반환
		System.out.println(data.lastIndexOf("g"));
		System.out.println(data.lastIndexOf("g",4)); //4번째부터 시작해서 왼쪽으로 g찾기
		
		
					System.out.println("-----------");		
					
		String name1="";
		String name2=null;
		System.out.println(name1==null);
		System.out.println(name2==null);
		
		//isEmpty : 가르키고 있는 내용이 있나요?
		System.out.println(name1.isEmpty()); //네 공백을 가르키고 있어요 
//		System.out.println(name2.isEmpty()); //null은 가르키는게 없음.
		
					System.out.println("-----------replace--------");
					
		//replace : 문자열 바꿔주기
		data = data.replace("g", "hello"); //내용을 조작할때에는 항상 메모리를 새로 만들으므로 대입해주어야함!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(data);
		
		
					System.out.println("-----------trim--------");
		
		//trim : 양끝 공백 제거 (중간공백 X)
		String data1 = "        hong        gil   dong          ";
		System.out.println(data1.trim());
		
		
	}

}
