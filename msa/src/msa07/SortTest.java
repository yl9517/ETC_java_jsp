package msa07;
/*
 * 정렬 (선택정렬/버블정렬/삽입정렬)
 * 오름차순 : 점점 숫자가 높아지도록 정렬
 * 
 * 기본 : 선택정렬
 * 0번쨰와 이후 숫자 비교, 작은거 있으면 자리 바꾸기
 * 1번째와 이후 숫자 비교, 작은거 있으면 자리 바꾸기
 */
public class SortTest {

	public static void main(String[] args) {
		
		int[] arr = {20,52,30,10,31,5};
		int temp;
		
		for(int i=0;i<arr.length-1; i++) { //숫자 앞의 5개만 볼거임
			
			for(int j=i+1; j<arr.length; j++) { //비교대상인 숫자 뒤 5개만 볼거임
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i:arr)
			System.out.print(i+" ");

	}

}
