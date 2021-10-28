import java.util.Scanner;

public class EmployeeManager2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      //사원의 정보: 사번, 이름, 나이, 부서명
	      String[] userNums = new String[100];
	      String[] names = new String[100];
	      int[] ages = new int[100];
	      String[] departments = new String[100];

	      //실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
	      int count = 0;

	      while(true) {
	         System.out.println("\n========== 사원 관리 프로그램 ==========");
	         System.out.println("# 1. 사원 정보 신규 등록");
	         System.out.println("# 2. 모든 사원 정보 보기");
	         System.out.println("# 3. 사원 정보 검색");
	         System.out.println("# 4. 사원 정보 수정");
	         System.out.println("# 5. 사원 정보 삭제");
	         System.out.println("# 6. 프로그램 종료");
	         System.out.println("====================================");

	         System.out.print("메뉴 입력: ");
	         int menu = sc.nextInt();
	         
	         if(menu == 1) {
	        	System.out.println("사원 정보 등록을 시작합니다.");
	            //사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
	            //사번은 중복되면 안됩니다.
	            //(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
	        	while(true) {
	        		System.out.println("사번을 입력하세요.");
	        		System.out.print("> ");
	        		userNums[count] = sc.next();
		        		
	        		for (int i = 0; i < count; i++) {
	        			if (userNums[count].equals(userNums[i])) {
	        				System.out.println("사번 중복!");
	        				continue;
	        			}
					}
		        			
		        			
		        		
		        		System.out.println("이름을 입력하세요.");
		        		System.out.print("> ");
		        		names[count] = sc.next();
		        		
		        		System.out.println("나이를 입력하세요.");
		        		System.out.print("> ");
		        		ages[count] = sc.nextInt();
		        		
		        		System.out.println("부서를 입력하세요.");
		        		System.out.print("> ");
		        		departments[count] = sc.next();
		        		
		        		System.out.println("사원 정보 등록을 성공적으로 완료했습니다.");
		        		count++;
		        		break;
					
				}
	         } else if (menu == 2) {
	        	 System.out.println("전 사원의 정보를 입력순으로 조회합니다.");
	        	 if(count==0) {
	        		 System.out.println("입력된 정보가 없으므로 초기화면으로 돌아갑니다.");
	        	 } else {
	        		 for (int i = 0; i < userNums.length; i++) {
	        			 if(userNums[i]==null) break;
	        			 System.out.println((i+1) + ". 사번: " + userNums[i] + " 이름: " + names[i] + " 나이: " + ages[i] + 
	        					 " 부서명: " + departments[i]);
	        		 }
	        	 }
	         } else if (menu == 3) {
	        	 System.out.println("사원의 정보를 검색합니다.");
	        	 System.out.println("검색할 사번을 입력해주세요.");
	        	 System.out.print("> ");
	        	 String emptyNum = sc.next();
	        	 //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
	        	 //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력
	        	 boolean flag = false;
	        	 for (int i = 0; i < count; i++) {
	        		 if(emptyNum.equals(userNums[i])) {
	        			 System.out.println((i+1) + ". 사번: " + userNums[i] + " 이름: " + names[i] + 
	        					 " 나이: " + ages[i] + " 부서명: " + departments[i]);
	        			 flag = true;
	        		 }
	        		 
	        		 if(!flag) {
	        			 System.out.println("조회하신 사원의 정보가 없습니다.");
	        		 }
				}
	        	 
	         } else if (menu == 4) {
//	        	 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
//	        	 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
//	        	 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 2. 부서변경 3. 취소 ]
//	        	 사번이 존재하지 않는다면 없다고 얘기해 주세요.
	        	 System.out.println("사원의 정보를 수정합니다.");
	        	 System.out.println("수정할 사번을 입력해주세요.");
	        	 System.out.print("> ");
	        	 String emptyNum = sc.next();

	        	 boolean flag = false;
	        	 
	        	 for (int i = 0; i < count; i++) {
	        		 if(emptyNum.equals(userNums[i])) {
	        			 System.out.println((i+1) + ". 사번: " + userNums[i] + " 이름: " + names[i] + 
	        					 " 나이: " + ages[i] + " 부서명: " + departments[i]);
	        			 flag = true;
	        		 }
	        	 }
	        		 
	        	 
	        	 
	         } else if (menu == 5) {
	        	 
	         } else if (menu == 6) {
	        	 System.out.println("프로그램을 종료합니다.");
	        	 break;
	         } else {
	        	 System.out.println("메뉴를 잘못 입력하셨습니다.");
	         }
	      }
	      sc.close();
	}

}
