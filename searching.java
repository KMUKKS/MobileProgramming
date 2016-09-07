
public class searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Searching(6, arr);	
	}
	
	public static void Searching(int a, int arr[]) {
		
		int mid;
		int last = arr.length;
		int first = 0;
		
		
		while (last >= first) {
			mid = (first + last) / 2;
			
			if (a == arr[mid]) {
				System.out.println(a + "가 님 이찾을려는 숫자입니다");
				break;
			
			}
			
			if (a < arr[mid]) {
				last = mid - 1;
			} 
			else {
				first = mid + 1;
				
			}
			
			
		}

	}

}
