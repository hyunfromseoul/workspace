import java.util.Scanner;

//사원 관리 프로그램 제작.
public class EmployeeManager {

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

            //사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
            //사번은 중복되면 안됩니다.
            //(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
            System.out.println("# 사원정보 등록을 시작합니다.");
            System.out.print("- 사번: ");
            String empNum = sc.next();
            while(true) {
               boolean flag = false;
               for(int i=0; i<count; i++) {
                  if(empNum.equals(userNums[i])) { //입력한 사번이 이미 존재하는 경우
                     System.out.println("이미 중복된 사번입니다.");
                     flag = true;
                     break;
                  }
               }
               if(!flag) { //flag -> false -> 중복 발생 x
                  userNums[count] = empNum;
                  break; //사번 확인용 무한 루프를 탈출.
               } else {
                  System.out.print("- 사번 재입력: ");
                  empNum = sc.next();
               }
            }

            System.out.print("- 이름: ");
            names[count] = sc.next();

            System.out.print("- 나이: ");
            ages[count] = sc.nextInt();

            System.out.print("- 부서명: ");
            departments[count] = sc.next();

            System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");
            count++; //다음 사람은 다음 인덱스에 저장해야 하니깐.


         } else if(menu == 2) {

            //각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
            //만약 사용자가 사원 등록을 한 명도 하지 않았다면
            //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
            if(count == 0) {
               System.out.println("등록된 사원 정보가 없습니다.");
            } else {
               System.out.println("============ 전체 사원 정보 ============");
               for(int i=0; i<count; i++) {
                  System.out.printf("%s %s %d세 %s\n"
                        , userNums[i], names[i], ages[i], departments[i]);
               }
            }
            
            
         } else if(menu == 3) {
        	 System.out.println("# 조회하실 사원의 번호를 입력하세요.");
        	 System.out.print("> ");
        	 String empNum = sc.next();
        	 boolean flag = false;
        	 //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
        	 //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력
        	 for (int i = 0; i < count; i++) {
				if (empNum.equals(userNums[i])) {
					System.out.println("사번: " + userNums[i] + "\n사원 이름: " + names[i] +
							"\n나이: " + ages[i] + "\n부서: " + departments[i]);
					flag = true;
				} 
			}
        	 if(!flag) {
        		 System.out.println("조회하신 사원의 정보가 없습니다.");
        		 continue;
        	 }
         } else if(menu == 4) {
//        	 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
//        	 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
//        	 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 2. 부서변경 3. 취소 ]
//        	 사번이 존재하지 않는다면 없다고 얘기해 주세요.
        	 System.out.println("# 수정하실 사원의 번호를 입력하세요.");
        	 System.out.print("> ");
        	 String empNum = sc.next();
        	 
        	 String temp = "";
        	 for (int i = 0; i < count; i++) {
				if (empNum.equals(userNums[i])) {
					System.out.println("1. 나이변경 2. 부서변경 3.취소");
					System.out.print("> ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("변경할 나이를 입력해주세요.");
						System.out.print("> ");
						int changeAge = sc.nextInt();
						System.out.printf("변경 전 나이: %d\n 변경 후 나이: %d\n", ages[i], changeAge);
						ages[i] = changeAge;
						System.out.println("초기화면으로 돌아갑니다.");
						break;
					} else if (choice == 2) {
						System.out.println("변경할 부서를 입력해주세요.");
						System.out.print("> ");
						String changeDe = sc.next();
						System.out.printf("변경 전 부서: %d\n 변경 후 부서: %d\n", departments[i], changeDe);
						departments[i] = changeDe;
						System.out.println("초기화면으로 돌아갑니다.");
						break;
					} else if (choice == 3) {
						System.out.println("초기화면으로 돌아갑니다.");
						break;
					}
				} else if (empNum.equals(userNums[i])) {
					System.out.println("사번이 존재하지 않습니다.");
					System.out.println("초기화면으로 돌아갑니다.");
					break;
				}
			}
        	 
         } else if(menu == 5) {

         } else if(menu == 6) {
            System.out.println("프로그램을 종료합니다.");
            sc.close();
            break;
         } else {
            System.out.println("메뉴를 잘못 입력하셨습니다.");
         }


      }



   }

}












